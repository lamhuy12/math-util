/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy.util.test;

import huy.ulti.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HUYVU
 */
public class MathUtilityTest {

    @Test //kí hiệu ủa JUnit đưa ra, biến hàm ngay sau đây thành 
    //public static void main(), app có nhiều main()
    //F6 chạy main() mặc định, Shift-F6 là chạy main() ở @Test
    //đây lfa 1 trong những cách đặt tên cho hàm test, để test code chính
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(240, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //XANH CHỈ ĐJAT ĐỢC NẾU TẤT CẢ CÙNG XANH, HÀM Ý HÀM ĐÚNG HẾT TẤT CẢ
    //ĐỎ: CHỈ CẦN ÍT NHẤT 1 THẰNG ĐỎ, COI NHƯ ĐỎ TẤT CẢ
    //ý nghĩa: hàm đã đúng thì phải đúng hết, sai 1 cái hay vài cá
    //hàm không đáng tin
    
    
    public MathUtilityTest() {
        
    }
    //viết code để test code chinh (MathUlitily)
    //viết code dùng thư viện JUnit, NUnit, xUnit, Jasmine,.... để test
    //xem code chính chạy ổn không trước khi đêm qua bên QC/khách hàng trải nghiệm
    //và thư viện này cung cấp cái cơ chế báo đúng sai qua màu sắc xanh đỏ
    //mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expected và actual rồi kết
}
