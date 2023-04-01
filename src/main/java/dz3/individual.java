package main.java.dz3;

public class individual extends transport{
    public static final String _category = "Individual Mobility";
    public String _type, _name;
    public boolean _arended = false;

    public individual(String type, String name, int num){
        super(num);
        _type = type;
        _name = name;
    }

    @Override
    public boolean isArended(){
        return _arended;
    }

    public void UnArend(){
        _arendday = 0;
        _arended = false;
    }

    public void SetArended(int day){
        if(_arended == true) System.out.println(_name + " уже в аренде!");
        else {
            _arended = true;
            _arendday = day;
        }
    }

    @Override
    public void getInfo(){
        System.out.println("Категория: " + this._category + "\nТип транспорта: " + this._type +"\nНазвание: " + this._name +"\nУникальный номер в системе: " + this.getId());
    }
}
