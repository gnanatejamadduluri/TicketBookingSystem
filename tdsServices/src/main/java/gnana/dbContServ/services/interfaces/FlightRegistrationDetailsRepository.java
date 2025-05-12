package gnana.dbContServ.services.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import gnana.dbContServ.dbEntities.FlightRegistrationDetails;

@Repository
public interface FlightRegistrationDetailsRepository extends JpaRepository<FlightRegistrationDetails, Integer>{

}
