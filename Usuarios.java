/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Información;
import LaTiendita.MenuPrincipal;
import java.util.Scanner;
/**
 *
 * @author melis
 */
public class Usuarios {
    int usuario;
    int contraseña;
    public Scanner in = new Scanner(System.in);

    public Usuarios() {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    public void Login(){
        MenuPrincipal LaT;
        LaT = new MenuPrincipal();
        
        System.out.println("******BIENVENIDO*******\n");
        System.out.println("Ingrese su usuario");
        usuario = in.nextInt();
        System.out.println("Ingrese su contraseña");
        contraseña = in.nextInt();
        
        if(usuario == 2010 && contraseña == 2019){
            LaT.Menu();
        }else if(usuario != 2010 && contraseña == 2019){
            System.out.println("\nSU USUARIO ES INCORRECTO\n");
            Login();
        }else if(usuario == 2010 && contraseña != 2019){
            System.out.println("SU CONTRASEÑA ES INCORRECTA\n");
            Login();
        }else{
            System.out.println("USUARIO Y CONTRASEÑA INCORRECTOS\n");
            Login();
        }
    }
    
    
}
