import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class ReminderManagement {
    // fields
    Gson gson = new Gson();
    {
        try {
            FileWriter fileWriter = new FileWriter("src/tasks.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(String title) {
    }
}
