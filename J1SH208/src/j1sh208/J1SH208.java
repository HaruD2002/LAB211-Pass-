/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh208;

/**
 *
 * @author Admin
 */
public class J1SH208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
        System.out.println(swapDigitPairs(123));
        
    }
    
         
    public static int swapDigitPairs(int n) {
    int result = 0;// int chua ket qua
    int m = 1; 
    //--1234 -- > d1 = 4 d2 --> 123%10 3 result =43  --
    while(n > 0) { // khi n > 0 giá trị thực hiện lệnh dưới 
        int d1 = n % 10;   //tính modulo của n tìm ra phần thử cuối cùng của chuỗi số nhập vào 
        n /= 10; //giá trị của n/10 
        
        if(n == 0) { // khi mà giá trị của n được tính bằng 0 thì result = result + m* d1(có giá trị là 0) => result
            result += m * d1;
            break;
          }
        
        int d2 = n % 10;  //tìm giá trị cuối cùng của dãy số sau khi tính modulo trên
        result = result + m * 10 * d1 + m * d2; //tiến hành hoán đổi 2 số vừa tìm được ở hàng chục,chăm ,nghìn
        n /= 10; //giảm giá trị của n và sử dụng n 
        m *= 100;//nhân giá trị lên để tiến hành hoán đỏi các hàng số khác
        
        // vòng lập tiếp tục lập lại đến khi giá trị n cuối cùng = 0 thì sẽ thoát ra khỏi vòng lập và trả về kết quả 
        
    }       
    return result;
}   
}
