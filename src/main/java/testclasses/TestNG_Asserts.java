package testclasses;

import appcode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Asserts {

    public SomeClassToTest obj = new SomeClassToTest();

    @Test
    public void testSumNumber(){
        System.out.println("\nRunning Test -> testSum");
        int result = obj.sumNumbers(1,2);
        Assert.assertEquals(result,3);
    }

    @Test
    public void testStrings() {
        System.out.println("\nRunning Test -> testStrings");
        String expectedString = "Hello World";
        String result = obj.addStrings("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testArrays() {
        System.out.println("\nRunning Test -> testArrays");
        int[] expectedArray = {1, 2, 3, 4};
        int[] result = obj.getArray();
        Assert.assertEquals(result, expectedArray);
        System.out.println("\nEnd Test -> testArrays");
    }

}
