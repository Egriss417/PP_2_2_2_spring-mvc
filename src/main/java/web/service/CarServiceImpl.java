package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> printCars(List<Car> cars, String count) {
        int length = (count == null || Integer.parseInt(count) >= 5) ? cars.size() : Integer.parseInt(count);
        return cars.stream().limit(length).collect(Collectors.toList());
    }
}
