package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShiftCipherTest {

    @Test
    void testTC01_UpperCaseStandard() {
        // TC01: SOFTWARE -> ZVMADHYL
        assertEquals("ZVMADHYL", ShiftCipher.encrypt("SOFTWARE", 3));
    }

    @Test
    void testTC02_LowerCaseStandard() {
        // TC02: software -> zvmadhyl
        assertEquals("zvmadhyl", ShiftCipher.encrypt("software", 3));
    }

    @Test
    void testTC03_PositiveCaseWithNumbers() {
        // TC03: Sqa2026 -> Zxh2026 (ตัวอักษรเลื่อน ตัวเลขคงเดิม)
        assertEquals("Zxh2026", ShiftCipher.encrypt("Sqa2026", 3));
    }

    @Test
    void testTC04_NegativeCaseWithSpecialChars() {
        // TC04: SQA #1 -> ZXH #1 (ช่องว่างและเครื่องหมาย # คงเดิม)
        assertEquals("ZXH #1", ShiftCipher.encrypt("SQA #1", 3));
    }
}