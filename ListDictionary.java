package exam;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ListDictionary<K, V> implements Dictionary<K, V>{
    private final List<K> keys = new LinkedList<>();
    private final List<V> values = new LinkedList<>();

    @Override
    public Option<V> get(K key) {
        int index = -1;
        for (int i = 0; i < keys.size(); i++){
            if (keys.get(i) == key){
                index = i;
                break;
            }
        }
        if (index >= 0)
            return Option.some(values.get(index));
        else return Option.none();
    }

    @Override
    public V get(K key, V defaultValue) {
        int index = -1;
        for (int i = 0; i < keys.size(); i++){
            if (keys.get(i) == key){
                index = i;
                break;
            }
        }
        if (index >= 0)
            return values.get(index);
        else return defaultValue;
    }

    @Override
    public boolean containsKey(K key) {
        return keys.contains(key);
    }

    @Override
    public boolean put(K key, V value) {
        if (containsKey(key)) return false;
        else {
            keys.add(key);
            values.add(value);
            return true;
        }
    }

    @Override
    public boolean update(K key, V value) {
        int index = -1;
        for (int i = 0; i < keys.size(); i++){
            if (keys.get(i) == key){
                index = i;
                break;
            }
        }
        if (index < 0)
            return false;
        else {
            values.set(index, value);
            return true;
        }
    }

    @Override
    public void clear(K key)  { //throws EmptyOptionException
//        if (containsKey(key)){
//            values.remove(get(key).get());
//            keys.remove(key);
//        }
        //it is shorter way to write but ultimately takes longer time

        int index = -1;
        for (int i = 0; i < keys.size(); i++){
            if (keys.get(i) == key){
                index = i;
                break;
            }
        }
        if (index >= 0) {
            values.remove(index);
            keys.remove(index);
        }

    }

    @Override
    public Stream<K> keyStream() {
        return keys.stream();
    }

    @Override
    public Stream<V> valueStream() {
        return values.stream();
    }

}
