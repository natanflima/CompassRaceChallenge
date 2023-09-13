package compass.natan.mscars.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Pilot {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id = UUID.randomUUID().toString();

    private String name;
    private Integer age;

    public Pilot() {
    }

    public Pilot( String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
