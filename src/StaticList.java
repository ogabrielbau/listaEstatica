public class StaticList {
    private int[] data;
    private int size;
    private int count;

    public StaticList(int size) {
        this.size = size;
        this.data = new int[size];
        this.count = 0;
    }
    public void clear() {
        this.count = 0;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("A lista está cheia.");
            return;
        }
        this.data[count++] = data;
    }

    public void add(int data, int pos) {
        if (isFull()) {
            System.out.println("A lista está cheia.");
            return;
        }
        if (pos < 0 || pos > count) {
            System.out.println("Posição inválida.");
            return;
        }
        for (int i = count; i > pos; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[pos] = data;
        count++;
    }

    public int remove(int pos) {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return -1;
        }
        if (pos < 0 || pos >= count) {
            System.out.println("Posição inválida.");
            return -1;
        }
        int removedData = this.data[pos];
        for (int i = pos; i < count - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        count--;
        return removedData;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void setData(int data, int pos) {
        if (pos < 0 || pos >= count) {
            System.out.println("Posição inválida.");
            return;
        }
        this.data[pos] = data;
    }

    public int getData(int pos) {
        if (pos < 0 || pos >= count) {
            System.out.println("Posição inválida.");
            return -1;
        }
        return this.data[pos];
    }

    public int getSize() {
        return this.count;
    }

    public int find(int data) {
        for (int i = 0; i < count; i++) {
            if (this.data[i] == data) {
                return i;
            }
        }
        return -1;
    }
    public void printList() {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Elementos da lista:");
        for (int i = 0; i < count; i++) {
            System.out.println("Posição " + i + ": " + data[i]);
        }
    }
}
