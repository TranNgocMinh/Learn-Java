public static void main(String[] args) {
// TODO Auto-generated method stub
	int so_bi_chia;// số bị chia 
	int so_chia;// số chia
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap so bi chia: ");
	so_bi_chia = Integer.parseInt(scanner.nextLine());
	System.out.println("Nhap so chia: ");
	so_chia = Integer.parseInt(scanner.nextLine());
	try {
		System.out.println(so_bi_chia + " / " + so_chia + 
 			" = " + (so_bi_chia / so_chia) + " So du là: " + 
 		(so_bi_chia % so_chia));
	}catch(ArithmeticException e) {
			System.out.println("Khong the chia cho 0!");
	}finally {
			System.out.println("Ket thuc chuong trinh.");
	}
}
//Kết quả:
Nhap so bi chia: 3
Nhap so chia: 0
Khong the chia cho 0!
Ket thuc chuong trinh.
