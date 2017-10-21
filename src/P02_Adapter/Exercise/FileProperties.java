package P02_Adapter.Exercise;

import java.io.*;

/**
 * Created by ilyar on 17-10-20
 */
public class FileProperties extends java.util.Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        File file = new File(filename);
        load(new FileInputStream(file));

    }

    @Override
    public void writeToFile(String filename) throws IOException {
        String header = "written by ilyar.";
        File file = new File(filename);
        store(new FileOutputStream(file), header);

    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
