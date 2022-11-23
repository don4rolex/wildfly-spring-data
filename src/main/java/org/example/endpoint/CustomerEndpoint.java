package org.example.endpoint;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.data.Customer;
import org.example.service.CustomerService;

import java.util.List;

@Path("/hello")
public class CustomerEndpoint {

    @Inject
    private CustomerService service;

    @GET
    @Path("/world")
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Customer> hello() {
        service.save();
        return service.findAll();
    }

}