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
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring20VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreservedIncomeCapitalInsuranceOwnHouseEmigration" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}PreservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid" minOccurs="0"/>
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
    "preservedIncomeCapitalInsuranceOwnHouseEmigration",
    "preservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue",
    "preservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement",
    "preservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName",
    "preservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber",
    "preservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid"
})
public class PreservedIncomeCapitalInsuranceOwnHouseEmigrationSpecification
    extends Placeholder
{

    @XmlElement(name = "PreservedIncomeCapitalInsuranceOwnHouseEmigration", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType preservedIncomeCapitalInsuranceOwnHouseEmigration;
    @XmlElement(name = "PreservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType preservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue;
    @XmlElement(name = "PreservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType preservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement;
    @XmlElement(name = "PreservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring70VItemType preservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName;
    @XmlElement(name = "PreservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring20VItemType preservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber;
    @XmlElement(name = "PreservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType preservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid;

    /**
     * Gets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigration property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPreservedIncomeCapitalInsuranceOwnHouseEmigration() {
        return preservedIncomeCapitalInsuranceOwnHouseEmigration;
    }

    /**
     * Sets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPreservedIncomeCapitalInsuranceOwnHouseEmigration(MonetaryNoDecimalsItemType value) {
        this.preservedIncomeCapitalInsuranceOwnHouseEmigration = value;
    }

    /**
     * Gets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getPreservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue() {
        return preservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue;
    }

    /**
     * Sets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setPreservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue(BooleanItemType value) {
        this.preservedIncomeCapitalInsuranceOwnHouseEmigrationFairValue = value;
    }

    /**
     * Gets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getPreservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement() {
        return preservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement;
    }

    /**
     * Sets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setPreservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement(BooleanItemType value) {
        this.preservedIncomeCapitalInsuranceOwnHouseEmigrationInOwnManagement = value;
    }

    /**
     * Gets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getPreservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName() {
        return preservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName;
    }

    /**
     * Sets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setPreservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName(Anstring70VItemType value) {
        this.preservedIncomeCapitalInsuranceOwnHouseEmigrationInsuranceCompanyName = value;
    }

    /**
     * Gets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getPreservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber() {
        return preservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber;
    }

    /**
     * Sets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setPreservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber(Anstring20VItemType value) {
        this.preservedIncomeCapitalInsuranceOwnHouseEmigrationPolicyNumber = value;
    }

    /**
     * Gets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getPreservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid() {
        return preservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid;
    }

    /**
     * Sets the value of the preservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setPreservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid(BooleanItemType value) {
        this.preservedIncomeCapitalInsuranceOwnHouseEmigrationPremiumsPaid = value;
    }

}
