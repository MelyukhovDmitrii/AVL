package me.melyukhov.avl;

import java.util.Set;

public interface Map<Key extends Comparable<Key>, Value> {

    TreeMap.Node getFirstNode();

    TreeMap.Node getLastNode();

    Set<Key> keySet();

    void put(Key key, Value value);

    void delete(Key key);

    Key minKey();

    Key maxKey();

    Value get(Key key);
}
