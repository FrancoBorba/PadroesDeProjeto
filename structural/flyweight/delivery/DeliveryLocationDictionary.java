package structural.flyweight.delivery;

import java.util.HashMap;
import java.util.Map;

public class DeliveryLocationDictionary {
    private final Map<String, DeliveryLocation> locations = new HashMap<>();

    public void addLocation(String key, DeliveryLocation location) {
        locations.put(key, location);
    }

    public DeliveryLocation getLocation(String key) {
        return locations.get(key);
    }
}