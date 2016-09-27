package com.ignacio.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;


import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@ApplicationPath("/api/*")
@SwaggerDefinition(tags = { @Tag(name = "REST application", description = "My REST application") })
public class Application extends javax.ws.rs.core.Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(Resource.class);
        return s;
    }

}