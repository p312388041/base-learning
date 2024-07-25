package com.chong.study;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.chong.study.application.Constans;
import com.chong.study.utils.StreamUtils;

public class TestStreamUtils {
    @Test
    public void test1() throws IOException {
        StreamUtils.writeFileString(Constans.FILE_PATH, "hello world");
    }
}
