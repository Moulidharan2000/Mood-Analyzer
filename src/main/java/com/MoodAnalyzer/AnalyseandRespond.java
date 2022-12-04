package com.MoodAnalyzer;

public class AnalyseandRespond {
	
	String message;
	public AnalyseandRespond(String message) {
		this.message = message;
	}
	public String analyzeMood() {
		if(message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
