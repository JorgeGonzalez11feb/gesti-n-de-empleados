package model;

public class Empleado {
    // Atributos (datos del empleado)
    private String nombre;
    private int edad;
    private double salarioMensual;

    // Constructor: se le llama al crear un objeto  el cual en este caso es Empleado
    public Empleado(String nombre, int edad, double salarioMensual) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioMensual = salarioMensual;
    }

    // Método para mostrar los datos del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario mensual: $" + salarioMensual);
    }

    // Método para calcular el salario anual
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }
}