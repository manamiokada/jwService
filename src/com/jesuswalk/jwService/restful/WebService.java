package com.jesuswalk.jwService.restful;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.bson.Document;
import org.json.JSONException;
import org.mongodb.morphia.Datastore;

import com.jesuswalk.jwService.database.MongoConnection;
import com.jesuswalk.jwService.model.*;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.util.JSON;

@Path("/webservice")
public class WebService {
	
	private static Map<String, Person> persons = new HashMap<String, Person>();
	
	@GET
	@Path("/test")
	@Produces("application/json")
	public Response data() throws JSONException {
		String result = "Failed";
		
		MongoCollection<Document> collection = MongoConnection.getCollection("Person");
		FindIterable<Document> docs = collection.find();
		for (Document doc : docs) {
			result += doc.toJson();
		}
			
		return Response.status(200).entity(result).build();
	}
	
	@Path("{json}")
	@GET	
	@Produces("application/json")
	public Response createdata(@PathParam("json") String json) throws JSONException {
		String result = "Success";
		
		MongoCollection<Document> collection = MongoConnection.getCollection("Person");		
		Document doc = Document.parse(json);
		collection.insertOne(doc);
			
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/insert")
	@Consumes("application/json")
	public Response createput(String person) throws JSONException {
		String result = "Failed";
		if(person != null)
			result = person;	
		
		
		
		return Response.status(200).entity(result).build();
	}
	

}
