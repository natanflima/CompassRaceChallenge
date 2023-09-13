package compass.natan.mshistory.consume;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import compass.natan.mshistory.model.Race;
import compass.natan.mshistory.service.RaceService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HistoryConsume {

    @Autowired
    private RaceService raceService;

    @RabbitListener(queues = "FilaRace")
    private void consumidor(String mensagem) throws JsonProcessingException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        Race race = objectMapper.readValue(mensagem, new TypeReference<Race>() {});

        raceService.saveRace(race);

        System.out.println(race.toString());
        System.out.println("------------------------------------");

    }
}

