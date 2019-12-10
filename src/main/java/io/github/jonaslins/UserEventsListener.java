package io.github.jonaslins;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserEventsListener {

    @Incoming("user-topic")
    public void process(String message) {
       System.out.println("hey yo!");
    }
}