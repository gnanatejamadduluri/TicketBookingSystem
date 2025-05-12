package gnana.dbContServ.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gnana.dbContServ.dbEntities.TicketBooking;
import gnana.dbContServ.services.interfaces.TicketBookingRepository;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingRepository ticketBookingRepository;
	
	public TicketBooking saveTicketBooking(TicketBooking ticketBooking) {
		return ticketBookingRepository.save(ticketBooking);
	}
	
	public List<TicketBooking> getAll() {
		return ticketBookingRepository.findAll();
	}
	
	public TicketBooking getBookingDetailsById(Integer bookingId) {
		return ticketBookingRepository.findById(bookingId).orElse(null);
	}
	
	
	public TicketBooking updateTicketBooking(Integer bookingId, TicketBooking updatedTicketBooking) {
        Optional<TicketBooking> optionalTicketBooking = ticketBookingRepository.findById(bookingId);
        if (optionalTicketBooking.isPresent()) {
        	TicketBooking existing = optionalTicketBooking.get();

            existing.setTransportType(updatedTicketBooking.getTransportType());
            existing.setFrom(updatedTicketBooking.getFrom());
            existing.setTo(updatedTicketBooking.getTo());
            existing.setTripType(updatedTicketBooking.getTripType());
            existing.setStartDate(updatedTicketBooking.getStartDate());
            existing.setReturnDate(updatedTicketBooking.getReturnDate());
            existing.setNoOfPass(updatedTicketBooking.getNoOfPass());

            return ticketBookingRepository.save(existing);
        }
        return null;
    }

	public void deleteTicketBooking(Integer bookingId) {
		ticketBookingRepository.deleteById(bookingId);
    }
}
