//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_tuples_ext1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring10VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring200VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Test11ItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacyDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacyEntirePossessionTestatorPartner" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacyInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacyPrefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacySurname" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacyTestatorIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacyTestatorPartnerCommonPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacyTestatorPartnerPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacyTestatorPrivatePart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}InheritanceNotYetDividedLegacyValueLegacy" minOccurs="0"/>
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
    "inheritanceNotYetDividedLegacyDateOfBirth",
    "inheritanceNotYetDividedLegacyEntirePossessionTestatorPartner",
    "inheritanceNotYetDividedLegacyInitials",
    "inheritanceNotYetDividedLegacyPrefix",
    "inheritanceNotYetDividedLegacySurname",
    "inheritanceNotYetDividedLegacyTestatorIdentificationNumber",
    "inheritanceNotYetDividedLegacyTestatorPartnerCommonPart",
    "inheritanceNotYetDividedLegacyTestatorPartnerPart",
    "inheritanceNotYetDividedLegacyTestatorPrivatePart",
    "inheritanceNotYetDividedLegacyValueLegacy"
})
public class InheritanceNotYetDividedLegacySpecification
    extends Placeholder
{

    @XmlElement(name = "InheritanceNotYetDividedLegacyDateOfBirth", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected DateItemType inheritanceNotYetDividedLegacyDateOfBirth;
    @XmlElement(name = "InheritanceNotYetDividedLegacyEntirePossessionTestatorPartner", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected BooleanItemType inheritanceNotYetDividedLegacyEntirePossessionTestatorPartner;
    @XmlElement(name = "InheritanceNotYetDividedLegacyInitials", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring10VItemType inheritanceNotYetDividedLegacyInitials;
    @XmlElement(name = "InheritanceNotYetDividedLegacyPrefix", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring10VItemType inheritanceNotYetDividedLegacyPrefix;
    @XmlElement(name = "InheritanceNotYetDividedLegacySurname", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring200VItemType inheritanceNotYetDividedLegacySurname;
    @XmlElement(name = "InheritanceNotYetDividedLegacyTestatorIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Test11ItemType inheritanceNotYetDividedLegacyTestatorIdentificationNumber;
    @XmlElement(name = "InheritanceNotYetDividedLegacyTestatorPartnerCommonPart", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceNotYetDividedLegacyTestatorPartnerCommonPart;
    @XmlElement(name = "InheritanceNotYetDividedLegacyTestatorPartnerPart", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceNotYetDividedLegacyTestatorPartnerPart;
    @XmlElement(name = "InheritanceNotYetDividedLegacyTestatorPrivatePart", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceNotYetDividedLegacyTestatorPrivatePart;
    @XmlElement(name = "InheritanceNotYetDividedLegacyValueLegacy", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceNotYetDividedLegacyValueLegacy;

    /**
     * Gets the value of the inheritanceNotYetDividedLegacyDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getInheritanceNotYetDividedLegacyDateOfBirth() {
        return inheritanceNotYetDividedLegacyDateOfBirth;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacyDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacyDateOfBirth(DateItemType value) {
        this.inheritanceNotYetDividedLegacyDateOfBirth = value;
    }

    /**
     * Gets the value of the inheritanceNotYetDividedLegacyEntirePossessionTestatorPartner property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getInheritanceNotYetDividedLegacyEntirePossessionTestatorPartner() {
        return inheritanceNotYetDividedLegacyEntirePossessionTestatorPartner;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacyEntirePossessionTestatorPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacyEntirePossessionTestatorPartner(BooleanItemType value) {
        this.inheritanceNotYetDividedLegacyEntirePossessionTestatorPartner = value;
    }

    /**
     * Gets the value of the inheritanceNotYetDividedLegacyInitials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getInheritanceNotYetDividedLegacyInitials() {
        return inheritanceNotYetDividedLegacyInitials;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacyInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacyInitials(Anstring10VItemType value) {
        this.inheritanceNotYetDividedLegacyInitials = value;
    }

    /**
     * Gets the value of the inheritanceNotYetDividedLegacyPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getInheritanceNotYetDividedLegacyPrefix() {
        return inheritanceNotYetDividedLegacyPrefix;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacyPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacyPrefix(Anstring10VItemType value) {
        this.inheritanceNotYetDividedLegacyPrefix = value;
    }

    /**
     * Gets the value of the inheritanceNotYetDividedLegacySurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getInheritanceNotYetDividedLegacySurname() {
        return inheritanceNotYetDividedLegacySurname;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacySurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacySurname(Anstring200VItemType value) {
        this.inheritanceNotYetDividedLegacySurname = value;
    }

    /**
     * Gets the value of the inheritanceNotYetDividedLegacyTestatorIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getInheritanceNotYetDividedLegacyTestatorIdentificationNumber() {
        return inheritanceNotYetDividedLegacyTestatorIdentificationNumber;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacyTestatorIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacyTestatorIdentificationNumber(Test11ItemType value) {
        this.inheritanceNotYetDividedLegacyTestatorIdentificationNumber = value;
    }

    /**
     * Gets the value of the inheritanceNotYetDividedLegacyTestatorPartnerCommonPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceNotYetDividedLegacyTestatorPartnerCommonPart() {
        return inheritanceNotYetDividedLegacyTestatorPartnerCommonPart;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacyTestatorPartnerCommonPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacyTestatorPartnerCommonPart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceNotYetDividedLegacyTestatorPartnerCommonPart = value;
    }

    /**
     * Gets the value of the inheritanceNotYetDividedLegacyTestatorPartnerPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceNotYetDividedLegacyTestatorPartnerPart() {
        return inheritanceNotYetDividedLegacyTestatorPartnerPart;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacyTestatorPartnerPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacyTestatorPartnerPart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceNotYetDividedLegacyTestatorPartnerPart = value;
    }

    /**
     * Gets the value of the inheritanceNotYetDividedLegacyTestatorPrivatePart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceNotYetDividedLegacyTestatorPrivatePart() {
        return inheritanceNotYetDividedLegacyTestatorPrivatePart;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacyTestatorPrivatePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacyTestatorPrivatePart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceNotYetDividedLegacyTestatorPrivatePart = value;
    }

    /**
     * Gets the value of the inheritanceNotYetDividedLegacyValueLegacy property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceNotYetDividedLegacyValueLegacy() {
        return inheritanceNotYetDividedLegacyValueLegacy;
    }

    /**
     * Sets the value of the inheritanceNotYetDividedLegacyValueLegacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceNotYetDividedLegacyValueLegacy(MonetaryNoDecimals10VItemType value) {
        this.inheritanceNotYetDividedLegacyValueLegacy = value;
    }

}
