package libreria;
import LibreriaDavid.LeerDatos;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
public class Libreria {
    //metodo para crear libro con arraylist
     public void engadirLibro(ArrayList <Libro> lista){
            String titulo;
            String autor;
            String isbn;
            int prezo;
            int unidades;
            
            //aplicamos los metodos de nuestra Libreria para leer los datos de cada libro que vayamos a crear
            titulo=LeerDatos.leerString("titulo: ");
            autor=LeerDatos.leerString("autor: ");
            isbn=LeerDatos.leerString("isbn: ");
            prezo=LeerDatos.leerInt("prezo: ");
            unidades=LeerDatos.leerInt("uniades: ");
            
            //creamos un nuevo libro y lo añade a la lista
            Libro li = new Libro(titulo,autor,isbn,prezo,unidades);
            lista.add(li);
                     
     }
     
     //metodo para vender libro con arraylist
     public void  venderLibro (ArrayList <Libro> lista){
        
        //si la lista esta vacia, nos manda introducir un libro
        if(lista.isEmpty()==true)
                JOptionPane.showInputDialog(null, "Introduce un libro");
        //si no lo está, compara si las unidades son cero o menor que cero y si lo son borra el libro de la lista
            else{
                for(Libro li: lista){
                    if(li.getUnidades()<=0){
                        lista.remove(li);
        //le resta 1 a las unidades
                    }else{
        //creamos una variable para pedir las unidades yle quito 1
                        int uni = li.getUnidades() -1;
                    }
                }
            }
     }
     
    //metodo para amosar os libros que temos a traves dun arraylist
      public void amosar(ArrayList<Libro>lista){
    //si la ista esta vacia, nos manda introducir un libro
            if(lista.isEmpty()==true){
                JOptionPane.showInputDialog(null, "Introduce un libro");
            }
    //si no lo está, muestra por pantalla toda la lista
            else{
                for(Libro li: lista){
                    System.out.println(li);
                }
            }
        }
     
    //metodo para dar de baja los libros
     public static ArrayList<Libro> darDeBaixa(ArrayList<Libro>lista){
    //con el iterator recorremos el array
         Iterator<Libro> it=lista.iterator();
         while(it.hasNext()){
    //declaramos una variable l 
            Libro l  = it.next();
    //pedimos las unidades y miramos si son menores o igaules a 0 y si lo son elimina "l" que acabamos de declarar
            if(l.getUnidades()<=0){
                lista.remove(lista.indexOf(l));
            }
         }
         return lista;
     }
     
    //metodo para consultar os libros co seu titulo
     public void consultarLibro(String titulo, ArrayList<Libro>lista){
    //si la lista esta vacia, nos manda introducir un libro
         if(lista.isEmpty()==true)
                JOptionPane.showInputDialog(null,"Introduce un libro");
    //con equals ignore case comparamos los dos strings de titulo, que lo pedimos con .getTitulo y muestra la consulta en pantalla
            else{
                for(Libro li: lista){
                    if(titulo.equalsIgnoreCase(li.getTitulo())){
                        JOptionPane.showInputDialog(null, li);
                            break;
                    }
                }
            }
     }
     
     public void sair(){
   System.exit(0);
   }
      
     
}
