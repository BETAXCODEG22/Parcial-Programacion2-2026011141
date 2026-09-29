package examen;

public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("examen.Vendedor: " + nombre);
        System.out.println("Ventas del Mes: $" + ventasMes);
        System.out.println("Comisión Calculada: $" + comision);
    }
}