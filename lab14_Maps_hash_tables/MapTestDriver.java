package lab14_Maps_hash_tables;

public class MapTestDriver {
    public static void main(String[] args) {

        System.out.println("--------  Testing Unsorted List Map----------");
        UnsortedListMap<Integer, String> ulsMap = new UnsortedListMap<>();

        System.out.println("put(5, A) → " + ulsMap.put(5, "A")); // null
        System.out.println("put(7, B) → " + ulsMap.put(7, "B")); // null
        System.out.println("put(2, C) → " + ulsMap.put(2, "C")); // null
        System.out.println("put(2, E) → " + ulsMap.put(2, "E")); // logs C, returns old value

        System.out.println("get(2) → " + ulsMap.get(2)); // test replacement works -> "E"
        System.out.println("get(7) → " + ulsMap.get(7)); // B
        System.out.println("remove(5) → " + ulsMap.remove(5)); // A
        System.out.println("get(5) → " + ulsMap.get(5)); // null

        System.out.println();
        System.out.println();
        System.out.println("--------  Testing Separate Chaining----------");

        SeparateChainingMap<String, String> sp = new SeparateChainingMap<>();

        // Aa and BB are expected to collide
        System.out.println("put(\"Aa\", \"Value1\") → " + sp.put("Aa", "Value1"));
        System.out.println("put(\"BB\", \"Value2\") → " + sp.put("BB", "Value2"));
        System.out.println("put(\"CC\", \"Value3\") → " + sp.put("CC", "Value3")); // same bucket as Aa and BB

        // Test get()
        System.out.println("get(\"Aa\") → " + sp.get("Aa"));
        System.out.println("get(\"BB\") → " + sp.get("BB"));
        System.out.println("get(\"CC\") → " + sp.get("CC"));

        System.out.println(sp);

        System.out.println("put(\"Aa\", \"Value1Updated\") → " + sp.put("Aa", "Value1Updated"));
        System.out.println(sp);
        System.out.println("remove(\"BB\") → " + sp.remove("BB"));
        System.out.println("get(\"BB\") → " + sp.get("BB"));

    }
}
