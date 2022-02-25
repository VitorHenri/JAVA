/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataenter;

import java.util.Scanner;

/**
 *
 * @author dell-vitor
 */
public class DataEnter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type some text");
        String text = reader.next();
        System.out.printf("U type %s%n", text);
    }

}
