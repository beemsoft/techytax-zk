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
import nl.nltaxonomie._9_0.basis.bd.types.bd_codes.TrainingItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}LoanFinalStudyYearPeriodEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}LoanFinalStudyYearPeriodForfaitAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}LoanFinalStudyYearPeriodStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}LoanFinalStudyYearPeriodTrainingType" minOccurs="0"/>
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
    "loanFinalStudyYearPeriodEndDate",
    "loanFinalStudyYearPeriodForfaitAmount",
    "loanFinalStudyYearPeriodStartDate",
    "loanFinalStudyYearPeriodTrainingType"
})
public class LoanFinalStudyYearPeriodSpecification
    extends Placeholder
{

    @XmlElement(name = "LoanFinalStudyYearPeriodEndDate", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType loanFinalStudyYearPeriodEndDate;
    @XmlElement(name = "LoanFinalStudyYearPeriodForfaitAmount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType loanFinalStudyYearPeriodForfaitAmount;
    @XmlElement(name = "LoanFinalStudyYearPeriodStartDate", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType loanFinalStudyYearPeriodStartDate;
    @XmlElement(name = "LoanFinalStudyYearPeriodTrainingType", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected TrainingItemType loanFinalStudyYearPeriodTrainingType;

    /**
     * Gets the value of the loanFinalStudyYearPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getLoanFinalStudyYearPeriodEndDate() {
        return loanFinalStudyYearPeriodEndDate;
    }

    /**
     * Sets the value of the loanFinalStudyYearPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setLoanFinalStudyYearPeriodEndDate(DateItemType value) {
        this.loanFinalStudyYearPeriodEndDate = value;
    }

    /**
     * Gets the value of the loanFinalStudyYearPeriodForfaitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getLoanFinalStudyYearPeriodForfaitAmount() {
        return loanFinalStudyYearPeriodForfaitAmount;
    }

    /**
     * Sets the value of the loanFinalStudyYearPeriodForfaitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setLoanFinalStudyYearPeriodForfaitAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.loanFinalStudyYearPeriodForfaitAmount = value;
    }

    /**
     * Gets the value of the loanFinalStudyYearPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getLoanFinalStudyYearPeriodStartDate() {
        return loanFinalStudyYearPeriodStartDate;
    }

    /**
     * Sets the value of the loanFinalStudyYearPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setLoanFinalStudyYearPeriodStartDate(DateItemType value) {
        this.loanFinalStudyYearPeriodStartDate = value;
    }

    /**
     * Gets the value of the loanFinalStudyYearPeriodTrainingType property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingItemType }
     *     
     */
    public TrainingItemType getLoanFinalStudyYearPeriodTrainingType() {
        return loanFinalStudyYearPeriodTrainingType;
    }

    /**
     * Sets the value of the loanFinalStudyYearPeriodTrainingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingItemType }
     *     
     */
    public void setLoanFinalStudyYearPeriodTrainingType(TrainingItemType value) {
        this.loanFinalStudyYearPeriodTrainingType = value;
    }

}
