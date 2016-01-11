package com.mulesoft.cloudhub;

import com.mulesoft.cloudhub.interfaces.DomainAPI;
import com.mulesoft.cloudhub.model.logging.DeploymentList;
import com.mulesoft.cloudhub.model.logging.LogResult;
import retrofit2.Call;
import retrofit2.Retrofit;

public class Domain {

    private String domain;
    DomainAPI domainAPI;

    public Domain(String domain, Retrofit retrofit) {
        domainAPI = retrofit.create(DomainAPI.class);
        this.domain = domain;
    }

    public Call<DeploymentList> getDeployments() {
        return domainAPI.getDeployments(domain);
    }

    public Call<LogResult> getDeploymentLogs(String deploymentId, Integer limit, Integer limitMsgLen) {
        return domainAPI.getDeploymentLogs(domain, deploymentId, limit, limitMsgLen);
    }

    public Call<LogResult> getInstanceLogs(String instanceId, Integer limit, Integer limitMsgLen, Integer offset, Boolean tail) {
        return domainAPI.getInstanceLogs(domain, instanceId, limit, limitMsgLen, offset, tail);
    }

    public retrofit2.Response getInstanceLogFile(String instanceId) {

        return domainAPI.getInstanceLogFile(domain, instanceId);
    }

}
