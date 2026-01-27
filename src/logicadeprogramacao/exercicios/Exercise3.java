package logicadeprogramacao.exercicios;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        if (n1 == n2){
            int n3 = n1 + n2;
            System.out.println(n3);
        }else{
            int n3 = n1 * n2;
            System.out.println(n3);
        }
    }
}
