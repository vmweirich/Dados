package Calculadora;

public class PilhaGenerica<Item> {
    Object [] Pilha;

    PilhaGenerica() {
        lista = new ListaEncadeadaGenerica<Item>();

    }

    void empilha(Item valor) {
        lista.insereFinal(valor);
    }

    Item desempilha() {
        return lista.removeUltimo();

    }

    void impreme
}