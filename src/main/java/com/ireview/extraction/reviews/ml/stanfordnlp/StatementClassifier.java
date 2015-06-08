package com.ireview.extraction.reviews.ml.stanfordnlp;

import java.util.ArrayList;
import java.util.List;

import com.ireview.extraction.reviews.utils.ConstantsPhoneFeatures;

public class StatementClassifier {

	private static StatementClassifier instance = new StatementClassifier( );

    private StatementClassifier() {

    }

    public static StatementClassifier getInstance() {
		if(instance == null) {
			instance = new StatementClassifier();
		}
		return instance;
	}
    
    public List<String> parse(String sentence) {
    	List<String> classifier = new ArrayList<String>();
    	
    	//CAMERA
    	boolean isFound = processSentence(sentence, 
    										ConstantsPhoneFeatures.PHONE_CAMERA_EXACT_UNMATCH,
    										ConstantsPhoneFeatures.PHONE_CAMERA_EXACT_MATCH,
    										ConstantsPhoneFeatures.PHONE_CAMERA_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.CAMERA);
    	}
    	
    	//NETWORK
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_NETWORK_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_NETWORK_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_NETWORK_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.NETWORK);
    	}
    	
    	//MEMORY
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_MEMORY_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_MEMORY_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_MEMORY_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.MEMORY);
    	}
    	
    	//DISPLAY
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_DISPLAY_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_DISPLAY_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_DISPLAY_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.DISPLAY);
    	}
    	
    	//PROCESSOR
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_PROCESSOR_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_PROCESSOR_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_PROCESSOR_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.PROCESSOR);
    	}
    	
    	//UPGRADE
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_UPGRADE_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_UPGRADE_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_UPGRADE_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.UPGRADE);
    	}
    	
    	//PRICE
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_PRICE_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_PRICE_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_PRICE_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.PRICE);
    	}
    	
    	//DESIGN
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_DESIGN_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_DESIGN_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_DESIGN_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.DESIGN);
    	}
    	
    	//SERVICE
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_SERVICE_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_SERVICE_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_SERVICE_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.SERVICE);
    	}
    	
    	//WIFI
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_WIFI_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_WIFI_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_WIFI_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.WIFI);
    	}
    	
    	//AUDIO
    	isFound = processSentence(sentence, 
    								ConstantsPhoneFeatures.PHONE_AUDIO_EXACT_UNMATCH,
    								ConstantsPhoneFeatures.PHONE_AUDIO_EXACT_MATCH,
    								ConstantsPhoneFeatures.PHONE_AUDIO_MATCH);
    	if(isFound) {
    		classifier.add(ConstantsPhoneFeatures.AUDIO);
    	}
    	
    	return classifier;
    }
    
    private boolean processSentence(String sentence, String[] unmatch_pattern, String[] exact_match_pattern, String[] match_pattern) {
    	int size = unmatch_pattern.length;
    	for(int i=0; i<size; i++) {
    		String pattern = unmatch_pattern[i];
    		if(sentence.contains(pattern)) {
    			return false;
    		}
    	}
    	
    	size = exact_match_pattern.length;
    	for(int i=0; i<size; i++) {
    		String pattern = exact_match_pattern[i];
    		if(sentence.contains(pattern)) {
    			return true;
    		}
    	}
    	
    	size = match_pattern.length;
    	for(int i=0; i<size; i++) {
    		String pattern = match_pattern[i];
    		if(sentence.contains(pattern)) {
    			return true;
    		}
    	}
    	
    	return false;
    }
}
