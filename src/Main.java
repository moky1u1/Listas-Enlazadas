import lde.ListaDoblementeEnlazada;
import lse.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args) {
        /*
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
        System.out.println(listaSimplementeEnlazada.estaVacia());

        //insertar elementos a nuestra lista
        listaSimplementeEnlazada.insertar("a");
        listaSimplementeEnlazada.insertar("b");
        listaSimplementeEnlazada.insertar("c");
        listaSimplementeEnlazada.insertar("d");
        listaSimplementeEnlazada.insertar("e");
        listaSimplementeEnlazada.insertar("f");

        //mostrar
        listaSimplementeEnlazada.mostrar();

        //eliminar algunos elementos
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        //mostrar
        listaSimplementeEnlazada.mostrar();
        System.out.println(listaSimplementeEnlazada.estaVacia());
         */

        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
        System.out.println(listaDoblementeEnlazada.estaVacia());

        //insertar elementos
        for (int i = 20; i > 0; i--) {
            listaDoblementeEnlazada.insertar(i);
        }
        System.out.println(listaDoblementeEnlazada.estaVacia());

        //mostrar Adelante
        listaDoblementeEnlazada.mostrarAdelante();

        //borrar datos
        listaDoblementeEnlazada.eliminar();
        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.mostrarAdelante();

        
        //mostrar Atras
        listaDoblementeEnlazada.mostrarAtras();
    }
}
