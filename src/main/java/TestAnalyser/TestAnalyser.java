package TestAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MoodAnalyzer.AnalyseandRespond;

public class TestAnalyser {
	@Test
	public void test() {
		
		assertEquals("SAD" , new AnalyseandRespond().analyzeMood("I am in Sad Mood"));
	}
}
