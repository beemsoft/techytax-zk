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
import nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.Anstring6FItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.MonetaryNoDecimalsItemType;
import org.xbrl._2003.instance.BooleanItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}CarPrivateUseCalculated" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}CarPrivateUseCataloguePrice" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}CarPrivateUseExpensesChargesTaxpayersOwnExpense" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}CarPrivateUseKilometreRecordsExists" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}CarPrivateUsePeriodEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}CarPrivateUsePeriodStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data}CarPrivateUseRegistration" minOccurs="0"/>
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
    "carPrivateUseCalculated",
    "carPrivateUseCataloguePrice",
    "carPrivateUseExpensesChargesTaxpayersOwnExpense",
    "carPrivateUseKilometreRecordsExists",
    "carPrivateUsePeriodEndDate",
    "carPrivateUsePeriodStartDate",
    "carPrivateUseRegistration"
})
public class CarPrivateUseSpecification
    extends Placeholder
{

    @XmlElement(name = "CarPrivateUseCalculated", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType carPrivateUseCalculated;
    @XmlElement(name = "CarPrivateUseCataloguePrice", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType carPrivateUseCataloguePrice;
    @XmlElement(name = "CarPrivateUseExpensesChargesTaxpayersOwnExpense", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType carPrivateUseExpensesChargesTaxpayersOwnExpense;
    @XmlElement(name = "CarPrivateUseKilometreRecordsExists", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected BooleanItemType carPrivateUseKilometreRecordsExists;
    @XmlElement(name = "CarPrivateUsePeriodEndDate", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected DateItemType carPrivateUsePeriodEndDate;
    @XmlElement(name = "CarPrivateUsePeriodStartDate", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected DateItemType carPrivateUsePeriodStartDate;
    @XmlElement(name = "CarPrivateUseRegistration", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.a/dictionary/bd-data")
    protected Anstring6FItemType carPrivateUseRegistration;

    /**
     * Gets the value of the carPrivateUseCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getCarPrivateUseCalculated() {
        return carPrivateUseCalculated;
    }

    /**
     * Sets the value of the carPrivateUseCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setCarPrivateUseCalculated(MonetaryNoDecimalsItemType value) {
        this.carPrivateUseCalculated = value;
    }

    /**
     * Gets the value of the carPrivateUseCataloguePrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getCarPrivateUseCataloguePrice() {
        return carPrivateUseCataloguePrice;
    }

    /**
     * Sets the value of the carPrivateUseCataloguePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setCarPrivateUseCataloguePrice(MonetaryNoDecimalsItemType value) {
        this.carPrivateUseCataloguePrice = value;
    }

    /**
     * Gets the value of the carPrivateUseExpensesChargesTaxpayersOwnExpense property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getCarPrivateUseExpensesChargesTaxpayersOwnExpense() {
        return carPrivateUseExpensesChargesTaxpayersOwnExpense;
    }

    /**
     * Sets the value of the carPrivateUseExpensesChargesTaxpayersOwnExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setCarPrivateUseExpensesChargesTaxpayersOwnExpense(MonetaryNoDecimalsItemType value) {
        this.carPrivateUseExpensesChargesTaxpayersOwnExpense = value;
    }

    /**
     * Gets the value of the carPrivateUseKilometreRecordsExists property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getCarPrivateUseKilometreRecordsExists() {
        return carPrivateUseKilometreRecordsExists;
    }

    /**
     * Sets the value of the carPrivateUseKilometreRecordsExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setCarPrivateUseKilometreRecordsExists(BooleanItemType value) {
        this.carPrivateUseKilometreRecordsExists = value;
    }

    /**
     * Gets the value of the carPrivateUsePeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getCarPrivateUsePeriodEndDate() {
        return carPrivateUsePeriodEndDate;
    }

    /**
     * Sets the value of the carPrivateUsePeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setCarPrivateUsePeriodEndDate(DateItemType value) {
        this.carPrivateUsePeriodEndDate = value;
    }

    /**
     * Gets the value of the carPrivateUsePeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getCarPrivateUsePeriodStartDate() {
        return carPrivateUsePeriodStartDate;
    }

    /**
     * Sets the value of the carPrivateUsePeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setCarPrivateUsePeriodStartDate(DateItemType value) {
        this.carPrivateUsePeriodStartDate = value;
    }

    /**
     * Gets the value of the carPrivateUseRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring6FItemType }
     *     
     */
    public Anstring6FItemType getCarPrivateUseRegistration() {
        return carPrivateUseRegistration;
    }

    /**
     * Sets the value of the carPrivateUseRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring6FItemType }
     *     
     */
    public void setCarPrivateUseRegistration(Anstring6FItemType value) {
        this.carPrivateUseRegistration = value;
    }

}
