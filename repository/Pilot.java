package compass.natan.mscars.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pilot extends MongoRepository<Pilot, Long> {
}


