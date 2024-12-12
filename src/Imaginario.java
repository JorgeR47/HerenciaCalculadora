public class Imaginario implements Numero {
    private final String valor;

    public Imaginario(String valorString) {
        this.valor = valorString;
    }

    @Override

    public double obtenerValor() {
        if(!validarNumero()){
            throw new IllegalArgumentException("Valor imaginario no existe");
        }
        return separarParteReal(valor);
    }
    private boolean validarNumero() {
        if (!valor.endsWith("i")) {
            return false;
        } else {
            return true;
        }
    }
    private double separarParteReal(String valor) {
        String aux = "";
        for (int i = 0; i < valor.length(); i++) {
            if (!(valor.charAt(i) == 'i')) {
                aux += valor.charAt(i);
            }
        }
        return Double.parseDouble(aux);
    }

}