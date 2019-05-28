package com.mac.algorithms.codility;

import com.mac.algorithms.codility.iterations.BinaryGap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryGapTest {

    BinaryGap binaryGap;

    @BeforeEach
    void init() {
        binaryGap = new BinaryGap();
    }

    @Test
    public void testMethid(){
        int result = binaryGap.solution(1041);
        Assertions.assertEquals(5, result);
    }

}