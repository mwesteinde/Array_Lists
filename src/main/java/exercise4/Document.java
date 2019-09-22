package exercise4;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Document {

    private final String url;     // the URL for this document
    private final int wordCount;  // the number of words in the document
    private HashMap<String,Integer> myMap = new HashMap<String, Integer>();
    private String full;
    private String BiggestWord;


    public Document(String url) throws IOException {
        // TODO: implement this constructor
        this.url = url;
        String word;
        int biggest = 0;

        int wordNumber = 0;
        int value;

        Scanner urlScanner = new Scanner(new URL(url).openStream());


//puts next word into Map, creates long string

        while (urlScanner.hasNext()) {
            word = urlScanner.next();


            full = full+word;
            if (myMap.containsKey(word)) {
                value = myMap.get(word);
                value++;
                myMap.put(word, value);
                if (value > biggest) {
                    BiggestWord = word;
                    biggest=value;
                }
                if (value == biggest) {
                    if (BiggestWord.compareTo(word) >= 0) {
                        BiggestWord = word;
                    }
                }
            }
            else {
                myMap.put(word, 1);

            }

                wordNumber++;
            }
            wordCount = wordNumber;

        }


    /**
     * Return the number of words in the document.
     * A word is a sequence of characters separated from other words
     * by whitespaces.
     *
     * @return the number of words in the document.
     */
    public int wordCount() {
        return wordCount;
    }

    /**
     * Return the most frequent word in the document
     *
     * @return the most frequent word in the document.
     * @throws EmptyDocumentException if the document contains no words.
     */
    public String mostFrequentWord() throws EmptyDocumentException {
        // TODO: Implement this method
        String NextWord;
        String MFWord="";
        int max=0;
        int count;
        if (this.wordCount == 0) {
            throw new EmptyDocumentException();
        }
        System.out.println(BiggestWord);

        return BiggestWord;
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
        int count;

        if (this.wordCount == 0) {
            throw new EmptyDocumentException();
        }
        count=myMap.get(BiggestWord);

        return count;
    }

    /**
     * Returns the hash code for the document.
     *
     * @return the hash code for the document.
     */
    public int hashCode() {
        int hash=0;
        int j=0;


        char [] cr=full.toCharArray();
        for (int i=0;i<cr.length;i+=4){
            hash+= (int) (cr[i]*1);
            hash+= (int) (cr[i]*256);
            hash+= (int) (cr[i]*256*256);
            hash+= (int) (cr[i]*256*256*256);
        }

        hash=hash%8192;


        System.out.println(full);


        return hash; // change this
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
