package main;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<? extends Object> list  = new ArrayList<>();
		list.add(1, null);
	}
}
