package Lista;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada l = new ListaEncadeada();
        l.adicionar("ac ");
        l.adicionar("ba ");
        l.adicionar("sc ");
        System.out.println("tamanho " + l.getTamanho());
        System.out.println("primeiro " + l.getPrimeiro().getValor());
        System.out.println("ultimo " + l.getUltimo().getValor());
        System.out.println(l.get(1).getValor());
        System.out.println(l.get(2).getValor());
        System.out.println(l.get(3).getValor());
        l.remover(null);
    }
}
