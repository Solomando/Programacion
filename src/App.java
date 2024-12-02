public class App {
    public static void main(String[] args) {
        // Crear vehículos
        Vehiculo seatPanda = new Vehiculo("Coche", "Seat Panda", 4, 0.0);
        Vehiculo volvoCamion = new Vehiculo("Camión", "Volvo 4500", 8, 50.3);
        Vehiculo bicicletaBH = new Vehiculo("Bicicleta", "BH Family", 2, 0.0);

        // Mostrar vehículos iniciales por pantalla
        System.out.println("Vehículos iniciales:");
        System.out.println(seatPanda);
        System.out.println(volvoCamion);
        System.out.println(bicicletaBH);

        // Acelerar todos los vehículos por pantalla
        System.out.println("\nAcelerando todos los vehículos en 10 km/h:");
        seatPanda.acelerar(10);
        volvoCamion.acelerar(10);
        bicicletaBH.acelerar(10);

        System.out.println(seatPanda);
        System.out.println(volvoCamion);
        System.out.println(bicicletaBH);

        // Parar todos los vehículos
        System.out.println("\nParando todos los vehículos:");
        seatPanda.parar();
        volvoCamion.parar();
        bicicletaBH.parar();

        System.out.println(seatPanda);
        System.out.println(volvoCamion);
        System.out.println(bicicletaBH);
    }
}
