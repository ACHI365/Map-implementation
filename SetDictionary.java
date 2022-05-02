package exam;

import java.lang.invoke.VarHandle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class SetDictionary<K, V> implements Dictionary<K, V>{
    private final Set<Pair<K, V>> entries = new HashSet<>();


    @Override
    public Option<V> get(K key) {
        var iter = entries.iterator();
        boolean exist = false;
        Pair<K, V> res = null;

        while (iter.hasNext()){
            var temp = iter.next();

            if (temp.first == key){
                exist = true;
                res = temp;
                break;
            }

        }
        if (exist){
            return Option.some(res.second);
        }
        else return Option.none();
    }

    @Override
    public V get(K key, V defaultValue) {
        var iter = entries.iterator();
        boolean exist = false;
        Pair<K, V> res = null;

        while (iter.hasNext()){
            var temp = iter.next();

            if (temp.first == key){
                exist = true;
                res = temp;
                break;
            }
        }
        if (exist){
            return res.second;
        }
        else return defaultValue;
    }

    @Override
    public boolean containsKey(K key) {
        var iter = entries.iterator();
        boolean exist = false;

        while (iter.hasNext()){
            var temp = iter.next();

            if (temp.first == key){
                exist = true;
                break;
            }
        }
        return exist;
    }

    @Override
    public boolean put(K key, V value) {
        if (containsKey(key))
            return false;
        else {
            entries.add(new Pair<K, V>(key, value));
            return true;
        }
    }

    @Override
    public boolean update(K key, V value) {
        var iter = entries.iterator();
        boolean exist = false;
        Pair<K, V> res = null;

        while (iter.hasNext()){
            var temp = iter.next();

            if (temp.first == key){
                exist = true;
                res = temp;
                break;
            }
        }
        if (exist){
            res.second = value;
            return true;
        }
        else return false;
    }

    @Override
    public void clear(K key) {
        if (containsKey(key)){
            var iter = entries.iterator();
            Pair<K, V> res = null;

            while (iter.hasNext()){
                var temp = iter.next();

                if (temp.first == key){
                    res = temp;
                    break;
                }

            }
            entries.remove(res);
        }
    }

    @Override
    public Stream<K> keyStream() {
        return entries.stream().map(e -> e.first);
    }

    @Override
    public Stream<V> valueStream() {
        return entries.stream().map(e -> e.second);
    }

    //P.S second option could be using For loop(enhanced), but since I could not compare these 2 solutions performances I wrote with this one.
}
