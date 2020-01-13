/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ponerdeuncolorunmensaje;


public class PonerDeUnColorUnMensaje {

  
    public static void main(String[] args) {
        
        System.out.println("Hola");
        System.out.println(Colores.RED+"Este mensaje se visualiza las letras en color rojo");
        System.out.println(Colores.GREY+"Este mensaje se visualiza en color gris");
        System.out.println(Colores.FONDO_GREEN+Colores.BLUE+"Este mensaje se visualiza con el fondo verde y las letras de color azul");
        System.out.println(Colores.YELLOW+"Este mensaje se visualiza en color amarillo (y se mantiene el color del fondo)"+"\nEste mensaje no se visualizar en color amarillo y fondo verde por la baja de línea. Se hace un reset a todo");
       
     
    }

}
