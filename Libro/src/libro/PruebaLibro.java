
package libro;

import java.util.Scanner;


public class PruebaLibro {
Libro l = new Libro();
Scanner entrada = new Scanner(System.in);

    
    public static void main(String[] args) {
     System.out.println("--Informacion de Libros--");
        PruebaLibro libro = new PruebaLibro();
        System.out.println("Ingrese Informacion: ");
        libro.leerInformacion();
        System.out.println("******************");
        System.out.println("Informe: ");
        libro.mostrarInformacion();  
    }
    public void leerInformacion(){
        System.out.println("Titulo: ");l.setTitulo(entrada.next());
        System.out.println("ISBN: ");l.setIsbn(entrada.next());
        System.out.println("Paginas: ");l.setPaginas(entrada.next());
        System.out.println("Edicion: ");l.setEdicion(entrada.next());
        System.out.println("Editorial: ");l.setEditorial(entrada.next());
        System.out.println("Primer Nombre Autor: ");l.setPrimerNombre(entrada.next());
        System.out.println("Segundo Nombre Autor: ");l.setSegundoNombre(entrada.next());
        System.out.println("Primer Apellido Autor: ");l.setPrimerApellido(entrada.next());
        System.out.println("Ciudad");l.setCiudad(entrada.next());
        System.out.println("Pais: ");l.setPais(entrada.next());
        System.out.println("Fecha Edicion: ");l.setFechaEdicion(entrada.next());
    }
    public void mostrarInformacion(){
        System.out.println();
        System.out.println("Titulo: " + l.getTitulo());
        System.out.println(l.getEdicion());
        System.out.println("Autor: " + l.getPrimerApellido() + ", " 
                + l.getPrimerNombre() + ". " + l.getSegundoNombre());
        System.out.println("ISBN: " + l.getIsbn());
        System.out.println(l.getEditorial() + ", " + l.getCiudad() + " (" + l.getPais() 
                + ") " + l.getFechaEdicion());
        System.out.println(l.getPaginas() + " Paginas");
    }   
    
}
