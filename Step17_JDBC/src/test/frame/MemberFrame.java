package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDTO;

public class MemberFrame extends JFrame implements ActionListener{
	JTextField inputName, inputAddr;
	DefaultTableModel model;
	JTable table;
	
	// Constructor
	public MemberFrame(String title){
		super(title);
		
		// Layout Setting (BorderLayout) 
		setLayout(new BorderLayout());
		// 2 JLabel
		JLabel label1 = new JLabel("NAME");
		JLabel label2 = new JLabel("ADDR");
		// 1 JTextField
		inputName = new JTextField(10);
		inputAddr = new JTextField(10);
		// JButton
		JButton addBtn = new JButton("ADD");
		JButton deleteBtn = new JButton("DELETE");
		
		// Panel UI
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);
		
		// Set Panel's Color
		panel.setBackground(Color.ORANGE);
		// Set Panel to North
		add(panel, BorderLayout.NORTH);
		
		// 버튼에 ActionListener 등록
		addBtn.addActionListener(this); // this 는 MemberFrame 객체
//		 class MemeberFrame extends JFrame{} (x) -> implements ActionListener
//		 어? 이제 너(this)는 ActionListener 가 맞네 
		deleteBtn.addActionListener(this);
		// 버튼에 액션 command 설정 
		addBtn.setActionCommand("add");
		deleteBtn.setActionCommand("delete");
//		(버튼이 두 개 이상일 경우 어떤 버튼을 누른건지 구분해줘야 한다.)
		
		
		// 회원 목록을 출력할 테이블
		table = new JTable();
		String[] colNames = {"NUMBER","NAME","ADDR"};
		// 테이블에 연결할 모델 객체
		model = new DefaultTableModel();
		model.setColumnIdentifiers(colNames);
//		model.setRowCount(0);
		//모델을 테이블에 연결
		table.setModel(model);
		//스크롤이 가능하도록 테이블을 JSCrollPane 에 감싼다.
		JScrollPane scroll = new JScrollPane(table);
		// JScrollPane 을 프레임 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);
		
		
//		프레임이 만들어지는 시점에 DB 에 있는 내용을 읽어와서 출력
//		시점도 중요하게 생각해야 한다!
		printMemebr();
		
		// 칼럼의 제목 글자 조정
		table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 18)); // 테이블 헤더 글자 크기
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16)); // 데이터 글자 크기
		table.setRowHeight(25); // 행 높이
		
		
	}// Constructor
	
	public static void main(String[] args) {
		MemberFrame f = new MemberFrame("회원정보 관리");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);	//EXIT_ON_CLOSE 는 부모가 가지고 있는 필드 / JFrame.EXIT_ON_CLOSE 라고 써도 되지만 부모자식 사이에는 생략가능
		f.setBounds(1000, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 눌러진 버튼의 action command 를 읽어온다.
		String command = e.getActionCommand();
		// action command 를 이용해서 분기한다.
		if(command.equals("add")) {	// java 에서는 문자열 비교를 .equals() 메소드를 이용해서 비교해야 한다.
			
//			System.out.println("Click Btn!");
			// 입력한 이름과 주소를 읽어온다.
			String name = inputName.getText();
			String addr = inputAddr.getText();
//			 inputName 과 inputAddr 은 필드이기 때문에 또 해당 텍스트 박스의 참조값이 들어있기 때문에 사용 가능하다
//			 this.inputName / this.inputAddr 라고 써도 되지만 this. 생략 (뭐가 생략되어있는지는 알고 있어야 한다.)
			
			// 입력한 이름과 주소를 MemeberDto 객체에 담든다.
			MemberDTO dto = new MemberDTO();
			dto.setName(name);
			dto.setAddr(addr);
			// MemberDao 객체를 생성해서
			MemberDao dao = new MemberDao();
			// insert 메소드를 이용해서 회원 정보를 DB 에 저장한다.
			dao.insert(dto);
			
		}else if(command.equals("delete")) {
//			new MemberDao().delete()
			// 선택된 JTable Row 가 있다면 번몇째 row 가 선택되어 있는지를 읽어와서
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제하시려면 row 를 선택해야 합니다.");
				return; // 메소드를 여기서 끝내기
			}
			
			// 삭제할 회원의 번호 (primary Key)
			int num = (int)model.getValueAt(selectedRow, 0);
			// 해당 메소드는 Object 타입을 반환하기 때문에 타입 캐스팅이 필요하다.
			new MemberDao().delete(num);
			
		}
		
		printMemebr();
		
	}
	
	// 회원 목록을 JTable 에 출력하는 메소드
	public void printMemebr() {
		
		// 기존에 출력된 내용을 초기화 한 후에
		model.setRowCount(0);
		
		// 테이블에 출력할 회원 목록 얻어오기
		List<MemberDTO> list = new MemberDao().getList();
		// 반복문 돌면서
		for(MemberDTO tmp:list) {
			// MemberDto 객체에 담긴 회원 정보를 이용해서 Object[] 에 담은 다음
			Object[] rowData = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			// 테이블에 연결된 모델에 추가하기
			model.addRow(rowData);
		}
	}
	
}