package com.jesuswalk.jwService.database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.sun.jersey.spi.resource.Singleton;
import com.mongodb.MongoException;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.bson.Document;

import com.jesuswalk.jwService.model.*;

@Singleton
public class MongoConnection {

	private static String dbName = "JesusWalk";
	
	public static void Instantiate() throws MongoException {
		
	}
	
	public static MongoCollection<Document> getCollection(String collection) throws MongoException{
		MongoClient client = new MongoClient("localhost", 27017);
		MongoDatabase db = client.getDatabase(dbName);	
		return db.getCollection(collection);
	}
	
	
}
