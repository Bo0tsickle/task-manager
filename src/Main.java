import java.io.IOException;
import java.util.Objects;

public class Main {
    static TaskManagement tasks;

    static {
        try {
            tasks = new TaskManagement();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Main() {
    }

    public static void main(String[] args) throws IOException {
        if(Objects.equals(args[0], "add")) {
            try {
                tasks.add(args[1]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("You didn't enter a title!");
            }

        }
    }
}