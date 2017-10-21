package P02_Adapter.Exercise;

import java.io.*;

/**
 * Created by ilyar on 17-10-20
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
