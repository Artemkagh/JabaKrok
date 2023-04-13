package testdz4;

import dz4.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;

public class TestClass {
    @Test
    public void TestGeter() throws IOException, ClassNotFoundException {
        Task testtask = new Task("12", "testname", "testdiscription", "testme", "testing");
        String actualserial = testtask.getSerialVersion();
        String actualname = testtask.getName();
        String actualdiscription = testtask.getDiscription();
        String actualexecutor = testtask.getExecutor();
        String actualstatus = testtask.getStatus();
        assertEquals("12", actualserial);
        assertEquals("testname", actualname);
        assertEquals("testdiscription", actualdiscription);
        assertEquals("testme", actualexecutor);
        assertEquals("testing", actualstatus);
    }

    @Test
    public void TestSeter() throws IOException, ClassNotFoundException {
        Task testtask = new Task("12", "testname", "testdiscription", "testme", "testing");
        testtask.setSerialVersion("321");
        testtask.setName("New test name");
        testtask.setDiscription("New discription");
        testtask.setExecutor("Also me");
        testtask.setStatus("Steel testing");
        String actualserial = testtask.getSerialVersion();
        String actualname = testtask.getName();
        String actualdiscription = testtask.getDiscription();
        String actualexecutor = testtask.getExecutor();
        String actualstatus = testtask.getStatus();
        assertEquals("321", actualserial);
        assertEquals("New test name", actualname);
        assertEquals("New discription", actualdiscription);
        assertEquals("Also me", actualexecutor);
        assertEquals("Steel testing", actualstatus);
    }

    @Test
    public void TestToString() throws IOException, ClassNotFoundException {
        Task testtask = new Task("12", "testname", "testdiscription", "testme", "testing");
        String teststring = testtask.toString();
        assertEquals("----------------------------------------\nКод задачи: 12\nНаименование: testname\nОписание: testdiscription\nИсполнитель: testme\nСтатус: testing", teststring);
    }
}
