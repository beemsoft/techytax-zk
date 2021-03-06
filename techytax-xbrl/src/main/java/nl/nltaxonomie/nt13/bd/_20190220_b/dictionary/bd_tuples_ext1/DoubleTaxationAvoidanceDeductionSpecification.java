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
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.iso3166_countrycodes_2017_11_23.IsoCountryCodes3CharactersItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}DoubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}DoubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry" minOccurs="0"/>
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
    "doubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode",
    "doubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry"
})
public class DoubleTaxationAvoidanceDeductionSpecification
    extends Placeholder
{

    @XmlElement(name = "DoubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected IsoCountryCodes3CharactersItemType doubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode;
    @XmlElement(name = "DoubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType doubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry;

    /**
     * Gets the value of the doubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getDoubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode() {
        return doubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.doubleTaxationAvoidanceDeductionInheritanceSimilarTaxPaidCountryCode = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getDoubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry() {
        return doubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry(MonetaryNoDecimals10VItemType value) {
        this.doubleTaxationAvoidanceDeductionInheritanceTaxSimilarPaidOtherCountry = value;
    }

}
