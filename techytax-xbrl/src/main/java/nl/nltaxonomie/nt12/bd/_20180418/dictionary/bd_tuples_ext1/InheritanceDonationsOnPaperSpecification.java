//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_tuples_ext1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring10VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring200VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Perc32ItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Test11ItemType;
import nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_codes_ext1.InterestItemType;
import org.xbrl._2003.instance.BooleanItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationOnPaperEntirePossessionTestatorPartner" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperAmountNotPaid" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperCurrentInterestPaid" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperDeed" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperDonationValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperInterestActuallyPaid" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperInterestPercentage" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperReceiverDonationDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperReceiverDonationIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperReceiverDonationInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperReceiverDonationPrefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperReceiverDonationSurname" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperSingleOrCompoundInterest" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperTestatorPartnerCommonPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperTestatorPartnerPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceDonationsOnPaperTestatorPrivatePart" minOccurs="0"/>
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
    "inheritanceDonationOnPaperEntirePossessionTestatorPartner",
    "inheritanceDonationsOnPaperAmountNotPaid",
    "inheritanceDonationsOnPaperCurrentInterestPaid",
    "inheritanceDonationsOnPaperDeed",
    "inheritanceDonationsOnPaperDonationValue",
    "inheritanceDonationsOnPaperInterestActuallyPaid",
    "inheritanceDonationsOnPaperInterestPercentage",
    "inheritanceDonationsOnPaperReceiverDonationDateOfBirth",
    "inheritanceDonationsOnPaperReceiverDonationIdentificationNumber",
    "inheritanceDonationsOnPaperReceiverDonationInitials",
    "inheritanceDonationsOnPaperReceiverDonationPrefix",
    "inheritanceDonationsOnPaperReceiverDonationSurname",
    "inheritanceDonationsOnPaperSingleOrCompoundInterest",
    "inheritanceDonationsOnPaperTestatorPartnerCommonPart",
    "inheritanceDonationsOnPaperTestatorPartnerPart",
    "inheritanceDonationsOnPaperTestatorPrivatePart"
})
public class InheritanceDonationsOnPaperSpecification
    extends Placeholder
{

    @XmlElement(name = "InheritanceDonationOnPaperEntirePossessionTestatorPartner", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected BooleanItemType inheritanceDonationOnPaperEntirePossessionTestatorPartner;
    @XmlElement(name = "InheritanceDonationsOnPaperAmountNotPaid", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceDonationsOnPaperAmountNotPaid;
    @XmlElement(name = "InheritanceDonationsOnPaperCurrentInterestPaid", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected BooleanItemType inheritanceDonationsOnPaperCurrentInterestPaid;
    @XmlElement(name = "InheritanceDonationsOnPaperDeed", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected BooleanItemType inheritanceDonationsOnPaperDeed;
    @XmlElement(name = "InheritanceDonationsOnPaperDonationValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceDonationsOnPaperDonationValue;
    @XmlElement(name = "InheritanceDonationsOnPaperInterestActuallyPaid", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected BooleanItemType inheritanceDonationsOnPaperInterestActuallyPaid;
    @XmlElement(name = "InheritanceDonationsOnPaperInterestPercentage", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Perc32ItemType inheritanceDonationsOnPaperInterestPercentage;
    @XmlElement(name = "InheritanceDonationsOnPaperReceiverDonationDateOfBirth", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected DateItemType inheritanceDonationsOnPaperReceiverDonationDateOfBirth;
    @XmlElement(name = "InheritanceDonationsOnPaperReceiverDonationIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Test11ItemType inheritanceDonationsOnPaperReceiverDonationIdentificationNumber;
    @XmlElement(name = "InheritanceDonationsOnPaperReceiverDonationInitials", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring10VItemType inheritanceDonationsOnPaperReceiverDonationInitials;
    @XmlElement(name = "InheritanceDonationsOnPaperReceiverDonationPrefix", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring10VItemType inheritanceDonationsOnPaperReceiverDonationPrefix;
    @XmlElement(name = "InheritanceDonationsOnPaperReceiverDonationSurname", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring200VItemType inheritanceDonationsOnPaperReceiverDonationSurname;
    @XmlElement(name = "InheritanceDonationsOnPaperSingleOrCompoundInterest", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected InterestItemType inheritanceDonationsOnPaperSingleOrCompoundInterest;
    @XmlElement(name = "InheritanceDonationsOnPaperTestatorPartnerCommonPart", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceDonationsOnPaperTestatorPartnerCommonPart;
    @XmlElement(name = "InheritanceDonationsOnPaperTestatorPartnerPart", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceDonationsOnPaperTestatorPartnerPart;
    @XmlElement(name = "InheritanceDonationsOnPaperTestatorPrivatePart", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceDonationsOnPaperTestatorPrivatePart;

    /**
     * Gets the value of the inheritanceDonationOnPaperEntirePossessionTestatorPartner property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getInheritanceDonationOnPaperEntirePossessionTestatorPartner() {
        return inheritanceDonationOnPaperEntirePossessionTestatorPartner;
    }

    /**
     * Sets the value of the inheritanceDonationOnPaperEntirePossessionTestatorPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setInheritanceDonationOnPaperEntirePossessionTestatorPartner(BooleanItemType value) {
        this.inheritanceDonationOnPaperEntirePossessionTestatorPartner = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperAmountNotPaid property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceDonationsOnPaperAmountNotPaid() {
        return inheritanceDonationsOnPaperAmountNotPaid;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperAmountNotPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperAmountNotPaid(MonetaryNoDecimals10VItemType value) {
        this.inheritanceDonationsOnPaperAmountNotPaid = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperCurrentInterestPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getInheritanceDonationsOnPaperCurrentInterestPaid() {
        return inheritanceDonationsOnPaperCurrentInterestPaid;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperCurrentInterestPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperCurrentInterestPaid(BooleanItemType value) {
        this.inheritanceDonationsOnPaperCurrentInterestPaid = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperDeed property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getInheritanceDonationsOnPaperDeed() {
        return inheritanceDonationsOnPaperDeed;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperDeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperDeed(BooleanItemType value) {
        this.inheritanceDonationsOnPaperDeed = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperDonationValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceDonationsOnPaperDonationValue() {
        return inheritanceDonationsOnPaperDonationValue;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperDonationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperDonationValue(MonetaryNoDecimals10VItemType value) {
        this.inheritanceDonationsOnPaperDonationValue = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperInterestActuallyPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getInheritanceDonationsOnPaperInterestActuallyPaid() {
        return inheritanceDonationsOnPaperInterestActuallyPaid;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperInterestActuallyPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperInterestActuallyPaid(BooleanItemType value) {
        this.inheritanceDonationsOnPaperInterestActuallyPaid = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperInterestPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getInheritanceDonationsOnPaperInterestPercentage() {
        return inheritanceDonationsOnPaperInterestPercentage;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperInterestPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperInterestPercentage(Perc32ItemType value) {
        this.inheritanceDonationsOnPaperInterestPercentage = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperReceiverDonationDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getInheritanceDonationsOnPaperReceiverDonationDateOfBirth() {
        return inheritanceDonationsOnPaperReceiverDonationDateOfBirth;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperReceiverDonationDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperReceiverDonationDateOfBirth(DateItemType value) {
        this.inheritanceDonationsOnPaperReceiverDonationDateOfBirth = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperReceiverDonationIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getInheritanceDonationsOnPaperReceiverDonationIdentificationNumber() {
        return inheritanceDonationsOnPaperReceiverDonationIdentificationNumber;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperReceiverDonationIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperReceiverDonationIdentificationNumber(Test11ItemType value) {
        this.inheritanceDonationsOnPaperReceiverDonationIdentificationNumber = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperReceiverDonationInitials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getInheritanceDonationsOnPaperReceiverDonationInitials() {
        return inheritanceDonationsOnPaperReceiverDonationInitials;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperReceiverDonationInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperReceiverDonationInitials(Anstring10VItemType value) {
        this.inheritanceDonationsOnPaperReceiverDonationInitials = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperReceiverDonationPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getInheritanceDonationsOnPaperReceiverDonationPrefix() {
        return inheritanceDonationsOnPaperReceiverDonationPrefix;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperReceiverDonationPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperReceiverDonationPrefix(Anstring10VItemType value) {
        this.inheritanceDonationsOnPaperReceiverDonationPrefix = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperReceiverDonationSurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getInheritanceDonationsOnPaperReceiverDonationSurname() {
        return inheritanceDonationsOnPaperReceiverDonationSurname;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperReceiverDonationSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperReceiverDonationSurname(Anstring200VItemType value) {
        this.inheritanceDonationsOnPaperReceiverDonationSurname = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperSingleOrCompoundInterest property.
     * 
     * @return
     *     possible object is
     *     {@link InterestItemType }
     *     
     */
    public InterestItemType getInheritanceDonationsOnPaperSingleOrCompoundInterest() {
        return inheritanceDonationsOnPaperSingleOrCompoundInterest;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperSingleOrCompoundInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperSingleOrCompoundInterest(InterestItemType value) {
        this.inheritanceDonationsOnPaperSingleOrCompoundInterest = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperTestatorPartnerCommonPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceDonationsOnPaperTestatorPartnerCommonPart() {
        return inheritanceDonationsOnPaperTestatorPartnerCommonPart;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperTestatorPartnerCommonPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperTestatorPartnerCommonPart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceDonationsOnPaperTestatorPartnerCommonPart = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperTestatorPartnerPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceDonationsOnPaperTestatorPartnerPart() {
        return inheritanceDonationsOnPaperTestatorPartnerPart;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperTestatorPartnerPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperTestatorPartnerPart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceDonationsOnPaperTestatorPartnerPart = value;
    }

    /**
     * Gets the value of the inheritanceDonationsOnPaperTestatorPrivatePart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceDonationsOnPaperTestatorPrivatePart() {
        return inheritanceDonationsOnPaperTestatorPrivatePart;
    }

    /**
     * Sets the value of the inheritanceDonationsOnPaperTestatorPrivatePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceDonationsOnPaperTestatorPrivatePart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceDonationsOnPaperTestatorPrivatePart = value;
    }

}
