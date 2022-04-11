import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
    first step locating the file that we want to read
    navigating to that location
    that special class which knows how to read the .properties file
    loading all the data from the file to properties object
     */
    public static String getProperty(String key) throws IOException {
        String path="Files/Config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties= new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }


    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("URL"));
        System.out.println(ConfigReader.getProperty("password"));
    }
}
