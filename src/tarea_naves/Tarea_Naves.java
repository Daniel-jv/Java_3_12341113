package tarea_naves;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static tarea_naves.Naves.archivosNaves;
import static tarea_naves.Naves.descomponerNave;
import static tarea_naves.Naves.modArchivosNaves;
import static tarea_naves.Naves.naveNew;

public class Tarea_Naves {
    
    public static void main(String[] args) {
        int op = 0;
        Scanner leer = new Scanner(System.in);
        Nave naveInicial = new Nave("Alpha 2-1","Matra",Nave.TipoNave.FRAGATA,Nave.TipoUniverso.OSCURO);
        Naves listNaves = new Naves();
        listNaves.naves.put(naveInicial.id, naveInicial);
        boolean var = true;
        System.out.println("- - - GESTION DE NAVES - - -");
        while(var){
            
            System.out.print("\n1 - Crear una nueva nave espacial\n2 - Mostrar todas las naves espaciales existentes\n3 - Actualizar los datos de una nave espacial existente\n4 - Eliminar una nave espacial\n5 - Salir del programa\nSELECCIONE: ");
            op = leer.nextInt();
            switch(op){

                case 1:{
                    System.out.println();
                    Nave nuevaNave = naveNew();
                    if(nuevaNave.getId().isEmpty()){
                        System.out.println("Intentelo una vez mas...");
                    }else{
                        for (Nave compare : listNaves.naves.values()) {
                            if(compare.getId().equals(nuevaNave.getId()) && compare.getNombre().equals(nuevaNave.getNombre()) && compare.getTipoNave() == nuevaNave.getTipoNave() && compare.getTipoUniverso() == nuevaNave.getTipoUniverso()){
                                System.out.println("\nESTA NAVE YA EXISTE");
                            }
                        }
                        listNaves.naves.put(nuevaNave.id, nuevaNave);
                    }
                    break;
                }
                
                case 2:{
                    System.out.println();
                    archivosNaves(listNaves.naves);
                    break;
                }
                
                case 3:{
                    System.out.println();
                    listNaves = modArchivosNaves(listNaves);
                    break;
                }
                
                case 4:{
                    System.out.println();
                    listNaves = descomponerNave(listNaves);
                    break;
                }
                
                case 5:{
                    System.out.println("Salio del Gestor de Naves...");
                    var = false;
                    break;
                }
                
                default:{
                    System.out.println("Opcion no valida");
                    break;
                }
                
            }
            
        }
        
    }
    
}
