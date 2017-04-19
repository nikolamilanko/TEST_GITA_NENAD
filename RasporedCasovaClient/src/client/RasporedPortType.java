package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-04-16T18:51:43.934+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://www.example.org/rasporedcasova/", name = "RasporedPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RasporedPortType {

    @WebMethod(operationName = "NewOperation", action = "http://www.example.org/rasporedcasova/NewOperation")
    @WebResult(name = "rasporedResponse", targetNamespace = "http://www.example.org/rasporedcasova/", partName = "out")
    public RasporedResponseType newOperation(
        @WebParam(partName = "in", name = "rasporedRequest", targetNamespace = "http://www.example.org/rasporedcasova/")
        RasporedRequestType in
    );
}
