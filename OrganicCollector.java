public class OrganicCollector extends WasteCollector {

    @Override
    protected boolean handle(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Organic")) {
            System.out.println("Organic Waste Collector disposing waste.");
            return true;
        }
        return false;
    }
}