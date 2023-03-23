package dz2;
import java.awt.*;
import java.util.Scanner;

public class trandasirdz2 {

    public static void main(String[] args) {
            var classInstance = new trandasirdz2();
            Scanner input = new Scanner(System.in);
            Parking _parking = new Parking();
            Entry _firstentry = new Entry(1);
            Entry _secondentry = new Entry(2);
            Entry _thirdentry = new Entry(3);
            Departure _firstdepart = new Departure(1);
            Departure _seconddepart = new Departure(2);
            Departure _thirddepart = new Departure(3);

            int _TempNumber;

            System.out.print("Введите номер машины для въезда - ");
            _TempNumber = input.nextInt();
            Car _car1 = new Car(_TempNumber);
            _parking.SetCar(_car1, _firstentry);

            System.out.print("Введите номер машины для въезда - ");
            _TempNumber = input.nextInt();
            Car _car2 = new Car(_TempNumber);
            _parking.SetCar(_car2, _firstentry);

            System.out.print("Введите номер машины для въезда - ");
            _TempNumber = input.nextInt();
            Car _car3 = new Car(_TempNumber);
            _parking.SetCar(_car3, _secondentry);

            System.out.print("Введите номер машины для въезда - ");
            _TempNumber = input.nextInt();
            Car _car4 = new Car(_TempNumber);
            _parking.SetCar(_car4, _firstentry);

            System.out.print("Количество свободных мест - " ); _parking.GetFreeSeats();
            System.out.println();

            _parking.DepartCar(_car1, _firstdepart);

            _parking.DepartCar(_car2, _seconddepart);

            _firstentry.GetNumbers();
            _secondentry.GetNumbers();
            _thirdentry.GetNumbers();

            _firstdepart.GetNumbers();
            _seconddepart.GetNumbers();
            _thirddepart.GetNumbers();

            System.out.print("Количество попыток проезда автомобиля с номером " + _car4.GetNumber() + " - "); _car4.CarTries();
            System.out.println();

            System.out.print("Количество свободных мест - " ); _parking.GetFreeSeats();
            System.out.println();

    }
}
    /*
        У владельцев автомобильной парковки появилась потребность программного управления свободными местами. Парковка имеет:
        * Въезды с номером и описанием
        * Выезды с номером и описанием
        * Общее количество парковочных мест
        Могут случаться следующие события:
        * Въезд автомобиля с номером XXX через определенный въезд
        * Выезд автомобиля с номером XXX через определенный выезд
        Программа должна позволять следующие возможности(методы):
        * Узнать сможет автомобиль заехать на парковку или нет(определяется по наличию свободных мест)
        * Узнать количество свободных мест на парковке
        * Узнать список машин проехавших через указанный выезд
        * Узнать список машин проехавших через указанный въезд
        * Узнать список попыток, с указанием номера машины и времени, когда машина не смогла попасть на парковку(попыткой считается вызов метода въехать)
        Требуется описать структуру классов(парковка, пункт въезда, пункт выезда, машина, попытка въезда), которая обеспечит парковку возможностями описанными выше.
        Для проверки работы в методе main показать ваш демо-сценарий использования программы.
     */

