package com.tfakos.uri.latest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("uri/{version: v[3-9]}/accounts")
public class AccountsResource {

    @GET
    public List<AccountResponse> loadAll() {
        // TODO Auto-generated method stub
        // return Arrays.asList(AccountResponse.SAMPLE);
        return null;
    }

    @GET
    @Path("{id : [-0-9][0-9]*}")
    public AccountResponse loadFullAccount(@PathParam("id") Long id) {
        // TODO Auto-generated method stub
        return AccountResponse.SAMPLE;
    }

    @GET
    @Path("/getByName/{name}")
    public AccountResponse loadAccount(@PathParam("name") String name) {
		// TODO Auto-generated method stub
		return null;
	}


    @POST
    public void createAccount(AccountRequest account) {
		// TODO Auto-generated method stub
	}

    @PUT
    @Path("{id : [-0-9][0-9]*}")
    public AccountResponse updateAccount(@PathParam("id") String accountId, AccountRequest account) {
        // TODO Auto-generated method stub
        return null;
    }


}
