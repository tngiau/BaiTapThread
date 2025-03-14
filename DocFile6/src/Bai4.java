import java.io.*;

import java.io.*;

    public class Bai4 {
        public static void main(String[] args) {
            String fileName = "numbers.dat";
            int[] numbers = {10, 20, 30, 40, 50};


            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
                for (int num : numbers) {
                    dos.writeInt(num);
                }
                System.out.println("Ghi dữ liệu thành công vào " + fileName);
            } catch (IOException e) {
                System.err.println("Lỗi khi ghi tệp: " + e.getMessage());
            }


            try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
                System.out.println("Các số nguyên đọc từ tệp:");
                while (dis.available() > 0) {
                    System.out.println(dis.readInt());
                }
            } catch (IOException e) {
                System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
            }
        }
    }


