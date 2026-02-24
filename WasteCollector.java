public abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNext(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void collect(WasteContainer container) {
        if (handle(container)) {
            return;
        }
        if (nextCollector != null) {
            nextCollector.collect(container);
        } else {
            System.out.println("No collector available for " + container.getType() + " waste.");
        }
    }

    protected abstract boolean handle(WasteContainer container);
}