package com.axelor.repository;

import com.yahoo.elide.standalone.config.ElideStandaloneSettings;

public class Settings implements ElideStandaloneSettings {
    @Override
    public String getModelPackageName() {
    	return "com.axelor.repository.beans";
    }
}
