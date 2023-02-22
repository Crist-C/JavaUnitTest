package com.aprendizaje.util;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void testRepeatZeroTimes(){
        assertEquals("",StringUtil.repeat("Hola", 0));
    }

    @Test
    public void testRepeatOnce(){
        assertEquals("Hola",StringUtil.repeat("Hola", 1));
    }

    @Test
    public void testRepeatMultipleTimes(){
        assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatNegativeTimes(){
        assertEquals("Hola",StringUtil.repeat("Hola", -1));
    }

}