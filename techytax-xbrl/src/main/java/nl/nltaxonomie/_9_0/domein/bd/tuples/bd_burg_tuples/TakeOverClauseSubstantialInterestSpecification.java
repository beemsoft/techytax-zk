//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring10VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring200VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Test11ItemType;
import org.xbrl._2003.instance.BooleanItemType;
import org.xbrl._2003.instance.DateTimeItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestBusinessCapital" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestDeceasedTransfereeSurname" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestTakeOverClauseCompensation" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestTakeOverClauseValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestTransfereeDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestTransfereeIdentificationnumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestTransfereeSurname" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestValueCompensationPaidForTakeOver" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TakeOverClauseSubstantialInterestValueTakenOverPart" minOccurs="0"/>
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
    "takeOverClauseSubstantialInterestBusinessCapital",
    "takeOverClauseSubstantialInterestDeceasedTransfereeSurname",
    "takeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials",
    "takeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix",
    "takeOverClauseSubstantialInterestTakeOverClauseCompensation",
    "takeOverClauseSubstantialInterestTakeOverClauseValue",
    "takeOverClauseSubstantialInterestTransfereeDateOfBirth",
    "takeOverClauseSubstantialInterestTransfereeIdentificationnumber",
    "takeOverClauseSubstantialInterestTransfereeSurname",
    "takeOverClauseSubstantialInterestValueCompensationPaidForTakeOver",
    "takeOverClauseSubstantialInterestValueTakenOverPart"
})
public class TakeOverClauseSubstantialInterestSpecification
    extends Placeholder
{

    @XmlElement(name = "TakeOverClauseSubstantialInterestBusinessCapital", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType takeOverClauseSubstantialInterestBusinessCapital;
    @XmlElement(name = "TakeOverClauseSubstantialInterestDeceasedTransfereeSurname", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring200VItemType takeOverClauseSubstantialInterestDeceasedTransfereeSurname;
    @XmlElement(name = "TakeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring10VItemType takeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials;
    @XmlElement(name = "TakeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring10VItemType takeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix;
    @XmlElement(name = "TakeOverClauseSubstantialInterestTakeOverClauseCompensation", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType takeOverClauseSubstantialInterestTakeOverClauseCompensation;
    @XmlElement(name = "TakeOverClauseSubstantialInterestTakeOverClauseValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType takeOverClauseSubstantialInterestTakeOverClauseValue;
    @XmlElement(name = "TakeOverClauseSubstantialInterestTransfereeDateOfBirth", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateTimeItemType takeOverClauseSubstantialInterestTransfereeDateOfBirth;
    @XmlElement(name = "TakeOverClauseSubstantialInterestTransfereeIdentificationnumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Test11ItemType takeOverClauseSubstantialInterestTransfereeIdentificationnumber;
    @XmlElement(name = "TakeOverClauseSubstantialInterestTransfereeSurname", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring200VItemType takeOverClauseSubstantialInterestTransfereeSurname;
    @XmlElement(name = "TakeOverClauseSubstantialInterestValueCompensationPaidForTakeOver", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType takeOverClauseSubstantialInterestValueCompensationPaidForTakeOver;
    @XmlElement(name = "TakeOverClauseSubstantialInterestValueTakenOverPart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType takeOverClauseSubstantialInterestValueTakenOverPart;

    /**
     * Gets the value of the takeOverClauseSubstantialInterestBusinessCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getTakeOverClauseSubstantialInterestBusinessCapital() {
        return takeOverClauseSubstantialInterestBusinessCapital;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestBusinessCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestBusinessCapital(BooleanItemType value) {
        this.takeOverClauseSubstantialInterestBusinessCapital = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestDeceasedTransfereeSurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getTakeOverClauseSubstantialInterestDeceasedTransfereeSurname() {
        return takeOverClauseSubstantialInterestDeceasedTransfereeSurname;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestDeceasedTransfereeSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestDeceasedTransfereeSurname(Anstring200VItemType value) {
        this.takeOverClauseSubstantialInterestDeceasedTransfereeSurname = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getTakeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials() {
        return takeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials(Anstring10VItemType value) {
        this.takeOverClauseSubstantialInterestSubstantialInterestTransfereeInitials = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getTakeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix() {
        return takeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix(Anstring10VItemType value) {
        this.takeOverClauseSubstantialInterestSubstantialInterestTransfereePrefix = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestTakeOverClauseCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getTakeOverClauseSubstantialInterestTakeOverClauseCompensation() {
        return takeOverClauseSubstantialInterestTakeOverClauseCompensation;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestTakeOverClauseCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestTakeOverClauseCompensation(MonetaryNoDecimals10VItemType value) {
        this.takeOverClauseSubstantialInterestTakeOverClauseCompensation = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestTakeOverClauseValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getTakeOverClauseSubstantialInterestTakeOverClauseValue() {
        return takeOverClauseSubstantialInterestTakeOverClauseValue;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestTakeOverClauseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestTakeOverClauseValue(MonetaryNoDecimals10VItemType value) {
        this.takeOverClauseSubstantialInterestTakeOverClauseValue = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestTransfereeDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeItemType }
     *     
     */
    public DateTimeItemType getTakeOverClauseSubstantialInterestTransfereeDateOfBirth() {
        return takeOverClauseSubstantialInterestTransfereeDateOfBirth;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestTransfereeDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestTransfereeDateOfBirth(DateTimeItemType value) {
        this.takeOverClauseSubstantialInterestTransfereeDateOfBirth = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestTransfereeIdentificationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getTakeOverClauseSubstantialInterestTransfereeIdentificationnumber() {
        return takeOverClauseSubstantialInterestTransfereeIdentificationnumber;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestTransfereeIdentificationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestTransfereeIdentificationnumber(Test11ItemType value) {
        this.takeOverClauseSubstantialInterestTransfereeIdentificationnumber = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestTransfereeSurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getTakeOverClauseSubstantialInterestTransfereeSurname() {
        return takeOverClauseSubstantialInterestTransfereeSurname;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestTransfereeSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestTransfereeSurname(Anstring200VItemType value) {
        this.takeOverClauseSubstantialInterestTransfereeSurname = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestValueCompensationPaidForTakeOver property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getTakeOverClauseSubstantialInterestValueCompensationPaidForTakeOver() {
        return takeOverClauseSubstantialInterestValueCompensationPaidForTakeOver;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestValueCompensationPaidForTakeOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestValueCompensationPaidForTakeOver(MonetaryNoDecimals10VItemType value) {
        this.takeOverClauseSubstantialInterestValueCompensationPaidForTakeOver = value;
    }

    /**
     * Gets the value of the takeOverClauseSubstantialInterestValueTakenOverPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getTakeOverClauseSubstantialInterestValueTakenOverPart() {
        return takeOverClauseSubstantialInterestValueTakenOverPart;
    }

    /**
     * Sets the value of the takeOverClauseSubstantialInterestValueTakenOverPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setTakeOverClauseSubstantialInterestValueTakenOverPart(MonetaryNoDecimals10VItemType value) {
        this.takeOverClauseSubstantialInterestValueTakenOverPart = value;
    }

}