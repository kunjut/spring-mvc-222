package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DaoImp implements Dao {

    @Override
    public List<Car> getCars(ModelMap model) {

        // получение данных из модели
        List<Car> cars = (List<Car>) model.getAttribute("cars");
        Integer count = (Integer) model.getAttribute("count");

        // правильный count, даже если null
        count = count == null ? cars.size() : count;

        // возврат обработанного списка через streamAPI
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}