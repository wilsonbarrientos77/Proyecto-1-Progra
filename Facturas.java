/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturación;
import java.util.Scanner;
import Información.Clientes;
import Información.Productos;
/**
 *
 * @author WABS
 */
public class Facturas {    
    
    Scanner in = new Scanner (System.in);
    int[] Correlativo;
    int FormaPago;
    int Cantidad; //Productos
    double total[];
    int opc;
    int i = 0;
    
    
  public Facturas(){
      this.Correlativo = new int [10];
      this.FormaPago = 0;
      this.Cantidad = 0;
      this.total = new double [100];
        this.opc = 0;
  }
  
    public void EncaFactura(){
        Clientes cl;
        cl = new Clientes ();
        Productos pr;
        pr = new Productos ();
     
        
        System.out.println("**FACTURACION**");
        System.out.println("Correlativo: " + Correlativo[i]);
        i++;
        cl.EncaClientes();
}

    
}
