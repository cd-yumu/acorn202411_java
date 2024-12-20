package test.mypac;

//anotatione - @ 로 시작하는 표시 (어노테이션이라고 한다)
@FunctionalInterface	// 추상 메소드를 1개만 만들도록 강제하는 역할( ()->{} 형태로 사용할 수 있도록 보장)
public interface Calc {
	// 어떤 연산을 할지는 개발자가 알아서 정하기
	public double execute(double num1, double num2);
//	public void test(); 메소드를 하나 더 만들면 컴파일 자체가 안 된다. (강제) (보장)
}
