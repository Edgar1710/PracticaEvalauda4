
package practicaevaluda4;

public class Compe {

 private static int getNumeroCorredor() {
 private Compe[] participantes;
 private int contador;

    public Compe(int capacidad) {
        participantes = new Compe[capacidad];
        contador = 0;
    }

    public boolean registrarParticipante(Compe participante) {
        if (contador >= participantes.length) {
            System.out.println("Capacidad máxima alcanzada. No se puede registrar más participantes.");
            return false;
        }
        if (buscarPorNumero(Compe.getNumeroCorredor()) != null) {
            System.out.println(" Número de corredor duplicado.");
            return false;
        }
        participantes[contador] = participante;
        contador++;
        return true;
    }

    public Compe buscarPorNumero(int numero) {
        for (int i = 0; i < contador; i++) {
            if (participantes[i].getNumeroCorredor() == numero) {
                return participantes[i];
            }
        }
        return null;
    }

    public void listarPorCategoria(String categoria) {
        System.out.println("Participantes en la categoría: " + categoria);
        for (int i = 0; i < contador; i++) {
            if (participantes[i].getCategoria().(categoria)) {
                System.out.println(participantes[i].getDatos());
            }
        }
    }

    public boolean eliminarParticipante(int numero) {
        for (int i = 0; i < contador; i++) {
            if (participantes[i].getNumeroCorredor() == numero) {
                // Mover el último participante al lugar del eliminado
                participantes[i] = participantes[contador - 1];
                participantes[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    public void mostrarTodos() {
        System.out.println("Lista de todos los participantes:");
        for (int i = 0; i < contador; i++) {
            System.out.println(participantes[i].getDatos());
        }
    }
  }

