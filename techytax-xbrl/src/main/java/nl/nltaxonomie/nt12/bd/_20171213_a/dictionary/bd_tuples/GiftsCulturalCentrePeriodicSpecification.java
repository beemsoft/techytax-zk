//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.NonNegativeInteger15VItemType;
import nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.Test11ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}GiftsCulturalCentrePeriodic" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}GiftsCulturalCentrePeriodicDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}GiftsCulturalCentrePeriodicIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}GiftsCulturalCentrePeriodicTransactionNumber" minOccurs="0"/>
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
    "giftsCulturalCentrePeriodic",
    "giftsCulturalCentrePeriodicDescription",
    "giftsCulturalCentrePeriodicIdentificationNumber",
    "giftsCulturalCentrePeriodicTransactionNumber"
})
public class GiftsCulturalCentrePeriodicSpecification
    extends Placeholder
{

    @XmlElement(name = "GiftsCulturalCentrePeriodic", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType giftsCulturalCentrePeriodic;
    @XmlElement(name = "GiftsCulturalCentrePeriodicDescription", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Anstring70VItemType giftsCulturalCentrePeriodicDescription;
    @XmlElement(name = "GiftsCulturalCentrePeriodicIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Test11ItemType giftsCulturalCentrePeriodicIdentificationNumber;
    @XmlElement(name = "GiftsCulturalCentrePeriodicTransactionNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected NonNegativeInteger15VItemType giftsCulturalCentrePeriodicTransactionNumber;

    /**
     * Gets the value of the giftsCulturalCentrePeriodic property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getGiftsCulturalCentrePeriodic() {
        return giftsCulturalCentrePeriodic;
    }

    /**
     * Sets the value of the giftsCulturalCentrePeriodic property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setGiftsCulturalCentrePeriodic(MonetaryNoDecimalsItemType value) {
        this.giftsCulturalCentrePeriodic = value;
    }

    /**
     * Gets the value of the giftsCulturalCentrePeriodicDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getGiftsCulturalCentrePeriodicDescription() {
        return giftsCulturalCentrePeriodicDescription;
    }

    /**
     * Sets the value of the giftsCulturalCentrePeriodicDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setGiftsCulturalCentrePeriodicDescription(Anstring70VItemType value) {
        this.giftsCulturalCentrePeriodicDescription = value;
    }

    /**
     * Gets the value of the giftsCulturalCentrePeriodicIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getGiftsCulturalCentrePeriodicIdentificationNumber() {
        return giftsCulturalCentrePeriodicIdentificationNumber;
    }

    /**
     * Sets the value of the giftsCulturalCentrePeriodicIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setGiftsCulturalCentrePeriodicIdentificationNumber(Test11ItemType value) {
        this.giftsCulturalCentrePeriodicIdentificationNumber = value;
    }

    /**
     * Gets the value of the giftsCulturalCentrePeriodicTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger15VItemType }
     *     
     */
    public NonNegativeInteger15VItemType getGiftsCulturalCentrePeriodicTransactionNumber() {
        return giftsCulturalCentrePeriodicTransactionNumber;
    }

    /**
     * Sets the value of the giftsCulturalCentrePeriodicTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger15VItemType }
     *     
     */
    public void setGiftsCulturalCentrePeriodicTransactionNumber(NonNegativeInteger15VItemType value) {
        this.giftsCulturalCentrePeriodicTransactionNumber = value;
    }

}
