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
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring34VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.MonetaryNoDecimals10VItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritanceStockAccountsBalanceOnDeceasedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritanceStockAccountsBankAccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritanceStockAccountsEntirePossessionTestatorPartner" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritanceStockAccountsTestatorPartnerCommonPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritanceStockAccountsTestatorPartnerPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritanceStockAccountsTestatorPrivatePart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritanceStockAccountsValueLegacy" minOccurs="0"/>
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
    "inheritanceStockAccountsBalanceOnDeceasedDate",
    "inheritanceStockAccountsBankAccountNumber",
    "inheritanceStockAccountsEntirePossessionTestatorPartner",
    "inheritanceStockAccountsTestatorPartnerCommonPart",
    "inheritanceStockAccountsTestatorPartnerPart",
    "inheritanceStockAccountsTestatorPrivatePart",
    "inheritanceStockAccountsValueLegacy"
})
public class InheritanceStockAccountsSpecification
    extends Placeholder
{

    @XmlElement(name = "InheritanceStockAccountsBalanceOnDeceasedDate", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType inheritanceStockAccountsBalanceOnDeceasedDate;
    @XmlElement(name = "InheritanceStockAccountsBankAccountNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring34VItemType inheritanceStockAccountsBankAccountNumber;
    @XmlElement(name = "InheritanceStockAccountsEntirePossessionTestatorPartner", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType inheritanceStockAccountsEntirePossessionTestatorPartner;
    @XmlElement(name = "InheritanceStockAccountsTestatorPartnerCommonPart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType inheritanceStockAccountsTestatorPartnerCommonPart;
    @XmlElement(name = "InheritanceStockAccountsTestatorPartnerPart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType inheritanceStockAccountsTestatorPartnerPart;
    @XmlElement(name = "InheritanceStockAccountsTestatorPrivatePart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType inheritanceStockAccountsTestatorPrivatePart;
    @XmlElement(name = "InheritanceStockAccountsValueLegacy", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType inheritanceStockAccountsValueLegacy;

    /**
     * Gets the value of the inheritanceStockAccountsBalanceOnDeceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceStockAccountsBalanceOnDeceasedDate() {
        return inheritanceStockAccountsBalanceOnDeceasedDate;
    }

    /**
     * Sets the value of the inheritanceStockAccountsBalanceOnDeceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceStockAccountsBalanceOnDeceasedDate(MonetaryNoDecimals10VItemType value) {
        this.inheritanceStockAccountsBalanceOnDeceasedDate = value;
    }

    /**
     * Gets the value of the inheritanceStockAccountsBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getInheritanceStockAccountsBankAccountNumber() {
        return inheritanceStockAccountsBankAccountNumber;
    }

    /**
     * Sets the value of the inheritanceStockAccountsBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setInheritanceStockAccountsBankAccountNumber(Anstring34VItemType value) {
        this.inheritanceStockAccountsBankAccountNumber = value;
    }

    /**
     * Gets the value of the inheritanceStockAccountsEntirePossessionTestatorPartner property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getInheritanceStockAccountsEntirePossessionTestatorPartner() {
        return inheritanceStockAccountsEntirePossessionTestatorPartner;
    }

    /**
     * Sets the value of the inheritanceStockAccountsEntirePossessionTestatorPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setInheritanceStockAccountsEntirePossessionTestatorPartner(BooleanItemType value) {
        this.inheritanceStockAccountsEntirePossessionTestatorPartner = value;
    }

    /**
     * Gets the value of the inheritanceStockAccountsTestatorPartnerCommonPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceStockAccountsTestatorPartnerCommonPart() {
        return inheritanceStockAccountsTestatorPartnerCommonPart;
    }

    /**
     * Sets the value of the inheritanceStockAccountsTestatorPartnerCommonPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceStockAccountsTestatorPartnerCommonPart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceStockAccountsTestatorPartnerCommonPart = value;
    }

    /**
     * Gets the value of the inheritanceStockAccountsTestatorPartnerPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceStockAccountsTestatorPartnerPart() {
        return inheritanceStockAccountsTestatorPartnerPart;
    }

    /**
     * Sets the value of the inheritanceStockAccountsTestatorPartnerPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceStockAccountsTestatorPartnerPart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceStockAccountsTestatorPartnerPart = value;
    }

    /**
     * Gets the value of the inheritanceStockAccountsTestatorPrivatePart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceStockAccountsTestatorPrivatePart() {
        return inheritanceStockAccountsTestatorPrivatePart;
    }

    /**
     * Sets the value of the inheritanceStockAccountsTestatorPrivatePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceStockAccountsTestatorPrivatePart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceStockAccountsTestatorPrivatePart = value;
    }

    /**
     * Gets the value of the inheritanceStockAccountsValueLegacy property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceStockAccountsValueLegacy() {
        return inheritanceStockAccountsValueLegacy;
    }

    /**
     * Sets the value of the inheritanceStockAccountsValueLegacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceStockAccountsValueLegacy(MonetaryNoDecimals10VItemType value) {
        this.inheritanceStockAccountsValueLegacy = value;
    }

}
