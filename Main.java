public class Main {
    public static void main(String[] args) {

        // Create collectors
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();

        // Build chain
        organic.setNext(recyclable);
        recyclable.setNext(hazardous);

        // Create containers
        WasteContainer organicBin = new WasteContainer("Organic", 100);
        WasteContainer recyclableBin = new WasteContainer("Recyclable", 150);
        WasteContainer hazardousBin = new WasteContainer("Hazardous", 50);

        // Fill containers
        organicBin.addWaste(100);
        recyclableBin.addWaste(150);
        hazardousBin.addWaste(50);

        // Trigger collection
        if (organicBin.isFull()) {
            organic.collect(organicBin);
        }

        if (recyclableBin.isFull()) {
            organic.collect(recyclableBin);
        }

        if (hazardousBin.isFull()) {
            organic.collect(hazardousBin);
        }
    }
}