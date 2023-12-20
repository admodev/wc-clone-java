package main;

import main.clonewc.Wclone;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Wclone wcClone = new Wclone();
        String filename = args[1];
        File file = new File(filename);

        try {
            switch (args[0]) {
                case "-c":
                    wcClone.countBytes(file);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
