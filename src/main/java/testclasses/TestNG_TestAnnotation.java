package testclasses;

import appcode.SomeClassToTest;
import org.testng.annotations.Test;

public class TestNG_TestAnnotation {

    //run the test alphabetical order


    @Test
    public void testMethod2() {
        System.out.println("Running Test -> testMethod2");
    }

    @Test
    public void testMethod3() {
        System.out.println("Running Test -> testMethod3");
    }

    @Test
    public void testMethod1(){
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        System.out.println("Running Test -> testMethod1");
    }

}
