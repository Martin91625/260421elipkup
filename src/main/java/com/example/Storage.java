package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    
    public static void writeToFile(String data){
        try {
            tryWriteToFile(data);
        } catch (IOException e) {
            System.err.println(e.getMessage() + "\nHiba a fájlba írás közben.");
        }
    }

    private static void tryWriteToFile(String data) throws IOException{
        try(FileWriter fileWriter = new FileWriter("data.txt", true)) {
            fileWriter.write(data);
        }
    }
}
