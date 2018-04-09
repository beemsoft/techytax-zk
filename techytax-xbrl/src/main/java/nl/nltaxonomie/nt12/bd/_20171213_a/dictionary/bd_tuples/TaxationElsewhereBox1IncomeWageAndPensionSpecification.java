//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.iso3166_countrycodes_2017_03_18.IsoCountryCodes3CharactersItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}TaxationElsewhereBox1IncomeWageAndPensionCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}TaxationElsewhereBox1IncomeWageAndPensionDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}TaxationElsewhereBox1IncomeWageAndPensionIncomeAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}TaxationElsewhereBox1IncomeWageAndPensionTaxAmount" minOccurs="0"/>
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
    "taxationElsewhereBox1IncomeWageAndPensionCountryCode",
    "taxationElsewhereBox1IncomeWageAndPensionDescription",
    "taxationElsewhereBox1IncomeWageAndPensionIncomeAmount",
    "taxationElsewhereBox1IncomeWageAndPensionTaxAmount"
})
public class TaxationElsewhereBox1IncomeWageAndPensionSpecification
    extends Placeholder
{

    @XmlElement(name = "TaxationElsewhereBox1IncomeWageAndPensionCountryCode", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected IsoCountryCodes3CharactersItemType taxationElsewhereBox1IncomeWageAndPensionCountryCode;
    @XmlElement(name = "TaxationElsewhereBox1IncomeWageAndPensionDescription", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Anstring70VItemType taxationElsewhereBox1IncomeWageAndPensionDescription;
    @XmlElement(name = "TaxationElsewhereBox1IncomeWageAndPensionIncomeAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox1IncomeWageAndPensionIncomeAmount;
    @XmlElement(name = "TaxationElsewhereBox1IncomeWageAndPensionTaxAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox1IncomeWageAndPensionTaxAmount;

    /**
     * Gets the value of the taxationElsewhereBox1IncomeWageAndPensionCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getTaxationElsewhereBox1IncomeWageAndPensionCountryCode() {
        return taxationElsewhereBox1IncomeWageAndPensionCountryCode;
    }

    /**
     * Sets the value of the taxationElsewhereBox1IncomeWageAndPensionCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setTaxationElsewhereBox1IncomeWageAndPensionCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.taxationElsewhereBox1IncomeWageAndPensionCountryCode = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox1IncomeWageAndPensionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getTaxationElsewhereBox1IncomeWageAndPensionDescription() {
        return taxationElsewhereBox1IncomeWageAndPensionDescription;
    }

    /**
     * Sets the value of the taxationElsewhereBox1IncomeWageAndPensionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setTaxationElsewhereBox1IncomeWageAndPensionDescription(Anstring70VItemType value) {
        this.taxationElsewhereBox1IncomeWageAndPensionDescription = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox1IncomeWageAndPensionIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox1IncomeWageAndPensionIncomeAmount() {
        return taxationElsewhereBox1IncomeWageAndPensionIncomeAmount;
    }

    /**
     * Sets the value of the taxationElsewhereBox1IncomeWageAndPensionIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox1IncomeWageAndPensionIncomeAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox1IncomeWageAndPensionIncomeAmount = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox1IncomeWageAndPensionTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox1IncomeWageAndPensionTaxAmount() {
        return taxationElsewhereBox1IncomeWageAndPensionTaxAmount;
    }

    /**
     * Sets the value of the taxationElsewhereBox1IncomeWageAndPensionTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox1IncomeWageAndPensionTaxAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox1IncomeWageAndPensionTaxAmount = value;
    }

}
