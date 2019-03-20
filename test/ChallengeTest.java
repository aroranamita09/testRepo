package com.stackroute;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class ChallengeTest {
    Challenge obj;
    @Before
    public void setUp() throws Exception {
        obj=new Challenge();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void sortArray() {
        int expectedArr = 1;
        assertEquals(expectedArr,obj.sortArray(new int[] {1,2,3},2,3) );
    }
}
