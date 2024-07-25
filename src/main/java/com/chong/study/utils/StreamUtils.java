package com.chong.study.utils;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.PushbackReader;

import com.chong.study.pojo.Student;

public class StreamUtils {
    public static void writeFileString(String filePath, String content) throws IOException {
        // 追加模式
        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write(content);
        fileWriter.close();
    }

    public static String readFileString(String filePath, int size) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        char[] buffer = new char[size];
        fileReader.read(buffer);
        fileReader.close();
        return new String(buffer);
    }

    public static void writeMemoryString(String filePath, String content) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        for (int i = 0; i < 10; i++) {
            writer.write(content);
        }
        FileWriter fileWriter = new FileWriter(filePath);
        writer.writeTo(fileWriter);
        System.out.println(new String(writer.toCharArray()));
        fileWriter.close();
        writer.close();
    }

    public static String readMemoryString(String filePath) throws IOException {
        String content = "hello world";
        CharArrayReader reader = new CharArrayReader(content.toCharArray());
        // FileWriter writer = new FileWriter(filePath);
        // reader.transferTo(writer);
        char[] buffer = new char[3];
        reader.read(buffer);
        // writer.close();
        reader.close();
        return new String(buffer);
    }

    public static void writeObjectToFile(String filePath) throws FileNotFoundException, IOException {
        Student student = new Student(1, 11, "zhang san", 55);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
    }

    public static Student readObjectFromFile(String filePath) throws ClassNotFoundException, IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        Student student = (Student) objectInputStream.readObject();
        objectInputStream.close();
        return student;
    }

    public static void print(String filePath) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(filePath));
        printWriter.printf("hello , %s", "world");
        printWriter.close();
    }

    public static void printStream(String filePath) throws IOException {
        PrintStream printStream = new PrintStream(new FileOutputStream(filePath));
        printStream.printf("hello , %s", "world");
        System.out.println(printStream.charset().name());
        printStream.close();
    }

    public static void pushBackReader(String filePath) throws IOException {
        PushbackReader pushbackReader = new PushbackReader(new FileReader(filePath));
        int ch;
        while((ch =pushbackReader.read())!=-1){
            if((char)ch ==','){
                pushbackReader.unread('#');
            } else{
                System.out.print((char)ch);
            }
        }
        pushbackReader.close();
    }

    public static void writeLongToFile(String filePath) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath));
        dataOutputStream.writeLong(1111111);
        dataOutputStream.close();
    }

    public static long readLongToFile(String filePath) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath));
        long result = dataInputStream.readLong();
        dataInputStream.close();
        return result;
    }
}

