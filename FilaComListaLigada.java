public class FilaComListaLigada {


    private ListaLigada lista_ligada;
    private int tamanho = 0;


    public FilaComListaLigada() {
        this.lista_ligada = new ListaLigada();
    }

    public void enqueue(int valor) {
        No aux = new No(valor);
        if (this.isEmpty()) {
            this.lista_ligada.head = this.lista_ligada.tail = aux;
        } else {
            this.lista_ligada.tail.proximo = aux;
            this.lista_ligada.tail = aux;
        }
        this.tamanho++;
    }

    public int dequeue() throws EListaVazia {
        if (this.isEmpty()) {
            throw new EListaVazia("A lista está vazia!");
        } else {
            int retorno = this.lista_ligada.head.getValor();
            this.lista_ligada.head = this.lista_ligada.head.proximo;
            this.tamanho--;
            return retorno;
        }
    }

    public int inicio() throws EListaVazia{
        if (this.isEmpty()) {
            throw new EListaVazia("A lista está vazia!");
        } else {
            return this.lista_ligada.head.getValor();
        }
    }

    public void imprimirFila(){
      No atual = this.lista_ligada.head;
      while (atual != null) {
        System.out.println(atual.getValor());
        atual = atual.proximo;
      }
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

}
