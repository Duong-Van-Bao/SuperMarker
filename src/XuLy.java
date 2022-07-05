import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
       /*
        * Bước 1: Tạo biến ten, soLuong, donGia, thanhTien
        * Bước 2: In thông báo nhập ten
        * Bước 3: Cho người dùng nhập và gán vào ten
        * Bước 4: In ra thông báo nhập soLuong
        * Bước 5: Cho người dùng nhập và gán vào soLuong
        * Bước 6: In ra thông báo donGia
        * Bước 7: Cho người dùng nhập vào và gán vào donGia
        * Bước 8: Xét soLuong
        *         Nếu >= 100 -> 12%
        *         Nếu 50 - 100 -> giảm 8%
        *         Nếu < 50 -> soLuong * doGia
        * Bước 9: Xuất ra kết quả        
        * */
		
		final int QUOTE1 = 100;
		final int QUOTE2 = 50;
		final float GIFT_QUOTE1 = 0.88f;
		final float GIFT_QUOTE2 = 0.92f;

        String tenHang;
        int soLuong;
        float donGia;
        float thanhTien;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vui lòng nhập tên hàng: ");
        tenHang = scan.nextLine();
        
        System.out.println("Vui lòng nhập số lượng: ");
        soLuong = Integer.parseInt(scan.nextLine());
        
        System.out.println("Vui lòng nhập đơn giá: ");
        donGia = Float.parseFloat(scan.nextLine());
        
        //Bước 8 : xét số lượng
//        if(soLuong >= QUOTE1) {
//        	thanhTien = QUOTE1*donGia + (soLuong - QUOTE1) * donGia * GIFT_QUOTE1;
//        } else {
//        	if((soLuong < QUOTE1) && (soLuong > QUOTE2)) { //50 <= soLuong < 100
//        		thanhTien = QUOTE2*donGia + (soLuong - QUOTE2) * donGia * GIFT_QUOTE2;
//        	} else {
//        		thanhTien = soLuong * donGia;
//        	}
//        }
        
		if (soLuong >= QUOTE1) {
			thanhTien = QUOTE1 * donGia + (soLuong - QUOTE1) * donGia * GIFT_QUOTE1;
		} else if ((soLuong < QUOTE1) && (soLuong > QUOTE2)) {
			thanhTien = QUOTE2 * donGia + (soLuong - QUOTE2) * donGia * GIFT_QUOTE2;
		} else { // số lượng <= 50
			thanhTien = soLuong * donGia;
		}

		System.out.println(" Tên hàng: " + tenHang + "\t" + "Số lượng: " + soLuong + "\t Đơn giá: " + donGia
				+ "\t Thành Tiền: " + thanhTien);
	}
   
}
