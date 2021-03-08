package web.service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.List;

public interface Service {
    List<Car> getCars(ModelMap model);
}
