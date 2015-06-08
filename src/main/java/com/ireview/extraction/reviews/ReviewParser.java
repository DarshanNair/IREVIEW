package com.ireview.extraction.reviews;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.ireview.extraction.reviews.ml.stanfordnlp.SentimentAnalyzer;
import com.ireview.extraction.reviews.ml.stanfordnlp.StatementClassifier;
import com.ireview.extraction.reviews.utils.ConstantsWebsiteFlipkartPhones;
import com.ireview.extraction.reviews.utils.ConstantsWebsites;
 
public class ReviewParser {

	private static final String DIRECTORY_PATH = "/Users/darshan/Desktop/personnel/MyProject/Flipkart_Data/";
	private static final String FILE_EXTENSION_TXT = ".txt";
	
	public static void main(String[] args) {
		crawlWebsiteReviews(ConstantsWebsites.FLIPKART, ConstantsWebsiteFlipkartPhones.FLIPKART_MOTOG2, 100, 10);
		System.out.println("Dumped all comments from Flipkart");
	}

	private static void sentimentAnalyzer(String para) {
		SentimentAnalyzer sa = SentimentAnalyzer.getInstance();
		StatementClassifier sc = StatementClassifier.getInstance();
		ArrayList<String> sentences = sa.processSentPara(para);
		
		for(int i=0; i<sentences.size(); i++) {
			String sentence = sentences.get(i);
			List<String> classifier = sc.parse(sentence);
			add2file(classifier, sentence);
		}
	}

	private static void crawlWebsiteReviews(String website, String product, int pageCount, int incrementCount) {
		
		String query_link = null;
		String query_string = null;
		
		if(website.equals(ConstantsWebsites.FLIPKART)) {
			System.out.println("#############################" + ConstantsWebsites.FLIPKART + "#############################");
			if(product.equals(ConstantsWebsiteFlipkartPhones.FLIPKART_MOTOG2)) {
				System.out.println("#############################" + ConstantsWebsiteFlipkartPhones.FLIPKART_MOTOG2 + "#############################");
				query_link = ConstantsWebsiteFlipkartPhones.FLIPKART_MOTOG2_LINK;
				query_string = ConstantsWebsites.FLIPKART_REVIEW_STRING;
			}
		}
		
		try {
			for(int i=0; i<pageCount; i=i+incrementCount) {
				Document doc = Jsoup.connect(query_link + i).get();

				// get page title
				String title = doc.title();
				System.out.println("Parsing Link With Title: " + title);

				// get all review text
				Elements reviews = doc.select(query_string);
				for (Element review : reviews) {
					System.out.println("#############################" + " Review " + "#############################");
					sentimentAnalyzer(review.text());
				}
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void add2file(List<String> fileNames, String sentence) {
		
		try {
			
			for(int i=0; i<fileNames.size(); i++) {
				File file =new File(DIRECTORY_PATH + fileNames.get(i) + FILE_EXTENSION_TXT);
		
				if(!file.exists()){
					file.createNewFile();
				}
		
				FileWriter fileWritter = new FileWriter(file,true);
				BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
				bufferWritter.write(sentence);
				bufferWritter.write("\n\n");
				bufferWritter.close();
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
 
}