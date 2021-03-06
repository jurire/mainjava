
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Kimlik Payla\u015f\u0131m\u0131 Sistemi'ne eri\u015fimi sa\u011flayan SGK Web Servisi (v4)
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SGKKPSWebServis", targetNamespace = "http://sgknet/SGKKPSWebServis", wsdlLocation = "http://kpsws.sgk.intra/SGKKPSWSv4/SGKKPSWSServer/SGKKPSWS.asmx?WSDL")
public class SGKKPSWebServis
    extends Service
{

    private final static URL SGKKPSWEBSERVIS_WSDL_LOCATION;
    private final static WebServiceException SGKKPSWEBSERVIS_EXCEPTION;
    private final static QName SGKKPSWEBSERVIS_QNAME = new QName("http://sgknet/SGKKPSWebServis", "SGKKPSWebServis");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://kpsws.sgk.intra/SGKKPSWSv4/SGKKPSWSServer/SGKKPSWS.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SGKKPSWEBSERVIS_WSDL_LOCATION = url;
        SGKKPSWEBSERVIS_EXCEPTION = e;
    }

    public SGKKPSWebServis() {
        super(__getWsdlLocation(), SGKKPSWEBSERVIS_QNAME);
    }

    public SGKKPSWebServis(WebServiceFeature... features) {
        super(__getWsdlLocation(), SGKKPSWEBSERVIS_QNAME, features);
    }

    public SGKKPSWebServis(URL wsdlLocation) {
        super(wsdlLocation, SGKKPSWEBSERVIS_QNAME);
    }

    public SGKKPSWebServis(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SGKKPSWEBSERVIS_QNAME, features);
    }

    public SGKKPSWebServis(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SGKKPSWebServis(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SGKKPSWebServisSoap
     */
    @WebEndpoint(name = "SGKKPSWebServisSoap")
    public SGKKPSWebServisSoap getSGKKPSWebServisSoap() {
        return super.getPort(new QName("http://sgknet/SGKKPSWebServis", "SGKKPSWebServisSoap"), SGKKPSWebServisSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SGKKPSWebServisSoap
     */
    @WebEndpoint(name = "SGKKPSWebServisSoap")
    public SGKKPSWebServisSoap getSGKKPSWebServisSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://sgknet/SGKKPSWebServis", "SGKKPSWebServisSoap"), SGKKPSWebServisSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SGKKPSWEBSERVIS_EXCEPTION!= null) {
            throw SGKKPSWEBSERVIS_EXCEPTION;
        }
        return SGKKPSWEBSERVIS_WSDL_LOCATION;
    }

}
