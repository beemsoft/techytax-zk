//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.Perc32ItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-tuples}AddressAbroadPresentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}ImmovablePropertyInterest" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}ImmovablePropertyValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}ImmovablePropertyValueInterest" minOccurs="0"/>
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
    "addressAbroadPresentation",
    "immovablePropertyInterest",
    "immovablePropertyValue",
    "immovablePropertyValueInterest"
})
public class ImmovablePropertyAbroadSpecification
    extends Placeholder
{

    @XmlElement(name = "AddressAbroadPresentation", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-tuples")
    protected AddressAbroadPresentation addressAbroadPresentation;
    @XmlElement(name = "ImmovablePropertyInterest", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected Perc32ItemType immovablePropertyInterest;
    @XmlElement(name = "ImmovablePropertyValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyValue;
    @XmlElement(name = "ImmovablePropertyValueInterest", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyValueInterest;

    /**
     * Gets the value of the addressAbroadPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressAbroadPresentation }
     *     
     */
    public AddressAbroadPresentation getAddressAbroadPresentation() {
        return addressAbroadPresentation;
    }

    /**
     * Sets the value of the addressAbroadPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressAbroadPresentation }
     *     
     */
    public void setAddressAbroadPresentation(AddressAbroadPresentation value) {
        this.addressAbroadPresentation = value;
    }

    /**
     * Gets the value of the immovablePropertyInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getImmovablePropertyInterest() {
        return immovablePropertyInterest;
    }

    /**
     * Sets the value of the immovablePropertyInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setImmovablePropertyInterest(Perc32ItemType value) {
        this.immovablePropertyInterest = value;
    }

    /**
     * Gets the value of the immovablePropertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyValue() {
        return immovablePropertyValue;
    }

    /**
     * Sets the value of the immovablePropertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyValue = value;
    }

    /**
     * Gets the value of the immovablePropertyValueInterest property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyValueInterest() {
        return immovablePropertyValueInterest;
    }

    /**
     * Sets the value of the immovablePropertyValueInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyValueInterest(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyValueInterest = value;
    }

}
