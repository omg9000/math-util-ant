/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.omg.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    @Test(expected = Exception.class)  
    //Vietsub: Khi chạy hàm này, kiểm tra giùm xem có 1 ngoại lệ thuộc nhóm/class IllegalArgumentException có xuất hiện hay không
    //Nó xuất hiện bằng cách nó được new IllegalArgumentException ở đâu đó
    //Nếu có xuất hiện, mừng quá, đúng như thiết kế, màu XANH
    //KÌ VỌNG EXCEPTION XUẤT HIỆN, DÙ NÓ LÀ EXCEPTION, VÀ NÓ XUẤT HIỆN THẬT, MÀU XANH
           //Hàm getF() được thiết kế trả về 1 con long nếu n đưa vào 0..20
           //Hàm getF() được thiết kế NÉM RA EXCEPTION NẾU TA ĐƯA VÀO N<0 || N>20
           //Tức là nếu gọi getF(-5) thì CHỖ GỌI SẼ NHẬN VỀ EXCEPTION TÊN LÀ IllegalArgumentException
           //Đưa cà chớn, nhận ngoại lệ!!
           //Bắt xem hàm mình có đúng ném ném ngoại lệ hay không nếu data cà chớn
           //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    
    @Test     //tên hàm test bao hàm luôn ý nghĩa test cái gì
              //quy ước dân kiểm thử
              //hàm này t muốn test hàm giai thừa khi đưa tham số đúng
              //hàm phải trả về đúng
              //viết code phải theo quy tắc - CODING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell2(){
        //Test case #4: n = 3; 3! expected = 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: n = 4; 3! expected = 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6: n = 5; 5! expected = 120
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        
        //Test case #7: n = 6; 6! expected = 720
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }
    
    @Test
    public void tryJUnitFirst(){
        Assert.assertEquals(69, 69);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        //Test case #1: Kiểm thử tình huống 01 coi có đúng không?
        //n = 0, hi vọng hàm trả về expected = 1; actual thực tế
        //hàm chạy trả ra mấy, đoán xem???
        long expected = 1;
        long actual = MathUtil.getFactorial(0);  //gọi hàm để xem actual là mấy
        //so sánh 2 giá trị coi tương đồng không? có đúng, không bug
        //so sánh = sout() và dùng mắt để luận kết quả, XƯA RỒI
        //chơi màn mới ngầu
        Assert.assertEquals(expected, actual);
        
        //Test case #2: Kiểm thử tình huống 01 coi có đúng không?
        //n = 1, hi vọng hàm trả về expected = 1; actual thực tế
        //hàm chạy trả ra mấy, đoán xem???
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        //Test case #3: n = 2; 2! expected = 2?
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
}

/*
CLASS NÀY TA VIẾT CÁC ĐOẠN CODE NHƯ BÌNH THƯỜNG
NHƯNG CODE NÀY DÙNG ĐỂ TEST CODE CHÍNH BÊN MATHUTIL
VIETS CODE ĐỂ TEST CODE CHÍNH, THÌ CÁI ĐOẠN CODE TEST NÀY ĐƯỢC GỌI TÊN LÀ TEST SCRIPT
Những đoạn code này sẽ gọi các hàm bên code chính, so sánh giá trị trả về của hàm chính cần test với giá trị kì vọng
Những đoạn code này/test script này sẽ PHẢI BAO GỒM CÁC TEST CASE BÊN TRONG
TEST SCRIPT CHỨA CÁC TEST CÁE
TRONG TEST SCRIPT/CLASS NÀY SẼ CÓ TEST 5! 6! 7! -> TEST CASE

@Test @ được gọi là ANNOTATION, kí hiệu, flag, để đánh dấu đoạn code mang 1 ý nghĩa nào dó. 
Và khi biên dịch/compile code thì thư viện đi kèm nó sẽ tự động generate thêm code cho mình tùy theo @
VÍ DỤ: @Test thì thư viện JUnit này import nó sẽ ngầm ngầm tự generate
Hàm này thàn public static void main() và gửi main() cho JVM
Kĩ thuật dùng thư viện, bị ép phải theo cú pháp của nó qua những @, thư viện gọi là framwork

FRAMEWORK: là thư viện, những file .jar .dll, xài class theo trình tự định sẵn, bị bộ framework điều khiển luồng code
generate dàn khung(chưa kịp)

Thư viện - library, những file .jar .dll chứa 1 đống class bên trong, ta thoải mái dùng hàm của nó theo cách của ta

QUY TẮC CHƠI XANH ĐỎ
XANH: Khi tất cả các test case đều xanh, tức là tất cả EXPECTED phải = ACTUAL
ĐỎ: Chỉ cần có 1 test case màu đỏ, xem như hàm toang sạch
Chỉ cần 1 expected != actual, xem như bỏ đi hết các test case, 1 thằng gây sai cho tất cả
LÍ DO: Hàm đã đúng thì phải đúng hết cho các case đã được nêu ra, chỉ cần 1 sự không = nhau của actual với expected
hàm ko ổn định về kết quả trả về => SAI

Ko thể test hết các case (NL2) nhưng đã test case nào thì phải ngon xanh case đó

Nói thêm về màu ĐỎ:
Đỏ xảy ra khi: có 1 sự không bằng nhau của expected với actual
Lý do gì expected != actual
Có 2 lí do
LD1: Expected đúng, mình tính bên ngoài bằng tay khi chưa có hàm
Actual sai, tình huống này hàm cùi bắp, BUG BUG
LD2: Expected sai, vứt luôn test case này đi, anh chàng QC/DEV bị ngáo
Kì vọng mà sai, hi vọng gì ở actual

DDT - Data Driven Testing
Tách bộ dât kiếm thử ra 1 chỗ
Lát hồi nhồi/nạp/fill/điền/feed data này tuần tự vào chỗ kiểm thử
VÍ DỤ: Tách data đã kiểm thử trên thành
1   0
1   1
2   2
6   3
24  4
120 5
720 6
Assert.assertEquals(2, MathUtil.getFactorial(2));
Thay vì lệnh so sánh, gọi viết cho từng case, ta biến lệnh này trở thanh tổng quát
không điền data cụ thể, mà sẽ lấy từ đâu đó
Assert.assertEquals(???, MathUtil.getFactorial(???));
??? này sẽ lấy từ tập data ở trên!!!
Code gọn hơn, dẹp hơn, dễ bảo trì hơn, kiểm soát được đủ thiếu các case
Kĩ thuật tách code test ra khỏi data của nó, lát hồi fill lại sau
được gọi là     KĨ THUẬT TEST CASE THEO KIỂU THAM SỐ HÓA PARAMETERIZED
HOẶC CÒN GỌI LÀ                                          DDT - DATA DRIVEN TESTING
VIẾT KIỂM THỬ HƯỚNG VỀ TÁCH DATA RIÊNG RA
*/
