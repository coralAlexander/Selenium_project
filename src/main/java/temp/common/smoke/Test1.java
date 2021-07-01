package temp.common.smoke;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

    @DataProvider(name = "db")
     public static Object[][] dbData(){
        return  new Object[][]{
                {"SQL", new Integer(1)},
                {"NoSQL",new Integer(2)}
        };
    }

    @Parameters({"db"})
    @Test(dataProvider = "db")
    public void test1(String e1, int e2){

        System.out.println("test1" + e1 + " " + e2);
    }


    @Test(groups ={"smokeTest"})
    public void test11(){
        System.out.println("test11");
    }


    @Test
    public void test3(){
        System.out.println("Test 3");
    }

    @Test(dependsOnMethods = {"test3"},alwaysRun = true )
    public void test55(){
        System.out.println("Test 55");
        Assert.fail();
    }


    @Test(retryAnalyzer = Retry.class)
    void test66(){
        System.out.println("Test 66");
    }

    class Retry implements IRetryAnalyzer{

        private int actualRetry = 0;
        private  static final  int  MAX_RETRY = 3;

        @Override
        public boolean retry(ITestResult iTestResult) {
           if(actualRetry < MAX_RETRY){
               actualRetry++;
               return true;
           }
            return false;
        }
    }
}
