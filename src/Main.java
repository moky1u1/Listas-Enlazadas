import lcde.ListaCircularDoblementeEnlazada;
import lcse.ListaCircularSimplementeEnlazada;
import lde.ListaDoblementeEnlazada;
import lse.ListaSimplementeEnlazada;
import pc.Cola;
import pc.Pila;

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

        /*
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
         */

        /*
        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVAcia());
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        for (int i = 1; i <= 12 ; i++) {
            listaCircularSimplementeEnlazada.insertarFin(i);
        }

        listaCircularSimplementeEnlazada.mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        //listaCircularSimplementeEnlazada.eliminarFin();
        //listaCircularSimplementeEnlazada.eliminarFin();

        //listaCircularSimplementeEnlazada.mostrar();

        listaCircularSimplementeEnlazada.mostrarCircular(2);
         */

        /*
        ListaCircularDoblementeEnlazada listaCircularDoblementeEnlazada = new ListaCircularDoblementeEnlazada();
        System.out.println(listaCircularDoblementeEnlazada.estaVacia());

        for (int i = 1; i <= 5; i++) {
            listaCircularDoblementeEnlazada.insertarFinal(i);
        }
        listaCircularDoblementeEnlazada.mostrar();

        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.mostrar();

        listaCircularDoblementeEnlazada.mostrarAdelante(7);
        listaCircularDoblementeEnlazada.mostrarAtras(7);
         */

        /*
        Cola cola = new Cola();
        System.out.println(cola.estaVacia());

        for (int i = 1; i <= 5; i++) {
            cola.insertar(i);
        }
        cola.mostrar();

        cola.eliminar();
        cola.eliminar();
        cola.mostrar();

         */

        Pila pila = new Pila();
        System.out.println(pila.estaVacia());

        for (int i = 1; i <= 5 ; i++) {
            pila.insertar(i);
        }
        pila.mostrar();

        pila.eliminar();
        pila.eliminar();
        pila.eliminar();

        pila.mostrar();
    }
}
