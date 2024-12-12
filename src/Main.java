//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Numero numeroHexadecimal = new Hexadecimal("7D");//125
        Numero numeroDecimal = new Decimal("100");
        Numero numeroBinario = new Binario("10");//2

        Numero numeroOctal = new Octal("10");//8
        Numero numeroImaginario = new Imaginario("20i");
        Numero numeroImaginario2 = new Imaginario("12i");
        Numero numeroRomano1 = new Romano("Xxx");//15

        Operacion suma = new Suma();
        Operacion resta = new Resta();
        Operacion multiplicacion = new Multiplicacion();
        Operacion division = new Division();

        calculadora.realizarOperacion(numeroImaginario, multiplicacion, numeroImaginario2);
    }
}