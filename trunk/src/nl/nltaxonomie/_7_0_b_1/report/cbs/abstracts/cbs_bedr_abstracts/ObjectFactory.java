//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package nl.nltaxonomie._7_0_b_1.report.cbs.abstracts.cbs_bedr_abstracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.xbrl._2003.instance.StringItemType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.nltaxonomie._7_0_b_1.report.cbs.abstracts.cbs_bedr_abstracts package. 
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

    private final static QName _CBSShorttermStatisticTitle_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/report/cbs/abstracts/cbs-bedr-abstracts", "CBSShorttermStatisticTitle");
    private final static QName _GlobalCommonDocumentTaxonomyCBSTitle_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/report/cbs/abstracts/cbs-bedr-abstracts", "GlobalCommonDocumentTaxonomyCBSTitle");
    private final static QName _CBSIncomeStatementTitle_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/report/cbs/abstracts/cbs-bedr-abstracts", "CBSIncomeStatementTitle");
    private final static QName _InvestmentsAndSalesofTangibleFixedAsstesTitle_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/report/cbs/abstracts/cbs-bedr-abstracts", "InvestmentsAndSalesofTangibleFixedAsstesTitle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.nltaxonomie._7_0_b_1.report.cbs.abstracts.cbs_bedr_abstracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/report/cbs/abstracts/cbs-bedr-abstracts", name = "CBSShorttermStatisticTitle", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "presentationItem")
    public JAXBElement<StringItemType> createCBSShorttermStatisticTitle(StringItemType value) {
        return new JAXBElement<StringItemType>(_CBSShorttermStatisticTitle_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/report/cbs/abstracts/cbs-bedr-abstracts", name = "GlobalCommonDocumentTaxonomyCBSTitle", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "presentationItem")
    public JAXBElement<StringItemType> createGlobalCommonDocumentTaxonomyCBSTitle(StringItemType value) {
        return new JAXBElement<StringItemType>(_GlobalCommonDocumentTaxonomyCBSTitle_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/report/cbs/abstracts/cbs-bedr-abstracts", name = "CBSIncomeStatementTitle", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "presentationItem")
    public JAXBElement<StringItemType> createCBSIncomeStatementTitle(StringItemType value) {
        return new JAXBElement<StringItemType>(_CBSIncomeStatementTitle_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/report/cbs/abstracts/cbs-bedr-abstracts", name = "InvestmentsAndSalesofTangibleFixedAsstesTitle", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "presentationItem")
    public JAXBElement<StringItemType> createInvestmentsAndSalesofTangibleFixedAsstesTitle(StringItemType value) {
        return new JAXBElement<StringItemType>(_InvestmentsAndSalesofTangibleFixedAsstesTitle_QNAME, StringItemType.class, null, value);
    }

}