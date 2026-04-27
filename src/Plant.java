import java.time.Duration;
import java.time.LocalDateTime;

public class Plant {
    //promenne pro nastaveni informaci o rostline
    private String name;
    private String notes;
    private LocalDateTime planted;
    private LocalDateTime watering;
    private Duration frequencyOfWatering;

    //konstruktory
    public Plant(String name, String notes, LocalDateTime planted, LocalDateTime watering, Duration frequencyOfWatering) {
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.watering = watering;
        this.frequencyOfWatering = frequencyOfWatering;
    }
}