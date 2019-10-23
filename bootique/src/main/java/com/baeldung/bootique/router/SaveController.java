package com.baeldung.bootique.router;

import com.baeldung.bootique.service.HelloService;
import com.google.inject.Inject;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/save")
public class SaveController {

    @Inject
    HelloService helloService;

    /**
     * Bootique controller endpoint. 
     */
    @POST
    public String save() {
        return "Data Saved!";
    }

}
