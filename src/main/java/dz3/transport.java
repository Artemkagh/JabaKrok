package main.java.dz3;
import java.util.ArrayList;

public class transport {
    ArrayList<transport> _transportArray = new ArrayList<>();
    public int _id;
    public int _arendday;

    public transport(){}

    public transport(int num){
        _id = num;
    }

    public int getId(){
        return _id;
    }

    public int getDay() {
        return _arendday;
    }

    public boolean isArended(){
        return false;
    }

    public void getInfo(){
    }


    public void AddTransport(transport elem){
        _transportArray.add(elem);
    }

    public void DeleteTransport(int id){
        for(int i = 0; i < _transportArray.size(); i++) {
            if (_transportArray.get(i).getId() == id) {
                if (_transportArray.get(i).isArended() == false)_transportArray.remove(_transportArray.get(i));
                else System.out.println(_transportArray.get(i).getId() + " находится в аренде!");
            }
        }
    }

    public void SWOT() {
        System.out.println("-----------------------SWOT-АНАЛИЗ-------------------------");
        for (int i = 0; i < _transportArray.size(); i++) {
            _transportArray.get(i).getInfo();
            System.out.print("Находится в аренде: ");
            if(_transportArray.get(i).isArended() == true){
                System.out.println("Да" + "\nДо конца аренды(дней):" + _transportArray.get(i).getDay());
            }
            else System.out.println("Нет");
            System.out.println("----------------------------------------------------------");
        }
    }
}
