//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.09 at 10:28:44 PM CET 
//


package nl.nltaxonomie._8_0.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0.basis.bd.types.bd_types.Anstring35VItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
import nl.nltaxonomie.iso.iso3166.IsoCountryCodes3CharactersItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}TaxationElsewhereBox2IncomeAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}TaxationElsewhereBox2IncomeCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}TaxationElsewhereBox2IncomeDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}TaxationElsewhereBox2IncomeTaxAmount" minOccurs="0"/>
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
    "taxationElsewhereBox2IncomeAmount",
    "taxationElsewhereBox2IncomeCountryCode",
    "taxationElsewhereBox2IncomeDescription",
    "taxationElsewhereBox2IncomeTaxAmount"
})
public class TaxationElsewhereBox2IncomeSpecification
    extends Placeholder
{

    @XmlElement(name = "TaxationElsewhereBox2IncomeAmount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType taxationElsewhereBox2IncomeAmount;
    @XmlElement(name = "TaxationElsewhereBox2IncomeCountryCode", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected IsoCountryCodes3CharactersItemType taxationElsewhereBox2IncomeCountryCode;
    @XmlElement(name = "TaxationElsewhereBox2IncomeDescription", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected Anstring35VItemType taxationElsewhereBox2IncomeDescription;
    @XmlElement(name = "TaxationElsewhereBox2IncomeTaxAmount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox2IncomeTaxAmount;

    /**
     * Gets the value of the taxationElsewhereBox2IncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getTaxationElsewhereBox2IncomeAmount() {
        return taxationElsewhereBox2IncomeAmount;
    }

    /**
     * Sets the value of the taxationElsewhereBox2IncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox2IncomeAmount(MonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox2IncomeAmount = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox2IncomeCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getTaxationElsewhereBox2IncomeCountryCode() {
        return taxationElsewhereBox2IncomeCountryCode;
    }

    /**
     * Sets the value of the taxationElsewhereBox2IncomeCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setTaxationElsewhereBox2IncomeCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.taxationElsewhereBox2IncomeCountryCode = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox2IncomeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring35VItemType }
     *     
     */
    public Anstring35VItemType getTaxationElsewhereBox2IncomeDescription() {
        return taxationElsewhereBox2IncomeDescription;
    }

    /**
     * Sets the value of the taxationElsewhereBox2IncomeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring35VItemType }
     *     
     */
    public void setTaxationElsewhereBox2IncomeDescription(Anstring35VItemType value) {
        this.taxationElsewhereBox2IncomeDescription = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox2IncomeTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox2IncomeTaxAmount() {
        return taxationElsewhereBox2IncomeTaxAmount;
    }

    /**
     * Sets the value of the taxationElsewhereBox2IncomeTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox2IncomeTaxAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox2IncomeTaxAmount = value;
    }

}
