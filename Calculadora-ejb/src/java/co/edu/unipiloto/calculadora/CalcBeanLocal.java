/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface CalcBeanLocal {

    Integer suma(int valor11, int valor2);
    Integer resta(int valor1, int valor2);
    Integer division(int valor1, int valor2);
    Integer multiplicacion(int valor1, int valor2);
    
    String separar(String cadena);
    

    
    
}
