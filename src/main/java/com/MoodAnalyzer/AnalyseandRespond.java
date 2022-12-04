package com.MoodAnalyzer;

public class AnalyseandRespond {
	
	static String message ;
	
	public String analyzeMood(String message) {
		if(message.contains("Sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
	
	
	
}
