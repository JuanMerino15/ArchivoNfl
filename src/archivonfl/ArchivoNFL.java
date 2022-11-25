/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivonfl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author juan
 */
public class ArchivoNFL {
    
 public static void leerArchivo(String name){
        File archivo = null; // apunta a un archivo fisico del dd
        FileReader fr = null;// para leer el archivo
        BufferedReader bufer = null;
        try{ // Es la aparte buena 
            //Creamos un apuntador al archivo físico
            archivo= new File("C:\\Users\\juanr\\Documents\\" + name + ".txt");
            //Abrimos el archivo para lectura
            fr=new FileReader(archivo);
            //configurar bufer para hacer lectura
            bufer = new BufferedReader(fr);
            
            //lectura del contenido
            String linea;
            //mientras haya información en el archivo
            while((linea = bufer.readLine()) !=null ) //La entrada va a ser el archivo y no por teclado
                System.out.println("Linea del archivo: " + linea);
            
        }catch(Exception e){ // se ejecuta cuando hay un error
            System.out.println("Error: No se encuentra el archivo");
            e.printStackTrace();
        }finally{
            //Esta cláusula se ejecuta siempre 
            //Se cierra el archivo
            try{
                //si se logró abrir el archivo, debemos cerrarlo.
                if(null !=fr){
                    fr.close();
                }
            
            }catch(Exception e2){
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
            
        }
        
        
    }
 
  public static void escribirArchivo(String name){
        FileWriter archivo = null;
        PrintWriter pw = null;
        BufferedReader bufer2 = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char respuesta;
        
        try{
            archivo = new FileWriter("C:\\Users\\juanr\\Documents\\" + name + ".txt");
            pw = new PrintWriter(archivo);
           do{
               System.out.println("Escribe información a guardar en el archivo: ");
               entrada = bufer2.readLine();
               //Agrega lo leído en teclado al archivo en disco
               pw.println(entrada);
               
               System.out.println("Escribe n para parar ");
               entrada = bufer2.readLine();
               respuesta = entrada.charAt(0);
               
           } while( respuesta != 'n');
        }catch (Exception e){
            System.out.println("Error al escribir en archivo: " + name);
            e.printStackTrace();
            
        }finally{
            try{
                // Cerrar el archivo si es que se pudo abrir para escritura
                if(null != archivo){
                    archivo.close();
                    
                }
                
            }catch(Exception e2){
                System.out.println("Error al cerrar archivo " + name);
                e2.printStackTrace();
            }
        }
    }
  


        
   public static void eliminarArchivo(String name){
        File archivo = new File ("C:\\Users\\juanr\\Documents\\" + name + ".txt");
        if(archivo.delete()){
            System.out.println("Archivo eliminado " + archivo.getName());
        }else{
            System.out.println("Error al eliminar archivo ");
        }
    }
}

    
    


    
    

