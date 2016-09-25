package com.ignacio.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = { "TagToGroupSomeAPIs" })
@Path("/hello")
public class Resource {
    @GET
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
    @ApiOperation(value = "Send a message via GET")
    public Response getMsg(@PathParam("param") String msg) {
        String output = "REST say : " + msg;
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
    @ApiOperation(value = "Send a message via POST")
    public Response postMsg(@PathParam("param") String msg) {
        String output = "REST say : " + msg;
        return Response.status(200).entity(output).build();
    }
}