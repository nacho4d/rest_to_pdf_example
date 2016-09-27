package com.ignacio.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ignacio.rest.bean.SimpleResponseBean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = { "TagToGroupSomeAPIs" })
@Path("/echo")
public class Resource {
    @GET
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
    @ApiOperation(value = "Send a message via GET")
    public SimpleResponseBean getMsg(@PathParam("param") String msg) {
        String output = "REST say : " + msg;
        SimpleResponseBean res = new SimpleResponseBean();
        res.setMessage(output);
        return res;
    }

    @POST
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
    @ApiOperation(value = "Send a message via POST")
    public SimpleResponseBean postMsg(@PathParam("param") String msg) {
        String output = "REST say : " + msg;
        SimpleResponseBean res = new SimpleResponseBean();
        res.setMessage(output);
        return res;
    }
}