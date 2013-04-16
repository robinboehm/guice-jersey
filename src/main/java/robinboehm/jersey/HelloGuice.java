package robinboehm.jersey;

import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
public class HelloGuice {
    private final GuicyInterface gi;

    @Inject
    public HelloGuice(final GuicyInterface gi) {
        this.gi = gi;
    }
    @GET
    @Produces("text/plain")
    public String get(@QueryParam("x") String x) {
        return "Howdy Guice. " + "Injected impl " + gi.toString() + ". Injected query parameter "+ (x != null ? "x = " + x : "x is not injected");
    }
}
