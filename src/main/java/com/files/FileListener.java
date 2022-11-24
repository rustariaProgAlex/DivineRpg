package com.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Enumeration;

import com.location.Location;

import javafx.scene.shape.Line;

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

    public static Location locationReader(String id) {
        String path = "plot/locations.txt";
        StringBuilder sb = null;
        BufferedReader reader;
        try {
            reader = Files.newBufferedReader(Path.of(path), StandardCharsets.UTF_8);
            sb = new StringBuilder();
            String line = reader.readLine();
            boolean pass = false;
            while (line != null) {
                if (line.contains("}") && pass) {
                    break;
                }
                if (line.contains(id) && line.contains("$")) {
                    pass = true;
                }
                if (pass && !line.contains("{") && !line.contains("}")) {
                    sb.append(line.replace(" " , "" ).replace(",", "") + "\n");
                }
                line = reader.readLine();
            }
            
        

        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] fields = sb.toString().split("\n");
        int dist = 0;
        String name = "";
        String type = "";
        ArrayList<String> links = new ArrayList<>();

       for(int i = 0; i < fields.length; i++ ){
        if(fields[i].contains("name")){
            name = fields[i].split("\"")[1];
        }
        if(fields[i].contains("dist")){
            dist = Integer.parseInt(fields[i].split("\"")[1]);
        }
        if(fields[i].contains("type")){
            type = fields[i].split("\"")[1];
        }
        if(fields[i].contains("links")){
            for (int j = i + 2; true; j++) {
                if(fields[j].contains("]")){
                    break;
                }
                links.add(fields[j]);
                
            }
        }
       }
        return new Location(name, dist, type, links);
    }
}
