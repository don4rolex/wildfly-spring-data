package org.example.endpoint;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.Set;

@ApplicationPath("/api")
public class Activator extends Application {
   /* class body intentionally left blank */

    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(CustomerEndpoint.class);
    }
}