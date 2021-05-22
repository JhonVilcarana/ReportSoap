
package pe.edu.upeu.soap.ws.daoimp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para venta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="venta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idventa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productos" type="{http://daoimp.ws.soap.upeu.edu.pe/}producto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "venta", propOrder = {
    "idventa",
    "fecha",
    "empleado",
    "productos"
})
public class Venta {

    protected int idventa;
    protected String fecha;
    protected String empleado;
    @XmlElement(nillable = true)
    protected List<Producto> productos;

    /**
     * Obtiene el valor de la propiedad idventa.
     * 
     */
    public int getIdventa() {
        return idventa;
    }

    /**
     * Define el valor de la propiedad idventa.
     * 
     */
    public void setIdventa(int value) {
        this.idventa = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad empleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpleado() {
        return empleado;
    }

    /**
     * Define el valor de la propiedad empleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpleado(String value) {
        this.empleado = value;
    }

    /**
     * Gets the value of the productos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Producto }
     * 
     * 
     */
    public List<Producto> getProductos() {
        if (productos == null) {
            productos = new ArrayList<Producto>();
        }
        return this.productos;
    }

}
