package com.ireview.extraction.reviews.utils;

public class ConstantsWebsites {

	//##################    SUPPORTED WEBSITES    ##################
	public static final String FLIPKART = "FLIPKART";
	public static final String AMAZON = "AMAZON";
	public static final String EBAY = "EBAY";
	public static final String TWITTER = "TWITTER";
	
	//###################   FLIPKART   ###################
	public static final String FLIPKART_LINK = "http://www.flipkart.com";
	public static final String FLIPKART_PRODUCT_REVIEWS = "product-reviews";
	public static final String FLIPKART_REVIEW_STRING = "span.review-text";
	public static final String FLIPKART_RATING_ALL = "rating=1,2,3,4,5";
	public static final String FLIPKART_REVIEW_ALL = "reviewers=all";
	public static final String FLIPKART_TYPE_TOP = "type=top";
	public static final String FLIPKART_SORT = "sort=most_helpful";
	public static final String FLIPKART_START = "start=";
	public static final String FLIPKART_PARAM_LINK = FLIPKART_RATING_ALL + "&" + FLIPKART_REVIEW_ALL + "&" 
													+ FLIPKART_TYPE_TOP + "&" + FLIPKART_SORT + "&" + FLIPKART_START;
}