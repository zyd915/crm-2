package com.hoau.crm.module.customer.server.si.dc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2016-01-07T10:47:14.412+08:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://www.hoau.net/services/CRMServices", name = "CRMServices")
@XmlSeeAlso({ObjectFactory.class})
public interface CRMServices {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "addCustomer", targetNamespace = "http://www.hoau.net/services/CRMServices", className = "com.hoau.crm.module.customer.server.si.dc.AddCustomer")
    @WebMethod
    @ResponseWrapper(localName = "addCustomerResponse", targetNamespace = "http://www.hoau.net/services/CRMServices", className = "com.hoau.crm.module.customer.server.si.dc.AddCustomerResponse")
    public com.hoau.crm.module.customer.server.si.dc.ResultMsg addCustomer(
        @WebParam(name = "customer", targetNamespace = "")
        com.hoau.crm.module.customer.server.si.dc.CrmCustomer customer
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "modifyCustomer", targetNamespace = "http://www.hoau.net/services/CRMServices", className = "com.hoau.crm.module.customer.server.si.dc.ModifyCustomer")
    @WebMethod
    @ResponseWrapper(localName = "modifyCustomerResponse", targetNamespace = "http://www.hoau.net/services/CRMServices", className = "com.hoau.crm.module.customer.server.si.dc.ModifyCustomerResponse")
    public com.hoau.crm.module.customer.server.si.dc.ResultMsg modifyCustomer(
        @WebParam(name = "customer", targetNamespace = "")
        com.hoau.crm.module.customer.server.si.dc.CrmCustomer customer
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://www.hoau.net/services/CRMServices", className = "com.hoau.crm.module.customer.server.si.dc.DeleteCustomer")
    @WebMethod
    @ResponseWrapper(localName = "deleteCustomerResponse", targetNamespace = "http://www.hoau.net/services/CRMServices", className = "com.hoau.crm.module.customer.server.si.dc.DeleteCustomerResponse")
    public com.hoau.crm.module.customer.server.si.dc.ResultMsg deleteCustomer(
        @WebParam(name = "customer", targetNamespace = "")
        com.hoau.crm.module.customer.server.si.dc.CrmCustomer customer
    );
}