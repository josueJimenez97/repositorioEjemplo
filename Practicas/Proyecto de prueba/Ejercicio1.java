public class Ejercicio1{
    public int cantidadDeCds(){
        int resultado;
        int informacion= 5*1024; //en Mb
        resultado= informacion/700;
        if(informacion%700!=0){
            resultado= resultado+1; //resultado++;
        }
        return resultado;
    }
}
