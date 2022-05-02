package exam;

public class main {
    public static void main(String[] args) throws EmptyOptionException {
        ListDictionary<String, Integer> listdict = new ListDictionary<>();
        listdict.put("A", 1);
        listdict.put("B", 2);
        listdict.put("C", 3);
        listdict.put("D", 4);
        listdict.put("E", 5);

        listdict.keyStream().forEach(key -> System.out.print(key + " "));
        System.out.println();
        listdict.valueStream().forEach(key -> System.out.print(key + " "));
        System.out.println();

        System.out.println();

        System.out.println(listdict.get("A").get()); // 1
        try { System.out.println(listdict.get("S").get()); // null
        } catch (Exception e) { System.out.println("null"); }

        System.out.println();

        System.out.println(listdict.get("A").getOrDefault(1)); // 1
        System.out.println(listdict.get("S").getOrDefault(69)); // 69

        System.out.println();

        System.out.println(listdict.get("A", 5)); // 1
        System.out.println(listdict.get("S", 69)); // 69

        System.out.println();

        System.out.println(listdict.containsKey("A")); // true
        System.out.println(listdict.containsKey("S")); // false

        System.out.println();

        System.out.println(listdict.put("A", 9)); // false
        listdict.keyStream().forEach(key -> System.out.print(key + " "));
        System.out.println();
        listdict.valueStream().forEach(key -> System.out.print(key + " "));
        System.out.println();

        System.out.println();

        System.out.println(listdict.update("D", 9)); // true
        System.out.println(listdict.update("S", 9)); // false
        listdict.keyStream().forEach(key -> System.out.print(key + " "));
        System.out.println();
        listdict.valueStream().forEach(key -> System.out.print(key + " "));
        System.out.println();

        System.out.println();

        listdict.clear("D");
        listdict.clear("S");
        listdict.keyStream().forEach(key -> System.out.print(key + " "));
        System.out.println();
        listdict.valueStream().forEach(key -> System.out.print(key + " "));
        System.out.println();

        System.out.println();

        System.out.println();
        System.out.println("================================================================================================================");
        System.out.println();

        SetDictionary<String, Integer> setdict = new SetDictionary<>();
        setdict.put("A", 1);
        setdict.put("B", 2);
        setdict.put("C", 3);
        setdict.put("D", 4);
        setdict.put("E", 5);

        setdict.keyStream().forEach(key -> System.out.print(key + " "));
        System.out.println();
        setdict.valueStream().forEach(key -> System.out.print(key + " "));
        System.out.println();

        System.out.println();

        System.out.println(setdict.get("A").get()); // 1
        try { System.out.println(setdict.get("S").get()); // null
        } catch (Exception e) { System.out.println("null"); }

        System.out.println();

        System.out.println(setdict.get("A").getOrDefault(1)); // 1
        System.out.println(setdict.get("S").getOrDefault(69)); // 69

        System.out.println();

        System.out.println(setdict.get("A", 5)); // 1
        System.out.println(setdict.get("S", 69)); // 69

        System.out.println();

        System.out.println(setdict.containsKey("A")); // true
        System.out.println(setdict.containsKey("S")); // false

        System.out.println();

        System.out.println(setdict.put("A", 9)); // false
        setdict.keyStream().forEach(key -> System.out.print(key + " "));
        System.out.println();
        setdict.valueStream().forEach(key -> System.out.print(key + " "));
        System.out.println();

        System.out.println();

        System.out.println(setdict.update("D", 9)); // true
        System.out.println(setdict.update("S", 9)); // false
        setdict.keyStream().forEach(key -> System.out.print(key + " "));
        System.out.println();
        setdict.valueStream().forEach(key -> System.out.print(key + " "));
        System.out.println();

        System.out.println();

        setdict.clear("D");
        setdict.clear("S");
        setdict.keyStream().forEach(key -> System.out.print(key + " "));
        System.out.println();
        setdict.valueStream().forEach(key -> System.out.print(key + " "));
        System.out.println();

        System.out.println();

    }
}