//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring30VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.NonNegativeInteger5VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Perc32ItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}DeclarationsDeliveryPeriodicCumulativeNumberOfItems" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}DeclarationsDeliveryPeriodicCumulativePercentage" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}DeclarationsDeliveryPeriodicName" minOccurs="0"/>
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
    "declarationsDeliveryPeriodicCumulativeNumberOfItems",
    "declarationsDeliveryPeriodicCumulativePercentage",
    "declarationsDeliveryPeriodicName"
})
public class PostponementDeclarationSchemeSpecification
    extends Placeholder
{

    @XmlElement(name = "DeclarationsDeliveryPeriodicCumulativeNumberOfItems", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeInteger5VItemType declarationsDeliveryPeriodicCumulativeNumberOfItems;
    @XmlElement(name = "DeclarationsDeliveryPeriodicCumulativePercentage", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Perc32ItemType declarationsDeliveryPeriodicCumulativePercentage;
    @XmlElement(name = "DeclarationsDeliveryPeriodicName", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring30VItemType declarationsDeliveryPeriodicName;

    /**
     * Gets the value of the declarationsDeliveryPeriodicCumulativeNumberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public NonNegativeInteger5VItemType getDeclarationsDeliveryPeriodicCumulativeNumberOfItems() {
        return declarationsDeliveryPeriodicCumulativeNumberOfItems;
    }

    /**
     * Sets the value of the declarationsDeliveryPeriodicCumulativeNumberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public void setDeclarationsDeliveryPeriodicCumulativeNumberOfItems(NonNegativeInteger5VItemType value) {
        this.declarationsDeliveryPeriodicCumulativeNumberOfItems = value;
    }

    /**
     * Gets the value of the declarationsDeliveryPeriodicCumulativePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getDeclarationsDeliveryPeriodicCumulativePercentage() {
        return declarationsDeliveryPeriodicCumulativePercentage;
    }

    /**
     * Sets the value of the declarationsDeliveryPeriodicCumulativePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setDeclarationsDeliveryPeriodicCumulativePercentage(Perc32ItemType value) {
        this.declarationsDeliveryPeriodicCumulativePercentage = value;
    }

    /**
     * Gets the value of the declarationsDeliveryPeriodicName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring30VItemType }
     *     
     */
    public Anstring30VItemType getDeclarationsDeliveryPeriodicName() {
        return declarationsDeliveryPeriodicName;
    }

    /**
     * Sets the value of the declarationsDeliveryPeriodicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring30VItemType }
     *     
     */
    public void setDeclarationsDeliveryPeriodicName(Anstring30VItemType value) {
        this.declarationsDeliveryPeriodicName = value;
    }

}
