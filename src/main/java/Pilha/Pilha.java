package Pilha;

import java.util.EmptyStackException;

/**
 * @author Matheus Felipe - <a href="https://github.com/sql1freitas">...</a>
 */

public class Pilha {

    private int[] elementos;
    private int tamanho;
    private int capacidade;

    // Construtor
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Retorna o tamanho da pilha
    public int size() {
        return tamanho;
    }

    // Coloca um inteiro no topo da pilha
    public void push(int valor) {
        if (tamanho == capacidade) {
            throw new StackOverflowError("A pilha está cheia.");
        }
        elementos[tamanho++] = valor;
    }

    // Remove o valor do topo da pilha e o retorna ao chamador
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int valor = elementos[--tamanho];
        elementos[tamanho] = 0; // Opcional: limpar o valor removido
        return valor;
    }

    // Espia o inteiro que está no topo e o retorna sem mexer na pilha
    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos[tamanho - 1];
    }
}
