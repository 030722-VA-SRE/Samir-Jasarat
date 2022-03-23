package com.revproject;

import com.revproject.models.Client;
import com.revproject.services.ClientService;

import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		
		/*
		 * Allows us to interact with methods in the ClientService class. These methods
		 * interact with clientpostgres to handle persistence while adding business logic
		 */
		ClientService is = new ClientService();
				
		Javalin app = Javalin.create();
		app.start(8080);
		
		app.get("/clients", (ctx)->{
			Client clients = is.getAllClients();
			
			ctx.json(clients);
		});
		//example of a path param
		app.get("clients/{id}", (ctx) -> {
			//returns the value of pathparam of name id, converted to a string to int
			int id = Integer.parseInt(ctx.pathParam("id"));
			//retrieve item using the item service method
			Client client = is.getById(id);
			
			ctx.json(client);
			ctx.status(200);
		});
	}

}
