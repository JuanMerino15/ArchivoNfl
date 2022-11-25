/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivonfl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
    
 public static void leerArchivo(String d) throws IOException{
        String archivo = "C:\\Users\\juanr\\Documents\\nfl.txt";
        FileWriter fw = new FileWriter(archivo, true);
        
        try {
            fw.write("\n"+d);//Añade la información al archivo
        } catch (Exception e) {
            System.out.println("Error al escribir en archivo");
            e.printStackTrace();
        } finally {
            //Cerrrar el archivo si es que se pudo abrir para escritura
            try {
                //si se logró abrir el archivo, debemos cerrarlo
                if (null != archivo) {
                    fw.close();
                }
            } catch (Exception e2) {
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
    }
//Album Cancion

    public static void escribirArchivo(String dato, String name) throws IOException {
        File archivoE = new File("C:\\Users\\juanr\\Documents\\" + name + ".txt");
        if (!archivoE.exists()) {
            FileWriter arc = null;
            PrintWriter pw = null;
            try {
                arc = new FileWriter("C:\\Users\\juanr\\Documents\\" + name + ".txt");//Crea el archivo
                pw = new PrintWriter(arc);
                pw.println(dato);
            } catch (Exception e) {
                System.out.println("Error al escribir en archivo: " + name);
                e.printStackTrace();
            } finally {
                try {
                    //Cerrrar el archivo si es que se pudo abrir para escritura
                    if (null != arc) {
                        arc.close();
                    }
                } catch (Exception e2) {
                    System.out.println("Error al cerrar el archivo " + name);
                    e2.printStackTrace();
                }
            }
        }else{
        String archivo = "C:\\Users\\juanr\\Documents\\" + name + ".txt";
        FileWriter fw = new FileWriter(archivo, true);
        /*FileWriter (archivo de archivo, agregado booleano): construye un objeto FileWriter
        dado un objeto File. Si el segundo argumento es verdadero, los bytes se escribirán al 
        final del archivo en lugar de al principio.
         */
        try {
            fw.write("\n" + dato);//Añade la información al archivo
        } catch (Exception e) {
            System.out.println("Error al escribir en archivo");
            e.printStackTrace();
        } finally {
            //Cerrrar el archivo si es que se pudo abrir para escritura
            try {
                //si se logró abrir el archivo, debemos cerrarlo
                if (null != archivo) {
                    fw.close();
                }
            } catch (Exception e2) {
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
        }
    }
    

    //Artista

    public static void borrarInformacion(String borrar) {
        try {
            String path = "C:\\Users\\juanr\\Documents\\nfl.txt";
            File archivo = new File(path);
            
            File archivoTemp = new File(archivo + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader(archivo));
            PrintWriter pw = new PrintWriter(new FileWriter(archivoTemp));

            String linea = null;

            //Copia el contenido del archivo, menos la linea que se indica que se va a borrar
            while ((linea = br.readLine()) != null) {
                /*String.trim() método que borra los carácteres vacíos iniciales y finales de la cadena
          Ejemplo: " Hola!" -> "Hola"
                 */
                if (!linea.trim().equals(borrar)) {

                    pw.println(linea);
                    //flush() cuando no queremos cerrar el archivo, pero sí vacear el bufer
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            //Validación de eliminar el archivo orginal
            if (!archivo.delete()) {
                System.out.println("No se pudo eliminar el archivo");
                return;
            }

            //Renombrar el archivo temporal como el archivo original
            if (!archivoTemp.renameTo(archivo)) {
                System.out.println("No se pudo renombrar el archivo");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void leerArchivos(String name){
        File archivo = null;//apunta a un archivo físico del dd
        FileReader fr=null;//para leer el archivo
        BufferedReader bufer=null;
        //creamos un apuntador al archivo físico
        archivo = new File ("C:\\Users\\juanr\\Documents\\"+name+".txt");
        if(!archivo.exists()){
            System.out.println("Error: No se ha inicializado");
        }else{
        try{
            //abrimos el archivo para lectura
            fr = new FileReader(archivo);
            //configurar bufer para hacer la lectura
            bufer = new BufferedReader(fr);
            //lectura del contenido del archivo
            String linea;
            //mientras haya información en el arhivo
            while((linea = bufer.readLine()) != null)
                System.out.println(linea);
        }catch(Exception e){
            System.out.println("Error: No se encuentra el archivo");
            e.printStackTrace();
        }finally{
            //Esta cláusula se ejecuta siempre 
            //Se cierra el archivo 
            try{
                //si se logró abrir el archivo, debemos cerrarlo
                if(null != fr){
                    fr.close();
                }
            }catch(Exception e2){
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
        }
    } 
}

