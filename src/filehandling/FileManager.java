package filehandling;

import java.io.*;

public class FileManager {

    protected String filePath;

    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    public void writeData(String data) {}

    public void appendData(String data) {}

    public void readData() {}
}