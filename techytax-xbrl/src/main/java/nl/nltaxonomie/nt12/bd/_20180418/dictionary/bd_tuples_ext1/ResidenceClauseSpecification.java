//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_tuples_ext1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring10VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring200VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Test11ItemType;
import nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_types_ext1.Anstring40VItemType;
import org.xbrl._2003.instance.DateItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}ResidenceClauseCapitalComponentDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}ResidenceClauseCapitalComponentReceiverInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}ResidenceClauseCapitalComponentValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}ResidenceClauseCapitalComponentValuePayedFor" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}ResidenceClauseReceiverDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}ResidenceClauseReceiverIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}ResidenceClauseReceiverPrefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1}ResidenceClauseReceiverSurname" minOccurs="0"/>
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
    "residenceClauseCapitalComponentDescription",
    "residenceClauseCapitalComponentReceiverInitials",
    "residenceClauseCapitalComponentValue",
    "residenceClauseCapitalComponentValuePayedFor",
    "residenceClauseReceiverDateOfBirth",
    "residenceClauseReceiverIdentificationNumber",
    "residenceClauseReceiverPrefix",
    "residenceClauseReceiverSurname"
})
public class ResidenceClauseSpecification
    extends Placeholder
{

    @XmlElement(name = "ResidenceClauseCapitalComponentDescription", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring40VItemType residenceClauseCapitalComponentDescription;
    @XmlElement(name = "ResidenceClauseCapitalComponentReceiverInitials", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring10VItemType residenceClauseCapitalComponentReceiverInitials;
    @XmlElement(name = "ResidenceClauseCapitalComponentValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType residenceClauseCapitalComponentValue;
    @XmlElement(name = "ResidenceClauseCapitalComponentValuePayedFor", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType residenceClauseCapitalComponentValuePayedFor;
    @XmlElement(name = "ResidenceClauseReceiverDateOfBirth", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected DateItemType residenceClauseReceiverDateOfBirth;
    @XmlElement(name = "ResidenceClauseReceiverIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Test11ItemType residenceClauseReceiverIdentificationNumber;
    @XmlElement(name = "ResidenceClauseReceiverPrefix", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring10VItemType residenceClauseReceiverPrefix;
    @XmlElement(name = "ResidenceClauseReceiverSurname", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418/dictionary/bd-data-ext1")
    protected Anstring200VItemType residenceClauseReceiverSurname;

    /**
     * Gets the value of the residenceClauseCapitalComponentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring40VItemType }
     *     
     */
    public Anstring40VItemType getResidenceClauseCapitalComponentDescription() {
        return residenceClauseCapitalComponentDescription;
    }

    /**
     * Sets the value of the residenceClauseCapitalComponentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring40VItemType }
     *     
     */
    public void setResidenceClauseCapitalComponentDescription(Anstring40VItemType value) {
        this.residenceClauseCapitalComponentDescription = value;
    }

    /**
     * Gets the value of the residenceClauseCapitalComponentReceiverInitials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getResidenceClauseCapitalComponentReceiverInitials() {
        return residenceClauseCapitalComponentReceiverInitials;
    }

    /**
     * Sets the value of the residenceClauseCapitalComponentReceiverInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setResidenceClauseCapitalComponentReceiverInitials(Anstring10VItemType value) {
        this.residenceClauseCapitalComponentReceiverInitials = value;
    }

    /**
     * Gets the value of the residenceClauseCapitalComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getResidenceClauseCapitalComponentValue() {
        return residenceClauseCapitalComponentValue;
    }

    /**
     * Sets the value of the residenceClauseCapitalComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setResidenceClauseCapitalComponentValue(MonetaryNoDecimals10VItemType value) {
        this.residenceClauseCapitalComponentValue = value;
    }

    /**
     * Gets the value of the residenceClauseCapitalComponentValuePayedFor property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getResidenceClauseCapitalComponentValuePayedFor() {
        return residenceClauseCapitalComponentValuePayedFor;
    }

    /**
     * Sets the value of the residenceClauseCapitalComponentValuePayedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setResidenceClauseCapitalComponentValuePayedFor(MonetaryNoDecimals10VItemType value) {
        this.residenceClauseCapitalComponentValuePayedFor = value;
    }

    /**
     * Gets the value of the residenceClauseReceiverDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getResidenceClauseReceiverDateOfBirth() {
        return residenceClauseReceiverDateOfBirth;
    }

    /**
     * Sets the value of the residenceClauseReceiverDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setResidenceClauseReceiverDateOfBirth(DateItemType value) {
        this.residenceClauseReceiverDateOfBirth = value;
    }

    /**
     * Gets the value of the residenceClauseReceiverIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getResidenceClauseReceiverIdentificationNumber() {
        return residenceClauseReceiverIdentificationNumber;
    }

    /**
     * Sets the value of the residenceClauseReceiverIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setResidenceClauseReceiverIdentificationNumber(Test11ItemType value) {
        this.residenceClauseReceiverIdentificationNumber = value;
    }

    /**
     * Gets the value of the residenceClauseReceiverPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getResidenceClauseReceiverPrefix() {
        return residenceClauseReceiverPrefix;
    }

    /**
     * Sets the value of the residenceClauseReceiverPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setResidenceClauseReceiverPrefix(Anstring10VItemType value) {
        this.residenceClauseReceiverPrefix = value;
    }

    /**
     * Gets the value of the residenceClauseReceiverSurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getResidenceClauseReceiverSurname() {
        return residenceClauseReceiverSurname;
    }

    /**
     * Sets the value of the residenceClauseReceiverSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setResidenceClauseReceiverSurname(Anstring200VItemType value) {
        this.residenceClauseReceiverSurname = value;
    }

}