package exam;

import java.util.stream.Stream;

public interface Dictionary<K, V> {
     Option<V> get(K key);
     V get(K key, V defaultValue);
     boolean containsKey(K key);

     boolean put(K key, V value);
     boolean update(K key, V value);

     void clear(K key) throws EmptyOptionException;

     Stream<K> keyStream();
     Stream<V> valueStream();
}
