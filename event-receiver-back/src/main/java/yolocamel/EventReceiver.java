package yolocamel;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/event")
public class EventReceiver {


    @POST
    public void event(String input){

        System.out.println("TOTO : " + input);
    }
}