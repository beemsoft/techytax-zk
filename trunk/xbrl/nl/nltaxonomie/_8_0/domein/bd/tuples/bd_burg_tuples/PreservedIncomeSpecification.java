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
import nl.nltaxonomie._8_0.basis.bd.types.bd_types.Anstring60VItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}PreservedIncomeAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}PreservedIncomeDescription" minOccurs="0"/>
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
    "preservedIncomeAmount",
    "preservedIncomeDescription"
})
public class PreservedIncomeSpecification
    extends Placeholder
{

    @XmlElement(name = "PreservedIncomeAmount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType preservedIncomeAmount;
    @XmlElement(name = "PreservedIncomeDescription", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected Anstring60VItemType preservedIncomeDescription;

    /**
     * Gets the value of the preservedIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPreservedIncomeAmount() {
        return preservedIncomeAmount;
    }

    /**
     * Sets the value of the preservedIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPreservedIncomeAmount(MonetaryNoDecimalsItemType value) {
        this.preservedIncomeAmount = value;
    }

    /**
     * Gets the value of the preservedIncomeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getPreservedIncomeDescription() {
        return preservedIncomeDescription;
    }

    /**
     * Sets the value of the preservedIncomeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setPreservedIncomeDescription(Anstring60VItemType value) {
        this.preservedIncomeDescription = value;
    }

}
