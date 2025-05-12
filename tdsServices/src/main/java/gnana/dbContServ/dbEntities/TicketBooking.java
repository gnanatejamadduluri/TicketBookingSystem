package gnana.dbContServ.dbEntities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="ticket_booking", schema="gtm_booking")
public class TicketBooking {

	@Id
	@GeneratedValue(strategy = GenerationType  .IDENTITY)
	private Integer bookingId;
	
	@Column (name="transport_type")
	private String transportType;
	
	@Column (name="from_location")
	private String from;
	
	@Column (name="to_location")
	private String to;
	
	@Column (name="trip_type")
	private String tripType;
	
	@Column (name="depature_date")
	private Date startDate;
	
	@Column (name="return_date")
	private Date returnDate;
	
	@Column (name="no_passengers")
	private int noOfPass;

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getNoOfPass() {
		return noOfPass;
	}

	public void setNoOfPass(int noOfPass) {
		this.noOfPass = noOfPass;
	}
}
