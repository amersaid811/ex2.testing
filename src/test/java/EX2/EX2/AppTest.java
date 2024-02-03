package EX2.EX2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * 
     * 
     */
    @Test
    public void ex2_bva_D_min()
    {
        String result = App.Grades(60);
        String expected = "D";
        org.junit.Assert.assertEquals(expected, result);
        		
    }
    public void ex2_bva_D_minPluseOne()
    {
        String result = App.Grades(61);
        String expected = "D";
        org.junit.Assert.assertEquals(expected, result);
        		
    }
    public void ex2_bva_D_Nominal()
    {
        String result = App.Grades(65);
        String expected = "D";
        org.junit.Assert.assertEquals(expected, result);
        		
    }
    public void ex2_bva_D_MaxMinusOne()
    {
        String result = App.Grades(68);
        String expected = "D";
        org.junit.Assert.assertEquals(expected, result);
        		
    }
    public void ex2_bva_D_Max()
    {
        String result = App.Grades(69);
        String expected = "D";
        org.junit.Assert.assertEquals(expected, result);
        		
    }
}