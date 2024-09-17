import java.util.ArrayList;

public class Race {
    //Переменная хранит участников гонки
    ArrayList<Car> arrCar = new ArrayList<>();

    //Добавляем участников гонки, предусматриваем возможность изменения количества участников
    void addCars(int i){
        for (int j=0; j<i; j++){
            Car car = new Car(j+1);
            arrCar.add(car);
        }
    }
    //Вычисляем победителя
    void whoWinn() {
        Car car = new Car();
        int distance = 0;
        for (Car e : arrCar) {
            if (distance < e.speed*24) {
                distance = e.speed*24;
                car = e;
            }
        }
        System.out.println("Самая быстрая машина: " + car.name);
    }
}
