class Main {
  public static void main(String[] args) {

    try {
      FilaComListaLigada fila = new FilaComListaLigada();

      System.out.println(fila.isEmpty());
      fila.enqueue(10);
      fila.enqueue(5);
      fila.enqueue(9);
      fila.enqueue(6);
      fila.enqueue(1);
      System.out.println(fila.isEmpty());
      fila.imprimirFila();
      fila.dequeue();
      fila.dequeue();
      System.out.println(fila.isEmpty());
      System.out.println(fila.tamanho());
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
