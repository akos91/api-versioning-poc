package com.tfakos.apiversining.resources;

import javax.naming.directory.InvalidAttributesException;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.tfakos.apiversining.v1.resources.AccountsResourceImplV1;
import com.tfakos.apiversining.v2.resources.AccountsResourceImplV2;

@Path("/main")
public class MainResource {

	// TODO some kind of dependency injection
	private AccountsResourceImplV1 accountResourceV1;
	private AccountsResourceImplV2 accountResourceV2;
	
	@Path("/accounts")
	public MainAccountResource accounts(@QueryParam("version") String version) throws InvalidAttributesException {
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
