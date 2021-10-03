import lse.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args) {
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
    }
}
