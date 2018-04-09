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
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring10VItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.NonNegativeInteger3VItemType;
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.NonNegativeInteger5VItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.MonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}WeekendExpensesAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}WeekendExpensesDaysCount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}WeekendExpensesDisabledPersonDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}WeekendExpensesDisabledPersonInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}WeekendExpensesKilometresTravelled" minOccurs="0"/>
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
    "weekendExpensesAmount",
    "weekendExpensesDaysCount",
    "weekendExpensesDisabledPersonDateOfBirth",
    "weekendExpensesDisabledPersonInitials",
    "weekendExpensesKilometresTravelled"
})
public class WeekendExpensesDisabledPersonsSpecification
    extends Placeholder
{

    @XmlElement(name = "WeekendExpensesAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType weekendExpensesAmount;
    @XmlElement(name = "WeekendExpensesDaysCount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeInteger3VItemType weekendExpensesDaysCount;
    @XmlElement(name = "WeekendExpensesDisabledPersonDateOfBirth", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected DateItemType weekendExpensesDisabledPersonDateOfBirth;
    @XmlElement(name = "WeekendExpensesDisabledPersonInitials", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring10VItemType weekendExpensesDisabledPersonInitials;
    @XmlElement(name = "WeekendExpensesKilometresTravelled", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeInteger5VItemType weekendExpensesKilometresTravelled;

    /**
     * Gets the value of the weekendExpensesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getWeekendExpensesAmount() {
        return weekendExpensesAmount;
    }

    /**
     * Sets the value of the weekendExpensesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setWeekendExpensesAmount(MonetaryNoDecimalsItemType value) {
        this.weekendExpensesAmount = value;
    }

    /**
     * Gets the value of the weekendExpensesDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger3VItemType }
     *     
     */
    public NonNegativeInteger3VItemType getWeekendExpensesDaysCount() {
        return weekendExpensesDaysCount;
    }

    /**
     * Sets the value of the weekendExpensesDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger3VItemType }
     *     
     */
    public void setWeekendExpensesDaysCount(NonNegativeInteger3VItemType value) {
        this.weekendExpensesDaysCount = value;
    }

    /**
     * Gets the value of the weekendExpensesDisabledPersonDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getWeekendExpensesDisabledPersonDateOfBirth() {
        return weekendExpensesDisabledPersonDateOfBirth;
    }

    /**
     * Sets the value of the weekendExpensesDisabledPersonDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setWeekendExpensesDisabledPersonDateOfBirth(DateItemType value) {
        this.weekendExpensesDisabledPersonDateOfBirth = value;
    }

    /**
     * Gets the value of the weekendExpensesDisabledPersonInitials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getWeekendExpensesDisabledPersonInitials() {
        return weekendExpensesDisabledPersonInitials;
    }

    /**
     * Sets the value of the weekendExpensesDisabledPersonInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setWeekendExpensesDisabledPersonInitials(Anstring10VItemType value) {
        this.weekendExpensesDisabledPersonInitials = value;
    }

    /**
     * Gets the value of the weekendExpensesKilometresTravelled property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public NonNegativeInteger5VItemType getWeekendExpensesKilometresTravelled() {
        return weekendExpensesKilometresTravelled;
    }

    /**
     * Sets the value of the weekendExpensesKilometresTravelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public void setWeekendExpensesKilometresTravelled(NonNegativeInteger5VItemType value) {
        this.weekendExpensesKilometresTravelled = value;
    }

}
