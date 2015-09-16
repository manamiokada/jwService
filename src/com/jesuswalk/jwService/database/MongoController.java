package com.jesuswalk.jwService.database;

import com.jesuswalk.jwService.model.*;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoController {

	static MongoClient client;
	static MongoDatabase db;
	
	public static void Instantiate() {
		client = new MongoClient("localhost", 27017);
		db = client.getDatabase("JesusWalk");
	}
	
	public static void addPerson(Person person) {
		
	}
	
}
