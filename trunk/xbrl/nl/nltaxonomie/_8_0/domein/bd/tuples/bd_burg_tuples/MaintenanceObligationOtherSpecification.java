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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}MaintenanceObligationOtherAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}MaintenanceObligationOtherDescription" minOccurs="0"/>
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
    "maintenanceObligationOtherAmount",
    "maintenanceObligationOtherDescription"
})
public class MaintenanceObligationOtherSpecification
    extends Placeholder
{

    @XmlElement(name = "MaintenanceObligationOtherAmount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType maintenanceObligationOtherAmount;
    @XmlElement(name = "MaintenanceObligationOtherDescription", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected Anstring60VItemType maintenanceObligationOtherDescription;

    /**
     * Gets the value of the maintenanceObligationOtherAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getMaintenanceObligationOtherAmount() {
        return maintenanceObligationOtherAmount;
    }

    /**
     * Sets the value of the maintenanceObligationOtherAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setMaintenanceObligationOtherAmount(MonetaryNoDecimalsItemType value) {
        this.maintenanceObligationOtherAmount = value;
    }

    /**
     * Gets the value of the maintenanceObligationOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getMaintenanceObligationOtherDescription() {
        return maintenanceObligationOtherDescription;
    }

    /**
     * Sets the value of the maintenanceObligationOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setMaintenanceObligationOtherDescription(Anstring60VItemType value) {
        this.maintenanceObligationOtherDescription = value;
    }

}
