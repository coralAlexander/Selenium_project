package steps;

import pages.MapPage;
import pages.MerchantConfigPage;
import pages.MerchantPage;

public class MerchantPageSteps {

   private MerchantPage merchantPage = new MerchantPage();

   public MerchantPageSteps  cleanAccountFromDrivers(){
      merchantPage.pushOnCleanAccountFromDriversCustomersAndTasks();
      merchantPage.confirmAlert();
      return this;
   }

   public MerchantConfigPage selectMerchantConfiguration(){
      merchantPage.selectMerchantConfiguration();
      return new MerchantConfigPage();
   }
}
