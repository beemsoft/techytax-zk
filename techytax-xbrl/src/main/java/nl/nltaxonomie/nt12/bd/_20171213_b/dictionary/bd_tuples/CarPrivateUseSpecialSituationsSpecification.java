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
import nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.Anstring70VItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}CarPrivateUseSpecialSituationsAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}CarPrivateUseSpecialSituationsDescription" minOccurs="0"/>
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
    "carPrivateUseSpecialSituationsAmount",
    "carPrivateUseSpecialSituationsDescription"
})
public class CarPrivateUseSpecialSituationsSpecification
    extends Placeholder
{

    @XmlElement(name = "CarPrivateUseSpecialSituationsAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType carPrivateUseSpecialSituationsAmount;
    @XmlElement(name = "CarPrivateUseSpecialSituationsDescription", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring70VItemType carPrivateUseSpecialSituationsDescription;

    /**
     * Gets the value of the carPrivateUseSpecialSituationsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getCarPrivateUseSpecialSituationsAmount() {
        return carPrivateUseSpecialSituationsAmount;
    }

    /**
     * Sets the value of the carPrivateUseSpecialSituationsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setCarPrivateUseSpecialSituationsAmount(MonetaryNoDecimalsItemType value) {
        this.carPrivateUseSpecialSituationsAmount = value;
    }

    /**
     * Gets the value of the carPrivateUseSpecialSituationsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getCarPrivateUseSpecialSituationsDescription() {
        return carPrivateUseSpecialSituationsDescription;
    }

    /**
     * Sets the value of the carPrivateUseSpecialSituationsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setCarPrivateUseSpecialSituationsDescription(Anstring70VItemType value) {
        this.carPrivateUseSpecialSituationsDescription = value;
    }

}
