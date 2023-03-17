package services;

public class ArtificialShip extends SpaceVehicles {

    protected String position;
    protected int frequencyMeasurement;

    /**
     * Creamos un constructor de la clase vacio
     */
    public ArtificialShip() {
    }

    /**
     * Constructor: permite crear una instancia de la clase Nave articial.
     *
     * @param position
     * @param frequencyMeasurement
     */
    public ArtificialShip(String position, int frequencyMeasurement) {
        this.position = position;
        this.frequencyMeasurement = frequencyMeasurement;
    }

    /**
     * Constructor: permite crear una instancia de la clase Nave articial y la
     * clase VehiculoEspaciales
     *
     * @param position
     * @param frequencyMeasurement
     * @param creator
     * @param name
     * @param peso
     * @param asset
     */
    public ArtificialShip(String creator, String name, int peso, boolean asset, String position, int frequencyMeasurement) {
        super(creator, name, peso, asset);
        this.position = position;
        this.frequencyMeasurement = frequencyMeasurement;
    }

    /**
     * Método de la clase NaveArtifiacial que permite redirecionar las antenas
     * de forma automática de la nave
     *
     */
    public void antenna() {
        System.out.println("La redireccion de las antenas de forma automática fue un exito");
    }

    /**
     * Se sobre escribe el método impulsoresInterestelar() de la clase interface
     * INaveEspacial implementada en la clase abstracta VehiculoEspaciales y al
     * extender la clase vehiculo espaciales a NaveArtificial se heredan los
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
     * clase vehiculo espaciales a NaveArtificial se heredan los metodos
     */
    @Override
    public void takeOff() {
        System.out.println("La nave espacial despego exitosamente");
    }

    /**
     * Se sobre escribe el método detenerse() de la clase interface
     * INaveEspacial implementada en la clase abstracta VehiculoEspaciales y al
     * extender la clase vehiculo espaciales a NaveArtificial se heredan los
     * metodos
     */
    @Override
    public void stop() {
        System.out.println("La nave espacial se detuvo en su destino");
    }

    /**
     * Se sobre escribe el método exploracionPlaneteria() de la clase interface
     * INaveEspacial implementada en la clase abstracta VehiculoEspaciales y al
     * extender la clase vehiculo espaciales a NaveArtificial se heredan los
     * metodos
     */

    @Override
    public void explorePlanets() {
        System.out.println("La investigacion en el espacio fue un éxito");
    }

    /**
     * se crean los get y set de los atributos de la clase
     *
     * @return
     */
    public String getposition() {
        return position;
    }

    public void setposition(String position) {
        this.position = position;
    }

    public int getfrequencyMeasurement() {
        return frequencyMeasurement;
    }

    public void setfrequencyMeasurement(int frequencyMeasurement) {
        this.frequencyMeasurement = frequencyMeasurement;
    }

    /**
     * ToString implementaciones que devuelven el formato de cadena del valor
     * que representa el objeto aveArtificial y las carcteristicas extendida de
     * la clase VehiculoEspaciales por medio de la palabra super.toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nave espacial Artificial: " + super.toString() + "\nLa position de la nave espacial: " + position
                + "\nPotencia de la Frecuencia nave espacial: " + frequencyMeasurement + " GHz" + "\n\n" + '}';

    }
}