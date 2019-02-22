/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaTiendita;
import java.util.Scanner;
import Información.Productos;
import Información.Clientes;
import Facturación.Facturas;
import static java.lang.System.exit;
/**
 *
 * @author WABS
 */
public class MenuPrincipal {
    Scanner in = new Scanner (System.in);
    
    public void Menu(){
        Productos producto;
        producto = new Productos();
        Clientes cliente;
        cliente = new Clientes();
        Facturas fc;
        fc = new Facturas();
        int opcion;
        opcion = 0;
        
        for(int i = 0; i <=10;i++){
            System.out.println("***MENU***");
            System.out.println("1. Facturas");
            System.out.println("2. Clientes");
            System.out.println("3. Productos");
            System.out.println("4. Salir");
            opcion = in.nextInt();
            
                if(opcion == 1){
                    fc.EncaFactura();
                }else if(opcion == 2){
                    cliente.MenuC();
                }else if(opcion == 3){
                    producto.MenuP();
                }else if (opcion == 4){
                    exit (0);
                }
                
        }
    
    }
    
}
