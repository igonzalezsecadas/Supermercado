public class Supermercado {
    private String codSede;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String telefono;
    private int metrosCuadrados;
    private int numCajas;
    private boolean tieneParking;
    private boolean tieneCarniceria;

    public Supermercado(String codSede, String nombre,String direccion, String ciudad, String telefono, int metrosCuadrados, int numCajas, boolean tieneParking, boolean tieneCarniceria) {
        this.direccion = direccion;
        this.codSede = codSede;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.metrosCuadrados = metrosCuadrados;
        this.numCajas = numCajas;
        this.tieneParking = tieneParking;
        this.tieneCarniceria = tieneCarniceria;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getNumCajas() {
        return numCajas;
    }

    public void setNumCajas(int numCajas) {
        this.numCajas = numCajas;
    }

    public boolean isTieneParking() {
        return tieneParking;
    }

    public void setTieneParking(boolean tieneParking) {
        this.tieneParking = tieneParking;
    }

    public boolean isTieneCarniceria() {
        return tieneCarniceria;
    }

    public void setTieneCarniceria(boolean tieneCarniceria) {
        this.tieneCarniceria = tieneCarniceria;
    }
}
