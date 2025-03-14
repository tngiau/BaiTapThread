import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import java.io.*;

    public class Bai3 {
        public static void main(String[] args) {
            String fileName = "inputbai3.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                int lineCount = 0;
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println("Số dòng trong tệp: " + lineCount);
            } catch (IOException e) {
                System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
            }
        }
    }

