package lcse;

public class ListaCircularSimplementeEnlazada {
    private Nodo inicio;

    public ListaCircularSimplementeEnlazada(){
        inicio = null;
    }

    public boolean estaVAcia(){
        return inicio == null;
    }

    public int tamaño(){
        int contador = 0;

        if (!estaVAcia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio){
                ultimo = ultimo.getSiguiente();

                contador ++;
            }
            contador ++;
        }
        return contador;
    }


    public void insertarFin(Object dato){
        if (estaVAcia()){
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio = nuevo;
        }else {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);


            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio){
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);
        }
    }

    public void eliminarFin(){
        if (!estaVAcia()){
            Nodo penultimo = inicio;
            while (penultimo.getSiguiente().getSiguiente() != inicio){
                penultimo = penultimo.getSiguiente();
            }
            penultimo.setSiguiente(inicio);
        }
    }

    public void mostrar(){
        if (!estaVAcia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio){
                System.out.print(ultimo.getDato() + "   ");

                ultimo = ultimo.getSiguiente();
            }
            System.out.print(ultimo.getDato() + "   ");
            System.out.println();
        }
    }

    public void mostrarCircular(int vueltas){
        if (!estaVAcia()){
            int contador = 0;
            Nodo temporal = inicio;
            while (temporal != null && contador < (tamaño() * vueltas)){
                System.out.print(temporal.getDato() + "   ");

                temporal = temporal.getSiguiente();

                contador ++;
            }
            System.out.println();
        }
    }
}
