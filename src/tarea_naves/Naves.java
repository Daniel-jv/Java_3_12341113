package tarea_naves;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import tarea_naves.Nave.TipoNave;
import tarea_naves.Nave.TipoUniverso;

public class Naves {
    
    public Map<String,Nave> naves = new HashMap<>();
    
    
    public static Nave naveNew(){
        Scanner leer = new Scanner(System.in);
        TipoNave typenave = TipoNave.ACORAZADO;
        TipoUniverso tipoUniverso = TipoUniverso.LUZ;
        System.out.print("NUMERO DE IDENTIFICACION: ");
        String id = leer.nextLine();
        System.out.print("NOMBRE: ");
        String name = leer.nextLine();
        System.out.print("---TIPOS DE NAVE---\n1 - FRAGATA\n2 - DESTRUCTOR\n3 - ACORAZADO\nTIPO DE NAVE: ");
        int tpNave = leer.nextInt();
        System.out.print("---TIPOS DE UNIVERSO---\n1 - OSCURO\n2 - LUZ\n3 - REZAGADO\nTIPO DE UNIVERSO: ");
        int tpUniverso = leer.nextInt();
        if (tpNave < 1 || tpNave > 3 || tpUniverso < 1 || tpUniverso > 3) {
            System.out.println("Datos Incorrectos%$&#%#)&#%%$...");
            Nave naveVacio = new Nave("","",null,null);
            return naveVacio;
        }
        switch(tpNave){
            case 1 -> {
                typenave = TipoNave.FRAGATA;}
            case 2 -> {
                typenave = TipoNave.DESTRUCTOR;}
            case 3 -> {
                typenave = TipoNave.ACORAZADO;}
        }
        switch(tpUniverso){
            case 1 -> {
                tipoUniverso = TipoUniverso.OSCURO;}
            case 2 -> {
                tipoUniverso = TipoUniverso.LUZ;}
            case 3 -> {
                tipoUniverso = TipoUniverso.REZAGADO;}
        }
        Nave nueva = new Nave(id,name,typenave,tipoUniverso);
        return nueva;
    }
    
    public static void archivosNaves(Map<String,Nave> naves){
        int cont = 0;
        for (Nave naveActual : naves.values()) {
            cont++;
        }
        if(cont < 1){
            System.out.println("No tenemos naves en nuestra flota...");
        }else{
            cont = 0;
            for (Nave naveActual : naves.values()) {
                cont++;
                System.out.println(cont+"  -  " + naveActual.toString());
            }
        }
    }
    
    public static Naves modArchivosNaves(Naves listaNaves){
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        for (Nave count : listaNaves.naves.values()) {
            cont++;
        }
        if(cont < 1){
            System.out.println("No tenemos naves en nuestra flota...");
        }else{
            System.out.print("Ingrese el ID para actualizar los archivos de la nave: ");
            String search = leer.nextLine();
            for (Nave naveActual : listaNaves.naves.values()) {
                String compare = naveActual.getId();
                if(search.contains(compare)){
                    Nave actualizarNave = naveNew();
                    naveActual.setId(actualizarNave.getId());
                    naveActual.setNombre(actualizarNave.getNombre());
                    naveActual.setTipoNave(actualizarNave.getTipoNave());
                    naveActual.setTipoUniverso(actualizarNave.getTipoUniverso());
                    return listaNaves;
                }
            }
            System.out.println("NO SE ENCONTRO LA NAVE");
        }
        return listaNaves;
    }
    
    public static Naves descomponerNave(Naves listaNaves){
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        for (Nave count : listaNaves.naves.values()) {
            cont++;
        }
        if(cont < 1){
            System.out.println("No tenemos naves en nuestra flota...");
        }else{
            System.out.print("Ingrese el ID de la nave a descomponer: ");
            String destruir = leer.nextLine();
            for (Nave naveActual : listaNaves.naves.values()) {
                String compare = naveActual.getId();
                if(destruir.contains(compare)){
                    listaNaves.naves.remove(compare);
                    return listaNaves;
                }
            }
            System.out.println("NO SE ENCONTRO LA NAVE");
        }
        return listaNaves;
    }
    
}



