public class Octal implements Numero {
    public static final int BASE = 8;
    private final String valor;

    public Octal(String valorString) {
        this.valor = valorString;
    }

    @Override
    public double obtenerValor() {
        int numero = Integer.parseInt(valor, BASE);
        return (double) numero;
    }
}
