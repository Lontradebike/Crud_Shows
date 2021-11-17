
	package br.com.config;

    import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRegistration;
	 
	import org.springframework.web.WebApplicationInitializer;
	import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
	import org.springframework.web.servlet.DispatcherServlet;
	 
	public class WebAppInitializer implements WebApplicationInitializer {
	  @Override
	    public void onStartup(ServletContext servletContext) throws ServletException {
	       AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
	        rootContext.register(WebMvcConfig.class);
	        
	        

	          
	  ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
	                "SpringDispatcher", new DispatcherServlet());
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
	          
	    }

 }

}