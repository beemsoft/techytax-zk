//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring70VItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}CapitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}CapitalInsuranceNotExemptedPartCapitalInsuranceValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}CapitalInsuranceNotExemptedPartLifeInsuranceSocietyName" minOccurs="0"/>
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
    "capitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber",
    "capitalInsuranceNotExemptedPartCapitalInsuranceValue",
    "capitalInsuranceNotExemptedPartLifeInsuranceSocietyName"
})
public class CapitalInsuranceNotExemptedPartSpecification
    extends Placeholder
{

    @XmlElement(name = "CapitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring34VItemType capitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber;
    @XmlElement(name = "CapitalInsuranceNotExemptedPartCapitalInsuranceValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType capitalInsuranceNotExemptedPartCapitalInsuranceValue;
    @XmlElement(name = "CapitalInsuranceNotExemptedPartLifeInsuranceSocietyName", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring70VItemType capitalInsuranceNotExemptedPartLifeInsuranceSocietyName;

    /**
     * Gets the value of the capitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getCapitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber() {
        return capitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber;
    }

    /**
     * Sets the value of the capitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setCapitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber(Anstring34VItemType value) {
        this.capitalInsuranceNotExemptedPartCapitalInsurancePolicyNumber = value;
    }

    /**
     * Gets the value of the capitalInsuranceNotExemptedPartCapitalInsuranceValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getCapitalInsuranceNotExemptedPartCapitalInsuranceValue() {
        return capitalInsuranceNotExemptedPartCapitalInsuranceValue;
    }

    /**
     * Sets the value of the capitalInsuranceNotExemptedPartCapitalInsuranceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setCapitalInsuranceNotExemptedPartCapitalInsuranceValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.capitalInsuranceNotExemptedPartCapitalInsuranceValue = value;
    }

    /**
     * Gets the value of the capitalInsuranceNotExemptedPartLifeInsuranceSocietyName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getCapitalInsuranceNotExemptedPartLifeInsuranceSocietyName() {
        return capitalInsuranceNotExemptedPartLifeInsuranceSocietyName;
    }

    /**
     * Sets the value of the capitalInsuranceNotExemptedPartLifeInsuranceSocietyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setCapitalInsuranceNotExemptedPartLifeInsuranceSocietyName(Anstring70VItemType value) {
        this.capitalInsuranceNotExemptedPartLifeInsuranceSocietyName = value;
    }

}
