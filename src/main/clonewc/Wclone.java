package main.clonewc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Wclone {

    public int countBytes(File inputFile) throws IOException {
        byte[] fileBytes = Files.readAllBytes(inputFile.toPath());

        System.out.println("File size in bytes: " + fileBytes.length);
        return fileBytes.length;
    }
}
