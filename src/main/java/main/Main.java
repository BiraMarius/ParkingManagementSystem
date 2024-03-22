package main;

import config.ProjectConfig;
import model.Car;
import repositories.CarRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            CarRepository carRepository = c.getBean(CarRepository.class);
            Car car = new Car();
            car.setRegistrationNumber("B800YAM");

            carRepository.addCar(car);
        }
    }
}
