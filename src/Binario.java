public class Binario implements Numero {
    public static final int BASE = 2;
    private String valor;
    public Binario(String valorString) {
        this.valor = valorString;
    }

    @Override
    public double obtenerValor() {
        int numero = Integer.parseInt(valor, BASE);
        return (double) (numero);
    }
}