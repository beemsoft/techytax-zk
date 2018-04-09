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
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.iso3166_countrycodes_2017_03_18.IsoCountryCodes3CharactersItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}DoubleTaxationAvoidanceSettlementInnovationboxCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}DoubleTaxationAvoidanceSettlementInnovationboxDeductibleTax" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}DoubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}DoubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}DoubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts" minOccurs="0"/>
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
    "doubleTaxationAvoidanceSettlementInnovationboxCountryCode",
    "doubleTaxationAvoidanceSettlementInnovationboxDeductibleTax",
    "doubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears",
    "doubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties",
    "doubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts"
})
public class DoubleTaxationAvoidanceSettlementInnovationboxSpecification
    extends Placeholder
{

    @XmlElement(name = "DoubleTaxationAvoidanceSettlementInnovationboxCountryCode", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected IsoCountryCodes3CharactersItemType doubleTaxationAvoidanceSettlementInnovationboxCountryCode;
    @XmlElement(name = "DoubleTaxationAvoidanceSettlementInnovationboxDeductibleTax", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType doubleTaxationAvoidanceSettlementInnovationboxDeductibleTax;
    @XmlElement(name = "DoubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType doubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears;
    @XmlElement(name = "DoubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType doubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties;
    @XmlElement(name = "DoubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType doubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts;

    /**
     * Gets the value of the doubleTaxationAvoidanceSettlementInnovationboxCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getDoubleTaxationAvoidanceSettlementInnovationboxCountryCode() {
        return doubleTaxationAvoidanceSettlementInnovationboxCountryCode;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSettlementInnovationboxCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSettlementInnovationboxCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.doubleTaxationAvoidanceSettlementInnovationboxCountryCode = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSettlementInnovationboxDeductibleTax property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSettlementInnovationboxDeductibleTax() {
        return doubleTaxationAvoidanceSettlementInnovationboxDeductibleTax;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSettlementInnovationboxDeductibleTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSettlementInnovationboxDeductibleTax(NonNegativeMonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSettlementInnovationboxDeductibleTax = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears() {
        return doubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears(NonNegativeMonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSettlementInnovationboxForwardShiftingPreviousYears = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties() {
        return doubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties(NonNegativeMonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSettlementInnovationboxGrossRoyalties = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts() {
        return doubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts(NonNegativeMonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSettlementInnovationboxRoyaltiesDeductibleCosts = value;
    }

}
