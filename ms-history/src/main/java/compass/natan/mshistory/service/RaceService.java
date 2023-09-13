package compass.natan.mshistory.service;

import compass.natan.mshistory.model.Race;
import compass.natan.mshistory.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {

    @Autowired
    private RaceRepository raceRepository;

    public void saveRace(Race race) {
        raceRepository.save(race);
    }

    public List<Race> findAll() {
        return raceRepository.findAll();
    }

    public Race findById(String id) {
        return raceRepository.findById(id).orElse(null);
    }
}
