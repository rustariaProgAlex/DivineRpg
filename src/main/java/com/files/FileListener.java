package com.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import com.location.Location;

public class FileListener {
    public static String textReading(String id, String path) {
        StringBuilder sb = null;
        try {
            BufferedReader reader = Files.newBufferedReader(Path.of(path), StandardCharsets.UTF_8);
            sb = new StringBuilder();
            String line = reader.readLine();
            boolean pass = false;
            while (line != null) {
                if (line.contains("$") && line.contains(id)) {
                    pass = true;
                }
                if (pass && !line.contains("$")) {
                    sb.append(line);
                }
                line = reader.readLine();
                if (line != null && line.contains("$") && pass) {
                    break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString().replace("null", "");
    }

    public static Location locationReader(String path, String id) {

        
        return null;
    }
}
