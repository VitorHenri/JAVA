/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phonebill;
import java.util.Scanner;
/**
 *
 * @author dell-vitor
 */
public class PhoneBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         double phoneTime,bill,extraTime;
         System.out.println("Insira a quantidade de minutos que utilizou");
         phoneTime = reader.nextDouble();
         if(phoneTime>100){
             extraTime = phoneTime - 100;
             bill = extraTime * 2 +50;
         }else{
             bill = 50;
         }
         System.out.printf("Valor a ser pago: %.2f%n",bill);
         String expensive = bill>100?"Muito":"Nem tanto";
         System.out.printf("Expensive or Cheap?:%s",expensive);
    }
    
}
