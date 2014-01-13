//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.09 at 10:28:44 PM CET 
//


package nl.nltaxonomie._8_0.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0.basis.bd.types.bd_types.Pure30ItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ListedBuildingDeductibleExpenses" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ListedBuildingEntitlementPercentage" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ListedBuildingExpensesThreshold" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ListedBuildingImmovablePropertyLawValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ListedBuildingJanuaryFirstCommercialValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ListedBuildingMaintenanceCostsAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ListedBuildingMaintenanceCostsAmountCommitmentBefore2012" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ListedBuildingOwnHouseExists" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ListedBuildingSubsidy" minOccurs="0"/>
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
    "listedBuildingDeductibleExpenses",
    "listedBuildingEntitlementPercentage",
    "listedBuildingExpensesThreshold",
    "listedBuildingImmovablePropertyLawValue",
    "listedBuildingJanuaryFirstCommercialValue",
    "listedBuildingMaintenanceCostsAmount",
    "listedBuildingMaintenanceCostsAmountCommitmentBefore2012",
    "listedBuildingOwnHouseExists",
    "listedBuildingSubsidy"
})
public class ListedBuildingCostsSpecification
    extends Placeholder
{

    @XmlElement(name = "ListedBuildingDeductibleExpenses", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType listedBuildingDeductibleExpenses;
    @XmlElement(name = "ListedBuildingEntitlementPercentage", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected Pure30ItemType listedBuildingEntitlementPercentage;
    @XmlElement(name = "ListedBuildingExpensesThreshold", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType listedBuildingExpensesThreshold;
    @XmlElement(name = "ListedBuildingImmovablePropertyLawValue", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType listedBuildingImmovablePropertyLawValue;
    @XmlElement(name = "ListedBuildingJanuaryFirstCommercialValue", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType listedBuildingJanuaryFirstCommercialValue;
    @XmlElement(name = "ListedBuildingMaintenanceCostsAmount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType listedBuildingMaintenanceCostsAmount;
    @XmlElement(name = "ListedBuildingMaintenanceCostsAmountCommitmentBefore2012", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType listedBuildingMaintenanceCostsAmountCommitmentBefore2012;
    @XmlElement(name = "ListedBuildingOwnHouseExists", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected BooleanItemType listedBuildingOwnHouseExists;
    @XmlElement(name = "ListedBuildingSubsidy", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType listedBuildingSubsidy;

    /**
     * Gets the value of the listedBuildingDeductibleExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getListedBuildingDeductibleExpenses() {
        return listedBuildingDeductibleExpenses;
    }

    /**
     * Sets the value of the listedBuildingDeductibleExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingDeductibleExpenses(NonNegativeMonetaryNoDecimalsItemType value) {
        this.listedBuildingDeductibleExpenses = value;
    }

    /**
     * Gets the value of the listedBuildingEntitlementPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Pure30ItemType }
     *     
     */
    public Pure30ItemType getListedBuildingEntitlementPercentage() {
        return listedBuildingEntitlementPercentage;
    }

    /**
     * Sets the value of the listedBuildingEntitlementPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pure30ItemType }
     *     
     */
    public void setListedBuildingEntitlementPercentage(Pure30ItemType value) {
        this.listedBuildingEntitlementPercentage = value;
    }

    /**
     * Gets the value of the listedBuildingExpensesThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getListedBuildingExpensesThreshold() {
        return listedBuildingExpensesThreshold;
    }

    /**
     * Sets the value of the listedBuildingExpensesThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingExpensesThreshold(MonetaryNoDecimalsItemType value) {
        this.listedBuildingExpensesThreshold = value;
    }

    /**
     * Gets the value of the listedBuildingImmovablePropertyLawValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getListedBuildingImmovablePropertyLawValue() {
        return listedBuildingImmovablePropertyLawValue;
    }

    /**
     * Sets the value of the listedBuildingImmovablePropertyLawValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingImmovablePropertyLawValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.listedBuildingImmovablePropertyLawValue = value;
    }

    /**
     * Gets the value of the listedBuildingJanuaryFirstCommercialValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getListedBuildingJanuaryFirstCommercialValue() {
        return listedBuildingJanuaryFirstCommercialValue;
    }

    /**
     * Sets the value of the listedBuildingJanuaryFirstCommercialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingJanuaryFirstCommercialValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.listedBuildingJanuaryFirstCommercialValue = value;
    }

    /**
     * Gets the value of the listedBuildingMaintenanceCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getListedBuildingMaintenanceCostsAmount() {
        return listedBuildingMaintenanceCostsAmount;
    }

    /**
     * Sets the value of the listedBuildingMaintenanceCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingMaintenanceCostsAmount(MonetaryNoDecimalsItemType value) {
        this.listedBuildingMaintenanceCostsAmount = value;
    }

    /**
     * Gets the value of the listedBuildingMaintenanceCostsAmountCommitmentBefore2012 property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getListedBuildingMaintenanceCostsAmountCommitmentBefore2012() {
        return listedBuildingMaintenanceCostsAmountCommitmentBefore2012;
    }

    /**
     * Sets the value of the listedBuildingMaintenanceCostsAmountCommitmentBefore2012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingMaintenanceCostsAmountCommitmentBefore2012(NonNegativeMonetaryNoDecimalsItemType value) {
        this.listedBuildingMaintenanceCostsAmountCommitmentBefore2012 = value;
    }

    /**
     * Gets the value of the listedBuildingOwnHouseExists property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getListedBuildingOwnHouseExists() {
        return listedBuildingOwnHouseExists;
    }

    /**
     * Sets the value of the listedBuildingOwnHouseExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setListedBuildingOwnHouseExists(BooleanItemType value) {
        this.listedBuildingOwnHouseExists = value;
    }

    /**
     * Gets the value of the listedBuildingSubsidy property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getListedBuildingSubsidy() {
        return listedBuildingSubsidy;
    }

    /**
     * Sets the value of the listedBuildingSubsidy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingSubsidy(MonetaryNoDecimalsItemType value) {
        this.listedBuildingSubsidy = value;
    }

}
