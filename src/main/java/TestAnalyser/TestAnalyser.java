package TestAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MoodAnalyzer.AnalyseandRespond;

public class TestAnalyser {
	 @Test
	 public void testAnalyse1() {
		 assertEquals("Happy" , new AnalyseandRespond("I am in Happy Mood"));
	    }

	 @Test
	 public void testAnalyse2() {
		 assertEquals("Sad" , new AnalyseandRespond("I am in Sad Mood"));
	    }
}
