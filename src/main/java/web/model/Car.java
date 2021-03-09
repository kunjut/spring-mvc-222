package web.model;

import java.util.Objects;

public class Car {
    private String mark;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, year);
    }
}
