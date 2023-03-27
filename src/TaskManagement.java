import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class TaskManagement {

    // external objects
    Gson gson = new Gson();
    FileWriter taskWriter = new FileWriter("src/tasks.json");

    // fields
    String title;
    boolean isComplete;

    public TaskManagement() throws IOException { // class constructor

    }

    public void add(String inputTitle) throws IOException {
        title = inputTitle; // set title
        String toJson = gson.toJson(this);
        taskWriter.write(toJson);
    }
}
