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
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.NonNegativeInteger2FItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Perc32ItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyBalanceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyDomesticTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyForeignTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyInterestDomesticTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyInterestForeignTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyInterestPartnerForeignTaxpayer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyNominal" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DebtOtherPropertyProductID" minOccurs="0"/>
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
    "debtOtherPropertyBalanceType",
    "debtOtherPropertyDescription",
    "debtOtherPropertyDomesticTaxpayer",
    "debtOtherPropertyForeignTaxpayer",
    "debtOtherPropertyIdentificationNumber",
    "debtOtherPropertyInterestDomesticTaxpayer",
    "debtOtherPropertyInterestForeignTaxpayer",
    "debtOtherPropertyInterestPartnerForeignTaxpayer",
    "debtOtherPropertyNominal",
    "debtOtherPropertyProductID"
})
public class DebtsOtherPropertySpecification
    extends Placeholder
{

    @XmlElement(name = "DebtOtherPropertyBalanceType", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeInteger2FItemType debtOtherPropertyBalanceType;
    @XmlElement(name = "DebtOtherPropertyDescription", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring70VItemType debtOtherPropertyDescription;
    @XmlElement(name = "DebtOtherPropertyDomesticTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType debtOtherPropertyDomesticTaxpayer;
    @XmlElement(name = "DebtOtherPropertyForeignTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType debtOtherPropertyForeignTaxpayer;
    @XmlElement(name = "DebtOtherPropertyIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring34VItemType debtOtherPropertyIdentificationNumber;
    @XmlElement(name = "DebtOtherPropertyInterestDomesticTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Perc32ItemType debtOtherPropertyInterestDomesticTaxpayer;
    @XmlElement(name = "DebtOtherPropertyInterestForeignTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Perc32ItemType debtOtherPropertyInterestForeignTaxpayer;
    @XmlElement(name = "DebtOtherPropertyInterestPartnerForeignTaxpayer", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Perc32ItemType debtOtherPropertyInterestPartnerForeignTaxpayer;
    @XmlElement(name = "DebtOtherPropertyNominal", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType debtOtherPropertyNominal;
    @XmlElement(name = "DebtOtherPropertyProductID", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring20VItemType debtOtherPropertyProductID;

    /**
     * Gets the value of the debtOtherPropertyBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getDebtOtherPropertyBalanceType() {
        return debtOtherPropertyBalanceType;
    }

    /**
     * Sets the value of the debtOtherPropertyBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setDebtOtherPropertyBalanceType(NonNegativeInteger2FItemType value) {
        this.debtOtherPropertyBalanceType = value;
    }

    /**
     * Gets the value of the debtOtherPropertyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getDebtOtherPropertyDescription() {
        return debtOtherPropertyDescription;
    }

    /**
     * Sets the value of the debtOtherPropertyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setDebtOtherPropertyDescription(Anstring70VItemType value) {
        this.debtOtherPropertyDescription = value;
    }

    /**
     * Gets the value of the debtOtherPropertyDomesticTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDebtOtherPropertyDomesticTaxpayer() {
        return debtOtherPropertyDomesticTaxpayer;
    }

    /**
     * Sets the value of the debtOtherPropertyDomesticTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtOtherPropertyDomesticTaxpayer(NonNegativeMonetaryNoDecimalsItemType value) {
        this.debtOtherPropertyDomesticTaxpayer = value;
    }

    /**
     * Gets the value of the debtOtherPropertyForeignTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDebtOtherPropertyForeignTaxpayer() {
        return debtOtherPropertyForeignTaxpayer;
    }

    /**
     * Sets the value of the debtOtherPropertyForeignTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtOtherPropertyForeignTaxpayer(NonNegativeMonetaryNoDecimalsItemType value) {
        this.debtOtherPropertyForeignTaxpayer = value;
    }

    /**
     * Gets the value of the debtOtherPropertyIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getDebtOtherPropertyIdentificationNumber() {
        return debtOtherPropertyIdentificationNumber;
    }

    /**
     * Sets the value of the debtOtherPropertyIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setDebtOtherPropertyIdentificationNumber(Anstring34VItemType value) {
        this.debtOtherPropertyIdentificationNumber = value;
    }

    /**
     * Gets the value of the debtOtherPropertyInterestDomesticTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getDebtOtherPropertyInterestDomesticTaxpayer() {
        return debtOtherPropertyInterestDomesticTaxpayer;
    }

    /**
     * Sets the value of the debtOtherPropertyInterestDomesticTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setDebtOtherPropertyInterestDomesticTaxpayer(Perc32ItemType value) {
        this.debtOtherPropertyInterestDomesticTaxpayer = value;
    }

    /**
     * Gets the value of the debtOtherPropertyInterestForeignTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getDebtOtherPropertyInterestForeignTaxpayer() {
        return debtOtherPropertyInterestForeignTaxpayer;
    }

    /**
     * Sets the value of the debtOtherPropertyInterestForeignTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setDebtOtherPropertyInterestForeignTaxpayer(Perc32ItemType value) {
        this.debtOtherPropertyInterestForeignTaxpayer = value;
    }

    /**
     * Gets the value of the debtOtherPropertyInterestPartnerForeignTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getDebtOtherPropertyInterestPartnerForeignTaxpayer() {
        return debtOtherPropertyInterestPartnerForeignTaxpayer;
    }

    /**
     * Sets the value of the debtOtherPropertyInterestPartnerForeignTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setDebtOtherPropertyInterestPartnerForeignTaxpayer(Perc32ItemType value) {
        this.debtOtherPropertyInterestPartnerForeignTaxpayer = value;
    }

    /**
     * Gets the value of the debtOtherPropertyNominal property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDebtOtherPropertyNominal() {
        return debtOtherPropertyNominal;
    }

    /**
     * Sets the value of the debtOtherPropertyNominal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtOtherPropertyNominal(NonNegativeMonetaryNoDecimalsItemType value) {
        this.debtOtherPropertyNominal = value;
    }

    /**
     * Gets the value of the debtOtherPropertyProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getDebtOtherPropertyProductID() {
        return debtOtherPropertyProductID;
    }

    /**
     * Sets the value of the debtOtherPropertyProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setDebtOtherPropertyProductID(Anstring20VItemType value) {
        this.debtOtherPropertyProductID = value;
    }

}
