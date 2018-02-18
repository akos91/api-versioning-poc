package com.tfakos.apiversining.v2.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.tfakos.apiversining.resources.MainAccountResource;

public interface AccountsResourceV2 extends MainAccountResource {

	@Path("/getByName/{userName}")
	AccountResponse loadAccount(@PathParam("userName") String userName);
	
	@Path("/filter")
	AccountResponse filterAccount(@QueryParam("userName") String userName);

	AccountResponse loadFullAccount(@PathParam("id") Long id);
	
	void createAccount(AccountRequest account);
}
