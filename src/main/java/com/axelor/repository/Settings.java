package com.axelor.repository;

//import com.axelor.sale.Customer;
//import com.axelor.sale.SaleOrder;
import com.yahoo.elide.standalone.config.ElideStandaloneSettings;

public class Settings implements ElideStandaloneSettings {
	
    @Override
    public String getModelPackageName() {
//        return SaleOrder.class.getPackage().getName();
    	return "com.axelor.sale";
//    	return "com.axelor.repository";
    }

//    @Override
//    public String getGraphQLApiPathSepc() {
//        return "/graphql";
//    }
//
//    @Override
//    public boolean enableGraphQL() {
//        return true;
//    }
}
