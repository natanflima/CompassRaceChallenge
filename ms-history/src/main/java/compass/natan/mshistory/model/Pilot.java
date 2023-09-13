package compass.natan.mshistory.model;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class Pilot implements Serializable {

    private String id = UUID.randomUUID().toString();

    private String name;
    private Integer age;

}
