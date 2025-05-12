package gnana.dbContServ.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import gnana.dbContServ.dbEntities.TicketBooking;
import gnana.dbContServ.services.TicketBookingService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/gnana/ticketBooking")
public class TicketBookingController {
	
	@Autowired
    private TicketBookingService ticketBookingService;

	@PostMapping
    public TicketBooking saveTicketBookingService(@RequestBody TicketBooking ticketBooking) {
        return ticketBookingService.saveTicketBooking(ticketBooking);
    }
	@GetMapping
    public List<TicketBooking> getAllTicketBooking() {
        return ticketBookingService.getAll();
    }
	
	 @GetMapping("/{bookingId}")
	    public TicketBooking getTicketBookingById(@PathVariable Integer bookingId) {
	        return ticketBookingService.getBookingDetailsById(bookingId);
	    }
	 
	    @PutMapping("/{bookingId}")
	    public TicketBooking updateTicketBooking(@PathVariable Integer bookingId, @RequestBody TicketBooking updatedTicketBooking) {
	        return ticketBookingService.updateTicketBooking(bookingId, updatedTicketBooking);
	    }
	    
	    @DeleteMapping("/{bookingId}")
	    public void deleteTicketBooking(@PathVariable Integer bookingId) {
	    	ticketBookingService.deleteTicketBooking(bookingId);
	    }

}