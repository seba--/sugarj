package xml;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import xml.XmlAsSax;
import xml.XmlJavaSyntax;
public class BookTest extends xml.Test 
{ 
  public static void main(String[] args) throws SAXException
  { 
    ContentHandler ch = new BookTest();
    String title = "Sweetness and Power: The Place of Sugar in Modern History";
    { 
      ch.startDocument();
      org.xml.sax.helpers.AttributesImpl b_0 = new org.xml.sax.helpers.AttributesImpl();
      b_0.addAttribute("", "title", "title", "CDATA", title + "");
      ch.startElement("", "book", "book", b_0);
      org.xml.sax.helpers.AttributesImpl a_0 = new org.xml.sax.helpers.AttributesImpl();
      a_0.addAttribute("", "name", "name", "CDATA", "Sidney W. Mintz" + "");
      ch.startElement("", "author", "author", a_0);
      ch.endElement("", "author", "author");
      ch.endElement("", "book", "book");
      ch.endDocument();
    }
  }
}
