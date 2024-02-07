package ListaEncadeada;

/**
 * @author Matheus Felipe - <a href="https://github.com/sql1freitas">...</a>
 */
class Node {
    int data;
    Node next;

    // Construtor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ListaEncadeada {
    private Node head;
    private int size;

    // Construtor
    public ListaEncadeada() {
        this.head = null;
        this.size = 0;
    }

    // Adiciona o nó ao fim da lista
    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    // Remove o nó no fim da lista e retorna o mesmo
    public Node pop() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            Node temp = head;
            head = null;
            size--;
            return temp;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = null;
        size--;
        return temp;
    }

    // Adiciona um nó na posição da lista indicada via parâmetro
    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    // Remove um nó na posição da lista indicada via parâmetro
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    // Retorna o elemento que está no índice da lista indicado via parâmetro
    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Retorna o tamanho da lista
    public int size() {
        return size;
    }

    // Retorna uma representação em texto da lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
