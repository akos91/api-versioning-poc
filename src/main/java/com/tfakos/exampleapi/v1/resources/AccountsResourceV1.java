package com.tfakos.exampleapi.v1.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("v1/accounts")
public class AccountsResourceV1 {

    @GET
    public List<AccountResponse1> loadAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @GET
    @Path("{id : [-0-9][0-9]*}")
    public AccountResponse1 loadFullAccount(@PathParam("id") Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @GET
    @Path("/getByName/{name}")
    public AccountResponse1 loadAccount(@PathParam("name") String name) {
		// TODO Auto-generated method stub
		return null;
	}


    @POST
    public void createAccount(AccountRequest1 account) {
		// TODO Auto-generated method stub
	}

    @PUT
    @Path("{id : [-0-9][0-9]*")
    public AccountResponse1 updateAccount(@PathParam("id") String accountId, AccountRequest1 account) {
        // TODO Auto-generated method stub
        return null;
    }


}
