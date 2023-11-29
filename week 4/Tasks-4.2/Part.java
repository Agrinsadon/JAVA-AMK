public class Part {
    private String identifier;
    private String manufacturer;
    private String description;
    private float  cost;

    public Part(String identifier, String manufacturer, String description, float cost) {
        this.identifier   = identifier;
        this.manufacturer = manufacturer;
        this.description  = description;
        this.cost         = cost;
    }

    public String getIdentifier() { return identifier; }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getCost() { return cost; }

    @Override
    public String toString() {
        return description + " (" + cost + "€)";
    }
}
