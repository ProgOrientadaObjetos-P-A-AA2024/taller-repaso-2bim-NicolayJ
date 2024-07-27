package paquete03;

public class Comprador {
    private String nombre;
    private String cedula;
    
    public Comprador(String n, String c){
        nombre = n;
        cedula = c;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s\n"
                + "Cedula: %s\n",
                obtenerNombre(),
                obtenerCedula());
        return cadena;
    }
}
