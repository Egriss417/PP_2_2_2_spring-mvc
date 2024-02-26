package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao{

    @Override
    public List<Car> getAllcar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("bmv", "sd12125",240.2f));
        cars.add(new Car("bmv", "sa32522",280.0f));
        cars.add(new Car("audi", "h86340",180.2f));
        cars.add(new Car("honda", "7843sy",362.7f));
        cars.add(new Car("renault", "sd12125",200.9f));
        return cars;
    }
}
