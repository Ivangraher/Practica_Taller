/**
 * Created by Navy on 03/10/2016.
 */
import java.util.*;
import java.util.stream.Collectors;


public class RegistroVehiculos {
    private HashMap<String, Coche> HashMapCoche;
    private Set<Coche> coches = new HashSet<>();
    private List<Coche> CochesList;

    public RegistroVehiculos() {
        HashMapCoche = new HashMap<>();
        CochesList = new ArrayList<>();
    }

    public void registrarVehiculo(Coche coche) {

        //CochesList.add(coche);
        coches.add(coche);
    }

// Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null

// Lo puedes omitir si trabajas con Java 7

    public Optional<Coche> obtenerVehiculo(String matricula) {
        //hashmap coche
        //return HashMapCoche.values();
        //hashset coche
        return coches.stream().filter(coche -> coche.getMatricula().equals(matricula)).findFirst();
    }

    public void eliminarVehiculo(String matricula) {
        //hashmap coche
        //HashMapCoche.remove(matricula);
        //hashset coche
        coches.remove(matricula);
    }

    public Optional<Coche> obtenerVehiculoPrecioMax() {
        //cogemos los valores del Hashmap de coches, los metemos en el flujo de datos y hacemos un comparator con un for each
        //para ir comparando todos los precios de los coches, de la clase Coche.
        //con hashmapCoches
        //return HashMapCoche.values().stream().max(Comparator.comparing(Coche::getPrecio));
        //con Hashset Coche
        return coches.stream().max(Comparator.comparing(Coche::getPrecio));
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
    return coches.stream().filter(coche -> coche.getMarca().equals(marca)).collect(Collectors.toList());
    }

    public Collection<Coche> obtenerTodos() {
        //con Hashmap Coche
        //return HashMapCoche.values();
        //con Hashset Coche
        return coches.stream().collect(Collectors.toList());
    }
}