public class Deportista extends Persona{
    private String marcaClasificacion;

    public Deportista(String nombres, String apellidos, String identificacion, String nacionalidad, int edad, String marcaClasificacion, String deporte){
        super(nombres, apellidos, identificacion, nacionalidad, edad, deporte);
        this.marcaClasificacion = marcaClasificacion;
    }

    @Override
    public String toString(){
        return "Deportista\n\t" + nombres + " " + apellidos + "\n\t Identidad: " + identificacion + "\n\t Edad: " + edad + "\n\t Deporte: " + deporte + "\n\t Marca Clasificación: " + marcaClasificacion + "\n\t Nacionalidad: " + nacionalidad + "\n\t ------";
    }
}
