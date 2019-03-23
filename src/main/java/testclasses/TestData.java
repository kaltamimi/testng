package testclasses;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"kawthar","khalid"},
                {"milk","bunny"},
                {"moon","sleep"},
        };
    }


}