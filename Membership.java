package day27_20220425_3;

public class Membership {
	
	//필드값 : 회원번호, 아이디, 비밀번호, 이름, 전화번호, 나이 
	long membershipNum = 0;
	String memberid = "";
	String memberpw = "";
	String membername = "";
	String memberphoneNum = "";
	int memberage = 0;
	
	// 기본 생성자
	Membership(){
		
	}

	// 모든 필드를 매개변수로 하는 생성자
	Membership(long membershipNum, String memberid, String memberpw, String membername, String memberphoneNum, int memberage){
		this.membershipNum = membershipNum;
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
		this.memberphoneNum = memberphoneNum;
		this.memberage = memberage;
	}
	
	// 회원가입(save)
	void save(long membershipNum, String memberid, String memberpw, String membername, String memberphoneNum, int memberage){
		this.membershipNum = membershipNum;
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
		this.memberphoneNum = memberphoneNum;
		this.memberage = memberage;
	}
	
	/*
    로그인 메서드를 호출할 때 가입시 입력한 아이디, 비밀번호를 매개변수로 전달하고 boolean 리턴을 받아서 로그인 성공, 실패 여부를 출력함.
	리턴타입 : boolean
	매개변수 : String 2개
	*/
	
	boolean memberLogin(String memberid, String memberpw) {
		boolean result = false;
		if(this.memberid.equals(memberid) && this.memberpw.equals(memberpw)){
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	
	void memberLogin2(String memberid, String memberpw) {
		if(this.memberid.equals(memberid) && this.memberpw.equals(memberpw)){
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
	
	
	
	/*
	3. 회원조회(findById)
    1. 해당 객체의 회원조회 메서드를 호출하면 해당 회원의 전체 정보를 출력함.
    */
	
	void findById() {
		System.out.println(this.membershipNum);
		System.out.println(this.memberid);
		System.out.println(this.memberpw);
		System.out.println(this.membername);
		System.out.println(this.memberphoneNum);
		System.out.println(this.memberage);
	}
	
	/*
	정보수정(update)
    1. 정보수정은 전화번호만 된다고 가정하고
    2. 정보수정 메서드 호출시 변경하고자 하는 전화번호를 매개변수로 넘겨서 해당 필드값을 변경하도록 한다.
    3. 변경 후 회원조회 메서드를 호출하여 값이 변경됐는지 확인함.\
	*/
	
	void update(String memberphoneNum) {
		this.memberphoneNum = memberphoneNum;
		findById();
	}
	
	
}
