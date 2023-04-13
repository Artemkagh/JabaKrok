package dz4;

import java.io.Serializable;
public class Task implements Serializable {

    private String serialVersion;
    private String name;
    private String discription;
    private String executor;
    private String status;

    public Task(String serialVersion, String name, String discription, String executor, String status) {
        this.serialVersion = serialVersion;
        this.name = name;
        this.discription = discription;
        this.executor = executor;
        this.status = status;
    }

    public String getSerialVersion() {
        return serialVersion;
    }

    public void setSerialVersion(String serialVersion) {
        this.serialVersion = serialVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "----------------------------------------\nКод задачи: " + serialVersion + "\nНаименование: " + name +  "\nОписание: " + discription + "\nИсполнитель: " + executor + "\nСтатус: " + status;
    }

}