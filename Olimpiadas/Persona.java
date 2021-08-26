public class Persona {
    protected String nombres;
    protected String apellidos;
    protected String identificacion;
    protected String nacionalidad;
    protected int edad;
    protected String deporte;

    public Persona(String nombres, String apellidos, String identificacion, String nacionalidad, int edad, String deporte){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.deporte = deporte;
    }

    @Override
    public String toString(){
        return nombres + " " + apellidos + " " + identificacion + " " + nacionalidad + " " + edad + " " + deporte;
    }
}
