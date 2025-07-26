package main;

import model.Empleado; // Importamos la clase Empleado

public class Principal {
    public static void main(String[] args) {
        // Crear tres empleados (instanciación de objetos)
        Empleado emp1 = new Empleado("Jorge Gonzalez Operador", 33, 40000);
        Empleado emp2 = new Empleado("Daniel Hernandez Ayudante", 26, 36000);
        Empleado emp3 = new Empleado("Gerardo Villanueva Ayudante", 54, 36000);

        // Mostrar información del primer empleado
        emp1.mostrarInformacion();
        System.out.println("Salario anual: $" + emp1.calcularSalarioAnual());

        System.out.println(); // línea en blanco

        // Mostrar información del segundo empleado
        emp2.mostrarInformacion();
        System.out.println("Salario anual: $" + emp2.calcularSalarioAnual());
        
        System.out.println(); // línea en blanco

        // Mostrar información del tercer empleado
        emp3.mostrarInformacion();
        System.out.println("Salario anual: $" + emp3.calcularSalarioAnual());
    }
}