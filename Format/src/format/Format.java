/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package format;

import java.util.Locale;

/**
 *
 * @author dell-vitor
 */
public class Format {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double x = 3.1455748;
        float w=3.58f;
        String nome = "Vitor";
        int idade = 19;
        double salario = 1980.98;
        System.out.println(x);
        System.out.printf("%.2f%n%.1f%n",x,w);  
        System.out.printf("%s tem %d e ganha %.2f reais por mês%n",nome,idade,salario);
        //Next I gonna practice with a exercise of text formating
        
        String product1 = "Computer";
        String product2 = "Office Desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("Products:%n%s, wich price is %.2f%n%s, wich price is %.2f%n%nRecord: %d years old,code %d and gender: %s%n%nMeasue with eight decimal places: %f%nRouded (three decimal places):%.3f%nUS decimal point:%.3f",product1,price1,product2,price2,age,code,gender,measure,measure,measure);
        int a =5;
        float b = 5f;
        a = (int)b;
    }
    
}
