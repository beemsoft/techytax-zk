//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_alg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring20VItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-algemeen}ProfessionalAssociationForTaxServiceProvidersName"/>
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
    "professionalAssociationForTaxServiceProvidersName"
})
public class ProfessionalAssociationForTaxServiceProvidersSpecification
    extends Placeholder
{

    @XmlElement(name = "ProfessionalAssociationForTaxServiceProvidersName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-algemeen", required = true)
    protected Anstring20VItemType professionalAssociationForTaxServiceProvidersName;

    /**
     * Gets the value of the professionalAssociationForTaxServiceProvidersName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getProfessionalAssociationForTaxServiceProvidersName() {
        return professionalAssociationForTaxServiceProvidersName;
    }

    /**
     * Sets the value of the professionalAssociationForTaxServiceProvidersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setProfessionalAssociationForTaxServiceProvidersName(Anstring20VItemType value) {
        this.professionalAssociationForTaxServiceProvidersName = value;
    }

}