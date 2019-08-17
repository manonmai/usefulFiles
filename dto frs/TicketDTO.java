package com.cg.flightreservationsystem.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ticket")
public class TicketDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TICKET_SEQ")
	@SequenceGenerator(name = "TICKET_SEQ", sequenceName = "ticket_seq")
	private String pnr;

	@Column(name = "seat_no")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEAT_NO_SEQ")
	@SequenceGenerator(name = "SEAT_NO_SEQ", sequenceName = "seat_no_seq")
	private String seatNo;

	@Column(name = "flight_id")
	public static final int FLIGHTID = 777;

	@Transient
	private String passengeName;

	@Transient
	private String date;

	@Transient
	private String time;

	@Transient
	private String source;

	@Transient
	private String destination;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passenger_id")
	private PassengerDTO passengerDTO;

	// @ManyToOne
	// private FlightDTO flightDTO;

	// @Column(name = "passenger_id")
	// private String passengerId;
	//
	// @Column(name = "flight_id")
	// private String flightId;
	//
	// public String getPassengerId() {
	// return passengerId;
	// }
	//
	// public void setPassengerId(String passengerId) {
	// this.passengerId = passengerId;
	// }
	//
	// public String getFlightId() {
	// return flightId;
	// }
	//
	// public void setFlightId(String flightId) {
	// this.flightId = flightId;
	// }

	public PassengerDTO getPassengerDTO() {
		return passengerDTO;
	}

	public void setPassengerDTO(PassengerDTO passengerDTO) {
		this.passengerDTO = passengerDTO;
	}

	public TicketDTO() {
		super();
	}

	public TicketDTO(String passengeName, String pnr, String seatNo, String date, String time, String source,
			String destination) {
		super();
		this.passengeName = passengeName;
		this.pnr = pnr;
		this.seatNo = seatNo;
		this.date = date;
		this.time = time;
		this.source = source;
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "TicketDTO [passengeName=" + passengeName + ", pnr=" + pnr + ", seatNo=" + seatNo + ", date=" + date
				+ ", time=" + time + ", source=" + source + ", destination=" + destination + "]";
	}

	public String getPassengeName() {
		return passengeName;
	}

	public void setPassengeName(String passengeName) {
		this.passengeName = passengeName;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
