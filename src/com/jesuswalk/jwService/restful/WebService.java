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

import com.jesuswalk.jwService.database.MongoConnection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.util.JSON;


@Path("/webservice")
public class WebService {
	
	
	@GET
	@Path("/retrieveall")
	@Produces("application/json")
	public Response getAll() throws JSONException {
		String result = "Success";
		
		MongoCollection<Document> collection = MongoConnection.getCollection("Person");
		FindIterable<Document> docs = collection.find();
		for (Document doc : docs) {
			result += doc.toJson();
		}
			
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@PathParam("{id}")
	@Path("/retrieveone/{id}")
	@Produces("application/json")
	public Response getOne(@PathParam("id") String ID) throws JSONException {
		String result = "Success";
		BasicDBObject search = new BasicDBObject();
		search.put("_id", ID);
		MongoCollection<Document> collection = MongoConnection.getCollection("Person");
		FindIterable<Document> docs = collection.find(search);
		result = docs.first().toJson();
			
		return Response.status(200).entity(result).build();
	}
		
	@GET
	@Path("/retrievestudent")
	@Produces("application/json")
	public Response getStudents() throws JSONException {
		String result = "Success";
		
		MongoCollection<Document> collection = MongoConnection.getCollection("Person");
		FindIterable<Document> docs = collection.find(); //MUST ADD PARAMETERS
		for (Document doc : docs) {
			result += doc.toJson();
		}
			
			
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/retrievestaff")
	@Produces("application/json")
	public Response getStaffs() throws JSONException {
		String result = "Success";
		
		MongoCollection<Document> collection = MongoConnection.getCollection("Person");
		FindIterable<Document> docs = collection.find();//MUST ADD PARAMETERS
		for (Document doc : docs) {
			result += doc.toJson();
		}
			
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/retrievecounselors")
	@Produces("application/json")
	public Response getCounselors() throws JSONException {
		String result = "Success";
		
		MongoCollection<Document> collection = MongoConnection.getCollection("Person");
		FindIterable<Document> docs = collection.find();//MUST ADD PARAMETERS
		for (Document doc : docs) {
			result += doc.toJson();
		}
			
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/insertone")
	@Consumes("application/json")
	public Response insert(String person) throws JSONException {
		String result = "Success";
		
		MongoCollection<Document> collection = MongoConnection.getCollection("Person");		
		Document doc = Document.parse(person);
		collection.insertOne(doc);
		
		
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/insertmany")
	@Consumes("application/json")
	public Response insertmany(String persons) throws JSONException {
		String result = "Success";
		
		MongoCollection<Document> collection = MongoConnection.getCollection("Person");		
		Document doc = Document.parse(persons);
		collection.insertOne(doc);
		
		
		return Response.status(200).entity(result).build();
	}
	

}
