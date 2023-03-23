package dz2;

public class Parking {
    int _CurrentCar = 0;
    public static int _AllSeats = 3;
    public int _FreeSeats;
    public int _TakenSeats;

    Car[] _CarsArray;
    public void GetFreeSeats(){
        System.out.println(_FreeSeats);
    }

    public Parking() {
        _FreeSeats = _AllSeats;
        _TakenSeats = 0;
        _CarsArray = new Car[_AllSeats];
    }
    public void GetSeats(){
        System.out.println(_TakenSeats);
    }
    public void SetCar(Car NewCar, Entry Entr) {
        if(_FreeSeats>0) {
            _CarsArray[_CurrentCar] = NewCar;
            _CurrentCar++;
            Entr.SetEntryCar(NewCar);
            _FreeSeats--;
            _TakenSeats++;
        } else {System.out.println("На парковке не осталось свободных мест!"); NewCar.UpdateTry(); System.out.println();}
    }

    public void DepartCar(Car CarNum, Departure Dep) {
        for (int i = 0; i<_AllSeats-1; i++){
            if(_CarsArray[i] != null && (_CarsArray[i].GetNumber() == CarNum.GetNumber())) {
                    Dep.SetDepartCar(CarNum);
            }
        }
        for (int i = 0; i < _CarsArray.length; i++) {
            if(_CarsArray[i] != null){
                if(_CarsArray[i].GetNumber() == CarNum.GetNumber() && _CarsArray[i+1] != null) {
                    Car temp = _CarsArray[i + 1];
                    _CarsArray[i] = null;
                    _CarsArray[i] = temp;
                    _CarsArray[i + 1] = null;
                }else _CarsArray[i] = null;
            }
        }
        _FreeSeats++;
        _TakenSeats--;
    }
}
