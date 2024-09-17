import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
    String name;
    int speed;

    /*Перегружаю конструктор класса, чтобы была возможность использовать условно пустой экземпляр
    автомобиля, который нужен при сравнении автомобилей.
     */
    public Car(){
        this.name = "";
        this.speed = 0;
    }
    // логика создания нового автомобиля из конструктора
    public Car(int num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название автомобиля №" + num +":");
        name = scanner.next();
        setSpeed(num);
    }
    /* логика установки скорости с валидацией введенных симоволов и рекурсивно заставляю ввести
     верное значение с указанием какие значения от него ожидаются
     */
    public void setSpeed(int num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость автомобиля №" + num + ":");
        int curentSpeed;
        try {
            curentSpeed = scanner.nextInt();
            if (curentSpeed > 0 && curentSpeed <=250){
                speed=curentSpeed;
            }else{
                System.out.println("Введенное значение находится вне пределов от 1 до 250 включительно. Попробуйте снова.");
                setSpeed(num);
            }
        } catch (InputMismatchException e){
            System.out.println("Необходимо ввести число от 1 до 250 включительно.");
            setSpeed(num);
        }
    }
}
