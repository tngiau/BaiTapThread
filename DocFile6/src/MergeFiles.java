import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MergeFiles {
    public static void main(String[] args) {
        String[] inputFiles = {"input1.txt", "input2.txt", "input3.txt"};
        String outputFile = "output.txt";

        List<Thread> threads = new ArrayList<>();
        List<String> contents = new ArrayList<>(inputFiles.length);


        for (int i = 0; i < inputFiles.length; i++) {
            contents.add("");
        }


        for (int i = 0; i < inputFiles.length; i++) {
            final int index = i;
            Thread thread = new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(new FileReader(inputFiles[index]))) {
                    String line;
                    StringBuilder fileContent = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        fileContent.append(line).append(System.lineSeparator());
                    }
                    synchronized (contents) {
                        contents.set(index, fileContent.toString());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            threads.add(thread);
            thread.start();
        }


        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String content : contents) {
                writer.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Đã gộp thành công nội dung các file vào " + outputFile);
    }
}


