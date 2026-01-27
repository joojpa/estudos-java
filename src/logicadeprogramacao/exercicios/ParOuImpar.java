package logicadeprogramacao.exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        if (number < 0){
            System.out.println("Negativo");
        }else {
            System.out.println("Positivo");
        }
    }
}
