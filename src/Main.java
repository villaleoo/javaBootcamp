public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setEdad(24);
        int verEdadPersona1= persona1.getEdad();

        persona1.setNombre("Leopoldo");
        String verNombrePersona1= persona1.getNombre();

        persona1.setTelefono(1122501309);
        int verTelefonoPersona1= persona1.getTelefono();

        System.out.println(verEdadPersona1);
        System.out.println(verNombrePersona1);
        System.out.println(verTelefonoPersona1);


    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad){
        this.edad= edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public String getNombre (){
        return this.nombre;
    }
    public void setTelefono (int telefono){
        this.telefono= telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
}

