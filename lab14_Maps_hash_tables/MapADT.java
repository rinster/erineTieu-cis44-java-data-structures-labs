package lab14_Maps_hash_tables;

// --- 2. Common Map Interface ---
interface MapADT<K, V> {
    V get(K key);

    V put(K key, V value);

    V remove(K key);

    int size();

    boolean isEmpty();
}