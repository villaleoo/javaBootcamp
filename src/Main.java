public class Main {
    public static void main(String[] args) {
        int resultado= 0;
        resultado= suma(4,2, 3);
        System.out.println(resultado);
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        System.out.println(miCoche.numeroDePuertas);
    }

    public static int suma (int a , int b , int c){
        return a+b+c;
    }
}
class Coche{
    public int numeroDePuertas= 0;

    public void agregarPuertas(){
        this.numeroDePuertas++;
    }
}
