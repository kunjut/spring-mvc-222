//package web;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.ui.ModelMap;
//import web.model.Car;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class ServiceImpl {
//    @Autowired
//    ModelMap model;
//
//    public List<Car> getCars() {
//        List<Car> carList = (List<Car>) model.getAttribute("cars");
//        assert carList != null;
//        List<Car> carList1 = carList.stream().limit(3).collect(Collectors.toList());
//        return carList1;
//    }
//}
