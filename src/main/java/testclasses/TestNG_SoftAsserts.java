package testclasses;

import appcode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAsserts {

    @Test
    public void test(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("\nRunning Test -> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1,2);

        softAssert.assertEquals(result,2);
        System.out.println("\nLine after assert 1");

        softAssert.assertEquals(result,3);
        System.out.println("\nLine after assert 2");
        softAssert.assertAll();
    }
}
