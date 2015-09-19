package com.blogspot.codeblock0;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@Stateless
@WebService(
        name="CodeBlock0",
        targetNamespace = "http://com.blogspot.codeblock0/ws/CodeBlock0",
        serviceName = "CodeBlock0Webservice")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class CodeBlock0Webservice {

    @WebMethod
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }

}


