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
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ApplicationArticle15aiExists" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}CapitalComponentAtUseCounterEvidenceValuation" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}CapitalComponentNotOwnedNewOwnerArticle15aiExists" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}CapitalComponentOccasionRemovalSubsidiaryBookValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}CapitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}CapitalComponentOwnedNewOwnerArticle15aiExists" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}MutualDebtOccasionRemovingSubsidiaryTaxEntityValuation" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}MutualDebtOtherCompanyValuation" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}MutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}MutualReceivableOtherCompanyValuation" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ProfitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ProfitTaxEntityDueToFormingReinvestmentReserveNewOwner" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ReinvestmentReserveBuildUpByNewOwnerExists" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ReinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ReinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ReinvestmentReserveUsageByNewOwnerExists" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ReplacingBusinessAssetsOccasionRemovalSubsidiaryBookValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}ReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}SubsidiaryName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}SubsidiaryRemovedSacrificedAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}TaxEntityProfitTransferCapitalComponent" minOccurs="0"/>
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
    "applicationArticle15AiExists",
    "capitalComponentAtUseCounterEvidenceValuation",
    "capitalComponentNotOwnedNewOwnerArticle15AiExists",
    "capitalComponentOccasionRemovalSubsidiaryBookValue",
    "capitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue",
    "capitalComponentOwnedNewOwnerArticle15AiExists",
    "mutualDebtOccasionRemovingSubsidiaryTaxEntityValuation",
    "mutualDebtOtherCompanyValuation",
    "mutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation",
    "mutualReceivableOtherCompanyValuation",
    "profitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity",
    "profitTaxEntityDueToFormingReinvestmentReserveNewOwner",
    "reinvestmentReserveBuildUpByNewOwnerExists",
    "reinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists",
    "reinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists",
    "reinvestmentReserveUsageByNewOwnerExists",
    "replacingBusinessAssetsOccasionRemovalSubsidiaryBookValue",
    "replacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue",
    "subsidiaryName",
    "subsidiaryRemovedSacrificedAmount",
    "taxEntityProfitTransferCapitalComponent"
})
public class SubsidiariesRemovalTaxEntitySpecification
    extends Placeholder
{

    @XmlElement(name = "ApplicationArticle15aiExists", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected BooleanItemType applicationArticle15AiExists;
    @XmlElement(name = "CapitalComponentAtUseCounterEvidenceValuation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType capitalComponentAtUseCounterEvidenceValuation;
    @XmlElement(name = "CapitalComponentNotOwnedNewOwnerArticle15aiExists", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected BooleanItemType capitalComponentNotOwnedNewOwnerArticle15AiExists;
    @XmlElement(name = "CapitalComponentOccasionRemovalSubsidiaryBookValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType capitalComponentOccasionRemovalSubsidiaryBookValue;
    @XmlElement(name = "CapitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType capitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue;
    @XmlElement(name = "CapitalComponentOwnedNewOwnerArticle15aiExists", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected BooleanItemType capitalComponentOwnedNewOwnerArticle15AiExists;
    @XmlElement(name = "MutualDebtOccasionRemovingSubsidiaryTaxEntityValuation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType mutualDebtOccasionRemovingSubsidiaryTaxEntityValuation;
    @XmlElement(name = "MutualDebtOtherCompanyValuation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType mutualDebtOtherCompanyValuation;
    @XmlElement(name = "MutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType mutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation;
    @XmlElement(name = "MutualReceivableOtherCompanyValuation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType mutualReceivableOtherCompanyValuation;
    @XmlElement(name = "ProfitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType profitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity;
    @XmlElement(name = "ProfitTaxEntityDueToFormingReinvestmentReserveNewOwner", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType profitTaxEntityDueToFormingReinvestmentReserveNewOwner;
    @XmlElement(name = "ReinvestmentReserveBuildUpByNewOwnerExists", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected BooleanItemType reinvestmentReserveBuildUpByNewOwnerExists;
    @XmlElement(name = "ReinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected BooleanItemType reinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists;
    @XmlElement(name = "ReinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected BooleanItemType reinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists;
    @XmlElement(name = "ReinvestmentReserveUsageByNewOwnerExists", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected BooleanItemType reinvestmentReserveUsageByNewOwnerExists;
    @XmlElement(name = "ReplacingBusinessAssetsOccasionRemovalSubsidiaryBookValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType replacingBusinessAssetsOccasionRemovalSubsidiaryBookValue;
    @XmlElement(name = "ReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType replacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue;
    @XmlElement(name = "SubsidiaryName", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring70VItemType subsidiaryName;
    @XmlElement(name = "SubsidiaryRemovedSacrificedAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType subsidiaryRemovedSacrificedAmount;
    @XmlElement(name = "TaxEntityProfitTransferCapitalComponent", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType taxEntityProfitTransferCapitalComponent;

    /**
     * Gets the value of the applicationArticle15AiExists property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getApplicationArticle15AiExists() {
        return applicationArticle15AiExists;
    }

    /**
     * Sets the value of the applicationArticle15AiExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setApplicationArticle15AiExists(BooleanItemType value) {
        this.applicationArticle15AiExists = value;
    }

    /**
     * Gets the value of the capitalComponentAtUseCounterEvidenceValuation property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getCapitalComponentAtUseCounterEvidenceValuation() {
        return capitalComponentAtUseCounterEvidenceValuation;
    }

    /**
     * Sets the value of the capitalComponentAtUseCounterEvidenceValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setCapitalComponentAtUseCounterEvidenceValuation(NonNegativeMonetaryNoDecimalsItemType value) {
        this.capitalComponentAtUseCounterEvidenceValuation = value;
    }

    /**
     * Gets the value of the capitalComponentNotOwnedNewOwnerArticle15AiExists property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getCapitalComponentNotOwnedNewOwnerArticle15AiExists() {
        return capitalComponentNotOwnedNewOwnerArticle15AiExists;
    }

    /**
     * Sets the value of the capitalComponentNotOwnedNewOwnerArticle15AiExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setCapitalComponentNotOwnedNewOwnerArticle15AiExists(BooleanItemType value) {
        this.capitalComponentNotOwnedNewOwnerArticle15AiExists = value;
    }

    /**
     * Gets the value of the capitalComponentOccasionRemovalSubsidiaryBookValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getCapitalComponentOccasionRemovalSubsidiaryBookValue() {
        return capitalComponentOccasionRemovalSubsidiaryBookValue;
    }

    /**
     * Sets the value of the capitalComponentOccasionRemovalSubsidiaryBookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setCapitalComponentOccasionRemovalSubsidiaryBookValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.capitalComponentOccasionRemovalSubsidiaryBookValue = value;
    }

    /**
     * Gets the value of the capitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getCapitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue() {
        return capitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue;
    }

    /**
     * Sets the value of the capitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setCapitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.capitalComponentOccasionRemovalSubsidiaryTaxEntityCommercialValue = value;
    }

    /**
     * Gets the value of the capitalComponentOwnedNewOwnerArticle15AiExists property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getCapitalComponentOwnedNewOwnerArticle15AiExists() {
        return capitalComponentOwnedNewOwnerArticle15AiExists;
    }

    /**
     * Sets the value of the capitalComponentOwnedNewOwnerArticle15AiExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setCapitalComponentOwnedNewOwnerArticle15AiExists(BooleanItemType value) {
        this.capitalComponentOwnedNewOwnerArticle15AiExists = value;
    }

    /**
     * Gets the value of the mutualDebtOccasionRemovingSubsidiaryTaxEntityValuation property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getMutualDebtOccasionRemovingSubsidiaryTaxEntityValuation() {
        return mutualDebtOccasionRemovingSubsidiaryTaxEntityValuation;
    }

    /**
     * Sets the value of the mutualDebtOccasionRemovingSubsidiaryTaxEntityValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setMutualDebtOccasionRemovingSubsidiaryTaxEntityValuation(NonNegativeMonetaryNoDecimalsItemType value) {
        this.mutualDebtOccasionRemovingSubsidiaryTaxEntityValuation = value;
    }

    /**
     * Gets the value of the mutualDebtOtherCompanyValuation property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getMutualDebtOtherCompanyValuation() {
        return mutualDebtOtherCompanyValuation;
    }

    /**
     * Sets the value of the mutualDebtOtherCompanyValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setMutualDebtOtherCompanyValuation(NonNegativeMonetaryNoDecimalsItemType value) {
        this.mutualDebtOtherCompanyValuation = value;
    }

    /**
     * Gets the value of the mutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getMutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation() {
        return mutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation;
    }

    /**
     * Sets the value of the mutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setMutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation(NonNegativeMonetaryNoDecimalsItemType value) {
        this.mutualReceivableOccasionRemovingSubsidiaryTaxEntityValuation = value;
    }

    /**
     * Gets the value of the mutualReceivableOtherCompanyValuation property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getMutualReceivableOtherCompanyValuation() {
        return mutualReceivableOtherCompanyValuation;
    }

    /**
     * Sets the value of the mutualReceivableOtherCompanyValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setMutualReceivableOtherCompanyValuation(NonNegativeMonetaryNoDecimalsItemType value) {
        this.mutualReceivableOtherCompanyValuation = value;
    }

    /**
     * Gets the value of the profitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getProfitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity() {
        return profitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity;
    }

    /**
     * Sets the value of the profitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setProfitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity(NonNegativeMonetaryNoDecimalsItemType value) {
        this.profitRevaluationReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntity = value;
    }

    /**
     * Gets the value of the profitTaxEntityDueToFormingReinvestmentReserveNewOwner property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getProfitTaxEntityDueToFormingReinvestmentReserveNewOwner() {
        return profitTaxEntityDueToFormingReinvestmentReserveNewOwner;
    }

    /**
     * Sets the value of the profitTaxEntityDueToFormingReinvestmentReserveNewOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setProfitTaxEntityDueToFormingReinvestmentReserveNewOwner(NonNegativeMonetaryNoDecimalsItemType value) {
        this.profitTaxEntityDueToFormingReinvestmentReserveNewOwner = value;
    }

    /**
     * Gets the value of the reinvestmentReserveBuildUpByNewOwnerExists property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getReinvestmentReserveBuildUpByNewOwnerExists() {
        return reinvestmentReserveBuildUpByNewOwnerExists;
    }

    /**
     * Sets the value of the reinvestmentReserveBuildUpByNewOwnerExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setReinvestmentReserveBuildUpByNewOwnerExists(BooleanItemType value) {
        this.reinvestmentReserveBuildUpByNewOwnerExists = value;
    }

    /**
     * Gets the value of the reinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getReinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists() {
        return reinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists;
    }

    /**
     * Sets the value of the reinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setReinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists(BooleanItemType value) {
        this.reinvestmentReserveOccasionRemovingSubsidiaryTaxEntityExists = value;
    }

    /**
     * Gets the value of the reinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getReinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists() {
        return reinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists;
    }

    /**
     * Sets the value of the reinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setReinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists(BooleanItemType value) {
        this.reinvestmentReserveReplacementIntentionOccasionRemovingSubsidiaryTaxEntityExists = value;
    }

    /**
     * Gets the value of the reinvestmentReserveUsageByNewOwnerExists property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getReinvestmentReserveUsageByNewOwnerExists() {
        return reinvestmentReserveUsageByNewOwnerExists;
    }

    /**
     * Sets the value of the reinvestmentReserveUsageByNewOwnerExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setReinvestmentReserveUsageByNewOwnerExists(BooleanItemType value) {
        this.reinvestmentReserveUsageByNewOwnerExists = value;
    }

    /**
     * Gets the value of the replacingBusinessAssetsOccasionRemovalSubsidiaryBookValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getReplacingBusinessAssetsOccasionRemovalSubsidiaryBookValue() {
        return replacingBusinessAssetsOccasionRemovalSubsidiaryBookValue;
    }

    /**
     * Sets the value of the replacingBusinessAssetsOccasionRemovalSubsidiaryBookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setReplacingBusinessAssetsOccasionRemovalSubsidiaryBookValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.replacingBusinessAssetsOccasionRemovalSubsidiaryBookValue = value;
    }

    /**
     * Gets the value of the replacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue() {
        return replacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue;
    }

    /**
     * Sets the value of the replacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setReplacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.replacingBusinessAssetsOccasionRemovalSubsidiaryTaxEntityCommercialValue = value;
    }

    /**
     * Gets the value of the subsidiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getSubsidiaryName() {
        return subsidiaryName;
    }

    /**
     * Sets the value of the subsidiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setSubsidiaryName(Anstring70VItemType value) {
        this.subsidiaryName = value;
    }

    /**
     * Gets the value of the subsidiaryRemovedSacrificedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getSubsidiaryRemovedSacrificedAmount() {
        return subsidiaryRemovedSacrificedAmount;
    }

    /**
     * Sets the value of the subsidiaryRemovedSacrificedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setSubsidiaryRemovedSacrificedAmount(MonetaryNoDecimalsItemType value) {
        this.subsidiaryRemovedSacrificedAmount = value;
    }

    /**
     * Gets the value of the taxEntityProfitTransferCapitalComponent property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxEntityProfitTransferCapitalComponent() {
        return taxEntityProfitTransferCapitalComponent;
    }

    /**
     * Sets the value of the taxEntityProfitTransferCapitalComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxEntityProfitTransferCapitalComponent(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxEntityProfitTransferCapitalComponent = value;
    }

}
