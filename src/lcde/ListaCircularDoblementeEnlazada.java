package lcde;

public class ListaCircularDoblementeEnlazada {
    Nodo inicio;

    public ListaCircularDoblementeEnlazada(){
        inicio = null;
    }

    public boolean estaVacia(){
        return inicio == null;
    }

    public void insertarFinal(Object dato){
        if (estaVacia()){
            Nodo nuevo = new Nodo();
            nuevo.setAnterior(nuevo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio = nuevo;
        }else {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio){
                ultimo = ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo();
            nuevo.setAnterior(ultimo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            ultimo.setSiguiente(nuevo);
            inicio.setAnterior(nuevo);
        }
    }

    public void eliminarFinal(){
        if (!estaVacia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio){
                ultimo = ultimo.getSiguiente();
            }

            Nodo penultimo = ultimo.getAnterior();
            penultimo.setSiguiente(inicio);
            inicio.setAnterior(penultimo);
        }
    }

    public void mostrar(){
        if (!estaVacia()){
            Nodo temporal = inicio;
            while (temporal.getSiguiente() != inicio){
                System.out.print(temporal.getDato() + "   ");

                temporal = temporal.getSiguiente();
            }
            System.out.println(temporal.getDato());
        }
    }

    public void mostrarAdelante(int vueltas){
        if (!estaVacia()){
            Nodo temporal = inicio;
            int contador = 0;
            while (contador < vueltas){
                if (temporal.getSiguiente() == inicio){
                    contador ++;
                }

                System.out.print(temporal.getDato() + "   ");
                temporal = temporal.getSiguiente();
            }
            System.out.println();
        }
    }


    public void mostrarAtras(int vueltas){
        if (!estaVacia()){
            Nodo temporal = inicio.getAnterior();
            int contador = 0;
            while (contador < vueltas){
                if (temporal.getAnterior() == inicio){
                    contador ++;
                }

                System.out.print(temporal.getDato() + "   ");
                temporal = temporal.getAnterior();
            }
            System.out.println(temporal.getDato());
        }
    }
}
