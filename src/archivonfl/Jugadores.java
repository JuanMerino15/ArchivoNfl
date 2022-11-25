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
public class Jugadores {
    
   
 private String name;
       LinkedList<Equipos> Equipos;
       
       public Jugadores(String name){
        this.name = name;
        Equipos = new LinkedList<>();
    }
       
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   public void add(Equipos unEquipos){
       this.Equipos.add(unEquipos);
   }
   
   public void remove(Equipos unEquipos){
       this.Equipos.remove(unEquipos);
   }

    public LinkedList<Equipos> getEquipos() {
        return Equipos;
    }
    
        public Equipos getEquipos(int e) {
        return Equipos.get(e);
    }
}