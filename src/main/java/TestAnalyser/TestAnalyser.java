package TestAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MoodAnalyzer.AnalyseandRespond;

public class TestAnalyser {
	@Test
	public void test() {
		
		assertEquals("HAPPY" , new AnalyseandRespond().analyzeMood("I am in Happy Mood"));
	}
}
