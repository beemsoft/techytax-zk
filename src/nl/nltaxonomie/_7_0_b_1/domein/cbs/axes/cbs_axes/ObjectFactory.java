//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package nl.nltaxonomie._7_0_b_1.domein.cbs.axes.cbs_axes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.xbrl._2003.instance.StringItemType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.nltaxonomie._7_0_b_1.domein.cbs.axes.cbs_axes package. 
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

    private final static QName _StatusDimension_QNAME = new QName("http://www.nltaxonomie.nl/7.0.b.1/domein/cbs/axes/cbs-axes", "StatusDimension");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.nltaxonomie._7_0_b_1.domein.cbs.axes.cbs_axes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/7.0.b.1/domein/cbs/axes/cbs-axes", name = "StatusDimension", substitutionHeadNamespace = "http://xbrl.org/2005/xbrldt", substitutionHeadName = "dimensionItem")
    public JAXBElement<StringItemType> createStatusDimension(StringItemType value) {
        return new JAXBElement<StringItemType>(_StatusDimension_QNAME, StringItemType.class, null, value);
    }

}