package exercise4;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GradingTests {
    @Test
    public void doc1() throws IOException, EmptyDocumentException {
        Document myDoc = new Document("http://textfiles.com/conspiracy/bankcris.txt");
        assertEquals(1522, myDoc.wordCount());
        assertEquals("the", myDoc.mostFrequentWord());
        assertEquals(95, myDoc.mostFrequentWordCount());
        assertEquals(1630, myDoc.hashCode());
    }

    @Test
    public void doc2() throws IOException, EmptyDocumentException {
        Document myDoc = new Document("http://textfiles.com/conspiracy/autoscam.hum");
        assertEquals(2446, myDoc.wordCount());
        assertEquals("the", myDoc.mostFrequentWord());
        assertEquals(140, myDoc.mostFrequentWordCount());
        assertEquals(1698, myDoc.hashCode());
    }

    @Test
    public void doc3() throws IOException, EmptyDocumentException {
        Document myDoc = new Document("http://textfiles.com/conspiracy/bookfile.txt");
        assertEquals(5094, myDoc.wordCount());
        assertEquals("the", myDoc.mostFrequentWord());
        assertEquals(260, myDoc.mostFrequentWordCount());
        assertEquals(8027, myDoc.hashCode());
    }

    @Test
    public void doc4() throws IOException, EmptyDocumentException {
        Document myDoc = new Document("https://www.dropbox.com/s/57tnpb0qqxux3w9/simple.txt?raw=1");
        assertEquals(19, myDoc.wordCount());
        assertEquals("a", myDoc.mostFrequentWord());
        assertEquals(5, myDoc.mostFrequentWordCount());
        assertEquals(2459, myDoc.hashCode());
    }


    @Test(expected = EmptyDocumentException.class)
    public void doc5() throws IOException, EmptyDocumentException {
        Document myDoc = new Document("https://www.dropbox.com/s/1f93otau53an9b5/empty.txt?raw=1");
        assertEquals(0, myDoc.wordCount());
        assertEquals("", myDoc.mostFrequentWord());
        assertEquals(0, myDoc.mostFrequentWordCount());
    }
}
