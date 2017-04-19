package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-04-16T18:51:43.965+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "rasporedcasova", 
                  wsdlLocation = "http://localhost:8080/RasporedCasovaService/RasporedPortType?wsdl",
                  targetNamespace = "http://www.example.org/rasporedcasova/") 
public class Rasporedcasova extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/rasporedcasova/", "rasporedcasova");
    public final static QName RasporedPortTypeImplPort = new QName("http://www.example.org/rasporedcasova/", "RasporedPortTypeImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/RasporedCasovaService/RasporedPortType?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Rasporedcasova.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/RasporedCasovaService/RasporedPortType?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Rasporedcasova(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Rasporedcasova(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Rasporedcasova() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Rasporedcasova(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Rasporedcasova(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Rasporedcasova(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns RasporedPortType
     */
    @WebEndpoint(name = "RasporedPortTypeImplPort")
    public RasporedPortType getRasporedPortTypeImplPort() {
        return super.getPort(RasporedPortTypeImplPort, RasporedPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RasporedPortType
     */
    @WebEndpoint(name = "RasporedPortTypeImplPort")
    public RasporedPortType getRasporedPortTypeImplPort(WebServiceFeature... features) {
        return super.getPort(RasporedPortTypeImplPort, RasporedPortType.class, features);
    }

}
