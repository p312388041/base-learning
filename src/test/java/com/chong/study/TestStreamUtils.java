package com.chong.study;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.chong.study.application.Constans;
import com.chong.study.pojo.Student;
import com.chong.study.utils.StreamUtils;

public class TestStreamUtils {
    @Test
    public void test1() throws IOException {
        StreamUtils.writeFileString(Constans.FILE_PATH, "hello world");
    }

    @Test
    public void test2() throws IOException {
        System.out.println(StreamUtils.readFileString(Constans.FILE_PATH, 5));
    }

    @Test
    public void test3() throws IOException {
        StreamUtils.writeMemoryString(Constans.FILE_PATH, "append data");
    }

    @Test
    public void test4() throws IOException {
        System.out.println(StreamUtils.readMemoryString(Constans.FILE_PATH));
    }

    @Test
    public void test5() throws IOException {
        StreamUtils.writeObjectToFile(Constans.FILE_PATH);
    }

    @Test
    public void test6() throws IOException, ClassNotFoundException {
        Student student = StreamUtils.readObjectFromFile(Constans.FILE_PATH);
        System.out.println(student.getName());
    }

    @Test
    public void test7() throws IOException, ClassNotFoundException {
        StreamUtils.print(Constans.FILE_PATH); 
    }

    @Test
    public void test8() throws IOException, ClassNotFoundException {
        StreamUtils.printStream(Constans.FILE_PATH); 
    }

    @Test
    public void test9() throws IOException, ClassNotFoundException {
        StreamUtils.pushBackReader(Constans.FILE_PATH); 
    }

    @Test
    public void test10() throws IOException, ClassNotFoundException {
        StreamUtils.writeLongToFile(Constans.FILE_PATH);
    }

    @Test
    public void test11() throws IOException, ClassNotFoundException {
        System.out.println(StreamUtils.readLongToFile(Constans.FILE_PATH));
    }
}
