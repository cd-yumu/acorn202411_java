package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Date;
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

import dao.FoodDao;
import dto.FoodDto;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class MainClass extends JFrame implements ActionListener, PropertyChangeListener{
	
	// 필드 영역
	JTextField inputCategory;
	JTextField inputMenu;
	JTextField inputPrice;
	JTextField inputReview;
	JTextField inputSelect;
	UtilDateModel dmodel;
	JTable table;
	DefaultTableModel model;
	
	

	//Constructor
	public MainClass(){
		//프레임 기본 셋팅
		setTitle("학원 와서 먹은거 기록");
		setBounds(1000,100,950,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//레이아웃 설정
		setLayout(new BorderLayout());
		
		
		
		//패널 설정
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setPreferredSize(new Dimension(950,100));
		add(panel, BorderLayout.NORTH);
		
		

		//라벨 설정
		JLabel dateLabel = new JLabel("날짜: ");
		JLabel categoryLabel = new JLabel("구분: ");
		JLabel menuLabel = new JLabel("메뉴: ");
		JLabel priceLabel = new JLabel("가격: ");
		JLabel reviewLabel = new JLabel("후기: ");
		JLabel selectLabel = new JLabel("ID: ");
		
		//텍스트필드 설정
		inputCategory = new JTextField(10);
		inputMenu = new JTextField(10);
		inputPrice = new JTextField(10);
		inputReview = new JTextField(10);
		inputSelect = new JTextField(10);
		
		//날짜필드 설정
		dmodel = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(dmodel);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		
		
		//버튼 설정
		JButton addBtn = new JButton("추가");
		JButton deleteBtn = new JButton("삭제");
//		JButton updateBtn = new JButton("수정(X)");
		JButton selectBtn = new JButton("조회");
		addBtn.setActionCommand("add");
		deleteBtn.setActionCommand("delete");
//		updateBtn.setActionCommand("update");
		selectBtn.setActionCommand("select");
		addBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
//		updateBtn.addActionListener(this);
		selectBtn.addActionListener(this);
		
		//패널에 추가
		
		panel.add(dateLabel);
//		panel.add(inputDate);
		panel.add(datePicker);
		panel.add(categoryLabel);
		panel.add(inputCategory);
		panel.add(menuLabel);
		panel.add(inputMenu);
		panel.add(priceLabel);
		panel.add(inputPrice);
		panel.add(reviewLabel);
		panel.add(inputReview);
		panel.add(addBtn);
		panel.add(deleteBtn);
//		panel.add(updateBtn);
		panel.add(selectLabel);
		panel.add(inputSelect);
		panel.add(selectBtn);
		
		
		//테이블 설정
		// 1. 테이블과 테이블 모델 객체 생성
		table = new JTable();
		
		// 2. 표 헤더 추가하기 - 테이블 모델에 추가
		String[] colNames = {"ID", "등록일", "구분", "메뉴","가격", "평가"}; 
		
		model = new DefaultTableModel(colNames,0) {
//			Cell 이 수정 돼도 되는지 확인해서 리턴
			@Override
			public boolean isCellEditable(int row, int column) {
				if(column==0) return false;  // 1열 ID 는 수정 불가하게 만들기
				else return true;	// 그 외에는 수정 가능!
			}	
		};

		
		model.setColumnIdentifiers(colNames);
		// 3. 테이블과 테이블 모델 연결 해주기
		table.setModel(model);
		// 4. 스크롤 기능 추가 - 테이블에 달아준다.
		add(new JScrollPane(table), BorderLayout.CENTER);
		// 5. 표 내용 - 테이블 모델에 추가
		printDatas();
		
		//테이블에 값이 바뀌었는지 감시할 리스너 등록
		table.addPropertyChangeListener(this);
		
		setVisible(true);
	}
	
	
//	Cell 이 변했는지 동작 감지 및 변했을 경우 동작할 것 코딩 
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("property change!");
		System.out.println("property name:"+evt.getPropertyName());
		System.out.println("isEditing:"+table.isEditing());
		/*
		 *  property name 이 "tableCellEditor" 이고
		 *  table 이 수정중이 아닐때 
		 *  현재 포커스가 있는 곳의 정보를 모두 읽어와서 DB 에 수정반영하기 
		 */
		if(evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()) {
			//현재 포커스가 있는 row 의 정보를 DB 에 수정 반영 한다. 
			//변화된 값을 읽어와서 DB 에 반영한다. 
			//수정된 칼럼에 있는 row  전체의 값을 읽어온다. 
			int selectedIndex=table.getSelectedRow();
			int id=(int)model.getValueAt(selectedIndex, 0);
			String regdate = (String)model.getValueAt(selectedIndex, 1);
			String category = (String)model.getValueAt(selectedIndex, 2);
			String menu = (String)model.getValueAt(selectedIndex, 3);
			int price = (int)model.getValueAt(selectedIndex, 4);
			String review = (String)model.getValueAt(selectedIndex, 5);
			System.out.println("regdate: " + regdate);
			
			//수정할 회원의 정보를 MemberDto 객체에 담고 
//			FoodDto dto=new FoodDto(id,regdate,category,menu,price,review);
			FoodDto dto = new FoodDto();
			dto.setId(id);
			dto.setRegdate(regdate);
			dto.setCategory(category);
			dto.setMenu(menu);
			dto.setPrice(price);
			dto.setReview(review);
			
			//DB에 저장하기 
			new FoodDao().update(dto);
			//선택된 포커스 clear
			table.clearSelection();
		}
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		// 혹시 switch 되나??? 일단 배운대로 하자
		
		if(command.equals("add")) {
			FoodDto dto = new FoodDto();
			
			
			// -------------데이터 타입의 난관
			// 오류 보류 : 날짜 저장 시 분명 2024 년도로 저장되는데 3924로 저장되는 문제
			

			System.out.println(String.format("얻어진 날짜: %d-%d-%d", dmodel.getYear(), dmodel.getMonth()+1, dmodel.getDay()));
			dto.setRegdate(String.format("%d-%d-%d", dmodel.getYear(), dmodel.getMonth()+1, dmodel.getDay()));
			dto.setCategory(inputCategory.getText());
			
			// 오류!! : 메뉴 입력 안 하면 insert 안 하고 싶은데 왜 됨?
			String menu = inputMenu.getText();
			//menu == "" || menu == null
			if(menu.isBlank() || menu.isEmpty()) {
				JOptionPane.showMessageDialog(this, "메뉴를 입력하세요");
				return;
			}
			dto.setMenu(menu);
			
			int price = 0;
			try {
				price = Integer.parseInt(inputPrice.getText());
			} catch(NumberFormatException err) {
				System.out.println("값은 0원으로 처리됩니다.");
			}
			dto.setPrice(price);
			dto.setReview(inputReview.getText());
	
			new FoodDao().insert(dto);
			System.out.println("데이터 삽입 완료");
			printDatas();
			System.out.println("데이터 로딩 완료");
			
			
			
		} else if(command.equals("delete")){
			
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제하려면 Row 를 선택하세요");
				return;
			}
			
			int id = (int)model.getValueAt(selectedRow, 0);
			new FoodDao().delete(id);
			System.out.println("데이터 삭제 완료");
			
			printDatas();
			System.out.println("데이터 로딩 완료");
			
			
		} else if(command.equals("update")) {
			
			
		} else if(command.equals("select")) {
			int id = 0;
			try {
				id = Integer.parseInt(inputSelect.getText());
				printData(new FoodDao().getData(id)); 
			} catch (NullPointerException err) {
				JOptionPane.showMessageDialog(this, id + "번은 없는 ID 입니다.");
				printDatas();
			} catch (NumberFormatException err) {
				JOptionPane.showMessageDialog(this, "숫자 형식의 ID 를 입력해주세요");
			}
			System.out.println("데이터 조회 완료");
			
		}
		
		
	}
	
	public void printData(FoodDto dto) {
		model.setRowCount(0);
		Object[] rowDaObject = {dto.getId(), dto.getCategory(), dto.getCategory(), dto.getMenu(), dto.getPrice(), dto.getReview()};
		model.addRow(rowDaObject);
		resetTextField();
	}
	
	
	public void printDatas() {
		model.setRowCount(0);
		List<FoodDto> list = new FoodDao().getList();
		for(FoodDto tmp:list) {
			Object[] rowData = {
				tmp.getId(),
				tmp.getRegdate(),
				tmp.getCategory(), 
				tmp.getMenu(), 
				tmp.getPrice(), 
				tmp.getReview()
			};
			model.addRow(rowData);
		}
		resetTextField();
	}
	
	public void resetTextField() {
		inputCategory.setText("");
		inputMenu.setText("");
		inputPrice.setText("");
		inputReview.setText("");
		inputSelect.setText("");

	}
	
	
	public static void main(String[] args) {
		new MainClass();
	}

	

}
