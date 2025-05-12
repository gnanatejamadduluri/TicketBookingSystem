package gnana.dbContServ.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gnana.dbContServ.dbEntities.FlightRegistrationDetails;
import gnana.dbContServ.services.interfaces.FlightRegistrationDetailsRepository;

@Service
public class FlightRegistrationDetailsService {
	
	@Autowired
	private FlightRegistrationDetailsRepository flightRegistrationDetailsRepository;
	
	public FlightRegistrationDetails saveFlightRegistrationDetails(FlightRegistrationDetails flightRegistrationDetails) {
		return flightRegistrationDetailsRepository.save(flightRegistrationDetails);
	}
	
	public List<FlightRegistrationDetails> getAll() {
		return flightRegistrationDetailsRepository.findAll();
	}
	
	public FlightRegistrationDetails getFlightRegistrationDetailsByTdsId(Integer flightTdsId) {
		return flightRegistrationDetailsRepository.findById(flightTdsId).orElse(null);
	}
	
	
	public FlightRegistrationDetails updateFlightRegistrationDetails(Integer flightTdsId, FlightRegistrationDetails updatedFlightRegistrationDetails) {
        Optional<FlightRegistrationDetails> optionalFlightRegistrationDetails = flightRegistrationDetailsRepository.findById(flightTdsId);
        if (optionalFlightRegistrationDetails.isPresent()) {
        	FlightRegistrationDetails existing = optionalFlightRegistrationDetails.get();

            existing.setFlightNum(updatedFlightRegistrationDetails.getFlightNum());
            existing.setFlightType(updatedFlightRegistrationDetails.getFlightType());
            existing.setCompanyName(updatedFlightRegistrationDetails.getCompanyName());
            existing.setFromLocation(updatedFlightRegistrationDetails.getFromLocation());
            existing.setToLocation(updatedFlightRegistrationDetails.getToLocation());
            existing.setDepatureDate(updatedFlightRegistrationDetails.getDepatureDate());
            existing.setDepatureTime(updatedFlightRegistrationDetails.getDepatureTime());
            existing.setArrivalDate(updatedFlightRegistrationDetails.getArrivalDate());
            existing.setArrivalTime(updatedFlightRegistrationDetails.getArrivalTime());
            existing.setAircraftType(updatedFlightRegistrationDetails.getAircraftType());

            return flightRegistrationDetailsRepository.save(existing);
        }
        return null;
    }

	public void deleteFlightRegistrationDetails(Integer flightTdsId) {
		flightRegistrationDetailsRepository.deleteById(flightTdsId);
    }
}
