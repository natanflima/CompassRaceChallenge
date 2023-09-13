package compass.natan.mshistory.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Race {

    @Id
    private String id;
    private Speedway speedway;
    private List<Car> carList;

    @Override
    public String toString() {
        return "Race{" +
                "id='" + id + '\'' +
                ", speedway=" + speedway+
                ", carList=" + carList +
                '}';
    }
}
