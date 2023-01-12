package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Audi","Family", 111));
        cars.add(new Car("BMW","Business", 100));
        cars.add(new Car("Ford","Work", 302));
        cars.add(new Car("Honda","Work", 301));
        cars.add(new Car("Mazda","Business", 200));
    }

    @Override
    public List<Car> getListCarByCount(Integer count) {
        List<Car> carsList = cars;

        if (count == null || count < 0 || count > carsList.size()) {
            count = carsList.size();
        }

        return carsList.stream().limit(count).toList();
    }


}
