package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
class CarDaolmp implements CarDao {


    @Override
    public List<Car> getAllCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("brand_1", "model_1", 2020));
        list.add(new Car("brand_2", "model_2", 2019));
        list.add(new Car("brand_3", "model_3", 2018));
        list.add(new Car("brand_4", "model_4", 2017));
        list.add(new Car("brand_5", "model_5", 2015));
        return list;
    }
}