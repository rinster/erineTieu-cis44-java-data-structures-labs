package lab13_list_based_priority_queues;

import java.util.LinkedList;

// --- 4. Implementation 2: Sorted List (LinkedList) ---
// Insert: O(n) | RemoveMin: O(1)
class SortedListPQ<K extends Comparable<K>, V> implements PriorityQueue<K, V> {
    private LinkedList<MyEntry<K, V>> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void insert(K key, V value) {
        MyEntry<K, V> newEntry = new MyEntry<>(key, value);
        int index = 0;
        for (MyEntry<K, V> entry : list) {
            if (newEntry.compareTo(entry) < 0) {
                list.add(index, newEntry); // Insert before first larger element
                return;
            }
            index++;
        }
        list.addLast(newEntry); // Insert at end if largest
    }

    public MyEntry<K, V> min() {
        return isEmpty() ? null : list.getFirst(); // O(1)
    }

    public MyEntry<K, V> removeMin() {
        return isEmpty() ? null : list.removeFirst(); // O(1)
    }
}
