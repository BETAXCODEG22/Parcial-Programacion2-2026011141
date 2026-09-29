package examen;

public class Main {
    public static void main(String[] args) {
        Empleado vendedor = new Vendedor("Josue Elias", 2000.0, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}