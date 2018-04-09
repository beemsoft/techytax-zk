//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring24VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring9VItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.iso3166_countrycodes_2017_03_18.IsoCountryCodes3CharactersItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/sbr/20170515/dictionary/nl-common-data}CountryCodeISO" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}HouseNumberAbroad" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}PlaceOfResidenceAbroad" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}PostalCodeAbroad" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}StreetNameAbroad" minOccurs="0"/>
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
    "countryCodeISO",
    "houseNumberAbroad",
    "placeOfResidenceAbroad",
    "postalCodeAbroad",
    "streetNameAbroad"
})
public class AddressAbroadPresentation
    extends Placeholder
{

    @XmlElement(name = "CountryCodeISO", namespace = "http://www.nltaxonomie.nl/nt12/sbr/20170515/dictionary/nl-common-data")
    protected IsoCountryCodes3CharactersItemType countryCodeISO;
    @XmlElement(name = "HouseNumberAbroad", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring9VItemType houseNumberAbroad;
    @XmlElement(name = "PlaceOfResidenceAbroad", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring24VItemType placeOfResidenceAbroad;
    @XmlElement(name = "PostalCodeAbroad", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring9VItemType postalCodeAbroad;
    @XmlElement(name = "StreetNameAbroad", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring24VItemType streetNameAbroad;

    /**
     * Gets the value of the countryCodeISO property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getCountryCodeISO() {
        return countryCodeISO;
    }

    /**
     * Sets the value of the countryCodeISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setCountryCodeISO(IsoCountryCodes3CharactersItemType value) {
        this.countryCodeISO = value;
    }

    /**
     * Gets the value of the houseNumberAbroad property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring9VItemType }
     *     
     */
    public Anstring9VItemType getHouseNumberAbroad() {
        return houseNumberAbroad;
    }

    /**
     * Sets the value of the houseNumberAbroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring9VItemType }
     *     
     */
    public void setHouseNumberAbroad(Anstring9VItemType value) {
        this.houseNumberAbroad = value;
    }

    /**
     * Gets the value of the placeOfResidenceAbroad property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getPlaceOfResidenceAbroad() {
        return placeOfResidenceAbroad;
    }

    /**
     * Sets the value of the placeOfResidenceAbroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setPlaceOfResidenceAbroad(Anstring24VItemType value) {
        this.placeOfResidenceAbroad = value;
    }

    /**
     * Gets the value of the postalCodeAbroad property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring9VItemType }
     *     
     */
    public Anstring9VItemType getPostalCodeAbroad() {
        return postalCodeAbroad;
    }

    /**
     * Sets the value of the postalCodeAbroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring9VItemType }
     *     
     */
    public void setPostalCodeAbroad(Anstring9VItemType value) {
        this.postalCodeAbroad = value;
    }

    /**
     * Gets the value of the streetNameAbroad property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getStreetNameAbroad() {
        return streetNameAbroad;
    }

    /**
     * Sets the value of the streetNameAbroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setStreetNameAbroad(Anstring24VItemType value) {
        this.streetNameAbroad = value;
    }

}
