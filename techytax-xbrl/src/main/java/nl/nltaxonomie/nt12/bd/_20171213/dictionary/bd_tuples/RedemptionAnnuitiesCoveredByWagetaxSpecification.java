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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}RedemptionAnnuitiesCoveredByWagetaxAnnuityRedemption" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}RedemptionAnnuitiesCoveredByWagetaxPayingAgencyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}RedemptionAnnuitiesCoveredByWagetaxWageLevy" minOccurs="0"/>
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
    "redemptionAnnuitiesCoveredByWagetaxAnnuityRedemption",
    "redemptionAnnuitiesCoveredByWagetaxPayingAgencyName",
    "redemptionAnnuitiesCoveredByWagetaxWageLevy"
})
public class RedemptionAnnuitiesCoveredByWagetaxSpecification
    extends Placeholder
{

    @XmlElement(name = "RedemptionAnnuitiesCoveredByWagetaxAnnuityRedemption", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType redemptionAnnuitiesCoveredByWagetaxAnnuityRedemption;
    @XmlElement(name = "RedemptionAnnuitiesCoveredByWagetaxPayingAgencyName", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring70VItemType redemptionAnnuitiesCoveredByWagetaxPayingAgencyName;
    @XmlElement(name = "RedemptionAnnuitiesCoveredByWagetaxWageLevy", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType redemptionAnnuitiesCoveredByWagetaxWageLevy;

    /**
     * Gets the value of the redemptionAnnuitiesCoveredByWagetaxAnnuityRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getRedemptionAnnuitiesCoveredByWagetaxAnnuityRedemption() {
        return redemptionAnnuitiesCoveredByWagetaxAnnuityRedemption;
    }

    /**
     * Sets the value of the redemptionAnnuitiesCoveredByWagetaxAnnuityRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setRedemptionAnnuitiesCoveredByWagetaxAnnuityRedemption(NonNegativeMonetaryNoDecimalsItemType value) {
        this.redemptionAnnuitiesCoveredByWagetaxAnnuityRedemption = value;
    }

    /**
     * Gets the value of the redemptionAnnuitiesCoveredByWagetaxPayingAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getRedemptionAnnuitiesCoveredByWagetaxPayingAgencyName() {
        return redemptionAnnuitiesCoveredByWagetaxPayingAgencyName;
    }

    /**
     * Sets the value of the redemptionAnnuitiesCoveredByWagetaxPayingAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setRedemptionAnnuitiesCoveredByWagetaxPayingAgencyName(Anstring70VItemType value) {
        this.redemptionAnnuitiesCoveredByWagetaxPayingAgencyName = value;
    }

    /**
     * Gets the value of the redemptionAnnuitiesCoveredByWagetaxWageLevy property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getRedemptionAnnuitiesCoveredByWagetaxWageLevy() {
        return redemptionAnnuitiesCoveredByWagetaxWageLevy;
    }

    /**
     * Sets the value of the redemptionAnnuitiesCoveredByWagetaxWageLevy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setRedemptionAnnuitiesCoveredByWagetaxWageLevy(NonNegativeMonetaryNoDecimalsItemType value) {
        this.redemptionAnnuitiesCoveredByWagetaxWageLevy = value;
    }

}