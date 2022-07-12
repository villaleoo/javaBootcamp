public class Main {
    public static void main(String[] args) {
        //int resultado= 0;
        //resultado= suma(4,2, 3);
        //System.out.println(resultado);
        //Coche miCoche = new Coche();                      ejercicio 1
        //miCoche.agregarPuertas();
        //miCoche.agregarPuertas();
        //System.out.println(miCoche.numeroDePuertas);
        int numeroIf= 0;
        int numeroWhile = 0;
        int numeroDoWhile= 0;
        int numeroFor = 0;
        String estacion= "invierno";

    funcionIf(numeroIf);
    funcionWhile(numeroWhile);
    funcionDoWhile(numeroDoWhile);
    funcionFor(numeroFor);
    functionSwitch(estacion);

    }

    //public static int suma (int a , int b , int c){    ejercicio 1
      //  return a+b+c;
   // }

    public static void funcionIf(int numeroIf){
        if(numeroIf>0){
            System.out.println("el numero es positivo");
        }else if(numeroIf<0){
            System.out.println("el numero es negativo");
        }else {
            System.out.println("el numero es 0");
        }
    }
    public static void funcionWhile(int numeroWhile){

        while (numeroWhile<3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

    }
    public  static void funcionDoWhile(int numeroDoWhile){
        do{
            System.out.println("primera y unica ejecucion");
        }while(numeroDoWhile<0);
    }
    public static void funcionFor(int numeroFor){
        for (int i = 0;numeroFor<= 3 ;numeroFor++ ){
            System.out.println(numeroFor);
        }
    }
    public static void functionSwitch(String estacion){
        switch (estacion){
            case "invierno":
                System.out.println("la estacion es invierno");
                break;
            case "otonio":
                System.out.println("la estacion es otonio");
                break;
            case "primavera":
                System.out.println("la estacion es primavera");
                break;
            default:
                System.out.println("la estacion es verano");
        }
    }
}
class Coche{
    public int numeroDePuertas= 0;                           //ejercicio 1

    public void agregarPuertas(){
        this.numeroDePuertas++;
    }
}


