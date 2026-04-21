/*
* File: Storage.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft I/N
* Date: 2026-04-21
* Github: https://github.com/Martin91625/
* Licenc: MIT
*/

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
