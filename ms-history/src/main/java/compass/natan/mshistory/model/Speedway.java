package compass.natan.mshistory.model;

import lombok.Data;

@Data
public class Speedway {

    private String id;
    private String name;
    private String country;
    private String date;

    @Override
    public String toString() {
        return "Pista{" +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
