import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;


/*Реструктуризація файлу. 
Написати програму,  
яка зчитує XML-файл 
і для кожного елемента перетворює всі його атрибути на дочірні елементи.
 Використати відповідну таблицю стилів XSLT (не DOM!). */

public class main {
    public static void main(String [] args) throws TransformerException {

        //отримання нового екземпляру TransformerFactory
        TransformerFactory factory = TransformerFactory.newInstance();
        Source xsl = new StreamSource("workers.xsl");
        //Create a new Transformer that performs a copy of the Source -> xsl -> to the Result -> transformer
        Transformer transformer = factory.newTransformer(xsl);
        Source xml =new StreamSource("workers.xml");
        Result result = new StreamResult("out.xml");
        transformer.transform(xml,result);
    }

}
