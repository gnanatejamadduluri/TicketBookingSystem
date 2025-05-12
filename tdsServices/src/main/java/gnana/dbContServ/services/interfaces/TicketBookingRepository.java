package gnana.dbContServ.services.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gnana.dbContServ.dbEntities.TicketBooking;


@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Integer> {
// custom queries can be added
}
