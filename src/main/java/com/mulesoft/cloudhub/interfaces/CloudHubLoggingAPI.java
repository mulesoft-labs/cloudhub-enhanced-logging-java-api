package com.mulesoft.cloudhub.interfaces;

import com.mulesoft.cloudhub.Domain;
import com.mulesoft.cloudhub.model.ApplicationDescription;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CloudHubLoggingAPI {

    @GET("/cloudhub/api/v2/applications")
    Call<List<ApplicationDescription>> getApplications();

    Domain domain(String domain);

}
