/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.NominaController;
import Modelo.Gerente;
import Modelo.Empleado;
public class VistaHerencia {
    public static void main (String[] args){
        System.out.println("aprendiendo Herencia");
        NominaController control = new NominaController ();
        
        control.registrarEmpleados(new Empleado("Danilo Eutanasia", 1000));
        control.registrarEmpleados(new Gerente("Danilo Eutanasia2", 7000, 500));
        
        System.out.println("==Lista de Pagos==");
        for (Empleado emp : control.obtenerLista()){
            //aquí actual el polimorfismo : cada objeto sabe como calcular su pago
            
            System.out.println("Nombre: " + emp.getNombre());
            System.out.println("Pago: "+ emp.calcularPago());
            System.out.println("-------------------------");
        
            System.out.println("=prueba de sobre carga=");
            Empleado busqueda1 =control.buscar("Danilo Eutanasia");
            Empleado busqueda2 =control.buscar(1);
            
            System.out.println("Prueba de sobrecarga busqueda por nombre: "+ (busqueda1 !=null? busqueda1.getNombre():"No existe"));
            System.out.println("Prueba de sobrecarga busqueda por índice: "+ (busqueda2 !=null? busqueda1.getNombre():"No existe"));
        }
        
        
        
        
    }

    
    
}
