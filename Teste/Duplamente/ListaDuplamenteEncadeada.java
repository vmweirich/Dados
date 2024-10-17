package Duplamente;

public class ListaDuplamenteEncadeada {
    private Nodo inicio;
    private Nodo ultimo;

    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.inicio = inicio;
        this.ultimo = ultimo;
        this.tamanho = 0;
    }

    private void Nodo() {
        int dado;
        Nodo proximo;
        Nodo anterior;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void InsereInicio(int n) {
        Nodo novo = new Nodo();
        novo.dado = n;
        if (inicio == ultimo) {
            inicio = novo;
        } else {
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    public void Vazio(int n) {
        if (inicio == null && ultimo == null) {
            throw new IllegalStateException("Esta vazia");
        }

    }

    public void unicoElemento(Nodo tamanho) {
        if (inicio == ultimo) {
            tamanho = inicio;
            throw new IllegalStateException("valor");
        }
    }

}
