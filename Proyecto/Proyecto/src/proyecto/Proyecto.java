/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Proyecto {
    static String[] libros = new String[7];
    static int libro;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llenemos nuestro vector
        buscarProducto();

        //Llamar el metodo interaccion
        Interaccion();
    }
    private static void buscarProducto(){
        //Este metodo cargara el vector
        libros[0] = "Accion";
        libros[1] = "CienciaFiccion";
        libros[2] = "Cocina";
        libros[3] = "Drama";
        libros[4] = "Historia";
        libros[5] = "Matematicas";
        libros[6] = "Romance";
        System.out.print("Vector cargado correctamente");
    }   
    private static void Interaccion(){
        //Variables locales metodos
        String opcion = JOptionPane.showInputDialog("Ingrese numero de catalogo");
        //Convertir la opcion a numero
        int busqueda = Integer.parseInt(opcion);

        //Llamo el metodo de buscar placa.
        String libroEncontrado = BuscarLibro(busqueda);
        //Notificar al usuario el libro detectado
        JOptionPane.showConfirmDialog(null, "El libro encontrado es de:" + libroEncontrado);
    }
    private static String BuscarLibro(int busqueda){
        //Variable locales del metodo
        int libroReal = busqueda - 1;
        String respuesta = libros[libroReal];
        return respuesta;
    }
}
