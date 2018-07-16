package com.axelor.graphql;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.axelor.repository.beans.Contact;
import com.yahoo.elide.core.EntityDictionary;
import com.yahoo.elide.security.checks.Check;

import graphql.schema.GraphQLSchema;

public class GraphQLTest {
	
	protected EntityDictionary dictionary;
	
	@BeforeClass
	public void init() {
		System.err.println("run");
		 Map<String, Class<? extends Check>> checks = new HashMap<>();
		 checks.put("allow all", com.yahoo.elide.security.checks.prefab.Role.ALL.class);
		 dictionary = new EntityDictionary(checks);
		 dictionary.bindEntity(Contact.class);
	}
	
//	@Test
//    public void testPageInfoObject() {
////        DataFetcher fetcher = mock(DataFetcher.class);
////        ModelBuilder builder = new ModelBuilder(dictionary, fetcher);
//
//        GraphQLSchema schema = builder.build();
//
//        GraphQLObjectType bookType = (GraphQLObjectType) schema.getType(BOOK);
//        Assert.assertNotNull(bookType.getFieldDefinition(PAGE_INFO));
//    }

}
