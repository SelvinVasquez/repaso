public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    // Constructor vacío
    public Vehiculo() {
        this.marca = "Desconocido";
        this.modelo = "Desconocido";
        this.precio = 0.0;
    }

    // Constructor con modelo y precio
    public Vehiculo(String marca, String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
    }

    // Métodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
    }

    }

