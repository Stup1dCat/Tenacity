package dev.tenacity.intent.api.util;
import java.util.Map;

public class ConstructableEntry<K, V> implements Map.Entry<K, V> {

    private final K key;
    private V value;

    public ConstructableEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V old = this.value;
        this.value = value;
        return old;
    }

}