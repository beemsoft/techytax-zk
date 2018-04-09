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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}WarrantyProvisionAllocationAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}WarrantyProvisionDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}WarrantyProvisionFiscalAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}WarrantyProvisionWithdrawal" minOccurs="0"/>
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
    "warrantyProvisionAllocationAmount",
    "warrantyProvisionDescription",
    "warrantyProvisionFiscalAmount",
    "warrantyProvisionWithdrawal"
})
public class WarrantyProvisionSpecification
    extends Placeholder
{

    @XmlElement(name = "WarrantyProvisionAllocationAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType warrantyProvisionAllocationAmount;
    @XmlElement(name = "WarrantyProvisionDescription", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Anstring70VItemType warrantyProvisionDescription;
    @XmlElement(name = "WarrantyProvisionFiscalAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType warrantyProvisionFiscalAmount;
    @XmlElement(name = "WarrantyProvisionWithdrawal", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType warrantyProvisionWithdrawal;

    /**
     * Gets the value of the warrantyProvisionAllocationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getWarrantyProvisionAllocationAmount() {
        return warrantyProvisionAllocationAmount;
    }

    /**
     * Sets the value of the warrantyProvisionAllocationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setWarrantyProvisionAllocationAmount(MonetaryNoDecimalsItemType value) {
        this.warrantyProvisionAllocationAmount = value;
    }

    /**
     * Gets the value of the warrantyProvisionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getWarrantyProvisionDescription() {
        return warrantyProvisionDescription;
    }

    /**
     * Sets the value of the warrantyProvisionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setWarrantyProvisionDescription(Anstring70VItemType value) {
        this.warrantyProvisionDescription = value;
    }

    /**
     * Gets the value of the warrantyProvisionFiscalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getWarrantyProvisionFiscalAmount() {
        return warrantyProvisionFiscalAmount;
    }

    /**
     * Sets the value of the warrantyProvisionFiscalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setWarrantyProvisionFiscalAmount(MonetaryNoDecimalsItemType value) {
        this.warrantyProvisionFiscalAmount = value;
    }

    /**
     * Gets the value of the warrantyProvisionWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getWarrantyProvisionWithdrawal() {
        return warrantyProvisionWithdrawal;
    }

    /**
     * Sets the value of the warrantyProvisionWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setWarrantyProvisionWithdrawal(MonetaryNoDecimalsItemType value) {
        this.warrantyProvisionWithdrawal = value;
    }

}
