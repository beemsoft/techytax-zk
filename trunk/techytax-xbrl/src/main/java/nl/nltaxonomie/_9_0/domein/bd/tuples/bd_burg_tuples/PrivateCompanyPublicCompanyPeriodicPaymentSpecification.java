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
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring10VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring200VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Test11ItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyShareholderDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyShareholderIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyShareholderInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyShareholderPrefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyShareholderSharesCount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyShareholderSurname" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanyShareRiseExpirationPensionRights" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanySharesAcquisitionPrice" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PrivateCompanyPublicCompanySharesValue" minOccurs="0"/>
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
    "privateCompanyPublicCompanyIdentificationNumber",
    "privateCompanyPublicCompanyName",
    "privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage",
    "privateCompanyPublicCompanyShareholderDateOfBirth",
    "privateCompanyPublicCompanyShareholderIdentificationNumber",
    "privateCompanyPublicCompanyShareholderInitials",
    "privateCompanyPublicCompanyShareholderPrefix",
    "privateCompanyPublicCompanyShareholderSharesCount",
    "privateCompanyPublicCompanyShareholderSurname",
    "privateCompanyPublicCompanyShareRiseExpirationPensionRights",
    "privateCompanyPublicCompanySharesAcquisitionPrice",
    "privateCompanyPublicCompanySharesValue"
})
public class PrivateCompanyPublicCompanyPeriodicPaymentSpecification
    extends Placeholder
{

    @XmlElement(name = "PrivateCompanyPublicCompanyIdentificationNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Test11ItemType privateCompanyPublicCompanyIdentificationNumber;
    @XmlElement(name = "PrivateCompanyPublicCompanyName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring200VItemType privateCompanyPublicCompanyName;
    @XmlElement(name = "PrivateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage;
    @XmlElement(name = "PrivateCompanyPublicCompanyShareholderDateOfBirth", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType privateCompanyPublicCompanyShareholderDateOfBirth;
    @XmlElement(name = "PrivateCompanyPublicCompanyShareholderIdentificationNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Test11ItemType privateCompanyPublicCompanyShareholderIdentificationNumber;
    @XmlElement(name = "PrivateCompanyPublicCompanyShareholderInitials", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring10VItemType privateCompanyPublicCompanyShareholderInitials;
    @XmlElement(name = "PrivateCompanyPublicCompanyShareholderPrefix", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring10VItemType privateCompanyPublicCompanyShareholderPrefix;
    @XmlElement(name = "PrivateCompanyPublicCompanyShareholderSharesCount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType privateCompanyPublicCompanyShareholderSharesCount;
    @XmlElement(name = "PrivateCompanyPublicCompanyShareholderSurname", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring200VItemType privateCompanyPublicCompanyShareholderSurname;
    @XmlElement(name = "PrivateCompanyPublicCompanyShareRiseExpirationPensionRights", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType privateCompanyPublicCompanyShareRiseExpirationPensionRights;
    @XmlElement(name = "PrivateCompanyPublicCompanySharesAcquisitionPrice", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType privateCompanyPublicCompanySharesAcquisitionPrice;
    @XmlElement(name = "PrivateCompanyPublicCompanySharesValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType privateCompanyPublicCompanySharesValue;

    /**
     * Gets the value of the privateCompanyPublicCompanyIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getPrivateCompanyPublicCompanyIdentificationNumber() {
        return privateCompanyPublicCompanyIdentificationNumber;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyIdentificationNumber(Test11ItemType value) {
        this.privateCompanyPublicCompanyIdentificationNumber = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getPrivateCompanyPublicCompanyName() {
        return privateCompanyPublicCompanyName;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyName(Anstring200VItemType value) {
        this.privateCompanyPublicCompanyName = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getPrivateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage() {
        return privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage(BooleanItemType value) {
        this.privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyShareholderDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getPrivateCompanyPublicCompanyShareholderDateOfBirth() {
        return privateCompanyPublicCompanyShareholderDateOfBirth;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyShareholderDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyShareholderDateOfBirth(DateItemType value) {
        this.privateCompanyPublicCompanyShareholderDateOfBirth = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyShareholderIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getPrivateCompanyPublicCompanyShareholderIdentificationNumber() {
        return privateCompanyPublicCompanyShareholderIdentificationNumber;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyShareholderIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyShareholderIdentificationNumber(Test11ItemType value) {
        this.privateCompanyPublicCompanyShareholderIdentificationNumber = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyShareholderInitials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getPrivateCompanyPublicCompanyShareholderInitials() {
        return privateCompanyPublicCompanyShareholderInitials;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyShareholderInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyShareholderInitials(Anstring10VItemType value) {
        this.privateCompanyPublicCompanyShareholderInitials = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyShareholderPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getPrivateCompanyPublicCompanyShareholderPrefix() {
        return privateCompanyPublicCompanyShareholderPrefix;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyShareholderPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyShareholderPrefix(Anstring10VItemType value) {
        this.privateCompanyPublicCompanyShareholderPrefix = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyShareholderSharesCount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getPrivateCompanyPublicCompanyShareholderSharesCount() {
        return privateCompanyPublicCompanyShareholderSharesCount;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyShareholderSharesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyShareholderSharesCount(MonetaryNoDecimals10VItemType value) {
        this.privateCompanyPublicCompanyShareholderSharesCount = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyShareholderSurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getPrivateCompanyPublicCompanyShareholderSurname() {
        return privateCompanyPublicCompanyShareholderSurname;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyShareholderSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyShareholderSurname(Anstring200VItemType value) {
        this.privateCompanyPublicCompanyShareholderSurname = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyShareRiseExpirationPensionRights property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getPrivateCompanyPublicCompanyShareRiseExpirationPensionRights() {
        return privateCompanyPublicCompanyShareRiseExpirationPensionRights;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyShareRiseExpirationPensionRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyShareRiseExpirationPensionRights(MonetaryNoDecimals10VItemType value) {
        this.privateCompanyPublicCompanyShareRiseExpirationPensionRights = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanySharesAcquisitionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getPrivateCompanyPublicCompanySharesAcquisitionPrice() {
        return privateCompanyPublicCompanySharesAcquisitionPrice;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanySharesAcquisitionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanySharesAcquisitionPrice(MonetaryNoDecimals10VItemType value) {
        this.privateCompanyPublicCompanySharesAcquisitionPrice = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanySharesValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getPrivateCompanyPublicCompanySharesValue() {
        return privateCompanyPublicCompanySharesValue;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanySharesValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanySharesValue(MonetaryNoDecimals10VItemType value) {
        this.privateCompanyPublicCompanySharesValue = value;
    }

}
