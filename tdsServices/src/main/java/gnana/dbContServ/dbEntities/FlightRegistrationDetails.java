package gnana.dbContServ.dbEntities;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="flight_reg_details", schema="gtm_booking")
public class FlightRegistrationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType  .IDENTITY)
	private Integer flightTdsId;
	
	@Column (name = "flight_num")
	private String flightNum;
	
	@Column (name = "flight_type")
	private String flightType;
	
	@Column (name = "company_name")
	private String companyName;

	@Column (name = "aircraft_type")
	private String aircraftType;
	
	@Column (name = "from_location")
	private String fromLocation;
	
	@Column (name = "to_location")
	private String toLocation;
	
	@Column (name = "depature_date")
	private Date depatureDate;
	
	@Column (name = "depature_time")
	private String depatureTime;
	
	@Column (name = "arrival_date")
	private Date arrivalDate;
	
	@Column (name = "arrival_time")
	private String arrivalTime;


	public Integer getFlightTdsId() {
		return flightTdsId;
	}

	public void setFlightTdsId(Integer flightTdsId) {
		this.flightTdsId = flightTdsId;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public Date getDepatureDate() {
		return depatureDate;
	}

	public void setDepatureDate(Date depatureDate) {
		this.depatureDate = depatureDate;
	}

	public String getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	
}
