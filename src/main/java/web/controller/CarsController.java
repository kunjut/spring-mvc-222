package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    CarServiceImp serviceImp;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            ModelMap model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "X1", 2016));
        cars.add(new Car("BMW", "X3", 2017));
        cars.add(new Car("BMW", "X4", 2018));
        cars.add(new Car("BMW", "X5", 2019));
        cars.add(new Car("BMW", "X6", 2020));

        // упакова в модель полученного параметра и списка
        model.addAttribute("count", count);
        model.addAttribute("cars", cars);

        // передача модели для обработки списка
        // получение итогового списка через сервис/дао
        List<Car> carsResult = serviceImp.getCars(model);

        // упаковка в модель итогового списка
        model.addAttribute("carsResult", carsResult);

        // возврат вьюхи
        return "cars";
    }
}
