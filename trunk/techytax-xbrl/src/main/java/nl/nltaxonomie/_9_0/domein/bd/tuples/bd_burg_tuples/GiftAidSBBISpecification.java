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
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring60VItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}GiftAidSBBIDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}GiftsAidSBBI" minOccurs="0"/>
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
    "giftAidSBBIDescription",
    "giftsAidSBBI"
})
public class GiftAidSBBISpecification
    extends Placeholder
{

    @XmlElement(name = "GiftAidSBBIDescription", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring60VItemType giftAidSBBIDescription;
    @XmlElement(name = "GiftsAidSBBI", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType giftsAidSBBI;

    /**
     * Gets the value of the giftAidSBBIDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getGiftAidSBBIDescription() {
        return giftAidSBBIDescription;
    }

    /**
     * Sets the value of the giftAidSBBIDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setGiftAidSBBIDescription(Anstring60VItemType value) {
        this.giftAidSBBIDescription = value;
    }

    /**
     * Gets the value of the giftsAidSBBI property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getGiftsAidSBBI() {
        return giftsAidSBBI;
    }

    /**
     * Sets the value of the giftsAidSBBI property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setGiftsAidSBBI(MonetaryNoDecimalsItemType value) {
        this.giftsAidSBBI = value;
    }

}
