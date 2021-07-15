package flows;

import pages.MerchantConfigPage;
import pages.MerchantPage;

public class MerchantPageFlows {

   private MerchantPage merchantPage = new MerchantPage();

   public MerchantPageFlows cleanAccountFromDrivers(){
      merchantPage.pushOnCleanAccountFromDriversCustomersAndTasks();
      merchantPage.confirmAlert();
      return this;
   }

   public MerchantConfigPage selectMerchantConfiguration(){
      merchantPage.selectMerchantConfiguration();
      return new MerchantConfigPage();
   }
}
