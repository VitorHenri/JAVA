package evenodd;

import java.util.Scanner;

public class Jogador {

    private int escolha;
    private int jogada;
    private String nome;
    Scanner input = new Scanner(System.in);

    public int getEscolha() {
        return escolha;
    }

    public int getJogada() {
        return jogada;
    }

    public String getNome() {
        return nome;
    }

    public void setEscolha() {
        do {
            System.out.println("Faça sua escolha");
            System.out.println("[0]PAR [1]IMPAR");
            escolha = input.nextInt();
        } while (0 != this.escolha && 1 != this.escolha);

        if (escolha == 0) {
            System.out.println(this.nome + " escolheu:PAR");
        } else {
            System.out.println(this.nome + " escolheu:IMPAR");
        }
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
        if (escolha == 0) {
            System.out.println("PC escolheu:PAR");
        } else {
            System.out.println("PC escolheu:IMPAR");
        }
    }

    public void setJogada() {
        System.out.println("Escolha um núemro");
        this.jogada = input.nextInt();
    }
     public void setJogada(int jogada) {
        
        this.jogada =jogada;
         System.out.println("PC ESCOLHEU: "+this.jogada);
    }

    public void setNome() {
        System.out.println("Escreva seu nome:");
        this.nome = input.next();
        
    }

}
