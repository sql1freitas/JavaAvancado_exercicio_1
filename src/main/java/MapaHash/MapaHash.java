package MapaHash;

import java.util.Arrays;

/**
 * @author Matheus Felipe - <a href="https://github.com/sql1freitas">...</a>
 * <p>
 * hash simples que mapeia as chaves para índices do array interno.
   Uma função de hash básica seria calcular o módulo da chave pelo
   tamanho do array interno, garantindo que a chave seja mapeada para
   um índice dentro dos limites do array.
 */
public class MapaHash {

    private int[] keys;
    private int[] values;
    private int size;

    // Construtor
    public MapaHash() {
        this.keys = new int[10];
        this.values = new int[10];
        this.size = 0;
    }

    // Função de hash simples
    private int hashFunction(int key) {
        return key % 10; // Módulo do valor da chave pelo tamanho do array
    }

    // Adiciona o par chave/valor ao mapa
    public void put(int key, int value) {
        int index = hashFunction(key);
        keys[index] = key;
        values[index] = value;
        size++;
    }

    // Remove o par chave/valor do mapa
    public void delete(int key) {
        int index = hashFunction(key);
        if (keys[index] == key) {
            keys[index] = 0;
            values[index] = 0;
            size--;
        }
    }

    // Retorna o valor associado à chave
    public int get(int key) {
        int index = hashFunction(key);
        if (keys[index] == key) {
            return values[index];
        }
        return -1; // Se a chave não for encontrada
    }

    // Remove todos os elementos do mapa
    public void clear() {
        Arrays.fill(keys, 0);
        Arrays.fill(values, 0);
        size = 0;
    }
}
