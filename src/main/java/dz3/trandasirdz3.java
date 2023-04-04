package main.java.dz3;

public class trandasirdz3 {
    public static void main(String[] args) {
        transport _transport = new transport();
        auto car1 = new auto("Легковой", "Vaz 2107", 1001); //Добавляем транспорт в список доступных транспортных средст в для аренды
        _transport.AddTransport(car1);

        auto car2 = new auto("Грузовой", "Volkswagen Crafter", 1002);
        _transport.AddTransport(car2);

        auto car3 = new auto("Легковой", "BMW 7 serias 730i VI", 1003);
        _transport.AddTransport(car3);

        individual ind1 = new individual("Самокат", "Kugoo3", 1004);
        _transport.AddTransport(ind1);

        individual ind2 = new individual("Самокат", "Kugoo4", 1005);
        _transport.AddTransport(ind2);

        individual ind3 = new individual("Моноколесо", "KolesoKugoo", 1006);
        _transport.AddTransport(ind3);

        aviation avia1 = new aviation("Private Jet", "HAWKER 900XP", 1007);
        _transport.AddTransport(avia1);

        aviation avia2 = new aviation("Helicopter", "Mi-38", 1008);
        _transport.AddTransport(avia2);

        aviation avia3 = new aviation("Helicopete", "Mi-8", 1009);
        _transport.AddTransport(avia3);

        _transport.SWOT(); //Запрашиваем анализ состояния транспортных средств

        System.out.println("\n\n");

        car3.SetArended(10); //Арендуем некоторые ТС
        ind2.SetArended(3);
        avia2.SetArended(6);
        car2.SetArended(1);

        System.out.println("\n\n");
        car3.SetArended(4); //Пытаемся арендовать уже арендованное ТС
        System.out.println("\n\n");

        _transport.DeleteTransport(1001); //Списываем старые ТС
        _transport.DeleteTransport(1006);

        System.out.println("\n\n");
        _transport.DeleteTransport(1005);  //Пытаемся списать ТС в аренде
        System.out.println("\n\n");

        _transport.SWOT();   //Запрашиваем анализ состояния транспортных средств

        System.out.println("\n\n");
        car3.UnArend();   //Возвращаем ТС из аренды
        ind2.UnArend();
        System.out.println("\n\n");


        _transport.SWOT();  //Запрашиваем анализ состояния транспортных средств
    }
}
