import java.util.ArrayList;
import java.util.Arrays;

public class Hipica {

    //Devuelve una lista sin elementos repetidos
    public String obtenerAgregadoGanadores(ArrayList<String> listaGanadores){
        ArrayList<String> ganadores = new ArrayList<>(); 

        for(String i : listaGanadores ){
            if(!ganadores.contains(i)){
                ganadores.add(i);
            }
        }

        Object[] nuevaListGanadores = ganadores.toArray();
        String arr = Arrays.toString(nuevaListGanadores);
        return arr;
    }

    //Devuelve el indice en el cual un elemeno se ecuentra con respecto a una lista en unos indices ya dados
    public String obtenerPosicionesPremioDoble(ArrayList<Integer> listaCarrerasConPremioDoble, ArrayList<String> listaGanadores, String caballo){
        ArrayList<Integer> carreras = new ArrayList<>();

        for(int i : listaCarrerasConPremioDoble){
            for(int j = 0; j < listaGanadores.size(); j++){
                if(listaGanadores.get(j) == caballo){
                    if(j == i){
                        carreras.add(j);
                    }
                }
            }
        }

        Object[] nuevaCarreras = carreras.toArray();
        String arr = Arrays.toString(nuevaCarreras);
        return arr;
    }
    
//Regresa una lista de los elementos que no estan en la degunda lista de entrda en comparacion con la primera
    public String obtenerCaballosNoGanadores(ArrayList<String>listaGanadoresAyer, ArrayList<String>listaGanadoresHoy){
        ArrayList<String> noGanadores = new ArrayList<>();

        for(String i : listaGanadoresAyer ){
            if(!listaGanadoresHoy.contains(i)){
                noGanadores.add(i);
            }
        }

        Object[] nuevosCaballos = noGanadores.toArray();
        String arr = Arrays.toString(nuevosCaballos);
        return arr;
    }
//Ordena dos listas, verica cuantos elementos no tienen en común y devuelve el menor de esa comparación
    public int obtenerMinimoNuevosGanadores(ArrayList<String> listaGanadoresAyer, ArrayList<String> listaGanadoresHoy){
        ArrayList<String> hoy = new ArrayList<>();
        ArrayList<String> ayer = new ArrayList<>();
        int aux1 = 0;
        int aux2 = 0;

        for(String i: listaGanadoresHoy){
            if(!hoy.contains(i)){
                hoy.add(i);
            }
        }
        
        for(String j : listaGanadoresAyer){
            if(!ayer.contains(j)){
                ayer.add(j);
            }
        }

        for(String k : hoy){
            if(!ayer.contains(k)){
                aux1++;
            }
        }

        for(String l : ayer){
            if(!hoy.contains(l)){
                aux2++;
            }
        }

        int min = Math.min(aux1, aux2);
        return min;
    }
}
