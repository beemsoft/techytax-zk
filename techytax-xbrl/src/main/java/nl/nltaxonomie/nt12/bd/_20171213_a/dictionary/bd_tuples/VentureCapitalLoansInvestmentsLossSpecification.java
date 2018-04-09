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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-tuples}AddressAbroadPresentation" minOccurs="0"/>
 *           &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-tuples}AddressPresentation" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}NameEntrepreneurParticipatingInterestFunds" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}VentureCapitalLoansInvestmentsLossAmount" minOccurs="0"/>
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
    "addressAbroadPresentation",
    "addressPresentation",
    "nameEntrepreneurParticipatingInterestFunds",
    "ventureCapitalLoansInvestmentsLossAmount"
})
public class VentureCapitalLoansInvestmentsLossSpecification
    extends Placeholder
{

    @XmlElement(name = "AddressAbroadPresentation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-tuples")
    protected AddressAbroadPresentation addressAbroadPresentation;
    @XmlElement(name = "AddressPresentation", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-tuples")
    protected AddressPresentation addressPresentation;
    @XmlElement(name = "NameEntrepreneurParticipatingInterestFunds", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Anstring70VItemType nameEntrepreneurParticipatingInterestFunds;
    @XmlElement(name = "VentureCapitalLoansInvestmentsLossAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType ventureCapitalLoansInvestmentsLossAmount;

    /**
     * Gets the value of the addressAbroadPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressAbroadPresentation }
     *     
     */
    public AddressAbroadPresentation getAddressAbroadPresentation() {
        return addressAbroadPresentation;
    }

    /**
     * Sets the value of the addressAbroadPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressAbroadPresentation }
     *     
     */
    public void setAddressAbroadPresentation(AddressAbroadPresentation value) {
        this.addressAbroadPresentation = value;
    }

    /**
     * Gets the value of the addressPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPresentation }
     *     
     */
    public AddressPresentation getAddressPresentation() {
        return addressPresentation;
    }

    /**
     * Sets the value of the addressPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPresentation }
     *     
     */
    public void setAddressPresentation(AddressPresentation value) {
        this.addressPresentation = value;
    }

    /**
     * Gets the value of the nameEntrepreneurParticipatingInterestFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getNameEntrepreneurParticipatingInterestFunds() {
        return nameEntrepreneurParticipatingInterestFunds;
    }

    /**
     * Sets the value of the nameEntrepreneurParticipatingInterestFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setNameEntrepreneurParticipatingInterestFunds(Anstring70VItemType value) {
        this.nameEntrepreneurParticipatingInterestFunds = value;
    }

    /**
     * Gets the value of the ventureCapitalLoansInvestmentsLossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getVentureCapitalLoansInvestmentsLossAmount() {
        return ventureCapitalLoansInvestmentsLossAmount;
    }

    /**
     * Sets the value of the ventureCapitalLoansInvestmentsLossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setVentureCapitalLoansInvestmentsLossAmount(MonetaryNoDecimalsItemType value) {
        this.ventureCapitalLoansInvestmentsLossAmount = value;
    }

}
