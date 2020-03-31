package yolocamel;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("/")
public class EventReceiver {

    @Inject 
    @Channel("out-events") 
    Emitter<String> emitter;

    @POST
    @Path("/event")
    public void hello(String input) {
        System.out.println("Res : " + input);
        emitter.send(input);
    }

    // @Incoming("in-events")
    // public void consume(String message) {              
    //     System.out.println("Consumed from kafka " + message);
    // }

}