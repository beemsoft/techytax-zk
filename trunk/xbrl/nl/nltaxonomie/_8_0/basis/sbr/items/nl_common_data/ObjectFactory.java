//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.09 at 10:28:44 PM CET 
//


package nl.nltaxonomie._8_0.basis.sbr.items.nl_common_data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_codes.GenderItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_codes.LegalItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_codes.PersonRoleItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.EmailItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NlzipItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeItemType;
import nl.nltaxonomie.iso.iso3166.IsoCountryCodes2CharactersItemType;
import nl.nltaxonomie.iso.iso3166.IsoCountryCodes3CharactersItemType;
import org.xbrl._2003.instance.DateItemType;
import org.xbrl._2003.instance.StringItemType;
import org.xbrl._2003.instance.TokenItemType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.nltaxonomie._8_0.basis.sbr.items.nl_common_data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DocumentCreationDate_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "DocumentCreationDate");
    private final static QName _CountryCodeISO_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "CountryCodeISO");
    private final static QName _StatutoryNameEntity_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "StatutoryNameEntity");
    private final static QName _HouseNumberNL_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "HouseNumberNL");
    private final static QName _POBoxNumber_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "POBoxNumber");
    private final static QName _TaxReferenceNumber_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "TaxReferenceNumber");
    private final static QName _EmailAddressDescription_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "EmailAddressDescription");
    private final static QName _FamilyName_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "FamilyName");
    private final static QName _LegalForm_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "LegalForm");
    private final static QName _NameRegion_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "NameRegion");
    private final static QName _DateOfDeath_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "DateOfDeath");
    private final static QName _PrivatePersonIdentification_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "PrivatePersonIdentification");
    private final static QName _Nationality_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "Nationality");
    private final static QName _EmailAddressOwner_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "EmailAddressOwner");
    private final static QName _EmailAddressFull_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "EmailAddressFull");
    private final static QName _SexCode_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "SexCode");
    private final static QName _DescriptionLocationNL_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "DescriptionLocationNL");
    private final static QName _PlaceOfResidenceNL_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "PlaceOfResidenceNL");
    private final static QName _StartDateForFinancialPeriod_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "StartDateForFinancialPeriod");
    private final static QName _HouseNumberAbroad_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "HouseNumberAbroad");
    private final static QName _PlaceOfResidenceAbroad_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "PlaceOfResidenceAbroad");
    private final static QName _PostalCodeNL_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "PostalCodeNL");
    private final static QName _EndDateForFinancialPeriod_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "EndDateForFinancialPeriod");
    private final static QName _NationalityCode_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "NationalityCode");
    private final static QName _Prefix_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "Prefix");
    private final static QName _Initials_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "Initials");
    private final static QName _DateOfBirth_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "DateOfBirth");
    private final static QName _FirstName_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "FirstName");
    private final static QName _DescriptionLocationAbroad_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "DescriptionLocationAbroad");
    private final static QName _TelephoneNumberUsage_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "TelephoneNumberUsage");
    private final static QName _NameBusiness_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "NameBusiness");
    private final static QName _HouseNumberAddition_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "HouseNumberAddition");
    private final static QName _PostalCodeAbroad_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "PostalCodeAbroad");
    private final static QName _NameShareholder_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "NameShareholder");
    private final static QName _StreetNameNL_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "StreetNameNL");
    private final static QName _StreetNameAbroad_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "StreetNameAbroad");
    private final static QName _TelephoneNumber_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "TelephoneNumber");
    private final static QName _CountryName_QNAME = new QName("http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", "CountryName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.nltaxonomie._8_0.basis.sbr.items.nl_common_data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "DocumentCreationDate", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<DateItemType> createDocumentCreationDate(DateItemType value) {
        return new JAXBElement<DateItemType>(_DocumentCreationDate_QNAME, DateItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsoCountryCodes3CharactersItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "CountryCodeISO", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<IsoCountryCodes3CharactersItemType> createCountryCodeISO(IsoCountryCodes3CharactersItemType value) {
        return new JAXBElement<IsoCountryCodes3CharactersItemType>(_CountryCodeISO_QNAME, IsoCountryCodes3CharactersItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "StatutoryNameEntity", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createStatutoryNameEntity(StringItemType value) {
        return new JAXBElement<StringItemType>(_StatutoryNameEntity_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonNegativeItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "HouseNumberNL", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<NonNegativeItemType> createHouseNumberNL(NonNegativeItemType value) {
        return new JAXBElement<NonNegativeItemType>(_HouseNumberNL_QNAME, NonNegativeItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonNegativeItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "POBoxNumber", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<NonNegativeItemType> createPOBoxNumber(NonNegativeItemType value) {
        return new JAXBElement<NonNegativeItemType>(_POBoxNumber_QNAME, NonNegativeItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "TaxReferenceNumber", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createTaxReferenceNumber(StringItemType value) {
        return new JAXBElement<StringItemType>(_TaxReferenceNumber_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "EmailAddressDescription", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createEmailAddressDescription(StringItemType value) {
        return new JAXBElement<StringItemType>(_EmailAddressDescription_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "FamilyName", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createFamilyName(StringItemType value) {
        return new JAXBElement<StringItemType>(_FamilyName_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "LegalForm", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<LegalItemType> createLegalForm(LegalItemType value) {
        return new JAXBElement<LegalItemType>(_LegalForm_QNAME, LegalItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "NameRegion", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createNameRegion(StringItemType value) {
        return new JAXBElement<StringItemType>(_NameRegion_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "DateOfDeath", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<DateItemType> createDateOfDeath(DateItemType value) {
        return new JAXBElement<DateItemType>(_DateOfDeath_QNAME, DateItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "PrivatePersonIdentification", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createPrivatePersonIdentification(StringItemType value) {
        return new JAXBElement<StringItemType>(_PrivatePersonIdentification_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "Nationality", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<TokenItemType> createNationality(TokenItemType value) {
        return new JAXBElement<TokenItemType>(_Nationality_QNAME, TokenItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonRoleItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "EmailAddressOwner", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<PersonRoleItemType> createEmailAddressOwner(PersonRoleItemType value) {
        return new JAXBElement<PersonRoleItemType>(_EmailAddressOwner_QNAME, PersonRoleItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "EmailAddressFull", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<EmailItemType> createEmailAddressFull(EmailItemType value) {
        return new JAXBElement<EmailItemType>(_EmailAddressFull_QNAME, EmailItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "SexCode", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<GenderItemType> createSexCode(GenderItemType value) {
        return new JAXBElement<GenderItemType>(_SexCode_QNAME, GenderItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "DescriptionLocationNL", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createDescriptionLocationNL(StringItemType value) {
        return new JAXBElement<StringItemType>(_DescriptionLocationNL_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "PlaceOfResidenceNL", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createPlaceOfResidenceNL(StringItemType value) {
        return new JAXBElement<StringItemType>(_PlaceOfResidenceNL_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "StartDateForFinancialPeriod", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<DateItemType> createStartDateForFinancialPeriod(DateItemType value) {
        return new JAXBElement<DateItemType>(_StartDateForFinancialPeriod_QNAME, DateItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "HouseNumberAbroad", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createHouseNumberAbroad(StringItemType value) {
        return new JAXBElement<StringItemType>(_HouseNumberAbroad_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "PlaceOfResidenceAbroad", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createPlaceOfResidenceAbroad(StringItemType value) {
        return new JAXBElement<StringItemType>(_PlaceOfResidenceAbroad_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlzipItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "PostalCodeNL", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<NlzipItemType> createPostalCodeNL(NlzipItemType value) {
        return new JAXBElement<NlzipItemType>(_PostalCodeNL_QNAME, NlzipItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "EndDateForFinancialPeriod", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<DateItemType> createEndDateForFinancialPeriod(DateItemType value) {
        return new JAXBElement<DateItemType>(_EndDateForFinancialPeriod_QNAME, DateItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsoCountryCodes2CharactersItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "NationalityCode", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<IsoCountryCodes2CharactersItemType> createNationalityCode(IsoCountryCodes2CharactersItemType value) {
        return new JAXBElement<IsoCountryCodes2CharactersItemType>(_NationalityCode_QNAME, IsoCountryCodes2CharactersItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "Prefix", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createPrefix(StringItemType value) {
        return new JAXBElement<StringItemType>(_Prefix_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "Initials", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createInitials(StringItemType value) {
        return new JAXBElement<StringItemType>(_Initials_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "DateOfBirth", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<DateItemType> createDateOfBirth(DateItemType value) {
        return new JAXBElement<DateItemType>(_DateOfBirth_QNAME, DateItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "FirstName", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createFirstName(StringItemType value) {
        return new JAXBElement<StringItemType>(_FirstName_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "DescriptionLocationAbroad", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createDescriptionLocationAbroad(StringItemType value) {
        return new JAXBElement<StringItemType>(_DescriptionLocationAbroad_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "TelephoneNumberUsage", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createTelephoneNumberUsage(StringItemType value) {
        return new JAXBElement<StringItemType>(_TelephoneNumberUsage_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "NameBusiness", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createNameBusiness(StringItemType value) {
        return new JAXBElement<StringItemType>(_NameBusiness_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "HouseNumberAddition", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createHouseNumberAddition(StringItemType value) {
        return new JAXBElement<StringItemType>(_HouseNumberAddition_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "PostalCodeAbroad", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createPostalCodeAbroad(StringItemType value) {
        return new JAXBElement<StringItemType>(_PostalCodeAbroad_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "NameShareholder", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createNameShareholder(StringItemType value) {
        return new JAXBElement<StringItemType>(_NameShareholder_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "StreetNameNL", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createStreetNameNL(StringItemType value) {
        return new JAXBElement<StringItemType>(_StreetNameNL_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "StreetNameAbroad", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createStreetNameAbroad(StringItemType value) {
        return new JAXBElement<StringItemType>(_StreetNameAbroad_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "TelephoneNumber", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createTelephoneNumber(StringItemType value) {
        return new JAXBElement<StringItemType>(_TelephoneNumber_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0/basis/sbr/items/nl-common-data", name = "CountryName", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<TokenItemType> createCountryName(TokenItemType value) {
        return new JAXBElement<TokenItemType>(_CountryName_QNAME, TokenItemType.class, null, value);
    }

}
