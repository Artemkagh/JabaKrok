package dz2;

public class Car {
    public int _Number;
    Try _CurrentTry = new Try();

    public Car(int num) {
        _Number = num;
    }

    public int GetNumber() {
        return _Number;
    }

    public void UpdateTry() {
        _CurrentTry.SetTry();
    }
    public void CarTries() {
        System.out.println(_CurrentTry.GetTry());
    }
}
