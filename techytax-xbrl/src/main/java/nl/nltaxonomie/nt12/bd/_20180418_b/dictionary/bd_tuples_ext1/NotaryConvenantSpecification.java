//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_tuples_ext1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.NonNegativeInteger3VItemType;
import org.xbrl._2003.instance.DateItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension}placeholder">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}NotaryConvenantCreationDate"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}NotaryConvenantSerialNumber"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notaryConvenantCreationDate",
    "notaryConvenantSerialNumber"
})
public class NotaryConvenantSpecification
    extends Placeholder
{

    @XmlElement(name = "NotaryConvenantCreationDate", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1", required = true)
    protected DateItemType notaryConvenantCreationDate;
    @XmlElement(name = "NotaryConvenantSerialNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1", required = true)
    protected NonNegativeInteger3VItemType notaryConvenantSerialNumber;

    /**
     * Gets the value of the notaryConvenantCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getNotaryConvenantCreationDate() {
        return notaryConvenantCreationDate;
    }

    /**
     * Sets the value of the notaryConvenantCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setNotaryConvenantCreationDate(DateItemType value) {
        this.notaryConvenantCreationDate = value;
    }

    /**
     * Gets the value of the notaryConvenantSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger3VItemType }
     *     
     */
    public NonNegativeInteger3VItemType getNotaryConvenantSerialNumber() {
        return notaryConvenantSerialNumber;
    }

    /**
     * Sets the value of the notaryConvenantSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger3VItemType }
     *     
     */
    public void setNotaryConvenantSerialNumber(NonNegativeInteger3VItemType value) {
        this.notaryConvenantSerialNumber = value;
    }

}
