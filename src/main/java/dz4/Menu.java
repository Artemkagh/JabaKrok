package dz4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements Serializable {
    int choice = -1;
    ArrayList<Task> listoftask = new ArrayList<Task>();
    File file;

    Scanner input = new Scanner(System.in);
    private String tmpserialVersion,  tmpname,  tmpdiscription,  tmpexecutor, tmpstatus;

    public Menu() throws IOException, ClassNotFoundException {

        if ( !Files.exists(Path.of("src\\main\\java\\dz4\\samplefile\\sample.dat"))) {
            Files.createDirectory(Path.of("src\\main\\java\\dz4\\samplefile"));
            Files.createFile(Path.of("src\\main\\java\\dz4\\samplefile\\sample.dat"));
        }
        file = new File("src\\main\\java\\dz4\\samplefile\\sample.dat");
        listoftask = readObjectFromFile(file);

        while (choice!=0){
            System.out.print("----------------------------------------\n1.Добавть новую задачу\n2.Редактировать задачу\n3.Удалить задачу\n4.Вывести список всех задач\nВвод: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1: {
                    System.out.print("\nВведите код задачи - ");
                    tmpserialVersion = input.nextLine();
                    System.out.print("Введите наименование - ");
                    tmpname = input.nextLine();
                    System.out.print("Введите описание - ");
                    tmpdiscription = input.nextLine();
                    System.out.print("Введите исполнитель - ");
                    tmpexecutor = input.nextLine();
                    System.out.print("Введите статус - ");
                    tmpstatus = input.nextLine();
                    listoftask.add(new Task(tmpserialVersion, tmpname, tmpdiscription, tmpexecutor, tmpstatus));
                    writeObjectToFile(listoftask, file);
                    break;
                }

                case 2:{
                    System.out.print("\nВведите код задачи для редактирования - "); tmpserialVersion = input.nextLine();
                    for ( Task i: listoftask) {
                        if(i.getSerialVersion().equals(tmpserialVersion)){
                            System.out.print("Введите код задачи - "); i.setSerialVersion(input.nextLine());
                            System.out.print("Введите наименование - "); i.setName(input.nextLine());
                            System.out.print("Введите описание - "); i.setDiscription(input.nextLine());
                            System.out.print("Введите исполнителя задачи - "); i.setExecutor(input.nextLine());
                            System.out.print("Введите статус - "); i.setStatus(input.nextLine());
                        }
                        break;
                    }
                    writeObjectToFile(listoftask, file);
                    break;
                }

                case 3:{
                    System.out.print("\nВведите код задачи для удаления - "); tmpserialVersion = input.nextLine();
                    for ( Task i: listoftask) {
                        listoftask.removeIf(el -> el.getSerialVersion().equals(tmpserialVersion));
                    }
                    writeObjectToFile(listoftask, file);
                    break;
                }

                case 4:{
                    ArrayList<Task> tmp =  readObjectFromFile(file);
                    for ( Task i: tmp) {
                        System.out.println(i);
                    }
                    break;
                }

            }
        }

    }


    // Serialization
    // Save object into a file.
    public static void writeObjectToFile(ArrayList<Task> obj, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
        }
    }

    // Deserialization
    // Get object from a file.
    public static ArrayList<Task> readObjectFromFile(File file) throws IOException, ClassNotFoundException {
        ArrayList<Task> result = new ArrayList<Task>();
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = (ArrayList<Task>) ois.readObject();
        } catch (EOFException ignore){}
        return result;
    }
}



