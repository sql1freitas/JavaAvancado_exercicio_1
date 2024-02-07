package Fila;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;


/**
 * @author Matheus Felipe - <a href="https://github.com/sql1freitas">...</a>
 */
public class Fila {
    private Queue<Integer> elementos;

    // Construtor
    public Fila() {
        this.elementos = new LinkedList<>();
    }

    // Adiciona um inteiro à fila
    public void enqueue(int valor) {
        elementos.add(valor);
    }

    // Remove um inteiro da fila
    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.poll();
    }

    // Retorna o inteiro que está no fim da fila
    public int rear() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return ((LinkedList<Integer>) elementos).getLast();
    }

    // Retorna o inteiro que está na frente da fila
    public int front() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.peek();
    }

    // Retorna o tamanho da fila
    public int size() {
        return elementos.size();
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

}
