package compass.natan.mscars.service;


import compass.natan.mscars.models.Car;
import compass.natan.mscars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car findById(String id) {
        return carRepository.findById(id).orElse(null);
    }

    public void save(Car car) {
        carRepository.save(car);
    }

    public void deleteAll() {
        carRepository.deleteAll();
    }

    public void update(Car car) {
        if (findById(car.getId()) != null) {
            save(car);
        }
    }

    public List<Car> findRandonCars(Integer numOfCars) throws Exception {
        List<Car> carsList = findAll();
        verifyNumber(numOfCars, carsList.size());
        Set<Car> returnCars = new HashSet<>();
        boolean a = true;
        while (a) {
            Integer num = ThreadLocalRandom.current().nextInt(0, carsList.size());
            returnCars.add(carsList.get(num));
            if (returnCars.size() == numOfCars)
                a = false;
        }
        return new ArrayList<>(returnCars);
    }

    private void verifyNumber(Integer numRandom, Integer sizeList) throws Exception {
        if (numRandom > sizeList)
            throw new Exception("Carros insuficientes.");
    }
}

