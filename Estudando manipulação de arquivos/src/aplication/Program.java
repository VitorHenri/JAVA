package aplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

        

                String path = "C:\\Users\\Usuario\\Documents\\PassW.txt";
                File arquivo = new File(path);
                
            	BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivo,true));
        		String linha = "";
        		Scanner in = new Scanner(System.in);
        		System.out.println("Escreva algo: ");
        		linha = in.nextLine();
        		System.out.println(linha instanceof String);
        		buffWrite.write(linha);
        		buffWrite.newLine();
        		
        		buffWrite.close();
                    
                        
             

        }

}