package com.tfakos.apiversioning.resources;

import javax.naming.directory.InvalidAttributesException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.tfakos.apiversioning.v1.resources.AccountsResourceImplV1;
import com.tfakos.apiversioning.v2.resources.AccountsResourceImplV2;

@Path("/main")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MainResource {

	// TODO some kind of dependency injection
	private AccountsResourceImplV1 accountResourceV1 = new AccountsResourceImplV1();
	private AccountsResourceImplV2 accountResourceV2 = new AccountsResourceImplV2();
	
	@Path("/accounts")
	public MainAccountResource accounts(@QueryParam("version") @DefaultValue("") String version) throws InvalidAttributesException {
		
		switch (version) {
		case "0":
			throw new UnsupportedOperationException("Version 0 api is deprecated");
		case "1":
			return accountResourceV1;
		case "2":
			return accountResourceV2;
		default:
			// latest by default
			return accountResourceV2;
		}
	}
}
