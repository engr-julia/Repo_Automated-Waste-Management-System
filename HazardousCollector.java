public class HazardousCollector extends WasteCollector {

    @Override
    protected boolean handle(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Hazardous Waste Collector safely disposing hazardous waste.");
            return true;
        }
        return false;
    }
}