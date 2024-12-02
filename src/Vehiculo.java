public class Vehiculo {
    private String tipo;
    private String modelo;
    private int nroRuedas;
    private double velocidad;

    // Constructor vacío
    public Vehiculo() {
        this.tipo = "";
        this.modelo = "";
        this.nroRuedas = 0;
        this.velocidad = 0.0;
    }

    // Constructor de inicialización
    public Vehiculo(String Ptipo, String Pmodelo, int PnroRuedas, double Pvelocidad) {
        this.tipo = Ptipo;
        this.modelo = Pmodelo;
        this.nroRuedas = PnroRuedas;
        this.velocidad = Pvelocidad;
    }

    // Métodos
    public void parar() {
        this.velocidad = 0.0;
    }

    public double acelerar(double incremento) {
        if (this.velocidad + incremento >= 0) {
            this.velocidad += incremento;
        } else {
            this.velocidad = 0.0;
        }
        return this.velocidad;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Modelo: " + modelo + ", NroRuedas: " + nroRuedas + ", Velocidad: " + velocidad + " km/h";
    }
}
