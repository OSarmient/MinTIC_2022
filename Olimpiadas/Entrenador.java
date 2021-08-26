public class Entrenador extends Persona {
    private boolean esCertificado;

    public Entrenador(String nombres, String apellidos, String identificacion, String nacionalidad, int edad, String deporte, boolean esCertificado){
        super(nombres, apellidos, identificacion, nacionalidad, edad, deporte);
        this.esCertificado = esCertificado;
    }

    @Override
    public String toString(){
        String certificado;
        if(esCertificado){
            certificado = "Certificado";
        }else{
            certificado = "No Certificado";
        }
        return "Entrenador\n\t" + nombres + " " + apellidos + "\n\t" + "Identidad: " + identificacion + "\n\t" + "Edad: " + edad + "\n\t" + "Deporte: " + nacionalidad + "\n\t" + "Certificado: " + certificado + "\n\t ------";
    }
}
