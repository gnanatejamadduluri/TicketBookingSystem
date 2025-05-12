package gnana.dbContServ.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/gnana")
public class FieldsController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/fromToLocations")
	public List<String> getLocations() {
	    return jdbcTemplate.queryForList("SELECT location_name FROM gtm_booking.locations", String.class);
	}
	
	@GetMapping("/flightType")
	public List<String> getFlightType() {
		return jdbcTemplate.queryForList("SELECT type_name FROM gtm_booking.flight_types",String.class);
	}
	
	@GetMapping("/aircraftType")
	public List<String> getAircraftType() {
		return jdbcTemplate.queryForList("SELECT model_name FROM gtm_booking.aircraft_types",String.class);
	}
}
