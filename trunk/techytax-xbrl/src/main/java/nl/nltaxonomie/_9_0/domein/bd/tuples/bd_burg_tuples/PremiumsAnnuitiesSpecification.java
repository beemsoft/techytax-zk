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
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring20VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring4VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PremiumsAnnuitiesCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PremiumsAnnuitiesInsurerName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PremiumsAnnuitiesPaidAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PremiumsAnnuitiesPolicyNumber" minOccurs="0"/>
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
    "premiumsAnnuitiesCode",
    "premiumsAnnuitiesInsurerName",
    "premiumsAnnuitiesPaidAmount",
    "premiumsAnnuitiesPolicyNumber"
})
public class PremiumsAnnuitiesSpecification
    extends Placeholder
{

    @XmlElement(name = "PremiumsAnnuitiesCode", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring4VItemType premiumsAnnuitiesCode;
    @XmlElement(name = "PremiumsAnnuitiesInsurerName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring70VItemType premiumsAnnuitiesInsurerName;
    @XmlElement(name = "PremiumsAnnuitiesPaidAmount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType premiumsAnnuitiesPaidAmount;
    @XmlElement(name = "PremiumsAnnuitiesPolicyNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring20VItemType premiumsAnnuitiesPolicyNumber;

    /**
     * Gets the value of the premiumsAnnuitiesCode property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring4VItemType }
     *     
     */
    public Anstring4VItemType getPremiumsAnnuitiesCode() {
        return premiumsAnnuitiesCode;
    }

    /**
     * Sets the value of the premiumsAnnuitiesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring4VItemType }
     *     
     */
    public void setPremiumsAnnuitiesCode(Anstring4VItemType value) {
        this.premiumsAnnuitiesCode = value;
    }

    /**
     * Gets the value of the premiumsAnnuitiesInsurerName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getPremiumsAnnuitiesInsurerName() {
        return premiumsAnnuitiesInsurerName;
    }

    /**
     * Sets the value of the premiumsAnnuitiesInsurerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setPremiumsAnnuitiesInsurerName(Anstring70VItemType value) {
        this.premiumsAnnuitiesInsurerName = value;
    }

    /**
     * Gets the value of the premiumsAnnuitiesPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPremiumsAnnuitiesPaidAmount() {
        return premiumsAnnuitiesPaidAmount;
    }

    /**
     * Sets the value of the premiumsAnnuitiesPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPremiumsAnnuitiesPaidAmount(MonetaryNoDecimalsItemType value) {
        this.premiumsAnnuitiesPaidAmount = value;
    }

    /**
     * Gets the value of the premiumsAnnuitiesPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getPremiumsAnnuitiesPolicyNumber() {
        return premiumsAnnuitiesPolicyNumber;
    }

    /**
     * Sets the value of the premiumsAnnuitiesPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setPremiumsAnnuitiesPolicyNumber(Anstring20VItemType value) {
        this.premiumsAnnuitiesPolicyNumber = value;
    }

}
