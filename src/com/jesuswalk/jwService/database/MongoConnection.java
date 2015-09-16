package com.jesuswalk.jwService.database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.sun.jersey.spi.resource.Singleton;
import com.mongodb.MongoException;

import org.bson.Document;


@Singleton
public class MongoConnection {

	private static MongoClient client;
	private static String dbName = "JesusWalk";
	
	public static void Instantiate() throws MongoException {
		
	}
	
	public static MongoCollection<Document> getCollection(String collection) throws MongoException {
		if(client == null)
			client = new MongoClient("localhost", 27017);
		
		MongoDatabase db = client.getDatabase(dbName);	
		return db.getCollection(collection);
	}
	
	
}
