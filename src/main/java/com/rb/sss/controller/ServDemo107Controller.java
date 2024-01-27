package com.rb.sss.controller;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
 
import com.rb.sss.model.EmployeeRes; 
 
 
    
import com.rb.sss.model.EmployeeReq; 
import com.rb.sss.service.ServDemo107Service;
import com.rb.core.rest.ConfigIdentifier;
import com.rb.core.rest.GenericApi;

@Path("/api/v1/employees")
public class ServDemo107Controller {

    public static final Logger logger = LoggerFactory.getLogger(ServDemo107Controller.class);
	@Inject
	ServDemo107Service service;

            
        @IntegrationApi
        @ConfigIdentifier("GetEmployee")
        @Path("/get")    
		public EmployeeRes getEmployee
        (EmployeeReq  request) { 
            
             return service.getEmployee(request);
             
        }
    
   

    
        

}

