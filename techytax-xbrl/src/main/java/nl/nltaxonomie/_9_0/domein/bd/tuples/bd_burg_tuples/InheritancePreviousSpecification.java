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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritancePreviousBeneficiaryDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritancePreviousBeneficiaryIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritancePreviousBeneficiaryInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritancePreviousBeneficiaryInstitutionName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritancePreviousBeneficiaryPrefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritancePreviousBeneficiarySurname" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}InheritancePreviousObtainingValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}WillAuthorDeceasedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}WillAuthorInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}WillAuthorPrefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}WillAuthorSurname" minOccurs="0"/>
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
    "inheritancePreviousBeneficiaryDateOfBirth",
    "inheritancePreviousBeneficiaryIdentificationNumber",
    "inheritancePreviousBeneficiaryInitials",
    "inheritancePreviousBeneficiaryInstitutionName",
    "inheritancePreviousBeneficiaryPrefix",
    "inheritancePreviousBeneficiarySurname",
    "inheritancePreviousObtainingValue",
    "willAuthorDeceasedDate",
    "willAuthorInitials",
    "willAuthorPrefix",
    "willAuthorSurname"
})
public class InheritancePreviousSpecification
    extends Placeholder
{

    @XmlElement(name = "InheritancePreviousBeneficiaryDateOfBirth", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType inheritancePreviousBeneficiaryDateOfBirth;
    @XmlElement(name = "InheritancePreviousBeneficiaryIdentificationNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Test11ItemType inheritancePreviousBeneficiaryIdentificationNumber;
    @XmlElement(name = "InheritancePreviousBeneficiaryInitials", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring10VItemType inheritancePreviousBeneficiaryInitials;
    @XmlElement(name = "InheritancePreviousBeneficiaryInstitutionName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring200VItemType inheritancePreviousBeneficiaryInstitutionName;
    @XmlElement(name = "InheritancePreviousBeneficiaryPrefix", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring10VItemType inheritancePreviousBeneficiaryPrefix;
    @XmlElement(name = "InheritancePreviousBeneficiarySurname", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring200VItemType inheritancePreviousBeneficiarySurname;
    @XmlElement(name = "InheritancePreviousObtainingValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType inheritancePreviousObtainingValue;
    @XmlElement(name = "WillAuthorDeceasedDate", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType willAuthorDeceasedDate;
    @XmlElement(name = "WillAuthorInitials", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring10VItemType willAuthorInitials;
    @XmlElement(name = "WillAuthorPrefix", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring10VItemType willAuthorPrefix;
    @XmlElement(name = "WillAuthorSurname", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring200VItemType willAuthorSurname;

    /**
     * Gets the value of the inheritancePreviousBeneficiaryDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getInheritancePreviousBeneficiaryDateOfBirth() {
        return inheritancePreviousBeneficiaryDateOfBirth;
    }

    /**
     * Sets the value of the inheritancePreviousBeneficiaryDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setInheritancePreviousBeneficiaryDateOfBirth(DateItemType value) {
        this.inheritancePreviousBeneficiaryDateOfBirth = value;
    }

    /**
     * Gets the value of the inheritancePreviousBeneficiaryIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getInheritancePreviousBeneficiaryIdentificationNumber() {
        return inheritancePreviousBeneficiaryIdentificationNumber;
    }

    /**
     * Sets the value of the inheritancePreviousBeneficiaryIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setInheritancePreviousBeneficiaryIdentificationNumber(Test11ItemType value) {
        this.inheritancePreviousBeneficiaryIdentificationNumber = value;
    }

    /**
     * Gets the value of the inheritancePreviousBeneficiaryInitials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getInheritancePreviousBeneficiaryInitials() {
        return inheritancePreviousBeneficiaryInitials;
    }

    /**
     * Sets the value of the inheritancePreviousBeneficiaryInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setInheritancePreviousBeneficiaryInitials(Anstring10VItemType value) {
        this.inheritancePreviousBeneficiaryInitials = value;
    }

    /**
     * Gets the value of the inheritancePreviousBeneficiaryInstitutionName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getInheritancePreviousBeneficiaryInstitutionName() {
        return inheritancePreviousBeneficiaryInstitutionName;
    }

    /**
     * Sets the value of the inheritancePreviousBeneficiaryInstitutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setInheritancePreviousBeneficiaryInstitutionName(Anstring200VItemType value) {
        this.inheritancePreviousBeneficiaryInstitutionName = value;
    }

    /**
     * Gets the value of the inheritancePreviousBeneficiaryPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getInheritancePreviousBeneficiaryPrefix() {
        return inheritancePreviousBeneficiaryPrefix;
    }

    /**
     * Sets the value of the inheritancePreviousBeneficiaryPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setInheritancePreviousBeneficiaryPrefix(Anstring10VItemType value) {
        this.inheritancePreviousBeneficiaryPrefix = value;
    }

    /**
     * Gets the value of the inheritancePreviousBeneficiarySurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getInheritancePreviousBeneficiarySurname() {
        return inheritancePreviousBeneficiarySurname;
    }

    /**
     * Sets the value of the inheritancePreviousBeneficiarySurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setInheritancePreviousBeneficiarySurname(Anstring200VItemType value) {
        this.inheritancePreviousBeneficiarySurname = value;
    }

    /**
     * Gets the value of the inheritancePreviousObtainingValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritancePreviousObtainingValue() {
        return inheritancePreviousObtainingValue;
    }

    /**
     * Sets the value of the inheritancePreviousObtainingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritancePreviousObtainingValue(MonetaryNoDecimals10VItemType value) {
        this.inheritancePreviousObtainingValue = value;
    }

    /**
     * Gets the value of the willAuthorDeceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getWillAuthorDeceasedDate() {
        return willAuthorDeceasedDate;
    }

    /**
     * Sets the value of the willAuthorDeceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setWillAuthorDeceasedDate(DateItemType value) {
        this.willAuthorDeceasedDate = value;
    }

    /**
     * Gets the value of the willAuthorInitials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getWillAuthorInitials() {
        return willAuthorInitials;
    }

    /**
     * Sets the value of the willAuthorInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setWillAuthorInitials(Anstring10VItemType value) {
        this.willAuthorInitials = value;
    }

    /**
     * Gets the value of the willAuthorPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getWillAuthorPrefix() {
        return willAuthorPrefix;
    }

    /**
     * Sets the value of the willAuthorPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setWillAuthorPrefix(Anstring10VItemType value) {
        this.willAuthorPrefix = value;
    }

    /**
     * Gets the value of the willAuthorSurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getWillAuthorSurname() {
        return willAuthorSurname;
    }

    /**
     * Sets the value of the willAuthorSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setWillAuthorSurname(Anstring200VItemType value) {
        this.willAuthorSurname = value;
    }

}