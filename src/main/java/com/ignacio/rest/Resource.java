package com.ignacio.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags={"TagToGroupSomeAPIs"})
@Path("/hello")
public class Resource {
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
	public Response getMsg(@PathParam("param") String msg) {
		String output = "REST say : " + msg;
		return Response.status(200).entity(output).build();
	}
}