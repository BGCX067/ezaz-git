
package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestDefaultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestDefaultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}XPathVersion"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDefaultsType", propOrder = {
    "xPathVersion"
})
public class RequestDefaultsType {

    @XmlElement(name = "XPathVersion")
    @XmlSchemaType(name = "anyURI")
    protected String xPathVersion;

    /**
     * Gets the value of the xPathVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPathVersion() {
        return xPathVersion;
    }

    /**
     * Sets the value of the xPathVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPathVersion(String value) {
        this.xPathVersion = value;
    }

}
