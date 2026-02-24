public class RecyclableCollector extends WasteCollector {

    @Override
    protected boolean handle(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Recyclable Waste Collector processing recyclable materials.");
            return true;
        }
        return false;
    }
}