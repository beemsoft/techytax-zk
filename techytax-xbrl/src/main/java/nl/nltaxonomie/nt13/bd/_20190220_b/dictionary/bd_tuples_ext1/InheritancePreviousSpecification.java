//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20190220_b.dictionary.bd_tuples_ext1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Anstring10VItemType;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Anstring200VItemType;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Test11ItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritancePreviousBeneficiaryDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritancePreviousBeneficiaryIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritancePreviousBeneficiaryInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritancePreviousBeneficiaryInstitutionName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritancePreviousBeneficiaryPrefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritancePreviousBeneficiarySurname" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritancePreviousObtainingValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}WillAuthorDeceasedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}WillAuthorInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}WillAuthorPrefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}WillAuthorSurname" minOccurs="0"/>
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

    @XmlElement(name = "InheritancePreviousBeneficiaryDateOfBirth", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected DateItemType inheritancePreviousBeneficiaryDateOfBirth;
    @XmlElement(name = "InheritancePreviousBeneficiaryIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Test11ItemType inheritancePreviousBeneficiaryIdentificationNumber;
    @XmlElement(name = "InheritancePreviousBeneficiaryInitials", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Anstring10VItemType inheritancePreviousBeneficiaryInitials;
    @XmlElement(name = "InheritancePreviousBeneficiaryInstitutionName", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Anstring200VItemType inheritancePreviousBeneficiaryInstitutionName;
    @XmlElement(name = "InheritancePreviousBeneficiaryPrefix", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Anstring10VItemType inheritancePreviousBeneficiaryPrefix;
    @XmlElement(name = "InheritancePreviousBeneficiarySurname", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Anstring200VItemType inheritancePreviousBeneficiarySurname;
    @XmlElement(name = "InheritancePreviousObtainingValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritancePreviousObtainingValue;
    @XmlElement(name = "WillAuthorDeceasedDate", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected DateItemType willAuthorDeceasedDate;
    @XmlElement(name = "WillAuthorInitials", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Anstring10VItemType willAuthorInitials;
    @XmlElement(name = "WillAuthorPrefix", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Anstring10VItemType willAuthorPrefix;
    @XmlElement(name = "WillAuthorSurname", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
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
