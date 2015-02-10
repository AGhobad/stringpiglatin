


package com.quiz.piglatin;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public  class TestStringPigLatin
{
    private StringPigLatin pigLatin;
    
    @Before public void setUpMyTest() {
	pigLatin = new StringPigLatin();
    }
    @Test public void test1() {
	final String result = pigLatin.stringPigLatin("there are 23 horses , true ?");

	assertEquals("heretay reaay 23 orseshay , ruetay ? ", result);
    
    }   
       
}