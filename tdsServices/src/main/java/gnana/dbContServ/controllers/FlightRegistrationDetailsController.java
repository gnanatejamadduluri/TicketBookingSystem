package gnana.dbContServ.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gnana.dbContServ.dbEntities.FlightRegistrationDetails;
import gnana.dbContServ.services.FlightRegistrationDetailsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/gnana/flightRegistrationDetails")
public class FlightRegistrationDetailsController {
	
	@Autowired
    private FlightRegistrationDetailsService flightRegistrationDetailsService;

	@PostMapping
    public FlightRegistrationDetails saveFlightRegistrationDetailsService(@RequestBody FlightRegistrationDetails flightRegistrationDetails) {
        return flightRegistrationDetailsService.saveFlightRegistrationDetails(flightRegistrationDetails);
    }
	@GetMapping
    public List<FlightRegistrationDetails> getAllFlightRegistrationDetails() {
        return flightRegistrationDetailsService.getAll();
    }
	
	 @GetMapping("/{flightTdsId}")
	    public FlightRegistrationDetails getFlightRegistrationDetailsByTdsId(@PathVariable Integer flightTdsId) {
	        return flightRegistrationDetailsService.getFlightRegistrationDetailsByTdsId(flightTdsId);
	    }
	 
	    @PutMapping("/{flightTdsId}")
	    public FlightRegistrationDetails updateFlightRegistrationDetails(@PathVariable Integer flightTdsId, @RequestBody FlightRegistrationDetails updatedFlightRegistrationDetails) {
	        return flightRegistrationDetailsService.updateFlightRegistrationDetails(flightTdsId, updatedFlightRegistrationDetails);
	    }
	    
	    @DeleteMapping("/{flightTdsId}")
	    public void deleteFlightRegistrationDetails(@PathVariable Integer flightTdsId) {
	    	flightRegistrationDetailsService.deleteFlightRegistrationDetails(flightTdsId);
	    }

}

