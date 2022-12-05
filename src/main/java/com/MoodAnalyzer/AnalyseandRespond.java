package com.MoodAnalyzer;

public class AnalyseandRespond {

	private String message;

	public AnalyseandRespond() {
	}

	public AnalyseandRespond(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (Exception e) {
			return "HAPPY";
		}
	}
}
