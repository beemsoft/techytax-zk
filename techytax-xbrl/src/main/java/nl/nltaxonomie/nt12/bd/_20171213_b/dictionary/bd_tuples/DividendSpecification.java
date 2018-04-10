//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_tuples;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring20VItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.NonNegativeInteger2FItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Test11ItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendAccountHolderIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendBankAccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendCommonInterestIndication" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-tuples}DividendPerCountrySpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendProductID" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendSourceBankTaxReferenceNumber" minOccurs="0"/>
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
    "dividendAccountHolderIdentificationNumber",
    "dividendBankAccountNumber",
    "dividendCommonInterestIndication",
    "dividendLabel",
    "dividendPerCountrySpecification",
    "dividendProductID",
    "dividendSourceBankTaxReferenceNumber"
})
public class DividendSpecification
    extends Placeholder
{

    @XmlElement(name = "DividendAccountHolderIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Test11ItemType dividendAccountHolderIdentificationNumber;
    @XmlElement(name = "DividendBankAccountNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring34VItemType dividendBankAccountNumber;
    @XmlElement(name = "DividendCommonInterestIndication", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeInteger2FItemType dividendCommonInterestIndication;
    @XmlElement(name = "DividendLabel", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring70VItemType dividendLabel;
    @XmlElement(name = "DividendPerCountrySpecification", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-tuples")
    protected List<DividendPerCountrySpecification> dividendPerCountrySpecification;
    @XmlElement(name = "DividendProductID", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring20VItemType dividendProductID;
    @XmlElement(name = "DividendSourceBankTaxReferenceNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Test11ItemType dividendSourceBankTaxReferenceNumber;

    /**
     * Gets the value of the dividendAccountHolderIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getDividendAccountHolderIdentificationNumber() {
        return dividendAccountHolderIdentificationNumber;
    }

    /**
     * Sets the value of the dividendAccountHolderIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setDividendAccountHolderIdentificationNumber(Test11ItemType value) {
        this.dividendAccountHolderIdentificationNumber = value;
    }

    /**
     * Gets the value of the dividendBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getDividendBankAccountNumber() {
        return dividendBankAccountNumber;
    }

    /**
     * Sets the value of the dividendBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setDividendBankAccountNumber(Anstring34VItemType value) {
        this.dividendBankAccountNumber = value;
    }

    /**
     * Gets the value of the dividendCommonInterestIndication property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getDividendCommonInterestIndication() {
        return dividendCommonInterestIndication;
    }

    /**
     * Sets the value of the dividendCommonInterestIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setDividendCommonInterestIndication(NonNegativeInteger2FItemType value) {
        this.dividendCommonInterestIndication = value;
    }

    /**
     * Gets the value of the dividendLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getDividendLabel() {
        return dividendLabel;
    }

    /**
     * Sets the value of the dividendLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setDividendLabel(Anstring70VItemType value) {
        this.dividendLabel = value;
    }

    /**
     * Gets the value of the dividendPerCountrySpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dividendPerCountrySpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDividendPerCountrySpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DividendPerCountrySpecification }
     * 
     * 
     */
    public List<DividendPerCountrySpecification> getDividendPerCountrySpecification() {
        if (dividendPerCountrySpecification == null) {
            dividendPerCountrySpecification = new ArrayList<DividendPerCountrySpecification>();
        }
        return this.dividendPerCountrySpecification;
    }

    /**
     * Gets the value of the dividendProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getDividendProductID() {
        return dividendProductID;
    }

    /**
     * Sets the value of the dividendProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setDividendProductID(Anstring20VItemType value) {
        this.dividendProductID = value;
    }

    /**
     * Gets the value of the dividendSourceBankTaxReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getDividendSourceBankTaxReferenceNumber() {
        return dividendSourceBankTaxReferenceNumber;
    }

    /**
     * Sets the value of the dividendSourceBankTaxReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setDividendSourceBankTaxReferenceNumber(Test11ItemType value) {
        this.dividendSourceBankTaxReferenceNumber = value;
    }

}