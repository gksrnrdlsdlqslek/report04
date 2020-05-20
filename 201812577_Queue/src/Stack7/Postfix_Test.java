package Stack7;

public class Postfix_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OptExp opt = new OptExp();
		int result;
		String exp = "35*62/-";
		System.out.printf("\n후위 표기식 : %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n 연산결과 = %d \n", result);

	}

}