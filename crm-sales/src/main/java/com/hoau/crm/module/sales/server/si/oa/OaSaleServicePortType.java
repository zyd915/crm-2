package com.hoau.crm.module.sales.server.si.oa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2015-07-01T09:49:15.196+08:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "OaSaleService", name = "OaSaleServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface OaSaleServicePortType {

    @WebResult(name = "out", targetNamespace = "OaSaleService")
    @RequestWrapper(localName = "getSalInfo", targetNamespace = "OaSaleService", className = "com.hoau.crm.module.sales.server.si.oa.GetSalInfo")
    @WebMethod
    @ResponseWrapper(localName = "getSalInfoResponse", targetNamespace = "OaSaleService", className = "com.hoau.crm.module.sales.server.si.oa.GetSalInfoResponse")
    public java.lang.String getSalInfo(
        @WebParam(name = "in0", targetNamespace = "OaSaleService")
        java.lang.String in0
    );
}
