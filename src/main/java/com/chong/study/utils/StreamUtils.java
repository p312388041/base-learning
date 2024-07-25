package com.chong.study.utils;

import java.io.FileWriter;
import java.io.IOException;

public class StreamUtils {
    public static void writeFileString(String filePath, String content) throws IOException {
        //追加模式
        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write(content);
        fileWriter.close();
    }
}
