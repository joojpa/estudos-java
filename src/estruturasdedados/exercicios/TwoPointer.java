package estruturasdedados.exercicios;

public class TwoPointer {
    public static void main(String[] args) {

        String s = "Eu tenho muitas coisas";

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word: words){
            StringBuilder reverse = new StringBuilder(word).reverse();
            result.append(reverse).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        System.out.println(result.toString());



    }
}
