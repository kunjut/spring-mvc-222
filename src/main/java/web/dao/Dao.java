package web.dao;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.List;

public interface Dao {
    List<Car> getCars(ModelMap model);
}
