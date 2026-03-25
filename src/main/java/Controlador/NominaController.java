/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controlador;

import Modelo.Empleado;
import Modelo.Gerente;
import java.util.ArrayList;
public class NominaController {
    private ArrayList<Empleado> listaEmpleados;
    
    public NominaController(){
        this. listaEmpleados = new ArrayList <>();
    }
    public void registrarEmpleados (Empleado e){
        listaEmpleados.add(e); //se registra la lista de empleados, se llena de esta forma
    }
    public Empleado buscar (String nombre){
        for (Empleado e : listaEmpleados){
            if (e.getNombre().equalsIgnoreCase(nombre)){
                return e;
            }
                 
        }
        return null;
    }
    
    public Empleado buscar (int indice){
        if (indice >= 0 && indice < listaEmpleados.size()){
            return listaEmpleados.get(indice);
        }
        return null;        
    }
    public ArrayList <Empleado> obtenerLista(){
        return listaEmpleados;
    }
    
}
