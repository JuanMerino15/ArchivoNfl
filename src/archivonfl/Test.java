/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivonfl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author juan
 */
public class Test {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        String nombre;
        String Equipos;
        String jugador;
        String posicion;
        int numero;
        int e;
        char a;
        LinkedList<Equipos> lista = new LinkedList<Equipos>();
        ArchivoNFL acciones = new ArchivoNFL();
        

        System.out.println("Equipos de la NFL");
        System.out.println("¿Qué acción deseas realizar?");
        do {
            System.out.println("1.- Agregar un nuevo equipo");
            System.out.println("2.-Eliminar un equipo");
            System.out.println("3.-Agregar un nuevo jugador");
            System.out.println("4.-Eliminar un jugador");
            System.out.println("5.-Ver la lista de jugadores");
            System.out.println("6.- Ver la lista de los equipos");
            entrada = bufer.readLine();
            e = Integer.parseInt(entrada);

            switch (e) {
                case 1: //Agregamos un equipo
                    System.out.println("Escribe el equipo: ");
                    entrada = bufer.readLine();
                    nombre = entrada;
                    Equipos unEquipos = new Equipos(nombre);
                    lista.add(unEquipos);
                     acciones.escribirArchivo(unEquipos.getNombre(), unEquipos.getNombre());
                    break;
                case 2: //Eliminamos un equipo
                    System.out.println("Tus Equipos:");
                    //Hacemos un for para imprimir todos los jugadores en la lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getNombre().toString());
                    }
                    System.out.println("Escribe la posición del equipo: ");
                    entrada = bufer.readLine();
                    int j = Integer.parseInt(entrada);
                    String equipo = lista.get(j).getNombre().toString();
                    System.out.println(equipo);
                    ArchivoNFL.borrarInformacion(equipo);
                    lista.remove(j);
                    break;
                case 3://Agregar un nuevo jugador
                  
                    System.out.println("Tus equipos:");
                    
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getNombre().toString());
                    }
                    System.out.println("Escribe la posición del equipo: ");
                    entrada = bufer.readLine();
                    int pi = Integer.parseInt(entrada);
                    Equipos al = lista.get(pi); 
                    System.out.println("Escribe el nombre del jugador: ");
                    entrada = bufer.readLine();
                    jugador = entrada;
                    System.out.println("Escribe la posicion del jugador: ");
                    entrada = bufer.readLine();
                    posicion = entrada;
                    System.out.println("Escribe el numero de la dorsal del jugador: ");
                    entrada = bufer.readLine();
                    int dorsal = Integer.parseInt(entrada);
                    Jugadores unJugadores = new Jugadores(jugador, dorsal, posicion);
                    System.out.println("Tus Jugadores son: " + "nombre : " + unJugadores.getName() + " Dorsal: " + unJugadores.getNumero() + " Posicion: " + unJugadores.getPosicion());
                  
                    String Equipo1 = lista.get(pi).getNombre();
                    String jugador1 = jugador;
                    ArchivoNFL.escribirArchivo(jugador1, Equipo1);
                   
                    break;
                case 4://Eliminar un jugador
                    System.out.println("Tus Equipos:");
                 
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getNombre());
                    }
                    System.out.println("Escribe la posición del equipo: ");
                    entrada = bufer.readLine();
                    int b = Integer.parseInt(entrada);
                    Equipos av = lista.get(b); 
                 
                    System.out.println("Sus Jugadores:");
                    for (int i = 0; i < av.equipos.size(); i++) {
                        System.out.println("" + av.equipos.get(i).getEquipo());
                    }
                    System.out.println("Escribe la posición del jugador ");
                    entrada = bufer.readLine();
                    int pw = Integer.parseInt(entrada);
                    av.equipos.remove(pw);
                    break;
               
                case 5:
                    System.out.println("Tus Equipos:");
                   
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getNombre());
                    }
                    System.out.println("Escribe la posición del equipo: ");
                    entrada = bufer.readLine();
                    int pu = Integer.parseInt(entrada);
                    Equipos ab = lista.get(pu); 
                    
                    
                    System.out.println("Sus Jugadores:");
                    for (int i = 0; i < ab.equipos.size(); i++) {
                        System.out.println("" + ab.equipos.get(i).getEquipo());
                    }
                    break;
                
                case 6:
                    ArchivoNFL.leerArchivo("Equipos");
                        System.out.println("Tus equipos:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getNombre().toString());
                    }
                    break;
            }
            System.out.println("¿Quieres realizar otra acción?");
            entrada = bufer.readLine();
            a = entrada.charAt(0);
        } while (a == 'S' || a == 's');
    }

}

