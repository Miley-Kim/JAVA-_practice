
public class EscapeSequences {

	public static void main(String[] args) {
		
		       System.out.println("AB"+'\b'+'c');  // \백스페이스 문자 -> ABc가 출력 되어야함_아래 출력된 것은 이클립스 오류임
		       System.out.println("AB"+'\t'+'c');  // \t 출력 시 탭만큼 띄움
		       System.out.println("AB"+'\n'+'c');  // \n 출력 시 줄바꿈(라인피드)_*****개 행 *****
		       System.out.println("AB"+'\r'+'c');  // \r 출력 시 캐리지 리턴 -> CB가 출력 되어야함_아래 출력된 것은 이클립스 오류임
	
	} 
}
      

