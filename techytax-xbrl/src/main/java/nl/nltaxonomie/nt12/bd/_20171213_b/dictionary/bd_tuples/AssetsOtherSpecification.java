//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Perc32ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}AssetsOtherDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}AssetsOtherInterestDomesticTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}AssetsOtherInterestForeignTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}AssetsOtherInterestPartnerForeignTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}AssetsOtherValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}AssetsOtherValueDomesticTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}AssetsOtherValueForeignTaxpayer" minOccurs="0"/>
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
    "assetsOtherDescription",
    "assetsOtherInterestDomesticTaxpayer",
    "assetsOtherInterestForeignTaxpayer",
    "assetsOtherInterestPartnerForeignTaxpayer",
    "assetsOtherValue",
    "assetsOtherValueDomesticTaxpayer",
    "assetsOtherValueForeignTaxpayer"
})
public class AssetsOtherSpecification
    extends Placeholder
{

    @XmlElement(name = "AssetsOtherDescription", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring70VItemType assetsOtherDescription;
    @XmlElement(name = "AssetsOtherInterestDomesticTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Perc32ItemType assetsOtherInterestDomesticTaxpayer;
    @XmlElement(name = "AssetsOtherInterestForeignTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Perc32ItemType assetsOtherInterestForeignTaxpayer;
    @XmlElement(name = "AssetsOtherInterestPartnerForeignTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Perc32ItemType assetsOtherInterestPartnerForeignTaxpayer;
    @XmlElement(name = "AssetsOtherValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType assetsOtherValue;
    @XmlElement(name = "AssetsOtherValueDomesticTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType assetsOtherValueDomesticTaxpayer;
    @XmlElement(name = "AssetsOtherValueForeignTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType assetsOtherValueForeignTaxpayer;

    /**
     * Gets the value of the assetsOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getAssetsOtherDescription() {
        return assetsOtherDescription;
    }

    /**
     * Sets the value of the assetsOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setAssetsOtherDescription(Anstring70VItemType value) {
        this.assetsOtherDescription = value;
    }

    /**
     * Gets the value of the assetsOtherInterestDomesticTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getAssetsOtherInterestDomesticTaxpayer() {
        return assetsOtherInterestDomesticTaxpayer;
    }

    /**
     * Sets the value of the assetsOtherInterestDomesticTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setAssetsOtherInterestDomesticTaxpayer(Perc32ItemType value) {
        this.assetsOtherInterestDomesticTaxpayer = value;
    }

    /**
     * Gets the value of the assetsOtherInterestForeignTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getAssetsOtherInterestForeignTaxpayer() {
        return assetsOtherInterestForeignTaxpayer;
    }

    /**
     * Sets the value of the assetsOtherInterestForeignTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setAssetsOtherInterestForeignTaxpayer(Perc32ItemType value) {
        this.assetsOtherInterestForeignTaxpayer = value;
    }

    /**
     * Gets the value of the assetsOtherInterestPartnerForeignTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getAssetsOtherInterestPartnerForeignTaxpayer() {
        return assetsOtherInterestPartnerForeignTaxpayer;
    }

    /**
     * Sets the value of the assetsOtherInterestPartnerForeignTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setAssetsOtherInterestPartnerForeignTaxpayer(Perc32ItemType value) {
        this.assetsOtherInterestPartnerForeignTaxpayer = value;
    }

    /**
     * Gets the value of the assetsOtherValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getAssetsOtherValue() {
        return assetsOtherValue;
    }

    /**
     * Sets the value of the assetsOtherValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setAssetsOtherValue(MonetaryNoDecimalsItemType value) {
        this.assetsOtherValue = value;
    }

    /**
     * Gets the value of the assetsOtherValueDomesticTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getAssetsOtherValueDomesticTaxpayer() {
        return assetsOtherValueDomesticTaxpayer;
    }

    /**
     * Sets the value of the assetsOtherValueDomesticTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setAssetsOtherValueDomesticTaxpayer(NonNegativeMonetaryNoDecimalsItemType value) {
        this.assetsOtherValueDomesticTaxpayer = value;
    }

    /**
     * Gets the value of the assetsOtherValueForeignTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getAssetsOtherValueForeignTaxpayer() {
        return assetsOtherValueForeignTaxpayer;
    }

    /**
     * Sets the value of the assetsOtherValueForeignTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setAssetsOtherValueForeignTaxpayer(NonNegativeMonetaryNoDecimalsItemType value) {
        this.assetsOtherValueForeignTaxpayer = value;
    }

}
