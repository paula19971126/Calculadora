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

    Integer suma(int valor1, int valor2);
    
    
}
