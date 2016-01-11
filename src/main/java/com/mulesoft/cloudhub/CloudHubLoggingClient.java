package com.mulesoft.cloudhub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mulesoft.cloudhub.interfaces.CloudHubLoggingAPI;
import com.mulesoft.cloudhub.model.ApplicationDescription;
import okhttp3.*;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class CloudHubLoggingClient {

    private static final String ANYPOINT_URL = "https://anypoint.mulesoft.com/";
    private static final String ANYPNT_ENV_ID = "ANYPNT-ENV-ID";
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final String AUTHORIZATION_HEADER = "Authorization";
    private final OkHttpClient httpClient;
    private final Retrofit retrofit;
    private final CloudHubLoggingAPI client;

    public CloudHubLoggingClient(final String user, final String password) {
        this(user, password, HttpUrl.parse(ANYPOINT_URL), null);
    }

    public CloudHubLoggingClient(final String user, final String password, String environmentId) {
        this(user, password, HttpUrl.parse(ANYPOINT_URL), environmentId);
    }

    public CloudHubLoggingClient(final String user, final String password, final HttpUrl cloudHubUrl, final String environmentId) {
        httpClient = new OkHttpClient.Builder().
                addInterceptor(new Interceptor() {

                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request.Builder interceptorBuilder = chain.request().newBuilder().addHeader(AUTHORIZATION_HEADER, Credentials.basic(user, password));
                        if (environmentId != null) {
                            interceptorBuilder = interceptorBuilder.addHeader(ANYPNT_ENV_ID, environmentId);
                        }

                        return chain.proceed(interceptorBuilder.build());
                    }
                }).build();
        Gson gson = new GsonBuilder().setDateFormat(DATE_FORMAT).create();
        retrofit = new Retrofit.Builder().baseUrl(cloudHubUrl).client(httpClient).addConverterFactory(GsonConverterFactory.create(gson)).build();

        client = retrofit.create(CloudHubLoggingAPI.class);
    }

    public Call<List<ApplicationDescription>> getApplications() {
        return client.getApplications();
    }

    public Domain domain(String domain) {
        return new Domain(domain, retrofit);
    }

}
