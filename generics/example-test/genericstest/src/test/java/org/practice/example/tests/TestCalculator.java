package org.practice.example.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.practice.example.app.Calculator;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestCalculator {

    @Parameterized.Parameter(value = 0)
    public Object first;
    @Parameterized.Parameter(value = 1)
    public Object second;
    @Parameterized.Parameter(value = 2)
    public Object result;

    @Parameterized.Parameters(name = "Test Add {index}: add [{0}+{1}={2}]")
    public static Collection getNumbers(){
        return Arrays.asList(new Object[][]{
                {new Integer(5),new Integer(6),new Integer(11)},
                {new Long(5),new Long(9),new Long(14)},
                {new Short((short) 12),new Short((short) 9),new Short((short) 21)},
                {new Double(12.1),new Double(8.0),new Double(20.1)},
                {new Float(7.5),new Float(8.2), new Float(15.7)}
        });

    }
    @Test
    public void testAddition(){

        Calculator calculator = new Calculator();
        assertEquals(getObject(result), calculator.add(getObject(first),getObject(second)));

    }

    private <T extends Number> T getObject(Object ob){
        try {
            return  (T) ob;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
