import java.io.File;
import java.io.IOException;

public class intro {
    public static void main(String[] args) {
        try {
            File obj = new File("myfile.txt");
            if (obj.createNewFile()) {
                System.out.println("File Created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
