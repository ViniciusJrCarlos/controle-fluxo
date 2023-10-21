import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);


        try {

            System.out.print("DIGITE O PRIMEIRO NUMERO: ");
            int numeroUm = terminal.nextInt();
            System.out.print("DIGITE O SEGUNDO NUMERO: ");
            int numeroDois = terminal.nextInt();

            contar(numeroUm, numeroDois);


            throw new ParametrosInvalidosException(numeroUm, numeroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println("-----------------------------------");
        }


    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {


        if (numeroUm > numeroDois) {

            System.out.println("O segundo parametro deve ser maior que o primeiro parametro");

        } else {

            int contagem = (numeroDois - numeroUm);

            System.out.println("-----------------------------------");
            for (int i = 0; i < contagem; i++) {

                System.out.println("Imprimindo o numero 1: º " );
                System.out.println("Imprimindo o numero 2: º " );
            }

        }

    }

}