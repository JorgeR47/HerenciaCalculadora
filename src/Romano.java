import java.util.HashMap;

public class Romano implements Numero {
    private final String valor;
    private static final HashMap<Character, Integer> mapaRomanos = new HashMap<>();

    static {
        mapaRomanos.put('I', 1);
        mapaRomanos.put('V', 5);
        mapaRomanos.put('X', 10);
        mapaRomanos.put('L', 50);
        mapaRomanos.put('C', 100);
        mapaRomanos.put('D', 500);
        mapaRomanos.put('M', 1000);
    }

    public Romano(String valorString) {
        this.valor = valorString.toUpperCase();
    }

    @Override
    public double obtenerValor() {
        if(!validarNumero()){
            throw new IllegalArgumentException("Valor romano no existe");
        }
        double valorDecimal = 0;
        double valorPrevio = 0;

        for (int i = valor.length() - 1; i >= 0; i--) {
            char currentChar = valor.charAt(i);
            int valorActual = mapaRomanos.get(currentChar);

            if (valorActual < valorPrevio) {
                valorDecimal -= valorActual;
            } else {
                valorDecimal += valorActual;
            }
            valorPrevio = valorActual;
        }
        return valorDecimal;
    }

    private boolean validarNumero() {
        int contador = 1;
        for (int i = 1; i < valor.length(); i++) {//VII
            if (valor.charAt(i) == valor.charAt(i - 1)) {
                contador++;
                if (contador > 3) {
                    return false;
                }
            } else {
                contador = 1;
            }
        }
        return true;
    }

}