package med.voll.logicaprogramacaocaldeira.piramedeAltura;

import java.util.Scanner;

public class PiramedeAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura da pirâmede: ");
        int altura = sc.nextInt();
        sc.close();

        for (int i = 1; i <= altura; i++) { // controle das linhas
            for (int j = 1; j <= altura - i; j++) { //imprime espaços
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) { // imprime os asteriscos
                System.out.print("*");
            }

            System.out.println(); // move para a próxima linha

        }
    }
}
