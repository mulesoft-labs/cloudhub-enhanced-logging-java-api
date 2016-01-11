package com.mulesoft.cloudhub.interfaces;

import com.mulesoft.cloudhub.model.logging.DeploymentList;
import com.mulesoft.cloudhub.model.logging.LogResult;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DomainAPI {

    @GET("/cloudhub/api/v2/applications/{domain}/deployments")
    Call<DeploymentList> getDeployments(@Path("domain") String domain);

    @GET("/cloudhub/api/v2/applications/{domain}/deployments/{deploymentId}/logs")
    Call<LogResult> getDeploymentLogs(@Path("domain") String domain, @Path("deploymentId") String deploymentId, @Query("limit") Integer limit,
            @Query("limitMsgLen") Integer limitMsgLen);

    @GET("/cloudhub/api/v2/applications/{domain}/instances/{instanceId}/logs")
    Call<LogResult> getInstanceLogs(@Path("domain") String domain, @Path("instanceId") String instanceId, @Query("limit") Integer limit, @Query("limitMsgLen") Integer limitMsglen,
            @Query("offset") Integer offset, @Query("tail") Boolean tail);

    @GET("/cloudhub/api/v2/applications/{domain}/instances/{instanceId}/logs")
    Response getInstanceLogFile(@Path("domain") String domain, @Path("instanceId") String instanceId);

}
