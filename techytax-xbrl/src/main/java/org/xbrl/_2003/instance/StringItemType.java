//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package org.xbrl._2003.instance;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.iso3166_countrycodes_2017_03_18.IsoCountryCodes2CharactersItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.iso3166_countrycodes_2017_03_18.IsoCountryCodes3CharactersItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.iso4217_currencycodes_2016_02_24.IsoCurrencyCodes4217ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_codes.LegalItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_codes.PersonRoleItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_codes.YesNoItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.EmailItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.ImageItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.NlzipItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.NonNegative20ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.String100000ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.String1000ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.String250ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.String500ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.sbi_businesscodes_2017.SbiItemType;


/**
 * <p>Java class for stringItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stringItemType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.xbrl.org/2003/instance}nonNumericItemAttrs"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stringItemType", propOrder = {
    "value"
})
@XmlSeeAlso({
    String1000ItemType.class,
    IsoCountryCodes3CharactersItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.IsoCountrycodeECMemberStatesItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.AbrogationEmployeeItemType.class,
    NlzipItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.IsoCountryCodeESRRItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.OwnHousePrincipalResidenceUsageSpecialSituationItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.DeliveryVanUserItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.AbrogationEntrpeneurItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.PostponementCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.TrainingItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.FunctionalCurrencyFactorItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.VatRateTypeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.String512ItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.ApplicationIdItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.ContactItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.StatementItemType.class,
    IsoCountryCodes2CharactersItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.MediaCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.MotivationCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_codes.TaxNameItemType.class,
    String500ItemType.class,
    EmailItemType.class,
    String250ItemType.class,
    ImageItemType.class,
    NonNegative20ItemType.class,
    String100000ItemType.class,
    PersonRoleItemType.class,
    LegalItemType.class,
    nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_codes.GenderItemType.class,
    YesNoItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.IsoCountrycodeECMemberStatesItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.AbrogationEmployeeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.IsoCountryCodeESRRItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.OwnHousePrincipalResidenceUsageSpecialSituationItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.DeliveryVanUserItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.AbrogationEntrpeneurItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.PostponementCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.TrainingItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.FunctionalCurrencyFactorItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.VatRateTypeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_types.String512ItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.ApplicationIdItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.ContactItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.StatementItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.MediaCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.MotivationCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_codes.TaxNameItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.IsoCountrycodeECMemberStatesItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.AbrogationEmployeeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.IsoCountryCodeESRRItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.OwnHousePrincipalResidenceUsageSpecialSituationItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.DeliveryVanUserItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.AbrogationEntrpeneurItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.PostponementCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.TrainingItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.FunctionalCurrencyFactorItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.VatRateTypeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_types.String512ItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.ApplicationIdItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.ContactItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.StatementItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.MediaCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.MotivationCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20171213_a.dictionary.bd_codes.TaxNameItemType.class,
    nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_codes_ext1.DonorRelationCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_codes_ext1.RelationCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_codes_ext1.CapitalItemType.class,
    nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_codes_ext1.LegalFormItemType.class,
    nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_codes_ext1.MovablePropertyItemType.class,
    nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_codes_ext1.GenderItemType.class,
    nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_codes_ext1.InterestItemType.class,
    nl.nltaxonomie.nt12.bd._20180418.dictionary.bd_codes_ext1.BenefitTerminationItemType.class,
    nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_codes_ext1.InterestItemType.class,
    nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_codes_ext1.CapitalItemType.class,
    nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_codes_ext1.MovablePropertyItemType.class,
    nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_codes_ext1.GenderItemType.class,
    nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_codes_ext1.BenefitTerminationItemType.class,
    nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_codes_ext1.LegalFormItemType.class,
    nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_codes_ext1.RelationCodeItemType.class,
    nl.nltaxonomie.nt12.bd._20180418_b.dictionary.bd_codes_ext1.DonorRelationCodeItemType.class,
    SbiItemType.class,
    IsoCurrencyCodes4217ItemType.class
})
public class StringItemType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "contextRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object contextRef;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the contextRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContextRef() {
        return contextRef;
    }

    /**
     * Sets the value of the contextRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContextRef(Object value) {
        this.contextRef = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
