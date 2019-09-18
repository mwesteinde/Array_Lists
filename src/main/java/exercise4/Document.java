package exercise4;

import java.io.IOException;

public class Document {

    private final String url;     // the URL for this document
    private final int wordCount;  // the number of words in the document

    public Document(String url) throws IOException {
        // TODO: implement this constructor
        this.url = url;
        wordCount = 0;
        // ... add more code ...
    }

    /**
     * Return the number of words in the document.
     * A word is a sequence of characters separated from other words
     * by whitespaces.
     *
     * @return the number of words in the document.
     */
    public int wordCount() {
        // TODO: implement this method
        return -1; // change this
    }

    /**
     * Return the most frequent word in the document
     *
     * @return the most frequent word in the document.
     * @throws EmptyDocumentException if the document contains no words.
     */
    public String mostFrequentWord() throws EmptyDocumentException {
        // TODO: Implement this method

        if (this.wordCount == 0) {
            throw new EmptyDocumentException();
        }

        return null; // CHANGE THIS
    }


    /**
     * Return the number of times the most frequent word occurs in this document.
     * If the document contains no words or is empty then throws EmptyDocumentException.
     *
     * @return the number of times the most frequent word occurs in this document.
     * @throws EmptyDocumentException if the document contains no words.
     */
    public int mostFrequentWordCount() throws EmptyDocumentException {
        // TODO: Implement this method

        if (this.wordCount == 0) {
            throw new EmptyDocumentException();
        }

        return -1;
    }

    /**
     * Returns the hash code for the document.
     *
     * @return the hash code for the document.
     */
    public int hashCode() {
        // TODO: Implement this method
        return -1; // change this
    }


    @Override
    /**
     * Returns the URL for the document as a String.
     * @return the URL for the document as a String.
     */
    public String toString() {
        return url;
    }

}
