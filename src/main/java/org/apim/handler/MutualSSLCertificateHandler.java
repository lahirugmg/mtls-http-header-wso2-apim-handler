package org.wso2.apim.handler;

import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.rest.AbstractHandler;
import org.wso2.carbon.apimgt.gateway.handlers.security.APISecurityException;

import java.util.Map;

public class MutualSSLCertificateHandler extends AbstractHandler {

    public boolean handleRequest(MessageContext messageContext) {
        processRequest(messageContext);
        return false;
    }

    public boolean handleResponse(MessageContext messageContext) {
        return true;
    }

    private boolean processRequest(MessageContext messageContext) {
        return true;
    }

}
