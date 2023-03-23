package dz2;

public class Departure {
    int _NumberOfDepart;
    int _CurrentCar = 0;
    Car[] _NumOfCarsArray;

    public Departure(int Num) {
        _NumberOfDepart = Num;
        _NumOfCarsArray = new Car[Parking._AllSeats];
    }

    public void SetDepartCar(Car DepCar) {
        _NumOfCarsArray[_CurrentCar] = DepCar;
        _CurrentCar++;
    }

    public void GetNumbers(){
        System.out.print("Список машин, проехавших через выезд " + _NumberOfDepart + " - ");
        if(_NumOfCarsArray[0] == null)System.out.println(" 0 ");
        for (int i = 0; i < _NumOfCarsArray.length; i++) {
            if(_NumOfCarsArray[i] == null)break;
            System.out.print(_NumOfCarsArray[i].GetNumber() + " ");
        }
        System.out.println();
    }

}
