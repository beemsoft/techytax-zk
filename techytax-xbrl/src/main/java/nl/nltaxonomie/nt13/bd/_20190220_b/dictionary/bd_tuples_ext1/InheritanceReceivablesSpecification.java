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
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Anstring20VItemType;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie.nt13.bd._20190220_b.dictionary.bd_types_ext1.Anstring40VItemType;
import nl.nltaxonomie.nt13.bd._20190220_b.dictionary.bd_types_ext1.Perc34ItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritanceReceivablesDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritanceReceivablesEntirePossessionTestatorPartner" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritanceReceivablesInterestPercentage" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritanceReceivablesTestatorPartnerCommonPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritanceReceivablesTestatorPartnerPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritanceReceivablesTestatorPrivatePart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritanceReceivablesValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}InheritanceReceivablesValueLegacy" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ReceivableImmidiatelyCollectableIndication" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ReceivableSingleOrCompoundInterest" minOccurs="0"/>
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
    "inheritanceReceivablesDescription",
    "inheritanceReceivablesEntirePossessionTestatorPartner",
    "inheritanceReceivablesInterestPercentage",
    "inheritanceReceivablesTestatorPartnerCommonPart",
    "inheritanceReceivablesTestatorPartnerPart",
    "inheritanceReceivablesTestatorPrivatePart",
    "inheritanceReceivablesValue",
    "inheritanceReceivablesValueLegacy",
    "receivableImmidiatelyCollectableIndication",
    "receivableSingleOrCompoundInterest"
})
public class InheritanceReceivablesSpecification
    extends Placeholder
{

    @XmlElement(name = "InheritanceReceivablesDescription", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Anstring40VItemType inheritanceReceivablesDescription;
    @XmlElement(name = "InheritanceReceivablesEntirePossessionTestatorPartner", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected BooleanItemType inheritanceReceivablesEntirePossessionTestatorPartner;
    @XmlElement(name = "InheritanceReceivablesInterestPercentage", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Perc34ItemType inheritanceReceivablesInterestPercentage;
    @XmlElement(name = "InheritanceReceivablesTestatorPartnerCommonPart", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceReceivablesTestatorPartnerCommonPart;
    @XmlElement(name = "InheritanceReceivablesTestatorPartnerPart", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceReceivablesTestatorPartnerPart;
    @XmlElement(name = "InheritanceReceivablesTestatorPrivatePart", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceReceivablesTestatorPrivatePart;
    @XmlElement(name = "InheritanceReceivablesValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceReceivablesValue;
    @XmlElement(name = "InheritanceReceivablesValueLegacy", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType inheritanceReceivablesValueLegacy;
    @XmlElement(name = "ReceivableImmidiatelyCollectableIndication", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected BooleanItemType receivableImmidiatelyCollectableIndication;
    @XmlElement(name = "ReceivableSingleOrCompoundInterest", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected Anstring20VItemType receivableSingleOrCompoundInterest;

    /**
     * Gets the value of the inheritanceReceivablesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring40VItemType }
     *     
     */
    public Anstring40VItemType getInheritanceReceivablesDescription() {
        return inheritanceReceivablesDescription;
    }

    /**
     * Sets the value of the inheritanceReceivablesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring40VItemType }
     *     
     */
    public void setInheritanceReceivablesDescription(Anstring40VItemType value) {
        this.inheritanceReceivablesDescription = value;
    }

    /**
     * Gets the value of the inheritanceReceivablesEntirePossessionTestatorPartner property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getInheritanceReceivablesEntirePossessionTestatorPartner() {
        return inheritanceReceivablesEntirePossessionTestatorPartner;
    }

    /**
     * Sets the value of the inheritanceReceivablesEntirePossessionTestatorPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setInheritanceReceivablesEntirePossessionTestatorPartner(BooleanItemType value) {
        this.inheritanceReceivablesEntirePossessionTestatorPartner = value;
    }

    /**
     * Gets the value of the inheritanceReceivablesInterestPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Perc34ItemType }
     *     
     */
    public Perc34ItemType getInheritanceReceivablesInterestPercentage() {
        return inheritanceReceivablesInterestPercentage;
    }

    /**
     * Sets the value of the inheritanceReceivablesInterestPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc34ItemType }
     *     
     */
    public void setInheritanceReceivablesInterestPercentage(Perc34ItemType value) {
        this.inheritanceReceivablesInterestPercentage = value;
    }

    /**
     * Gets the value of the inheritanceReceivablesTestatorPartnerCommonPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceReceivablesTestatorPartnerCommonPart() {
        return inheritanceReceivablesTestatorPartnerCommonPart;
    }

    /**
     * Sets the value of the inheritanceReceivablesTestatorPartnerCommonPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceReceivablesTestatorPartnerCommonPart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceReceivablesTestatorPartnerCommonPart = value;
    }

    /**
     * Gets the value of the inheritanceReceivablesTestatorPartnerPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceReceivablesTestatorPartnerPart() {
        return inheritanceReceivablesTestatorPartnerPart;
    }

    /**
     * Sets the value of the inheritanceReceivablesTestatorPartnerPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceReceivablesTestatorPartnerPart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceReceivablesTestatorPartnerPart = value;
    }

    /**
     * Gets the value of the inheritanceReceivablesTestatorPrivatePart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceReceivablesTestatorPrivatePart() {
        return inheritanceReceivablesTestatorPrivatePart;
    }

    /**
     * Sets the value of the inheritanceReceivablesTestatorPrivatePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceReceivablesTestatorPrivatePart(MonetaryNoDecimals10VItemType value) {
        this.inheritanceReceivablesTestatorPrivatePart = value;
    }

    /**
     * Gets the value of the inheritanceReceivablesValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceReceivablesValue() {
        return inheritanceReceivablesValue;
    }

    /**
     * Sets the value of the inheritanceReceivablesValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceReceivablesValue(MonetaryNoDecimals10VItemType value) {
        this.inheritanceReceivablesValue = value;
    }

    /**
     * Gets the value of the inheritanceReceivablesValueLegacy property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getInheritanceReceivablesValueLegacy() {
        return inheritanceReceivablesValueLegacy;
    }

    /**
     * Sets the value of the inheritanceReceivablesValueLegacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setInheritanceReceivablesValueLegacy(MonetaryNoDecimals10VItemType value) {
        this.inheritanceReceivablesValueLegacy = value;
    }

    /**
     * Gets the value of the receivableImmidiatelyCollectableIndication property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getReceivableImmidiatelyCollectableIndication() {
        return receivableImmidiatelyCollectableIndication;
    }

    /**
     * Sets the value of the receivableImmidiatelyCollectableIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setReceivableImmidiatelyCollectableIndication(BooleanItemType value) {
        this.receivableImmidiatelyCollectableIndication = value;
    }

    /**
     * Gets the value of the receivableSingleOrCompoundInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getReceivableSingleOrCompoundInterest() {
        return receivableSingleOrCompoundInterest;
    }

    /**
     * Sets the value of the receivableSingleOrCompoundInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setReceivableSingleOrCompoundInterest(Anstring20VItemType value) {
        this.receivableSingleOrCompoundInterest = value;
    }

}
