public class WasteContainer {
    private String type;
    private int capacity;
    private int currentLevel;

    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.currentLevel = 0;
    }

    public void addWaste(int amount) {
        currentLevel += amount;
        if (currentLevel > capacity) {
            currentLevel = capacity;
        }
        System.out.println(type + " container filled: " + currentLevel + "/" + capacity);
    }

    public boolean isFull() {
        return currentLevel >= capacity;
    }

    public String getType() {
        return type;
    }
}