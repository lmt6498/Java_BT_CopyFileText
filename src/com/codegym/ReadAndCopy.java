package com.codegym;

import java.io.*;

public class ReadAndCopy {
    public void readText(String sourceFile, String targetFile) {
        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            FileWriter writer = new FileWriter(targetFile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            while ((line = br.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            br.close();

        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
    }

}
