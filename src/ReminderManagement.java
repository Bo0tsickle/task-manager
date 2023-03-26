import com.google.gson.Gson;

public class ReminderManagement {
    Gson gson = new Gson();
    private enum Reminder {
        add,
        subtract,
    }
    private void WriteToJson(ReminderManagement task, Reminder operator) {
        switch (operator) {
            case add: {

            }
            case subtract: {

            }
        }
    }
    public void AddTask() {

    }
}
