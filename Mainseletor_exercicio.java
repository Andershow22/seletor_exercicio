package seletor_exercicio;
import java.util.Scanner;

public class Mainseletor_exercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("       1-exercicios de musculação    2-exercicios aeróbicos\n");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("R:");
        int n = teclado.nextInt();
        sugestaoExercicio sugestao = new sugestaoExercicio();
        sugestao.sorteia(n);
        System.out.println("Musculação: " + sugestao.getexcMusculacao().toString());
        System.out.println("Corrida: " + sugestao.getexcCorrida().toString());
       
    }
    
}
