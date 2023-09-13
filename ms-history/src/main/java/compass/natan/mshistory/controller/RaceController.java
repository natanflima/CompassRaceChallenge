package compass.natan.mshistory.controller;


import compass.natan.mshistory.model.Race;
import compass.natan.mshistory.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Races")
public class RaceController {

    @Autowired
    private RaceService raceService;

    @GetMapping("/findAll")
    public List<Race> findAll(){
        return raceService.findAll();
    }

    @GetMapping("/findById")
    public Race findById(@RequestParam String id){
        return raceService.findById(id);
    }
}

