//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20190220_b.dictionary.bd_tuples_ext1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie.nt13.bd._20190220_b.dictionary.bd_types_ext1.Anstring50VItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}PropertyOtherDescription"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}PropertyOtherValue"/>
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
    "propertyOtherDescription",
    "propertyOtherValue"
})
public class PropertyOtherSpecification
    extends Placeholder
{

    @XmlElement(name = "PropertyOtherDescription", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected Anstring50VItemType propertyOtherDescription;
    @XmlElement(name = "PropertyOtherValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected MonetaryNoDecimals10VItemType propertyOtherValue;

    /**
     * Gets the value of the propertyOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring50VItemType }
     *     
     */
    public Anstring50VItemType getPropertyOtherDescription() {
        return propertyOtherDescription;
    }

    /**
     * Sets the value of the propertyOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring50VItemType }
     *     
     */
    public void setPropertyOtherDescription(Anstring50VItemType value) {
        this.propertyOtherDescription = value;
    }

    /**
     * Gets the value of the propertyOtherValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getPropertyOtherValue() {
        return propertyOtherValue;
    }

    /**
     * Sets the value of the propertyOtherValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setPropertyOtherValue(MonetaryNoDecimals10VItemType value) {
        this.propertyOtherValue = value;
    }

}
