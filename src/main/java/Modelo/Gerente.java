/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Gerente extends Empleado{
    private double bono;
    
    public Gerente (String nombre, double salarioBase, double bono){
        super(nombre,salarioBase);
        this.bono = bono;
    }
    
    @Override // Cunado se va a sobre escribir algo
    public double calcularPago(){
        return salarioBase + bono;
    }
}
