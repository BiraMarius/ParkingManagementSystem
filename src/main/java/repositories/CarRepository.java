package repositories;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addCar(Car car){
        String sql = "INSERT INTO car VALUES (NULL, ?)";
        String sql2 = "INSERT INTO car VALUES (NULL, test)";
        jdbcTemplate.update(sql, car.getRegistrationNumber());
    }

}
