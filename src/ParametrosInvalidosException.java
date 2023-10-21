import java.util.InputMismatchException;

public class ParametrosInvalidosException extends Exception {

    private int numeroUm;
    private int numeroDois;

    private int contagem;
    public ParametrosInvalidosException(int numeroUm, int numeroDois) {

        super();
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
        this.contagem = contagem;

    }


}
