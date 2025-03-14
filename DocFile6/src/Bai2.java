import java.io.*;



    public class Bai2 {
        public static void main(String[] args) {
            String fileName = "output2.txt";

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

                System.out.println("Nhập nội dung (nhập 'exit' để kết thúc):");
                String line;

                while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                    writer.write(line);
                    writer.newLine();
                }

                System.out.println("Dữ liệu đã được lưu vào " + fileName);
            } catch (IOException e) {
                System.err.println("Lỗi khi ghi tệp: " + e.getMessage());
            }
        }
    }

