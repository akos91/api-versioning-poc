package com.tfakos.mediatype.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.tfakos.mediatype.beans.AccountRequestV2;
import com.tfakos.mediatype.beans.AccountRequestV3;
import com.tfakos.mediatype.beans.AccountResponseV2;
import com.tfakos.mediatype.beans.AccountResponseV3;

@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("accounts")
public class AccountsResource {


    @GET
    @Path("{id : [0-9]+")
    @Produces(AccountResponseV3.MEDIA_TYPE_V3)
    public AccountResponseV3 loadFullAccount(@PathParam("id") Long id) {
        // TODO Auto-generated method stub
        return null;
    }


    // New end point added in V2 and changed in V3
    @GET
    @Path("/search")
    @Produces(AccountResponseV2.MEDIA_TYPE_V2)
    public AccountResponseV2 searchAccounts(@QueryParam("username") String userName) {
        // TODO Auto-generated method stub
        return null;
    }

    @GET
    @Path("/search")
    @Produces(AccountResponseV3.MEDIA_TYPE_V3)
    public AccountResponseV3 searchAccounts(@QueryParam("username") String userName, @QueryParam("age") Integer age) {
        // TODO Auto-generated method stub
        return null;
    }


    @POST
    @Consumes(AccountRequestV3.MEDIA_TYPE)
    public void createAccount(AccountRequestV3 account) {
		// TODO Auto-generated method stub
	}

    @POST
    @Consumes(AccountRequestV2.MEDIA_TYPE_V2)
    public void createAccount(AccountRequestV2 account) {
        // TODO Auto-generated method stub
    }

    @PUT
    @Path("{id : [-0-9][0-9]*")
    @Consumes(AccountRequestV3.MEDIA_TYPE)
    @Produces(AccountResponseV3.MEDIA_TYPE_V3)
    public AccountResponseV3 updateAccount(@PathParam("id") String accountId, AccountRequestV3 account) {
        // TODO Auto-generated method stub
        return null;
    }

    @PUT
    @Path("{id : [-0-9][0-9]*")
    @Consumes(AccountRequestV2.MEDIA_TYPE_V2)
    @Produces(AccountResponseV2.MEDIA_TYPE_V2)
    public AccountResponseV2 updateAccount(@PathParam("id") String accountId, AccountRequestV2 account) {
        // TODO Auto-generated method stub
        return null;
    }

}
