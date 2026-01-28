package logicadeprogramacao.exercicios;

import java.util.Scanner;

public class Exercise5 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        double salaryMinimum = 1293.00;
        double mySalary = sc.nextDouble();

        double salary = mySalary / salaryMinimum;

        System.out.printf("Salario:  %.0f", salary);

    }

}
