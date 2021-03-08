package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import web.dao.Dao;
import web.model.Car;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImp implements Service {

    @Autowired
    Dao dao;

    @Override
    public List<Car> getCars(ModelMap model) {
        return dao.getCars(model);
    }
}
