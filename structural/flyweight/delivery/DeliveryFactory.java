package structural.flyweight.delivery;

import java.util.HashMap;
import java.util.Map;

public class DeliveryFactory {
    private final Map<String, DeliveryLocation> locations = new HashMap<>();

    private String createId(DeliveryLocationData data) {
        return (data.getStreet() + "_" + data.getCity())
                .replaceAll("\\s+", "")
                .toLowerCase();
    }

    public InterfaceDeliveryFlyweight makeLocation(DeliveryLocationData intrinsicState) {
        String key = createId(intrinsicState);
        if (locations.containsKey(key)) {
            return locations.get(key);
        }
        DeliveryLocation location = new DeliveryLocation(intrinsicState);
        locations.put(key, location);
        return location;
    }

    public Map<String, DeliveryLocation> getLocations() {
        return locations;
    }
}