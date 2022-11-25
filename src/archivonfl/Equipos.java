/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivonfl;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author juan
 */
public class Equipos {
      private String nombre;
    ArrayList<nfl> equipos;
    
    public Equipos(String nombre) {
        this.nombre = nombre;
        equipos = new ArrayList<>();
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void add(nfl equipo) {
        this.equipos.add(equipo);
    }
    
    public void remove(nfl equipo){
        this.equipos.remove(equipo);
    }

    public ArrayList<nfl> getnfl() {
        return equipos;
    }

    public nfl getnfl(int e){
        return equipos.get(e);
    }

   
    
   
    
}
   
