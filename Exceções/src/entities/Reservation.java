package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.DomainException;

public class Reservation {
	private int numberRoom;
	private Date checkIn;
	private Date checkOut;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Calendar calendar1 = Calendar.getInstance();
	
	public int getNumberRoom() {
		return numberRoom;
	}
	
	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public Reservation(int numberRoom, Date checkIn, Date checkOut) throws DomainException {
		if(checkIn.after(checkOut)) {
			throw new DomainException("Invalid parameters");
		}
		this.numberRoom = numberRoom;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	
	
	public long duration(){
		//pegar a data dos elementos em milissegundos
		long diff = checkOut.getTime() - checkIn.getTime();
		//converte a diferança de milissegundos para a diferença e dias
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn,Date checkOut) throws DomainException {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates must be future dates");
		}
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Invalid dates");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room: "+numberRoom+" CheckIN: "+sdf.format(checkIn)+" Checkout: "+sdf.format(checkOut)+" Duration: "+duration();
	}
	
	
}
