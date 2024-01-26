package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest request, ModelMap model) {
        String count = request.getParameter("count");
        CarService carService = new CarServiceImpl();

        List<Car> cars = carService.printCars((count != null)?Integer.parseInt(count):5);

        model.addAttribute("cars", cars);
        return "cars";
    }
}
