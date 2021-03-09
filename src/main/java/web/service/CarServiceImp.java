package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("ВАЗ", "2101", 1975));
        cars.add(new Car("Жигули", "2106", 1980));
        cars.add(new Car("Lada", "2110", 2000));
        cars.add(new Car("Lada", "Kalina", 2005));
        cars.add(new Car("Lada", "Vesta", 2019));

        // правильный count, даже если null
        count = count == null ? cars.size() : count;

        // возврат обработанного списка через streamAPI
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
