public class ListaEncadeadaGenerica {
    ListaEncadeadaGenerica lista;

    FilaEncadeada(){
        lista=new ListaEncadeadaGenerica();
    }

    void insereFinal(Integer valor) {
        lista.insereFinal(valor);
    }

    Integer removeInicio() {
        return lista.removeInicio();
    }

    void imprimeFila() {
        lista.imprimeCalculo();
    }
}