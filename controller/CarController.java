package compass.natan.mscars.controller;

import compass.natan.mscars.models.Car;
import compass.natan.mscars.models.CarResponse;
import compass.natan.mscars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/random")
    public CarResponse findCarsToNumbers(@RequestParam String id) throws Exception {
        verifyHeaders(id);
        Integer num = Integer.valueOf(id);
        return converteToResponse(carService.returnRandonCars(num));
    }

    @GetMapping
    public CarResponse findAll() {
        return converteToResponse(carService.findAll());
    }

    @PostMapping
    public void save(@RequestBody Car car) {
        carService.save(car);
    }

    @DeleteMapping
    public void deleteAll() {
        carService.deleteAll();
    }

    @PutMapping
    public void update(@RequestBody Car car) {
        carService.update(car);
    }

    private CarResponse converteToResponse(List<Car> car) {
        CarResponse carResponse = new CarResponse();
        carResponse.setCarList(car);
        return carResponse;
    }

    private void verifyHeaders(String id) throws Exception {
        Integer num = Integer.valueOf(id);
        if (num < 3 || num > 10)
            throw new Exception("Header invalido");
    }
}


