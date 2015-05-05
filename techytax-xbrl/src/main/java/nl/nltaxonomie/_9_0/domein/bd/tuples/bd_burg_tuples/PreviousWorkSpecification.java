//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreviousWorkBenefitsAgencyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreviousWorkIncomeAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreviousWorkLifecycleLeaveReductionApplied" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreviousWorkTemporaryTaxCreditIndication" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreviousWorkWithheldWageLevy" minOccurs="0"/>
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
    "previousWorkBenefitsAgencyName",
    "previousWorkIncomeAmount",
    "previousWorkLifecycleLeaveReductionApplied",
    "previousWorkTemporaryTaxCreditIndication",
    "previousWorkWithheldWageLevy"
})
public class PreviousWorkSpecification
    extends Placeholder
{

    @XmlElement(name = "PreviousWorkBenefitsAgencyName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring70VItemType previousWorkBenefitsAgencyName;
    @XmlElement(name = "PreviousWorkIncomeAmount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType previousWorkIncomeAmount;
    @XmlElement(name = "PreviousWorkLifecycleLeaveReductionApplied", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType previousWorkLifecycleLeaveReductionApplied;
    @XmlElement(name = "PreviousWorkTemporaryTaxCreditIndication", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType previousWorkTemporaryTaxCreditIndication;
    @XmlElement(name = "PreviousWorkWithheldWageLevy", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType previousWorkWithheldWageLevy;

    /**
     * Gets the value of the previousWorkBenefitsAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getPreviousWorkBenefitsAgencyName() {
        return previousWorkBenefitsAgencyName;
    }

    /**
     * Sets the value of the previousWorkBenefitsAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setPreviousWorkBenefitsAgencyName(Anstring70VItemType value) {
        this.previousWorkBenefitsAgencyName = value;
    }

    /**
     * Gets the value of the previousWorkIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPreviousWorkIncomeAmount() {
        return previousWorkIncomeAmount;
    }

    /**
     * Sets the value of the previousWorkIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPreviousWorkIncomeAmount(MonetaryNoDecimalsItemType value) {
        this.previousWorkIncomeAmount = value;
    }

    /**
     * Gets the value of the previousWorkLifecycleLeaveReductionApplied property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPreviousWorkLifecycleLeaveReductionApplied() {
        return previousWorkLifecycleLeaveReductionApplied;
    }

    /**
     * Sets the value of the previousWorkLifecycleLeaveReductionApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPreviousWorkLifecycleLeaveReductionApplied(MonetaryNoDecimalsItemType value) {
        this.previousWorkLifecycleLeaveReductionApplied = value;
    }

    /**
     * Gets the value of the previousWorkTemporaryTaxCreditIndication property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getPreviousWorkTemporaryTaxCreditIndication() {
        return previousWorkTemporaryTaxCreditIndication;
    }

    /**
     * Sets the value of the previousWorkTemporaryTaxCreditIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setPreviousWorkTemporaryTaxCreditIndication(BooleanItemType value) {
        this.previousWorkTemporaryTaxCreditIndication = value;
    }

    /**
     * Gets the value of the previousWorkWithheldWageLevy property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getPreviousWorkWithheldWageLevy() {
        return previousWorkWithheldWageLevy;
    }

    /**
     * Sets the value of the previousWorkWithheldWageLevy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setPreviousWorkWithheldWageLevy(NonNegativeMonetaryNoDecimalsItemType value) {
        this.previousWorkWithheldWageLevy = value;
    }

}
