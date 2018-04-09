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
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring20VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.NonNegativeInteger2FItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Perc32ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-tuples}AddressPresentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtBalanceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtIdentificationNumberNetherlands" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtInterestAmountDomesticTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtInterestAmountForeignTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtInterestDomesticTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtInterestForeignTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtInterestPartnerForeignTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtNetherlands" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtPeriodReduction" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ImmovablePropertyDebtProductID" minOccurs="0"/>
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
    "addressPresentation",
    "immovablePropertyDebtBalanceType",
    "immovablePropertyDebtEndDate",
    "immovablePropertyDebtIdentificationNumberNetherlands",
    "immovablePropertyDebtInterestAmountDomesticTaxpayer",
    "immovablePropertyDebtInterestAmountForeignTaxpayer",
    "immovablePropertyDebtInterestDomesticTaxpayer",
    "immovablePropertyDebtInterestForeignTaxpayer",
    "immovablePropertyDebtInterestPartnerForeignTaxpayer",
    "immovablePropertyDebtNetherlands",
    "immovablePropertyDebtPeriodReduction",
    "immovablePropertyDebtProductID"
})
public class ImmovablePropertyDebtsNetherlandsSpecification
    extends Placeholder
{

    @XmlElement(name = "AddressPresentation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-tuples")
    protected AddressPresentation addressPresentation;
    @XmlElement(name = "ImmovablePropertyDebtBalanceType", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeInteger2FItemType immovablePropertyDebtBalanceType;
    @XmlElement(name = "ImmovablePropertyDebtEndDate", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected DateItemType immovablePropertyDebtEndDate;
    @XmlElement(name = "ImmovablePropertyDebtIdentificationNumberNetherlands", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring34VItemType immovablePropertyDebtIdentificationNumberNetherlands;
    @XmlElement(name = "ImmovablePropertyDebtInterestAmountDomesticTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyDebtInterestAmountDomesticTaxpayer;
    @XmlElement(name = "ImmovablePropertyDebtInterestAmountForeignTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyDebtInterestAmountForeignTaxpayer;
    @XmlElement(name = "ImmovablePropertyDebtInterestDomesticTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Perc32ItemType immovablePropertyDebtInterestDomesticTaxpayer;
    @XmlElement(name = "ImmovablePropertyDebtInterestForeignTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Perc32ItemType immovablePropertyDebtInterestForeignTaxpayer;
    @XmlElement(name = "ImmovablePropertyDebtInterestPartnerForeignTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Perc32ItemType immovablePropertyDebtInterestPartnerForeignTaxpayer;
    @XmlElement(name = "ImmovablePropertyDebtNetherlands", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyDebtNetherlands;
    @XmlElement(name = "ImmovablePropertyDebtPeriodReduction", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyDebtPeriodReduction;
    @XmlElement(name = "ImmovablePropertyDebtProductID", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring20VItemType immovablePropertyDebtProductID;

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
     * Gets the value of the immovablePropertyDebtBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getImmovablePropertyDebtBalanceType() {
        return immovablePropertyDebtBalanceType;
    }

    /**
     * Sets the value of the immovablePropertyDebtBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setImmovablePropertyDebtBalanceType(NonNegativeInteger2FItemType value) {
        this.immovablePropertyDebtBalanceType = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getImmovablePropertyDebtEndDate() {
        return immovablePropertyDebtEndDate;
    }

    /**
     * Sets the value of the immovablePropertyDebtEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setImmovablePropertyDebtEndDate(DateItemType value) {
        this.immovablePropertyDebtEndDate = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtIdentificationNumberNetherlands property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getImmovablePropertyDebtIdentificationNumberNetherlands() {
        return immovablePropertyDebtIdentificationNumberNetherlands;
    }

    /**
     * Sets the value of the immovablePropertyDebtIdentificationNumberNetherlands property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setImmovablePropertyDebtIdentificationNumberNetherlands(Anstring34VItemType value) {
        this.immovablePropertyDebtIdentificationNumberNetherlands = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtInterestAmountDomesticTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyDebtInterestAmountDomesticTaxpayer() {
        return immovablePropertyDebtInterestAmountDomesticTaxpayer;
    }

    /**
     * Sets the value of the immovablePropertyDebtInterestAmountDomesticTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyDebtInterestAmountDomesticTaxpayer(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyDebtInterestAmountDomesticTaxpayer = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtInterestAmountForeignTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyDebtInterestAmountForeignTaxpayer() {
        return immovablePropertyDebtInterestAmountForeignTaxpayer;
    }

    /**
     * Sets the value of the immovablePropertyDebtInterestAmountForeignTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyDebtInterestAmountForeignTaxpayer(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyDebtInterestAmountForeignTaxpayer = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtInterestDomesticTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getImmovablePropertyDebtInterestDomesticTaxpayer() {
        return immovablePropertyDebtInterestDomesticTaxpayer;
    }

    /**
     * Sets the value of the immovablePropertyDebtInterestDomesticTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setImmovablePropertyDebtInterestDomesticTaxpayer(Perc32ItemType value) {
        this.immovablePropertyDebtInterestDomesticTaxpayer = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtInterestForeignTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getImmovablePropertyDebtInterestForeignTaxpayer() {
        return immovablePropertyDebtInterestForeignTaxpayer;
    }

    /**
     * Sets the value of the immovablePropertyDebtInterestForeignTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setImmovablePropertyDebtInterestForeignTaxpayer(Perc32ItemType value) {
        this.immovablePropertyDebtInterestForeignTaxpayer = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtInterestPartnerForeignTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getImmovablePropertyDebtInterestPartnerForeignTaxpayer() {
        return immovablePropertyDebtInterestPartnerForeignTaxpayer;
    }

    /**
     * Sets the value of the immovablePropertyDebtInterestPartnerForeignTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setImmovablePropertyDebtInterestPartnerForeignTaxpayer(Perc32ItemType value) {
        this.immovablePropertyDebtInterestPartnerForeignTaxpayer = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtNetherlands property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyDebtNetherlands() {
        return immovablePropertyDebtNetherlands;
    }

    /**
     * Sets the value of the immovablePropertyDebtNetherlands property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyDebtNetherlands(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyDebtNetherlands = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtPeriodReduction property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyDebtPeriodReduction() {
        return immovablePropertyDebtPeriodReduction;
    }

    /**
     * Sets the value of the immovablePropertyDebtPeriodReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyDebtPeriodReduction(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyDebtPeriodReduction = value;
    }

    /**
     * Gets the value of the immovablePropertyDebtProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getImmovablePropertyDebtProductID() {
        return immovablePropertyDebtProductID;
    }

    /**
     * Sets the value of the immovablePropertyDebtProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setImmovablePropertyDebtProductID(Anstring20VItemType value) {
        this.immovablePropertyDebtProductID = value;
    }

}
