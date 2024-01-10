package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest request, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("bmv", "sd12125",240.2f));
        cars.add(new Car("bmv", "sa32522",280.0f));
        cars.add(new Car("audi", "h86340",180.2f));
        cars.add(new Car("honda", "7843sy",362.7f));
        cars.add(new Car("renault", "sd12125",200.9f));

        String count = request.getParameter("count");

        if(count != null && Integer.parseInt(count) <=5) {
            cars = cars.subList(0, Integer.parseInt(count));
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}
