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
import nl.nltaxonomie._8_0.basis.bd.types.bd_types.Anstring34VItemType;
import nl.nltaxonomie._8_0.basis.bd.types.bd_types.Anstring45VItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}DebtBox3Amount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}DebtBox3Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}DebtBox3IdentificationNumber" minOccurs="0"/>
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
    "debtBox3Amount",
    "debtBox3Description",
    "debtBox3IdentificationNumber"
})
public class DebtBox3Specification
    extends Placeholder
{

    @XmlElement(name = "DebtBox3Amount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType debtBox3Amount;
    @XmlElement(name = "DebtBox3Description", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected Anstring45VItemType debtBox3Description;
    @XmlElement(name = "DebtBox3IdentificationNumber", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected Anstring34VItemType debtBox3IdentificationNumber;

    /**
     * Gets the value of the debtBox3Amount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDebtBox3Amount() {
        return debtBox3Amount;
    }

    /**
     * Sets the value of the debtBox3Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtBox3Amount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.debtBox3Amount = value;
    }

    /**
     * Gets the value of the debtBox3Description property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring45VItemType }
     *     
     */
    public Anstring45VItemType getDebtBox3Description() {
        return debtBox3Description;
    }

    /**
     * Sets the value of the debtBox3Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring45VItemType }
     *     
     */
    public void setDebtBox3Description(Anstring45VItemType value) {
        this.debtBox3Description = value;
    }

    /**
     * Gets the value of the debtBox3IdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getDebtBox3IdentificationNumber() {
        return debtBox3IdentificationNumber;
    }

    /**
     * Sets the value of the debtBox3IdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setDebtBox3IdentificationNumber(Anstring34VItemType value) {
        this.debtBox3IdentificationNumber = value;
    }

}
