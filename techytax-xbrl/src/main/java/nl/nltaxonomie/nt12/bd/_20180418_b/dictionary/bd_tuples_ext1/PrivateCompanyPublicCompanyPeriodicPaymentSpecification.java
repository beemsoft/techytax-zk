//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_tuples_ext1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring200VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Test11ItemType;
import org.xbrl._2003.instance.BooleanItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}PrivateCompanyPublicCompanyIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}PrivateCompanyPublicCompanyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1}PrivateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-tuples-ext1}PrivateCompanyPublicCompanyShareholderSpecification" maxOccurs="40" minOccurs="0"/>
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
    "privateCompanyPublicCompanyIdentificationNumber",
    "privateCompanyPublicCompanyName",
    "privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage",
    "privateCompanyPublicCompanyShareholderSpecification"
})
public class PrivateCompanyPublicCompanyPeriodicPaymentSpecification
    extends Placeholder
{

    @XmlElement(name = "PrivateCompanyPublicCompanyIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected Test11ItemType privateCompanyPublicCompanyIdentificationNumber;
    @XmlElement(name = "PrivateCompanyPublicCompanyName", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected Anstring200VItemType privateCompanyPublicCompanyName;
    @XmlElement(name = "PrivateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-data-ext1")
    protected BooleanItemType privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage;
    @XmlElement(name = "PrivateCompanyPublicCompanyShareholderSpecification", namespace = "http://www.nltaxonomie.nl/nt12/bd/20180418.b/dictionary/bd-tuples-ext1")
    protected List<PrivateCompanyPublicCompanyShareholderSpecification> privateCompanyPublicCompanyShareholderSpecification;

    /**
     * Gets the value of the privateCompanyPublicCompanyIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getPrivateCompanyPublicCompanyIdentificationNumber() {
        return privateCompanyPublicCompanyIdentificationNumber;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyIdentificationNumber(Test11ItemType value) {
        this.privateCompanyPublicCompanyIdentificationNumber = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getPrivateCompanyPublicCompanyName() {
        return privateCompanyPublicCompanyName;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyName(Anstring200VItemType value) {
        this.privateCompanyPublicCompanyName = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getPrivateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage() {
        return privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage;
    }

    /**
     * Sets the value of the privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setPrivateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage(BooleanItemType value) {
        this.privateCompanyPublicCompanyOwnerRelativesByBloodOrMarriage = value;
    }

    /**
     * Gets the value of the privateCompanyPublicCompanyShareholderSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateCompanyPublicCompanyShareholderSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateCompanyPublicCompanyShareholderSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateCompanyPublicCompanyShareholderSpecification }
     * 
     * 
     */
    public List<PrivateCompanyPublicCompanyShareholderSpecification> getPrivateCompanyPublicCompanyShareholderSpecification() {
        if (privateCompanyPublicCompanyShareholderSpecification == null) {
            privateCompanyPublicCompanyShareholderSpecification = new ArrayList<PrivateCompanyPublicCompanyShareholderSpecification>();
        }
        return this.privateCompanyPublicCompanyShareholderSpecification;
    }

}
