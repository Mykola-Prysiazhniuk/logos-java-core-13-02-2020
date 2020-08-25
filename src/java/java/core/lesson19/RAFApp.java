package java.core.lesson19;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFApp {
    public static void main(String[] args) throws IOException {
        File file = new File("RandomAccessFileFileFile.txt");
        writeToFile(file, "111111112222222222233333333333333444444444444444445555555555", 0);
        String s = readFromFile(file, 27,10);
        System.out.println(s);
    }

    public static void writeToFile(File file, String data, int position) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.seek(position);
        raf.write(data.getBytes());
        raf.close();
    }

    public static String readFromFile(File file, int position, int size) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        byte[] array = new byte[size];
        raf.seek(50);
        raf.read(array);

        StringBuilder sb = new StringBuilder();
        for (byte b : array){

        }
        return sb.toString();

    }
}
