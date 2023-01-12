package web.model;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String model;
    private String type;
    private int plate;

    @Override
    public String toString() {
        return "Model: " + model + "\n" +
               "Type: " + type + "\n" +
               "Plate: " + plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return plate == car.plate && model.equals(car.model) && type.equals(car.type);
    }

    @Override
    public int hashCode() {
        long a = Objects.hash(model);
        long b = Objects.hash(type);
        long c = Objects.hash(plate);
        long d = (37 * (a + b + c));
        return (int) d;
    }
}
