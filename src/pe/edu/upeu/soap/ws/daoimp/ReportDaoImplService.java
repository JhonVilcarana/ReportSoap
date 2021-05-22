
package pe.edu.upeu.soap.ws.daoimp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ReportDaoImplService", targetNamespace = "http://daoimp.ws.soap.upeu.edu.pe/", wsdlLocation = "http://localhost:9090/soap/ventas/reporte?wsdl")
public class ReportDaoImplService
    extends Service
{

    private final static URL REPORTDAOIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException REPORTDAOIMPLSERVICE_EXCEPTION;
    private final static QName REPORTDAOIMPLSERVICE_QNAME = new QName("http://daoimp.ws.soap.upeu.edu.pe/", "ReportDaoImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/soap/ventas/reporte?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REPORTDAOIMPLSERVICE_WSDL_LOCATION = url;
        REPORTDAOIMPLSERVICE_EXCEPTION = e;
    }

    public ReportDaoImplService() {
        super(__getWsdlLocation(), REPORTDAOIMPLSERVICE_QNAME);
    }

    public ReportDaoImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REPORTDAOIMPLSERVICE_QNAME, features);
    }

    public ReportDaoImplService(URL wsdlLocation) {
        super(wsdlLocation, REPORTDAOIMPLSERVICE_QNAME);
    }

    public ReportDaoImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REPORTDAOIMPLSERVICE_QNAME, features);
    }

    public ReportDaoImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportDaoImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReportDao
     */
    @WebEndpoint(name = "ReportDaoImplPort")
    public ReportDao getReportDaoImplPort() {
        return super.getPort(new QName("http://daoimp.ws.soap.upeu.edu.pe/", "ReportDaoImplPort"), ReportDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportDao
     */
    @WebEndpoint(name = "ReportDaoImplPort")
    public ReportDao getReportDaoImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://daoimp.ws.soap.upeu.edu.pe/", "ReportDaoImplPort"), ReportDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REPORTDAOIMPLSERVICE_EXCEPTION!= null) {
            throw REPORTDAOIMPLSERVICE_EXCEPTION;
        }
        return REPORTDAOIMPLSERVICE_WSDL_LOCATION;
    }

}