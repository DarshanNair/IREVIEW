/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ireview.extraction.reviews.ml.stanfordnlp;

import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.*;

import org.jsoup.Jsoup;

public class SentimentAnalyzer {

	private static SentimentAnalyzer instance = new SentimentAnalyzer( );
	
    private Logger log;
    private Annotation document;
    private StanfordCoreNLP pipeline;
    private ArrayList<ArrayList<String>> dictionary;

    private SentimentAnalyzer() {

        log = Logger.getLogger("SentimentAnalyzer");
        log.info("Initializing");

        Properties props = new Properties();
        props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
        pipeline = new StanfordCoreNLP(props);

        dictionary = readDictionary();

    }

    public static SentimentAnalyzer getInstance() {
		if(instance == null) {
			instance = new SentimentAnalyzer();
		}
		return instance;
	}
    
    public ArrayList<String> processSentPara(String text) {
    	ArrayList<String> retSentences = new ArrayList<String>();
    	
    	text = Jsoup.parse(text).text();
        document = new Annotation(text);
        pipeline.annotate(document);

        List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);
        for (CoreMap sentence : sentences) {
        	System.out.println("#############################" + " SENTENCE " + "#############################");
        	System.out.println(sentence.toString());
        	retSentences.add(sentence.toString());
        }
	
        return retSentences;
    }

    private ArrayList<ArrayList<String>> readDictionary() {

        BufferedReader br;

        ArrayList<String> posWordsLocal = new ArrayList<>();
        ArrayList<String> negWordsLocal = new ArrayList<>();
        ArrayList<String> negEmphatWordsLocal = new ArrayList<>();
        ArrayList<String> posEmphatWordsLocal = new ArrayList<>();

        ArrayList<ArrayList<String>> dictionary = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("data/dictionary/LoughranMcDonald_Positive.txt"));
            while (br.ready()) {
                String line = br.readLine();
                posWordsLocal.add(line.trim().toLowerCase());
            }
            br.close();

            br = new BufferedReader(new FileReader("data/dictionary/LoughranMcDonald_Negative.txt"));
            while (br.ready()) {
                String line = br.readLine();
                negWordsLocal.add(line.trim().toLowerCase());
            }
            br.close();

            br = new BufferedReader(new FileReader("data/dictionary/positiveemphat.txt"));
            while (br.ready()) {
                String line = br.readLine();
                posEmphatWordsLocal.add(line.trim().toLowerCase());
            }
            br.close();

            br = new BufferedReader(new FileReader("/data/dictionary/negativeemphat.txt"));
            while (br.ready()) {
                String line = br.readLine();
                negEmphatWordsLocal.add(line.trim().toLowerCase());
            }
            br.close();


        } catch (IOException e) {
        }

        dictionary.add(posWordsLocal);
        dictionary.add(negWordsLocal);
        dictionary.add(posEmphatWordsLocal);
        dictionary.add(negEmphatWordsLocal);

        return dictionary;
    }
}
