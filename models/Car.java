package compass.natan.mscars.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Data
public class Car {

    @Id
    private String id;
    private String brand;
    private String model;
    private String year;
    private Pilot pilot;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
