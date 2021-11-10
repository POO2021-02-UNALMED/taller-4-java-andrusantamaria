package classroom;

public class Persona {
	
    private String nombre;
    private long cedula;
    private static int contadorPersonas;
    
    static {
        contadorPersonas = 0;
    }

    Persona(){
    	
    }
    
    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        contadorPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        contadorPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        contadorPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        this.cedula = 1;
        contadorPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}