//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.Anstring200VItemType;


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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-tuples}AddressAbroadPresentation" minOccurs="0"/>
 *           &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-tuples}AddressPresentation" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}BenefitNotNoticedLegalPersonName" minOccurs="0"/>
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
    "addressPresentation",
    "benefitNotNoticedLegalPersonName"
})
public class BenefitNotNoticedLegalPersonSpecification
    extends Placeholder
{

    @XmlElement(name = "AddressAbroadPresentation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-tuples")
    protected AddressAbroadPresentation addressAbroadPresentation;
    @XmlElement(name = "AddressPresentation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-tuples")
    protected AddressPresentation addressPresentation;
    @XmlElement(name = "BenefitNotNoticedLegalPersonName", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Anstring200VItemType benefitNotNoticedLegalPersonName;

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
     * Gets the value of the addressPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPresentation }
     *     
     */
    public AddressPresentation getAddressPresentation() {
        return addressPresentation;
    }

    /**
     * Sets the value of the addressPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPresentation }
     *     
     */
    public void setAddressPresentation(AddressPresentation value) {
        this.addressPresentation = value;
    }

    /**
     * Gets the value of the benefitNotNoticedLegalPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getBenefitNotNoticedLegalPersonName() {
        return benefitNotNoticedLegalPersonName;
    }

    /**
     * Sets the value of the benefitNotNoticedLegalPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setBenefitNotNoticedLegalPersonName(Anstring200VItemType value) {
        this.benefitNotNoticedLegalPersonName = value;
    }

}
