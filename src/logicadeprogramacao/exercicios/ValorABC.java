package logicadeprogramacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ValorABC {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros");
        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();

        ValorABC valorABC = new ValorABC();
        valorABC.result(valorA,valorB,valorC);


    }
    public void result(int valorA, int valorB, int valorC){
        int soma = valorA + valorB;
        System.out.println(soma);
        if (soma < valorC){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }


}
