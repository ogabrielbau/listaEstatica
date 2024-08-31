public class Main {
    public static void main(String[] args) {
        StaticList lista = new StaticList(5);

        System.out.println("Inserindo 3 valores");
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.printList();

        System.out.println("\nInserindo valor na posição 1");
        lista.add(15, 1);
        lista.printList();

        System.out.println("\nRemovendo valor na posição 2");
        lista.remove(2);
        lista.printList();

        // Validação
        System.out.println("\nA lista está cheia? " + lista.isFull());

        System.out.println("\nInserindo mais 3 valores");
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.printList();

        System.out.println("\nProcurando um numero na lista:");
        int posicao = lista.find(990);
        if (posicao == -1) {
            System.out.println("\nElemento não encontrado na lista");
        } else {
            System.out.println("\nElemento 40 encontrado na posição: " + posicao);
        }

        lista.clear();
        System.out.println("\nLista limpa. Tamanho atual: " + lista.getSize());
    }
}
