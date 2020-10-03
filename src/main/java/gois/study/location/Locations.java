package gois.study.location;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * <description>
 *
 * @author Gustavo Gois (gustavo.gois@gmail.com)
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public int size() {
        return locations.size();
    }

    public boolean isEmpty() {
        return locations.isEmpty();
    }

    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    public Location get(Object key) {
        return locations.get(key);
    }

    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    public Location remove(Object key) {
        return locations.remove(key);
    }

    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    public void clear() {
        locations.clear();
    }

    public Set<Integer> keySet() {
        return locations.keySet();
    }

    public Collection<Location> values() {
        return locations.values();
    }

    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
