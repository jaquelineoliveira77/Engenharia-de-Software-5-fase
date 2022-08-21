/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Fatorial {

    public Fatorial(){
    }

    public int calcula(int n){

        if(n<=0) 
            return 1;
        else 
            return calcula(n-1)*n;
        
    }
}
