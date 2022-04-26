package day27_20220425_3;

import java.util.Scanner;

public class MembershipMain {

	public static void main(String[] args) {
		Membership member1 = new Membership();
		member1.membershipNum = 1234L;
		member1.memberid = "mozzi";
		member1.memberpw = "1004";
		member1.membername = "김모찌";
		member1.memberphoneNum = "010-7777-7777";
		member1.memberage = 4;
		member1.findById();

		Membership member2 = new Membership();
		member2.save(1227L,"kjs","8086","김진서","010-7224-8086",28);

		Membership member3 = new Membership(5678L,"id3","pw3","홍길동","010-3333-3333",10);
		member3.findById();
		
		member2.findById();

		member1.update("010-1004-1004");
	
		// 스캐너없이 매개변수로 로그인 성공 여부 확인
		member1.memberLogin2("mozzi","1004");
		member2.memberLogin2("kjs1","1004");
		
		// 스캐너로 아이디,비밀번호 입력 후 로그인 성공 여부 확인
		Scanner scan =new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberid = scan.nextLine();
		System.out.print("비밀번호 : ");
		String memberpw = scan.nextLine();
		boolean memberLogin = member1.memberLogin(memberid, memberpw);
		if(memberLogin) {
			System.out.println("로그인 성공");
		} else{
			System.out.println("로그인 실패");
		}
		
		
	}
}
