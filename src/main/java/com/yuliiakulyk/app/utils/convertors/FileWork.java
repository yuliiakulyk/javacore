package com.yuliiakulyk.app.utils.convertors;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Yuliia Kulyk on 13.11.2016.
 */
public class FileWork {
    public String[] readFileLines (String srcFilePath) { // returns String array of lines from the specified file
        ArrayList<String> fileLines = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(srcFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                fileLines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileLines.toArray(new String[fileLines.size()]);
    }

    public void writeFileLines (String[] info, String filePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)));
            for (int i = 0; i < info.length - 1; i++) {
                writer.append(info[i]);
                writer.newLine();
            }
            writer.append(info[info.length - 1]);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
