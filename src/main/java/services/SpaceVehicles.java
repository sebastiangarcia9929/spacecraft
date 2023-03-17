package services;
public abstract class SpaceVehicles implements Spacecraft {

    protected String creator;
    protected String name;
    protected int weight;
    protected boolean asset;

    /**
     * Creamos un constructor de la clase vacio
     */
    public SpaceVehicles() {

    }

    /**
     * Constructor con argumento: permite crear una instancia de la clase
     * VehiculoEspaciales de acuerdo a los parametros que necesitamos.
     *
     * @param creator
     * @param name
     * @param weight
     * @param asset
     */
    public SpaceVehicles(String creator, String name, int weight, boolean asset) {
        this.creator = creator;
        this.name = name;
        this.weight = weight;
        this.asset = asset;
    }

    /*se crean los metodos get y set para cada atributo de la clase
      creator, name, weight, asset, los metodos get nos devuelve el valor que
      contiene la variable y los metodos set nos permite modificar el valor de la
        variable
     */
    public String getcreator() {
        return this.creator;
    }

    public void setcreator(String creator) {
        this.creator = creator;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getweight() {
        return this.weight;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }

    /**
     * Método is que devuelve el valor de la variable asset en boolean false o
     * true.
     *
     * @return
     */
    public boolean isasset() {
        return this.asset;
    }

    /**
     * metodo set que permite modificar el valor de la variable
     *
     * @param asset
     */
    public void setasset(boolean asset) {
        this.asset = asset;
    }

    /**
     * ToString implementaciones que devuelven el formato de cadena del valor
     * que representa el objeto VehiculoEspaciales
     *
     * @return
     */
    @Override
    public String toString() {
        return '{' + "\nCreado por: " + creator + " \nnombre de la nave: " + name
                + " \nweight de la nave: " + weight + " Tonelada." + " \nLa nave se en cuentra: " + (asset==true?"Activa":"Inactiva");
    }
}