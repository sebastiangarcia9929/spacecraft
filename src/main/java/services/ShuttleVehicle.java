package services;

public class ShuttleVehicle extends SpaceVehicles {

    public int fullLoad;
    public int vehicleMattresses;
    public int speedUp = 6;

    public ShuttleVehicle() {
    }

    public ShuttleVehicle(String creator, String name, int weight, boolean asset, int fullLoad, int vehicleMattresses) {
        super(creator, name, weight, asset);
        this.fullLoad = fullLoad;
        this.vehicleMattresses = vehicleMattresses;

    }

    /**
     * Se sobre escribe el método impulsoresInterestelar() de la clase interface
     * INaveEspacial implementada en la clase abstracta VehiculoEspaciales y al
     * extender la clase vehiculo espaciales a vehiculo lanzadera se heredan los
     * metodos
     */
    @Override
    public void interstellarDrive() {
        System.out.println("El segundo motor esta asset y la nave espacial esta viajando entre las estrellas.");
    }

    /**
     * Se sobre escribe el método despegar() de la clase interface INaveEspacial
     * implementada en la clase abstracta VehiculoEspaciales y al extender la
     * clase vehiculo espaciales a vehiculo lanzadera se heredan los metodos
     */

    @Override
    public void takeOff() {
        System.out.println("La nave espacial despego exitosamente");
    }

    /**
     * Se sobre escribe el método detenerse() de la clase interface
     * INaveEspacial implementada en la clase abstracta VehiculoEspaciales y al
     * extender la clase vehiculo espaciales a vehiculo lanzadera se heredan los
     * metodos
     */

    public int velocidad() {

        this.speedUp = speedUp + 1;
        System.out.println("velocidad " + speedUp);

        return speedUp;

    }

    @Override
    public void stop() {
        System.out.println("La nave espacial se detuvo en su destino");
    }

    /**
     * Se sobre escribe el método exploracionPlaneteria() de la clase interface
     * INaveEspacial implementada en la clase abstracta VehiculoEspaciales y al
     * extender la clase vehiculo espaciales a vehiculo lanzadera se heredan los
     * metodos
     */
    @Override
    public void explorePlanets() {
        System.out.println("La investigacion en el espacio fue un éxito");
    }

    public int getfullLoad() {
        return this.fullLoad;
    }

    public void setfullLoad(int fullLoad) {
        this.fullLoad = fullLoad;
    }

    /**
     * se crean los get y set de los atributos de la clase
     *
     * @return
     */
    public int getvehicleMattresses() {
        return this.vehicleMattresses;
    }

    public void setvehicleMattresses(int vehicleMattresses) {
        this.vehicleMattresses = vehicleMattresses;
    }

    /**
     * ToString implementaciones que devuelven el formato de cadena del valor
     * que representa el objeto VehiculoLanzadera y las carcteristicas extendida
     * de la clase VehiculoEspaciales por medio de la palabra super.toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Vehiculo espacial lanzadera : " + super.toString() + "\nCapacidad de carga de la nave espacial: " + fullLoad + " Tonelada"
                + "\nNumero de colchones del vehiculo espacial: " + vehicleMattresses + "colchones" + "\n\n" + '}';
    }
}

