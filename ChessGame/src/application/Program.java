package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) throws ParseException {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf1.parse("05/04/2022");
		System.out.println(sdf1.format(d));
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
	
	}

}	
