/**
 * Created by Navy on 03/10/2016.
 */
public class Main_Taller {
    public static void main(String[] args) {
//Personas
        Persona jose = new Persona("39425364H", "111111111", "Jose", "Tomás", 35, 45000.00);
        Persona maria = new Persona("39425654W", "33333333", "Maria", "Gallego", 55, 61300.20);
        Persona carlos = new Persona("39425355Q", "22222222","Carlos", "Torres", 22, 23000.00);
        Persona anna = new Persona("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);

        //Coches
        Coche Jaguar= new Coche ("1234ENG","Jaguar","F-Pace", 20.0000);
        Coche BMW= new Coche ("9065AME", "BMW", "320i",60.000);
        Coche Lexus= new Coche ("5638DDD", "Lexus", "LFA", 120.000);
        Coche Mercedes= new Coche ("3564GER", "Merecedes-Benz", "SLS AMG",150.000);

        Taller taller = new Taller();

        taller.registrarReparacion(jose, Jaguar);
        taller.registrarReparacion(maria, BMW);
        taller.registrarReparacion(carlos, Lexus);
        taller.registrarReparacion(anna, Mercedes);


        System.out.println(taller.obtenerCoche(jose));

// debes comprobar que las personas aparecen ordenadas según el criterio especificado en el comparador

// que se pasa al constructor del TreeMap

        System.out.println(taller.obtenerClientes());
    }

}
