public class Division implements Operacion {
    @Override
    public void realizarOperacion(Numero datoUno, Numero datoDos) {
        if(datoDos.obtenerValor() == 0){
            throw new IllegalArgumentException("MATH ERROR Division para cero");
        }
        System.out.println(datoUno.obtenerValor() / datoDos.obtenerValor());
    }
}