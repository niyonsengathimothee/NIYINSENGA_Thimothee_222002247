package MYEntities;

public class Rooms {
    private int id;
    private String roomType;
    private double pricePerNight; // Changed data type to double for representing price
    private String description;
    private String customerId;

    public Rooms(int id, String roomType, double pricePerNight, String description, String customerId) {
        this.id = id;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.description = description;
        this.customerId = customerId;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
