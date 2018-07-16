package com.axelor.repository;

import com.axelor.repository.beans.Contact;
import com.yahoo.elide.standalone.config.ElideStandaloneSettings;

public class Settings implements ElideStandaloneSettings {
	
    @Override
    public String getModelPackageName() {
        return Contact.class.getPackage().getName();
//    	return "com.axelor.repository.beans";
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
