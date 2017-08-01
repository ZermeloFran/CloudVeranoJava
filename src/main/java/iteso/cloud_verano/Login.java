package iteso.cloud_verano;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("login")
public class Login {
	
	@GET
	Response login(){
		return Response.ok().type(MediaType.APPLICATION_JSON).build();
	}
}
