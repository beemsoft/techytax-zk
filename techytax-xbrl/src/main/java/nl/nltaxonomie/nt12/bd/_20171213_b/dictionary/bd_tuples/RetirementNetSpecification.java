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
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring20VItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring4VItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}RetirementNetCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}RetirementNetLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}RetirementNetPolicyNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}RetirementNetPremiumsPaid" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}RetirementNetPremiumsRepaid" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}RetirementNetProductID" minOccurs="0"/>
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
    "retirementNetCode",
    "retirementNetLabel",
    "retirementNetPolicyNumber",
    "retirementNetPremiumsPaid",
    "retirementNetPremiumsRepaid",
    "retirementNetProductID"
})
public class RetirementNetSpecification
    extends Placeholder
{

    @XmlElement(name = "RetirementNetCode", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring4VItemType retirementNetCode;
    @XmlElement(name = "RetirementNetLabel", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring70VItemType retirementNetLabel;
    @XmlElement(name = "RetirementNetPolicyNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring34VItemType retirementNetPolicyNumber;
    @XmlElement(name = "RetirementNetPremiumsPaid", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType retirementNetPremiumsPaid;
    @XmlElement(name = "RetirementNetPremiumsRepaid", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType retirementNetPremiumsRepaid;
    @XmlElement(name = "RetirementNetProductID", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring20VItemType retirementNetProductID;

    /**
     * Gets the value of the retirementNetCode property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring4VItemType }
     *     
     */
    public Anstring4VItemType getRetirementNetCode() {
        return retirementNetCode;
    }

    /**
     * Sets the value of the retirementNetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring4VItemType }
     *     
     */
    public void setRetirementNetCode(Anstring4VItemType value) {
        this.retirementNetCode = value;
    }

    /**
     * Gets the value of the retirementNetLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getRetirementNetLabel() {
        return retirementNetLabel;
    }

    /**
     * Sets the value of the retirementNetLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setRetirementNetLabel(Anstring70VItemType value) {
        this.retirementNetLabel = value;
    }

    /**
     * Gets the value of the retirementNetPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getRetirementNetPolicyNumber() {
        return retirementNetPolicyNumber;
    }

    /**
     * Sets the value of the retirementNetPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setRetirementNetPolicyNumber(Anstring34VItemType value) {
        this.retirementNetPolicyNumber = value;
    }

    /**
     * Gets the value of the retirementNetPremiumsPaid property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getRetirementNetPremiumsPaid() {
        return retirementNetPremiumsPaid;
    }

    /**
     * Sets the value of the retirementNetPremiumsPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setRetirementNetPremiumsPaid(NonNegativeMonetaryNoDecimalsItemType value) {
        this.retirementNetPremiumsPaid = value;
    }

    /**
     * Gets the value of the retirementNetPremiumsRepaid property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getRetirementNetPremiumsRepaid() {
        return retirementNetPremiumsRepaid;
    }

    /**
     * Sets the value of the retirementNetPremiumsRepaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setRetirementNetPremiumsRepaid(NonNegativeMonetaryNoDecimalsItemType value) {
        this.retirementNetPremiumsRepaid = value;
    }

    /**
     * Gets the value of the retirementNetProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getRetirementNetProductID() {
        return retirementNetProductID;
    }

    /**
     * Sets the value of the retirementNetProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setRetirementNetProductID(Anstring20VItemType value) {
        this.retirementNetProductID = value;
    }

}
