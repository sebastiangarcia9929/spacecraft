package services;

public class MannedSpacecraft extends SpaceVehicles {

    int crewCapacity;

    public MannedSpacecraft() {
    }

    /**
     * Constructor: permite crear una instancia de la clase Nave espacial
     * tripulada..
     *
     * @param creator
     * @param name
     * @param weight
     * @param asset
     * @param crewCapacity
     */
    public MannedSpacecraft(String creator, String name, int weight, boolean asset, int crewCapacity) {
        super(creator, name, weight, asset);
        this.crewCapacity = crewCapacity;
    }

    /**
     * Se sobre escribe el método impulsoresInterestelar() de la clase interface
     * INaveEspacial implementada en la clase abstracta VehiculoEspaciales y al
     * extender la clase vehiculo espaciales a vehiculo lanzadera se heredan los
     * metodos
     *
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

    /**
     * Método de la clase NaveEspacialTripulada que permite notificar cuando el
     * piloto automático de la nave se desactiva.
     */
    public void turnOffAutopilot() {
        System.out.println("El piloto automatico ha sido desactivado, por favor preparece para tomar el control");
    }

    /**
     * se crean los get y set de los atributos de la clase
     *
     * @return
     */

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    /**
     * ToString implementaciones que devuelven el formato de cadena del valor
     * que representa el objeto NaveEspacialTripulada y las carcteristicas
     * extendida de la clase VehiculoEspaciales por medio de la palabra
     * super.toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nave Espacial Tripulada: " + super.toString() + "\nCapacidad de tripulacion de la nave: "
                + crewCapacity + " personas." + "\n\n" + '}';
    }
}

