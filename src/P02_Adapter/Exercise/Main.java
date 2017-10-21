package P02_Adapter.Exercise;

import javax.imageio.IIOException;
import java.io.IOException;

/**
 * Created by ilyar on 17-10-21
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("/home/ilyar/IdeaProjects/gs-spring-boot/DesignPatterns/src/P02_Adapter/Exercise/file.txt");
            f.setValue("year", "2017");
            f.setValue("month","10");
            f.setValue("day","21");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
