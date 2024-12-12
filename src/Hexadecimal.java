public class Hexadecimal implements Numero {
    public static final int BASE = 16;
    private String valor;
/*
Para que un número sea considerado hexadecimal, debe cumplir con las siguientes características:

Base 16: El sistema hexadecimal utiliza una base de 16. Esto significa que los dígitos válidos son del 0 al 9 y las letras A a F (mayúsculas o minúsculas). Por ejemplo, los números hexadecimales válidos son: 1A, 7D, F0, etc.
Prefijo opcional: A menudo, los números hexadecimales se prefijan con “0x” o “0X” para indicar que están en base 16. Por ejemplo, “0x7D” representa el número 125 en decimal.
Caracteres válidos: Solo se permiten caracteres válidos en la representación hexadecimal. Cualquier otro carácter (como letras más allá de F o símbolos) hará que el número no sea válido.
 */
    public Hexadecimal(String valorString) {
        this.valor = valorString;
    }

    @Override
    public double obtenerValor() {
        int numero = Integer.parseInt(valor, BASE);
        if (!validarNumero()) {
            throw new IllegalArgumentException("Valor de base hexadecimal no existe");
        }
        return (double) (numero);
    }

    private boolean validarNumero() {
        return false;
    }
}