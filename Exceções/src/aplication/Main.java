package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;
import exceptions.DomainException;

public class Main {
	
	public static void main(String[] args)  {
		Scanner read = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		System.out.print("Type the number of the room: ");
		int numberRoom = read.nextInt();
		System.out.print("CheckIn date");
		Date checkIn = sdf.parse(read.next());
		System.out.print("CheckOut date: ");
		Date checkOut = sdf.parse(read.next());
		
			Reservation reservation = new Reservation(numberRoom, checkIn, checkOut);
			System.out.println(reservation);
			System.out.print("CheckIn date");
			checkIn = sdf.parse(read.next());
			System.out.print("CheckOut date: ");
			checkOut = sdf.parse(read.next());
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
		
		}catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation "+e.getMessage());
		}
		
		
	}
}
