package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.config.WebConfig;
import web.model.Car;
import web.service.CarService;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {
    CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest request, ModelMap model) {
        List<Car> cars = carService.printCars(request.getParameter("count"));

        model.addAttribute("cars", cars);
        return "cars";
    }
}
