/**
 * Created by Navy on 03/10/2016.
 */
import java.util.*;


public class Taller {

    private Map<Persona, Coche> reparaciones = new TreeMap<>(Comparator.comparing(Persona::getNumSS));
    private HashMap<String, Coche> HashMapReparacions = new HashMap<>();

    public void registrarReparacion(Persona persona, Coche coche){

        reparaciones.put(persona, coche);
    }

    public Coche obtenerCoche(Persona persona){

        return reparaciones.get(persona);
    }

    //al pasarle la key del treemap, el ordena y compara todas las personas por el NumSS
    public Set<Persona>obtenerClientes(){

        return reparaciones.keySet();
    }

}
