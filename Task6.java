import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args) {
        File file = new File("Task6.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            String data = """
                    Name Surname Age
                    Kate Smith 20
                    Paul Green 25
                    Mike Black 23""";
            fileWriter.write(data);
            fileWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
