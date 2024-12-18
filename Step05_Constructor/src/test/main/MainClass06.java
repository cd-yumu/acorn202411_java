package test.main;

import javax.swing.JFrame;

public class MainClass06 {

	public static void main(String[] args) {

		JFrame f = new JFrame("My Frame");
		// .setBounds(x, y, width, height)
		f.setBounds(100,100,500,500);
		// 창의 닫기 버튼을 눌렀을 때 프로세스가 종료되도록(app 이 종료 되도록)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면에 보이도록 한다.
		f.setVisible(true);

//		public class JFrame{
//			public static final int EXIT_ON_CLOSE = 3;
//			*의미 없는 숫자 3에 이름을 부여하는 것과 같다.
//		}
		
	}

}
