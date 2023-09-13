package compass.natan.mshistory.repository;


import compass.natan.mshistory.model.Race;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends MongoRepository<Race, String> {
}
