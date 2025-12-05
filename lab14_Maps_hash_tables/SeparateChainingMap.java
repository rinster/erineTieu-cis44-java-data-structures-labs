package lab14_Maps_hash_tables;

import java.util.ArrayList;
import java.util.LinkedList;

// --- 4. Implementation: Separate Chaining Hash Map ---
// Time Complexity: get/put/remove are O(1) expected (Amortized)
class SeparateChainingMap<K, V> implements MapADT<K, V> {
    private ArrayList<LinkedList<Entry<K, V>>> table;
    private int size = 0;
    private final int N = 11; // Use a prime number for table capacity

    public SeparateChainingMap() {
        table = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            table.add(new LinkedList<Entry<K, V>>());
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % N);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // TODO: Complete this method (O(1) expected time)
    public V get(K key) {
        // 1. Calculate the hash index (bucket).
        int h = hash(key);
        LinkedList<Entry<K, V>> bucket = table.get(h); // get bucket address

        // 2. Search linearly within the bucket.
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        // 3. Not found → return null.
        return null;

    }

    // 3. If key is not found in the bucket, return null.

    public V put(K key, V value) {
        int h = hash(key);
        LinkedList<Entry<K, V>> bucket = table.get(h);

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                V oldVal = entry.getValue();
                entry.setValue(value);
                return oldVal;
            }
        }
        // handle new key, add front of list uses O(1)
        bucket.addFirst(new Entry<>(key, value));
        size++;
        return null;
    }

    public V remove(K key) {
        int h = hash(key);
        LinkedList<Entry<K, V>> bucket = table.get(h);

        Entry<K, V> toRemove = null;
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                toRemove = entry;
                break;
            }
        }

        if (toRemove != null) {
            V oldValue = toRemove.getValue();
            bucket.remove(toRemove);
            size--;
            return oldValue;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.size(); i++) {
            LinkedList<Entry<K, V>> bucket = table.get(i);
            sb.append("Bucket ").append(i).append(": ");
            if (bucket.isEmpty()) {
                sb.append("empty");
            } else {
                for (Entry<K, V> entry : bucket) {
                    sb.append("(").append(entry.getKey())
                            .append(", ").append(entry.getValue()).append(") ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
