import java.util.*;
import java.io.*;

public class Evento{

    private static LinkedList<Persona> participantes = new LinkedList<>();

    public Evento(){
        participantes = null;
    }

    public static void agregarParticipante(Persona persona){
        participantes.add(persona);
    }

    public static LinkedList<Persona> obtenerParticipantes(){
        System.out.println("***** Participantes Juegos Olimpicos *****");
        for(Persona element : participantes){
            System.out.println(element);
        }
        return participantes;
    }

    public static void procesarComando() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<String>();
        long length = 0;
        String stg = br.readLine();
        arr.add(stg);
        while (!stg.equals("4")){
            length += stg.length();
            stg = br.readLine();
            //System.out.println(stg);
            arr.add(stg);
        }

        for(int i = 0; i < arr.size(); i++){
        //System.out.println("Read length " + length);
        String[] part = arr.get(i).split("&");
        boolean certificado; 

            switch (part[0]) {
                case "1":
                    Persona D = new Deportista(part[3], part[4], part[2], part[8], Integer.parseInt(part[5]), part[7], part[6]);
                    agregarParticipante(D);
                    break;

                case "2":
                    String es = part[8].toLowerCase();
                    if(es.equalsIgnoreCase("si")){
                        certificado = true;
                    }else{
                        certificado = false;
                    }
                    Persona E = new Entrenador(part[3], part[4], part[2], part[7], Integer.parseInt(part[5]), part[6], certificado);
                    agregarParticipante(E);
                    break;

                case "3":
                    obtenerParticipantes();
                    break;
            
                case "4":
                    System.out.println("Ejecución finalizada!");
                    break;
                default:
                    break;
            }
        }
        br.close();
    }
     


    public static void main(String[] args) throws IOException{
        procesarComando();
    }
}

/*
1&Deportista&1112034&Mariana&Pajon&29&BMX&1:21&Colombia
2&Entrenador&898989&Juanito&Perez&54&BMX&Colombia&SI
2&Entrenador&788302&Elena&Rodriguez&32&Pesas&Argentina&si
2&Entrenador&689233&Britta&Trambley&43&Gimnasia&USA&Si
2&Entrenador&33434&Uday&Ventakadasar&45&Judo&India&No
1&Deportista&234523&Katerine&Ibarguen&37&Salto&14:34&Colombia
3
4
*/