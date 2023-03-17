package services;

public class UnmannedSpacecraft extends SpaceVehicles {

    public int totalAntenna;
    public int fullCamera;

    /**
     * Creamos un constructor de la clase vacio
     */
    public UnmannedSpacecraft() {

    }
    /**
     * Constructor: permite crear una instancia de la clase Nave espacial no tripulada..
     * @param creator
     * @param name
     * @param weight
     * @param asset
     * @param totalAntenna
     * @param fullCamera
     */
    public UnmannedSpacecraft(String creator, String name, int weight, boolean asset, int totalAntenna, int fullCamera) {
        super(creator, name, weight, asset);
        this.totalAntenna = totalAntenna;
        this.fullCamera = fullCamera;
    }
    /**
     * Método de la clase aveEspacialNoTripulada que permite enviar fotos, informacion y ubicacion
     * de la nave
     *
     */
    public void message(){
        System.out.println( "la informacion y las imagenes fueron enviada exitosamente");
    }
    /**
     * Se sobre escribe el método impulsoresInterestelar() de la clase interface INaveEspacial
     * implementada en la clase abstracta VehiculoEspaciales  y al extender la clase vehiculo espaciales
     *a NaveEspacialNoTripulada se heredan los metodos
     *
     */
    @Override
    public void interstellarDrive() {
        System.out.println("El segundo motor esta asset y la nave espacial esta viajando entre las estrellas.");
    }
    /**
     * Se sobre escribe el método despegar() de la clase interface INaveEspacial
     * implementada en la clase abstracta VehiculoEspaciales  y al extender la clase vehiculo espaciales
     *a NaveEspacialNoTripulada se heredan los metodos
     */
    @Override
    public void takeOff() {
        System.out.println("La nave espacial despego exitosamente");
    }
    /**
     * Se sobre escribe el método detenerse() de la clase interface INaveEspacial
     * implementada en la clase abstracta VehiculoEspaciales  y al extender la clase vehiculo espaciales
     *a NaveEspacialNoTripulada se heredan los metodos
     */
    @Override
    public void stop() {
        System.out.println("La nave espacial se detuvo en su destino");
    }
    /**
     * Se sobre escribe el método exploracionPlaneteria() de la clase interface INaveEspacial
     * implementada en la clase abstracta VehiculoEspaciales  y al extender la clase vehiculo espaciales
     *a NaveEspacialNoTripulada se heredan los metodos
     */


    @Override
    public void explorePlanets() {
        System.out.println("La investigacion en el espacio fue un éxito");
    }
    /**
     * se crean los get y set de los atributos de la clase
     * @return
     */
    public int gettotalAntenna() {
        return totalAntenna;
    }

    public void settotalAntenna(int totalAntenna) {
        this.totalAntenna = totalAntenna;
    }

    public int getfullCamera() {
        return fullCamera;
    }

    public void setfullCamera(int fullCamera) {
        this.fullCamera = fullCamera;
    }
    /**
     * ToString implementaciones que devuelven el formato de cadena del valor que representa el objeto NaveEspacialNoTripulada
     * y las carcteristicas extendida de la clase VehiculoEspaciales por medio de la palabra super.toString
     * @return
     */
    @Override
    public String toString() {
        return "Nave Espacial No Tripulada: " + super.toString() + "\nTotal de antenas de la nave: " + totalAntenna +" antenas"+
                "\nTotal de camaras la la nave espacia: " + fullCamera + "camaras" +"\n\n" + '}';
    }


}