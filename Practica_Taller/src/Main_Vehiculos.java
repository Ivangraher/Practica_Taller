public class Main_Vehiculos {

    public static void main(String[] args) {
        Coche Jaguar= new Coche ("1234ENG","Jaguar","F-Pace", 20.0000);
        Coche BMW= new Coche ("9065AME", "BMW", "320i",60.000);
        Coche Lexus= new Coche ("5638DDD", "Lexus", "LFA", 120.000);
        Coche Mercedes= new Coche ("3564GER", "Merecedes-Benz", "SLS AMG",150.000);
        Coche Alfa_Romeo= new Coche ("4749JAV", "Alfa Romeo", "Guilia", 12.000);

        RegistroVehiculos registro = new RegistroVehiculos();

        registro.registrarVehiculo(Jaguar);
        registro.registrarVehiculo(BMW);
        registro.registrarVehiculo(Lexus);
        registro.registrarVehiculo(Mercedes);
        registro.registrarVehiculo(Alfa_Romeo);

        // Debes comprobar que el HashSet no permite duplicados

        registro.registrarVehiculo(Alfa_Romeo);

        System.out.println(registro.obtenerTodos());

        registro

                .obtenerVehiculo("4749JAV")

            .ifPresent(
                    coche ->System.out.println("Coche con matricula 4749JAV:"  + coche)
            );

        registro
                .obtenerVehiculosMarca("Lexus")
                // esto es un bucle tradicional expresado con Java 8
            .forEach(
                    coche ->System.out.println(coche)
            );

        registro
                .obtenerVehiculoPrecioMax()
                // esta expresión es equivalente a verificar diferente de null con Java 8

                .ifPresent(
                        coche-> System.out.println("Coche Max precio:"+ coche)
                );

        System.out.println("Eliminando coche con matricula 1234ENG");
        registro
                .eliminarVehiculo("1234ENG");

        System.out.println(registro.obtenerTodos());
    }
}
