package com.baeldung.bootique.router;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class IndexController {

    /**
     * Bootique controller endpoint. 
     */
    @GET
    public String index() {
        return "Hello, baeldung!";
    }

}
