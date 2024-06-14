public class ClaveVehiculo {
    public void mostrarInformacion() {
        System.out.println("Tipo de clave: " + tipo);
        System.out.println("Código: " + codigo);
    }

    private String tipo;

    private String codigo;
    // Constructor vacío

    public ClaveVehiculo() {
        this.tipo = "Desconocido";
        this.codigo = "0000";
    }
    // Constructor con tipo y código

    public ClaveVehiculo(String tipo, String codigo) {
        this.tipo = tipo;
        this.codigo = codigo;
    }
    // Constructor con tipo (código por defecto)

    public ClaveVehiculo(String tipo) {
        this.tipo = tipo;
        this.codigo = "0000";
    }
    // Métodos getters y setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    }
