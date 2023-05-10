/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package examen2doparcialpoe;

import javax.swing.JOptionPane;

public class Pila {

    public Playa pila;

    public Pila() {
        pila = null;
    }

    public void push(String nombre, String ubicacion, double costoEntrada, int capacidadMaxima, boolean tieneSombrillas, String restaurante) {
        Playa nuevo = new Playa(nombre, ubicacion, costoEntrada, capacidadMaxima, tieneSombrillas, restaurante);
        if (pila == null) {
            pila = nuevo;
        } else {
            nuevo.setSiguiente(pila);
            pila = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Playa " + nuevo.getNombre() + " agregada a la pila.", "Bien", JOptionPane.INFORMATION_MESSAGE);
    }

    public void recorrerPila() {
        Playa aux = pila;
        if (pila == null) {
            JOptionPane.showMessageDialog(null, "La pila está vacía.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            StringBuilder valores = new StringBuilder();
            while (aux != null) {
                valores.append("Nombre: ").append(aux.getNombre()).append("\n");
                valores.append("Ubicación: ").append(aux.getUbicacion()).append("\n");
                valores.append("Entrada: ").append(aux.getCostoEntrada()).append("\n");
                valores.append("Capacidad: ").append(aux.getCapacidadMaxima()).append("\n");
                valores.append("Tiene sombrillas: ").append(aux.getTienteSombrillas()).append("\n");
                valores.append("Restaurante: ").append(aux.getRestaurantes()).append("\n\n\n");
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, valores.toString());
        }
    }

    public void pop() {
        if (pila == null) {
            JOptionPane.showMessageDialog(null, "La pila está vacía.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            Playa eliminada = pila;
            pila = pila.getSiguiente();
            JOptionPane.showMessageDialog(null, "Playa " + eliminada.getNombre() + " eliminada de la pila.", "Bien", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void buscar() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la playa a buscar:");
        Playa aux = pila;
        boolean encontrado = false;
        while (aux != null) {
            StringBuilder valores = new StringBuilder();
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                valores.append("Nombre: ").append(aux.getNombre()).append("\n");
                valores.append("Ubicación: ").append(aux.getUbicacion()).append("\n");
                valores.append("Entrada: ").append(aux.getCostoEntrada()).append("\n");
                valores.append("Capacidad: ").append(aux.getCapacidadMaxima()).append("\n");
                valores.append("Tiene sombrillas: ").append(aux.getTienteSombrillas()).append("\n");
                valores.append("Restaurante: ").append(aux.getRestaurantes()).append("\n");
                JOptionPane.showMessageDialog(null, valores.toString());
                encontrado = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Playa " + nombre + " no encontrada en la pila.", "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
