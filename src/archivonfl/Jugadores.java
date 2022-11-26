/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivonfl;



/**
 *
 * @author juan
 */
public class Jugadores {

 
    
   
 private String name;
 private int numero;
 private String posicion;
       
       public Jugadores(String name, int num, String p ){
        this.name = name;
        this.numero = num;
        this.posicion = p;
    }

    

   
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
       
}