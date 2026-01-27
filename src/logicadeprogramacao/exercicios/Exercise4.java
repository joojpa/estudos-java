package logicadeprogramacao.exercicios;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.printf("Antecessor: %d\nSucessor: %d",n -1, n + 1);
    }
}
