package invercao;

import java.util.Scanner;

public class Invercao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite uma string: ");
        String s = sc.nextLine();
        
        sc.close();
        char[] arrayCaracteres = s.toCharArray();

        for (int i = 0, j = arrayCaracteres.length - 1; i < j; i++, j--) {
            // Troca os caracteres nas posições i e j
            char temp = arrayCaracteres[i];
            arrayCaracteres[i] = arrayCaracteres[j];
            arrayCaracteres[j] = temp;
        }

        String stringInvertida = new String(arrayCaracteres);
        System.out.println("String invertida: " + stringInvertida);
        
    }

}
