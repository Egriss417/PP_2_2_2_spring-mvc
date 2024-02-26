package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> printCars(String count) {
        List<Car> cars = carDao.getAllcar();
        int length = (count != null)?Integer.parseInt(count):5;
        return cars.stream().limit(length).collect(Collectors.toList());
    }
}
