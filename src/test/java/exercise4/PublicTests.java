package exercise4;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PublicTests {

    // count the number of words in a document - test #1
    @Test
    public void testWordCount1() throws IOException {
        Document testDoc = new Document("http://textfiles.com/conspiracy/bookfile.txt");
        assertEquals(5094, testDoc.wordCount());
    }

    // count the number of words in a document - test #2
    @Test
    public void testWordCount2() throws IOException {
        Document testDoc = new Document("http://textfiles.com/conspiracy/bankcris.txt");
        assertEquals(1522, testDoc.wordCount());
    }

    // find the most frequent word in a document
    @Test
    public void testFrequentWord() throws IOException, EmptyDocumentException {
        Document testDoc = new Document("http://textfiles.com/conspiracy/bendini.txt");
        assertEquals("the", testDoc.mostFrequentWord());
    }

    // find the count of the most frequent word in a document
    @Test
    public void testFrequentWordCount() throws IOException, EmptyDocumentException {
        Document testDoc = new Document("http://textfiles.com/conspiracy/bendini.txt");
        assertEquals(216, testDoc.mostFrequentWordCount());
    }

    // compute the hashcode - test #1
    @Test
    public void testHashCode1() throws IOException {
        Document testDoc = new Document("http://textfiles.com/conspiracy/assassin.the");
        assertEquals(4291, testDoc.hashCode());
    }

    // compute the hashcode - test #2
    @Test
    public void testHashCode2() throws IOException {
        Document testDoc = new Document("http://textfiles.com/conspiracy/autoscam.hum");
        assertEquals(1698, testDoc.hashCode());
    }

}
