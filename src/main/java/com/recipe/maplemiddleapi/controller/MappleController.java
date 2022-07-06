package com.recipe.maplemiddleapi.controller;


import com.recipe.maplemiddleapi.service.MappleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappleController {

    final
    MappleService mappleService;

    public MappleController(MappleService mappleService) {
        this.mappleService = mappleService;
    }

    @PostMapping("/levelup")
    public Object sendLevelUpInfo(int exp1, int exp2){

        mappleService.levelUpInfo(exp1,exp2);

        return null;
    }

}
