package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/patients")
public class PatientResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String patients(){
		return "AKash";
	}
}
