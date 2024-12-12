public class Decimal implements Numero {
    String valor;
    public Decimal(String valorString) {
        valor = valorString;
    }

    @Override
    public double obtenerValor() {
        return Double.parseDouble(valor);
    }
}