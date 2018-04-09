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
import nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.Anstring24VItemType;
import nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.Anstring4VItemType;
import nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.NonNegativeInteger5VItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.NlzipItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}HouseNumberAddition" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}HouseNumberNL" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}PlaceOfResidenceNL" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}PostalCodeNL" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}StreetNameNL" minOccurs="0"/>
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
    "houseNumberAddition",
    "houseNumberNL",
    "placeOfResidenceNL",
    "postalCodeNL",
    "streetNameNL"
})
public class AddressPresentation
    extends Placeholder
{

    @XmlElement(name = "HouseNumberAddition", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Anstring4VItemType houseNumberAddition;
    @XmlElement(name = "HouseNumberNL", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected NonNegativeInteger5VItemType houseNumberNL;
    @XmlElement(name = "PlaceOfResidenceNL", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Anstring24VItemType placeOfResidenceNL;
    @XmlElement(name = "PostalCodeNL", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected NlzipItemType postalCodeNL;
    @XmlElement(name = "StreetNameNL", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Anstring24VItemType streetNameNL;

    /**
     * Gets the value of the houseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring4VItemType }
     *     
     */
    public Anstring4VItemType getHouseNumberAddition() {
        return houseNumberAddition;
    }

    /**
     * Sets the value of the houseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring4VItemType }
     *     
     */
    public void setHouseNumberAddition(Anstring4VItemType value) {
        this.houseNumberAddition = value;
    }

    /**
     * Gets the value of the houseNumberNL property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public NonNegativeInteger5VItemType getHouseNumberNL() {
        return houseNumberNL;
    }

    /**
     * Sets the value of the houseNumberNL property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public void setHouseNumberNL(NonNegativeInteger5VItemType value) {
        this.houseNumberNL = value;
    }

    /**
     * Gets the value of the placeOfResidenceNL property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getPlaceOfResidenceNL() {
        return placeOfResidenceNL;
    }

    /**
     * Sets the value of the placeOfResidenceNL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setPlaceOfResidenceNL(Anstring24VItemType value) {
        this.placeOfResidenceNL = value;
    }

    /**
     * Gets the value of the postalCodeNL property.
     * 
     * @return
     *     possible object is
     *     {@link NlzipItemType }
     *     
     */
    public NlzipItemType getPostalCodeNL() {
        return postalCodeNL;
    }

    /**
     * Sets the value of the postalCodeNL property.
     * 
     * @param value
     *     allowed object is
     *     {@link NlzipItemType }
     *     
     */
    public void setPostalCodeNL(NlzipItemType value) {
        this.postalCodeNL = value;
    }

    /**
     * Gets the value of the streetNameNL property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getStreetNameNL() {
        return streetNameNL;
    }

    /**
     * Sets the value of the streetNameNL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setStreetNameNL(Anstring24VItemType value) {
        this.streetNameNL = value;
    }

}
