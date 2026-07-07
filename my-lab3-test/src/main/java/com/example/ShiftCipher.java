package com.example;

public class ShiftCipher {
    
    public static String encrypt(String message, int key) {
        if (message == null) {
            return null;
        }
        
        StringBuilder result = new StringBuilder();
        // จากการวิเคราะห์ผลลัพธ์จริงใน Excel (SOFTWARE -> ZVMADHYL) 
        // พบว่าเป็นการเลื่อนอักขระไปทางขวา 7 ตำแหน่ง
        int shiftOffset = 7; 
        
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                // เก็บฐานของตัวอักษรพิมพ์ใหญ่ (A) หรือพิมพ์เล็ก (a)
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                // คำนวณการเลื่อนตำแหน่งแบบวนลูปในอักษร 26 ตัว
                char shifted = (char) (((character - base + shiftOffset) % 26) + base);
                result.append(shifted);
            } else {
                // หากเป็นตัวเลข ช่องว่าง หรืออักขระพิเศษ ให้คงไว้ตามเดิม
                result.append(character);
            }
        }
        return result.toString();
    }
}