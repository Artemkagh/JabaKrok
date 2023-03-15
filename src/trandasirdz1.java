import java.util.Scanner;

public class trandasirdz1{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество число");
        printBytes(input.nextLong());
    }

    public static void printBytes(long size) {
        double tmp; //временная переменная
        double b = size; //исходный размер
        double kb = size/1024.0;   //размер в кб
        double mb = ((size/1024.0)/1024.0); //размер в мб
        double gb = (((size/1024.0)/1024.0)/1024.0);    //размер в гб
        double tb = ((((size/1024.0)/1024.0)/1024.0)/1024.0);   //размер в тб
        double[] myArray = new double[]{b, kb, mb, gb, tb}; //массив всех чисел

        for(int i = 1; i < myArray.length; i++){
            tmp = myArray[i-1]; //записываем предыдущее щначение
            if(myArray[i]<1){ //если i-ое значение <0 выводим предыдущее значение
                System.out.print(String.format("%.1f", tmp).replace(',', '.'));
                switch (i-1){
                    case 0: { System.out.println(" B"); break; }
                    case 1: {System.out.println(" KB"); break; }
                    case 2: {System.out.println(" MB"); break; }
                    case 3: {System.out.println(" GB"); break; }
                }
                break;
            }
            if(myArray[myArray.length - 1] > 1){
                System.out.println(String.format("%.1f", tb).replace(',', '.') + " TB");
                break;
            }
        }




    }

}
