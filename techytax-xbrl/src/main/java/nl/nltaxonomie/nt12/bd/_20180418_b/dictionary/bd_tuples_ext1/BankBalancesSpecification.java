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
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import org.xbrl._2003.instance.BooleanItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}BankBalancesBankAccountBalanceOnDeceasedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}BankBalancesBankAccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}BankBalancesEntirePossessionTestatorPartner" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}BankBalancesTestatorPartnerCommonPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}BankBalancesTestatorPartnerPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}BankBalancesTestatorPrivatePart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}BankBalancesValueLegacy" minOccurs="0"/>
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
    "bankBalancesBankAccountBalanceOnDeceasedDate",
    "bankBalancesBankAccountNumber",
    "bankBalancesEntirePossessionTestatorPartner",
    "bankBalancesTestatorPartnerCommonPart",
    "bankBalancesTestatorPartnerPart",
    "bankBalancesTestatorPrivatePart",
    "bankBalancesValueLegacy"
})
public class BankBalancesSpecification
    extends Placeholder
{

    @XmlElement(name = "BankBalancesBankAccountBalanceOnDeceasedDate", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType bankBalancesBankAccountBalanceOnDeceasedDate;
    @XmlElement(name = "BankBalancesBankAccountNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected Anstring34VItemType bankBalancesBankAccountNumber;
    @XmlElement(name = "BankBalancesEntirePossessionTestatorPartner", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected BooleanItemType bankBalancesEntirePossessionTestatorPartner;
    @XmlElement(name = "BankBalancesTestatorPartnerCommonPart", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType bankBalancesTestatorPartnerCommonPart;
    @XmlElement(name = "BankBalancesTestatorPartnerPart", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType bankBalancesTestatorPartnerPart;
    @XmlElement(name = "BankBalancesTestatorPrivatePart", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType bankBalancesTestatorPrivatePart;
    @XmlElement(name = "BankBalancesValueLegacy", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType bankBalancesValueLegacy;

    /**
     * Gets the value of the bankBalancesBankAccountBalanceOnDeceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBankBalancesBankAccountBalanceOnDeceasedDate() {
        return bankBalancesBankAccountBalanceOnDeceasedDate;
    }

    /**
     * Sets the value of the bankBalancesBankAccountBalanceOnDeceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBankBalancesBankAccountBalanceOnDeceasedDate(MonetaryNoDecimals10VItemType value) {
        this.bankBalancesBankAccountBalanceOnDeceasedDate = value;
    }

    /**
     * Gets the value of the bankBalancesBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getBankBalancesBankAccountNumber() {
        return bankBalancesBankAccountNumber;
    }

    /**
     * Sets the value of the bankBalancesBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setBankBalancesBankAccountNumber(Anstring34VItemType value) {
        this.bankBalancesBankAccountNumber = value;
    }

    /**
     * Gets the value of the bankBalancesEntirePossessionTestatorPartner property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getBankBalancesEntirePossessionTestatorPartner() {
        return bankBalancesEntirePossessionTestatorPartner;
    }

    /**
     * Sets the value of the bankBalancesEntirePossessionTestatorPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setBankBalancesEntirePossessionTestatorPartner(BooleanItemType value) {
        this.bankBalancesEntirePossessionTestatorPartner = value;
    }

    /**
     * Gets the value of the bankBalancesTestatorPartnerCommonPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBankBalancesTestatorPartnerCommonPart() {
        return bankBalancesTestatorPartnerCommonPart;
    }

    /**
     * Sets the value of the bankBalancesTestatorPartnerCommonPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBankBalancesTestatorPartnerCommonPart(MonetaryNoDecimals10VItemType value) {
        this.bankBalancesTestatorPartnerCommonPart = value;
    }

    /**
     * Gets the value of the bankBalancesTestatorPartnerPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBankBalancesTestatorPartnerPart() {
        return bankBalancesTestatorPartnerPart;
    }

    /**
     * Sets the value of the bankBalancesTestatorPartnerPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBankBalancesTestatorPartnerPart(MonetaryNoDecimals10VItemType value) {
        this.bankBalancesTestatorPartnerPart = value;
    }

    /**
     * Gets the value of the bankBalancesTestatorPrivatePart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBankBalancesTestatorPrivatePart() {
        return bankBalancesTestatorPrivatePart;
    }

    /**
     * Sets the value of the bankBalancesTestatorPrivatePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBankBalancesTestatorPrivatePart(MonetaryNoDecimals10VItemType value) {
        this.bankBalancesTestatorPrivatePart = value;
    }

    /**
     * Gets the value of the bankBalancesValueLegacy property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBankBalancesValueLegacy() {
        return bankBalancesValueLegacy;
    }

    /**
     * Sets the value of the bankBalancesValueLegacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBankBalancesValueLegacy(MonetaryNoDecimals10VItemType value) {
        this.bankBalancesValueLegacy = value;
    }

}
