package evenodd;
import java.util.Random;
import java.util.Scanner;
public class EvenOdd {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int soma,resultado;
        Scanner ler = new Scanner(System.in);
        int op=0;
        do{
        Jogador p1 = new Jogador();
        Jogador pc = new Jogador();
        p1.setNome();
        p1.setEscolha();
 
        if (p1.getEscolha() == 0) {
            pc.setEscolha(1);
        } else {
            pc.setEscolha(0);
        }

        p1.setJogada();
        pc.setJogada(aleatorio.nextInt(100));
        soma = p1.getJogada()+pc.getJogada();
            System.out.println("Valor final "+soma);
        if(soma%2==0){
            resultado=0;
        }else{
            resultado=1;
        }
        if(p1.getEscolha()==resultado){
            System.out.println(p1.getNome()+" VENCEU");
        }else{
            System.out.println("PC VENCEU");
        }
            System.out.println("Deseja continuar? [0]SIM [1]NAO");
            op = ler.nextInt();
        }while(op!=1);
    }
        

}
