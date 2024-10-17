package Lista;

public class ListaEncadeada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaEncadeada() {

        this.tamanho = 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;

        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(String novoValor) {
        Elemento atual = primeiro;
        Elemento anterior = null;

        if (atual != null && atual.getValor().equals(novoValor)) {
            primeiro = atual.getProximo();
            return;
        }
        while (atual != null && !atual.getValor().equals(novoValor)) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (atual != null) {
            anterior.proximo = atual.proximo;
        }
    }

    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;
        for (int i = 1; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
