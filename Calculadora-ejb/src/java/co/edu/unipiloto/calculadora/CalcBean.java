/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Stateless;

/**
 *
 * @author LENOVO
 */
@Stateless
public class CalcBean implements CalcBeanLocal {
    int suma =0;

    @Override
    public Integer suma(int valor1, int valor2) {
        return valor1+valor2;
    }
    public Integer resta (int valor1, int valor2){
        return valor1-valor2;
    }
    
    public Integer division(int valor1, int valor2){
        return valor1/valor2;
    }
    public Integer multiplicacion(int valor1, int valor2){
        return valor1*valor2;
  }

    public String separar (String cadena ){
        String vec [];
        int uno=0;
        int dos =0;
        vec= cadena.split(" ");
        uno=Integer.parseInt(vec[0]);
        dos=Integer.parseInt(vec[2]);
        String res="";
        switch (vec[1]){
            
            case "+": 
               res= suma(uno,dos).toString();
                break;
                
            case "-": 
                res= resta(uno,dos).toString();
                break;
                
            case "*": 
                res= multiplicacion(uno,dos).toString();
                break;
            
            case "/": 
                res= division(uno,dos).toString();
                break;
                
    }
        return res;
    }
    }

    
    
        
    
   

   

   
    
   
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

  

  

   
   
    
    
