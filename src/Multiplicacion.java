public class Multiplicacion implements Operacion {
    @Override
    public void realizarOperacion(Numero datoUno, Numero datoDos) {
        System.out.println(datoUno.obtenerValor() * datoDos.obtenerValor());
    }
}