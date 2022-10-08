/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.omg.mathutil.core;

/**
 *
 * @author Admin
 */
//ta sẽ clone bộ thư viện/công cụ Math util của JDK
//giả lập các hàm của class Math của JDK
//Những gì mà là công cụ dùng cho người khác, hàm khác, class khác thì thường sẽ được
//thiết kế là STATIC
//STATIC LÀ CHẤM TRỰC TIẾP QUA TÊN CLASS, ÉO CÓ NEW
public class MathUtil {
    public static final double PI = 3.141592653589793;
    
    //Hàm tính n!=1.2.3...n
    //Quy ước:
    //ko có giai thừa số âm
    //0! = 1! = 1
    //21! vượt 18 số 0, vượt kiểu long
    //hàm chúng ta design là: chỉ chấp nhận tính giai thừa của n từ 0..20
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if(n == 0 || n == 1)
            return 1;
        //sống sót đến đây, sure n từ 2..20
        long product = 1; //biến con heo đất, nhân tích lũy //acc = accumulative, góp dẫn
        for (int i = 2; i <= n; i++)
            product *= i;
        return product;
    }
}

//KĨ THUẬT LẬP TRÌNH KIỂU MỚI (VẪN GIỮ NGUYÊN NHỮNG KIẾN THỨC LẬP TRÌNH ĐÃ CÓ)
//PLUGIN CHO TRÌNH ĐỘ CỦA DEV - VIETS CODE CHÚ Ý LUÔN/CAM KẾT CODE CÓ CHẤT LƯỢNG
//CHẤT LƯỢNG KO NÓI = MIỆNG, CHẤT LƯỢNG NÓI = CODE
//KĨ THUẬT TĐ = TEST DRIVEN DEVELOPMENT
//VIẾT CODE VÀ VIẾT CODE ĐỂ TEST SONG SONG VỚI NHAU
//MỖI HÀM DEVELOPER VIẾT RA PHẢI VIẾT NGAY CÁI TEST CASE, PHẢI VIẾT NGAY HÀNH ĐỘNG KIỂM THỬ HÀM
//KIỂM THỬ HÀM, DỂ BIẾT RẰNG HÀM VỪA VIẾT CHẠY SAI HAY ĐÚNG