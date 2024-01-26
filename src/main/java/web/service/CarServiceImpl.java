package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    private final CarDao carDao = new CarDaoImp();
    @Override
    public List<Car> printCars(int count) {
        List<Car> cars = carDao.getAllcar();
        int length = (count >= 5) ? cars.size() : count;
        return cars.stream().limit(length).collect(Collectors.toList());
    }
}
