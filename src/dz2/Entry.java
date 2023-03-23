package dz2;

public class Entry {
    int _NumberOfEntry;
    int _CurrentCar = 0;
    Car[] _NumOfCarsArray;

    public Entry(int Num) {
        _NumberOfEntry = Num;
        _NumOfCarsArray = new Car[Parking._AllSeats];
    }

    public void SetEntryCar(Car NewCar) {
        _NumOfCarsArray[_CurrentCar] = NewCar;
        _CurrentCar++;
    }

    public void GetNumbers(){
        System.out.print("Список машин, проехавших через проезд " + _NumberOfEntry + " - ");
        if(_NumOfCarsArray[0] == null)System.out.println(" 0 ");
        else {
            for (int i = 0; i < _NumOfCarsArray.length; i++) {
                if(_NumOfCarsArray[i] == null) break;
                System.out.print(_NumOfCarsArray[i].GetNumber() + " ");
            }
        }
        System.out.println();
    }
}
