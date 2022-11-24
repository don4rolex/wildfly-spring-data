package org.example.endpoint;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.data.Customer;
import org.example.data.UserAccount;
import org.example.service.CustomerService;

import java.util.List;

@Path("/hello")
public class CustomerEndpoint {

    @Inject
    private CustomerService service;

    @GET
    @Path("/customer")
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Customer> findAllCustomers() {
        return service.findAllCustomers();
    }

    @GET
    @Path("/user")
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<UserAccount> findAllUsers() {
        return service.findAllUsers();
    }

}