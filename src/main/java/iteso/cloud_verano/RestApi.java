package iteso.cloud_verano;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Hello world!
 *
 */
@ApplicationPath("api")
public class RestApi extends Application{
	
	@Override
	public Set<Class<?>> getClasses(){
		HashSet<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(Login.class);
		classes.add(Signup.class);
		classes.add(UserDashboard.class);
		return classes;
	}
	
	public Set<Object> getSingletons(){
		HashSet<Object> singletons = new HashSet<Object>();
		singletons.add(Interceptor.class);
		return singletons;
	}
}
