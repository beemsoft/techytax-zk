//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_tuples;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}AssetsOtherInConnectionWithResultFromActivitiesDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}AssetsOtherInConnectionWithResultFromActivitiesValue" maxOccurs="2" minOccurs="0"/>
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
    "assetsOtherInConnectionWithResultFromActivitiesDescription",
    "assetsOtherInConnectionWithResultFromActivitiesValue"
})
public class AssetsOtherInConnectionWithResultFromOtherActivitiesSpecification
    extends Placeholder
{

    @XmlElement(name = "AssetsOtherInConnectionWithResultFromActivitiesDescription", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected Anstring70VItemType assetsOtherInConnectionWithResultFromActivitiesDescription;
    @XmlElement(name = "AssetsOtherInConnectionWithResultFromActivitiesValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected List<MonetaryNoDecimalsItemType> assetsOtherInConnectionWithResultFromActivitiesValue;

    /**
     * Gets the value of the assetsOtherInConnectionWithResultFromActivitiesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getAssetsOtherInConnectionWithResultFromActivitiesDescription() {
        return assetsOtherInConnectionWithResultFromActivitiesDescription;
    }

    /**
     * Sets the value of the assetsOtherInConnectionWithResultFromActivitiesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setAssetsOtherInConnectionWithResultFromActivitiesDescription(Anstring70VItemType value) {
        this.assetsOtherInConnectionWithResultFromActivitiesDescription = value;
    }

    /**
     * Gets the value of the assetsOtherInConnectionWithResultFromActivitiesValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetsOtherInConnectionWithResultFromActivitiesValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetsOtherInConnectionWithResultFromActivitiesValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryNoDecimalsItemType }
     * 
     * 
     */
    public List<MonetaryNoDecimalsItemType> getAssetsOtherInConnectionWithResultFromActivitiesValue() {
        if (assetsOtherInConnectionWithResultFromActivitiesValue == null) {
            assetsOtherInConnectionWithResultFromActivitiesValue = new ArrayList<MonetaryNoDecimalsItemType>();
        }
        return this.assetsOtherInConnectionWithResultFromActivitiesValue;
    }

}
