
package com.viewds.wsdl.xacmlv3wd17pdp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import oasis.names.tc.saml._2_0.protocol.ResponseType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AuthorizationDecisionPort", targetNamespace = "http://viewDS.com/wsdl/XACMLv3wd17PDP.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    oasis.names.tc.xacml._3_0.profile.saml2_0.v2.schema.assertion.wd_13.ObjectFactory.class,
    org.w3._2000._09.xmldsig_.ObjectFactory.class,
    oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory.class,
    org.w3._2001._04.xmlenc_.ObjectFactory.class,
    oasis.names.tc.saml._2_0.assertion.ObjectFactory.class,
    oasis.names.tc.xacml._3_0.profile.saml2_0.v2.schema.protocol.wd_13.ObjectFactory.class,
    oasis.names.tc.saml._2_0.protocol.ObjectFactory.class
})
public interface AuthorizationDecisionPort {


    /**
     * 
     * @param body
     * @return
     *     returns oasis.names.tc.saml._2_0.protocol.ResponseType
     */
    @WebMethod(operationName = "GetAuthorizationDecision")
    @WebResult(name = "Response", targetNamespace = "urn:oasis:names:tc:SAML:2.0:protocol", partName = "body")
    public ResponseType getAuthorizationDecision(
        @WebParam(name = "XACMLAuthzDecisionQuery", targetNamespace = "urn:oasis:names:tc:xacml:3.0:profile:saml2.0:v2:schema:protocol:wd-13", partName = "body")
        Object body);

}
