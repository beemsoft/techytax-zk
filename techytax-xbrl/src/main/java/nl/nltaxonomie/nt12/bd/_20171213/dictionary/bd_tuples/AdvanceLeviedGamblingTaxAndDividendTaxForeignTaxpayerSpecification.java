//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring70VItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}AdvanceLeviedGamblingTaxAndDividendTaxAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}AdvanceLeviedGamblingTaxAndDividendTaxDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}DividendBankAccountNumber" minOccurs="0"/>
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
    "advanceLeviedGamblingTaxAndDividendTaxAmount",
    "advanceLeviedGamblingTaxAndDividendTaxDescription",
    "dividendBankAccountNumber"
})
public class AdvanceLeviedGamblingTaxAndDividendTaxForeignTaxpayerSpecification
    extends Placeholder
{

    @XmlElement(name = "AdvanceLeviedGamblingTaxAndDividendTaxAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType advanceLeviedGamblingTaxAndDividendTaxAmount;
    @XmlElement(name = "AdvanceLeviedGamblingTaxAndDividendTaxDescription", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring70VItemType advanceLeviedGamblingTaxAndDividendTaxDescription;
    @XmlElement(name = "DividendBankAccountNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring34VItemType dividendBankAccountNumber;

    /**
     * Gets the value of the advanceLeviedGamblingTaxAndDividendTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getAdvanceLeviedGamblingTaxAndDividendTaxAmount() {
        return advanceLeviedGamblingTaxAndDividendTaxAmount;
    }

    /**
     * Sets the value of the advanceLeviedGamblingTaxAndDividendTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setAdvanceLeviedGamblingTaxAndDividendTaxAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.advanceLeviedGamblingTaxAndDividendTaxAmount = value;
    }

    /**
     * Gets the value of the advanceLeviedGamblingTaxAndDividendTaxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getAdvanceLeviedGamblingTaxAndDividendTaxDescription() {
        return advanceLeviedGamblingTaxAndDividendTaxDescription;
    }

    /**
     * Sets the value of the advanceLeviedGamblingTaxAndDividendTaxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setAdvanceLeviedGamblingTaxAndDividendTaxDescription(Anstring70VItemType value) {
        this.advanceLeviedGamblingTaxAndDividendTaxDescription = value;
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

}
