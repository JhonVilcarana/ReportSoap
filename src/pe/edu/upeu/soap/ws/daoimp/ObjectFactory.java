
package pe.edu.upeu.soap.ws.daoimp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.upeu.soap.ws.daoimp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerateReport_QNAME = new QName("http://daoimp.ws.soap.upeu.edu.pe/", "generateReport");
    private final static QName _GenerateReportResponse_QNAME = new QName("http://daoimp.ws.soap.upeu.edu.pe/", "generateReportResponse");
    private final static QName _GetClients_QNAME = new QName("http://daoimp.ws.soap.upeu.edu.pe/", "getClients");
    private final static QName _GetClientsResponse_QNAME = new QName("http://daoimp.ws.soap.upeu.edu.pe/", "getClientsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.upeu.soap.ws.daoimp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerateReport }
     * 
     */
    public GenerateReport createGenerateReport() {
        return new GenerateReport();
    }

    /**
     * Create an instance of {@link GenerateReportResponse }
     * 
     */
    public GenerateReportResponse createGenerateReportResponse() {
        return new GenerateReportResponse();
    }

    /**
     * Create an instance of {@link GetClients }
     * 
     */
    public GetClients createGetClients() {
        return new GetClients();
    }

    /**
     * Create an instance of {@link GetClientsResponse }
     * 
     */
    public GetClientsResponse createGetClientsResponse() {
        return new GetClientsResponse();
    }

    /**
     * Create an instance of {@link Venta }
     * 
     */
    public Venta createVenta() {
        return new Venta();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link Reporte }
     * 
     */
    public Reporte createReporte() {
        return new Reporte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://daoimp.ws.soap.upeu.edu.pe/", name = "generateReport")
    public JAXBElement<GenerateReport> createGenerateReport(GenerateReport value) {
        return new JAXBElement<GenerateReport>(_GenerateReport_QNAME, GenerateReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://daoimp.ws.soap.upeu.edu.pe/", name = "generateReportResponse")
    public JAXBElement<GenerateReportResponse> createGenerateReportResponse(GenerateReportResponse value) {
        return new JAXBElement<GenerateReportResponse>(_GenerateReportResponse_QNAME, GenerateReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://daoimp.ws.soap.upeu.edu.pe/", name = "getClients")
    public JAXBElement<GetClients> createGetClients(GetClients value) {
        return new JAXBElement<GetClients>(_GetClients_QNAME, GetClients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://daoimp.ws.soap.upeu.edu.pe/", name = "getClientsResponse")
    public JAXBElement<GetClientsResponse> createGetClientsResponse(GetClientsResponse value) {
        return new JAXBElement<GetClientsResponse>(_GetClientsResponse_QNAME, GetClientsResponse.class, null, value);
    }

}
