package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getListCarByCount(Integer count);
}