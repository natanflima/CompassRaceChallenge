package compass.natan.mshistory.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Car implements Serializable {

    private String id;

    private String brand;
    private String model;
    private String year;

    private Pilot pilot;

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", pilot=" + pilot.getId() +
                '}';
    }
}
