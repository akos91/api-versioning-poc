package com.tfakos.apiversioning.v1.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.tfakos.apiversioning.resources.MainAccountResource;

public interface AccountsResourceV1 extends MainAccountResource {

	@Path("/getByName/{name}")
	AccountResponse loadAccount(@PathParam("name") String name);

	@Path("/filter")
	AccountResponse filterAccount(@QueryParam("name") String name);
	
	AccountResponse loadFullAccount(@PathParam("id") Long id);
	
	void createAccount(AccountRequest account);
	
	@Path("/ping")
	@GET
	String v1Ping();
}
