package xml;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import xml.AsSax;
import xml.Test;
import xml.XmlJavaSyntax;
public class BookTest extends xml.Test 
{ 
  public static void main(String[] args) throws SAXException
  { 
    ContentHandler ch = new BookTest();
    String title = "Sweetness and Power: The Place of Sugar in Modern History";
    { 
      ch.startDocument();
      org.xml.sax.helpers.AttributesImpl k_3 = new org.xml.sax.helpers.AttributesImpl();
      k_3.addAttribute("", "title", "title", "CDATA", title + "");
      ;
      ch.startElement("", "book", "book", k_3);
      org.xml.sax.helpers.AttributesImpl j_3 = new org.xml.sax.helpers.AttributesImpl();
      j_3.addAttribute("", "name", "name", "CDATA", "Sidney W. Mintz" + "");
      ;
      ch.startElement("", "author", "author", j_3);
      ch.endElement("", "author", "author");
      ;
      ch.endElement("", "book", "book");
      ;
      ch.endDocument();
    }
  }
}
