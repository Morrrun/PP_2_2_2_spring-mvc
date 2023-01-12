package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String outputCars(@RequestParam(value = "count", required = false)
                                 Integer count,
                                 Model model) {

        List<Car> cars = carService.getListCarByCount(count);

        model.addAttribute("cars", cars);

        return "cars/count_cars";
    }

}
