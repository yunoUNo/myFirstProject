import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Main {
	private JPanel curPanel2;
	private JFrame frame;
	private JTextField gradeInput;
	private JPanel currPanel = new JPanel();//현재 페널
	private JTextField subjectInput;
	private JTextField tfa1b1;
	private JTextField tfa1b2;
	private JTextField tfa2b2;
	private JTextField tfa2b1;
	private JTextField tfa3b1;
	private JTextField tfa3b2;
	private JTextField tfa1;
	private JTextField tfa2;
	private JTextField tfa3;
	private JTextField tfb1;
	private JTextField tfb2;
	private JTextField nameTf;
	private JTextField ageTf;
	private JTextField dataTf;
	private JTable table;
	private JTextField search;
	private JTable table_1;
	private JTextField textField;
	private JTextField tf1_2x2;
	private JTextField tf2_2x2;
	private JTextField tf3_2x2;
	private JTextField tf4_2x2;
	private JTextField tf5_2x2;
	private JTextField tf6_2x2;
	private JTextField tf7_2x2;
	private JTextField tf8_2x2;
	private JTextField txt1x2_3;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txt1x2_1;
	private JTextField txt1x2_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txta_4;
	private JTextField txta_3;
	private JTextField txta_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CsvSave cs = new CsvSave();
		DataSave dataSave = new DataSave();
		//패널 모음
		JPanel loginPanel = new JPanel();
		JPanel savedDataProcessPanel = new JPanel(); savedDataProcessPanel.setVisible(false);
		
		ButtonGroup btnG2 = new ButtonGroup();
		ButtonGroup btnG1 = new ButtonGroup();
		ButtonGroup btnG3 = new ButtonGroup();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1181, 905);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		currPanel = loginPanel;
		frame.getContentPane().setLayout(null);
		JPanel dataInputPanel = new JPanel();	
		dataInputPanel.setVisible(false);
		JPanel choosePanel = new JPanel();	
		choosePanel.setVisible(false);
		JPanel newDataProcessPanel = new JPanel();	
		newDataProcessPanel.setVisible(false);
		JPanel newDataPanel1 = new JPanel(); 
		newDataPanel1.setVisible(false);
		JPanel varTestPanel = new JPanel();
		varTestPanel.setBounds(76, 237, 293, 90);
		JPanel twoVariationPanel = new JPanel();
		twoVariationPanel.setBounds(76, 369, 293, 272);
		twoVariationPanel.setVisible(false);
		JPanel oneVariationPanel = new JPanel();
		oneVariationPanel.setBounds(76, 369, 293, 272);
		oneVariationPanel.setVisible(false);
		JComboBox levelCombo = new JComboBox();
		JLabel getSubjectLabel = new JLabel();
		
		newDataPanel1.setBounds(0, 0, 1167, 868);
		frame.getContentPane().add(newDataPanel1);
		newDataPanel1.setLayout(null);
		
		JPanel TablePanel_2x2 = new JPanel(); 
		TablePanel_2x2.setVisible(false);
		
		JPanel panel1x3 = new JPanel(); 
		panel1x3.setVisible(false);
		
		JPanel panel1x2 = new JPanel(); 
		panel1x2.setVisible(false);
		panel1x2.setBounds(393, 352, 694, 393);
		newDataPanel1.add(panel1x2);
		panel1x2.setLayout(null);
		
		txt1x2_3 = new JTextField();
		txt1x2_3.setText("\uCE21\uC815\uC8FC\uC81C");
		txt1x2_3.setBounds(39, 144, 139, 74);
		panel1x2.add(txt1x2_3);
		txt1x2_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("\uC778\uC6D0\uC218");
		textField_2.setBounds(179, 144, 139, 74);
		panel1x2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("\uC778\uC6D0\uC218");
		textField_3.setColumns(10);
		textField_3.setBounds(320, 144, 139, 74);
		panel1x2.add(textField_3);
		
		txt1x2_1 = new JTextField();
		txt1x2_1.setText("\uC218\uC900a1");
		txt1x2_1.setColumns(10);
		txt1x2_1.setBounds(179, 73, 139, 74);
		panel1x2.add(txt1x2_1);
		
		txt1x2_2 = new JTextField();
		txt1x2_2.setText("\uC218\uC900a2");
		txt1x2_2.setColumns(10);
		txt1x2_2.setBounds(320, 73, 139, 74);
		panel1x2.add(txt1x2_2);
		
		JButton btnDataSave1x2 = new JButton("\uC138\uBD80\uB370\uC774\uD130 \uC785\uB825--->");
		btnDataSave1x2.setBounds(178, 258, 235, 74);
		panel1x2.add(btnDataSave1x2);
		panel1x3.setBounds(390, 317, 612, 378);
		newDataPanel1.add(panel1x3);
		panel1x3.setLayout(null);
		btnDataSave1x2.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				levelCombo.removeAllItems();
				currPanel.setVisible(false);
				dataInputPanel.setVisible(true);
				currPanel=dataInputPanel;
				String a1 = txt1x2_1.getText();
				String a2 = txt1x2_2.getText();
				String a3 = txt1x2_3.getText();
				
				
				String subject = subjectInput.getText();
				getSubjectLabel.setText(subject);
				
				levelCombo.addItem(a3 +" x "+ a1);
				levelCombo.addItem(a3 +" x "+ a2);
				
			}
		});
		
		textField_4 = new JTextField();
		textField_4.setText("\uCE21\uC815\uC8FC\uC81C");
		textField_4.setBounds(40, 183, 125, 68);
		panel1x3.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("\uC778\uC6D0\uC218");
		textField_5.setColumns(10);
		textField_5.setBounds(166, 183, 125, 68);
		panel1x3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("\uC778\uC6D0\uC218");
		textField_6.setColumns(10);
		textField_6.setBounds(292, 183, 125, 68);
		panel1x3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("\uC778\uC6D0\uC218");
		textField_7.setColumns(10);
		textField_7.setBounds(416, 183, 125, 68);
		panel1x3.add(textField_7);
		
		txta_4 = new JTextField();
		txta_4.setText("\uC218\uC900a3");
		txta_4.setColumns(10);
		txta_4.setBounds(416, 118, 125, 68);
		panel1x3.add(txta_4);
		
		txta_3 = new JTextField();
		txta_3.setText("\uC218\uC900a2");
		txta_3.setColumns(10);
		txta_3.setBounds(292, 118, 125, 68);
		panel1x3.add(txta_3);
		
		txta_2 = new JTextField();
		txta_2.setText("\uC218\uC900a1");
		txta_2.setColumns(10);
		txta_2.setBounds(166, 118, 125, 68);
		panel1x3.add(txta_2);
		
		JButton btnDataSave1x3 = new JButton("\uC138\uBD80\uB370\uC774\uD130 \uC785\uB825\uD558\uAE30-->");
		btnDataSave1x3.setBounds(184, 298, 254, 70);
		panel1x3.add(btnDataSave1x3);
		TablePanel_2x2.setBounds(423, 324, 647, 407);
		newDataPanel1.add(TablePanel_2x2);
		TablePanel_2x2.setLayout(null);
		btnDataSave1x3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				levelCombo.removeAllItems();
				currPanel.setVisible(false);
				dataInputPanel.setVisible(true);
				currPanel=dataInputPanel;
				String a1 = txta_2.getText();
				String a2 = txta_3.getText();
				String a3 = txta_4.getText();
				String b1 = textField_4.getText();
				
				String subject = subjectInput.getText();
				getSubjectLabel.setText(subject);
				
				levelCombo.addItem(b1 +" x "+ a1);
				levelCombo.addItem(b1 +" x "+ a2);
				levelCombo.addItem(b1 +" x "+ a3);
				
			}
		});
		
		tf1_2x2 = new JTextField();
		tf1_2x2.setText("\uC218\uC9001");
		tf1_2x2.setBounds(156, 56, 135, 64);
		TablePanel_2x2.add(tf1_2x2);
		tf1_2x2.setColumns(10);
		
		tf2_2x2 = new JTextField();
		tf2_2x2.setText("\uC218\uC9002");
		tf2_2x2.setColumns(10);
		tf2_2x2.setBounds(292, 56, 135, 64);
		TablePanel_2x2.add(tf2_2x2);
		
		tf3_2x2 = new JTextField();
		tf3_2x2.setText("\uC218\uC9001");
		tf3_2x2.setColumns(10);
		tf3_2x2.setBounds(22, 119, 135, 64);
		TablePanel_2x2.add(tf3_2x2);
		
		tf4_2x2 = new JTextField();
		tf4_2x2.setText("\uC218\uC9002");
		tf4_2x2.setColumns(10);
		tf4_2x2.setBounds(22, 186, 135, 64);
		TablePanel_2x2.add(tf4_2x2);
		
		tf5_2x2 = new JTextField();
		tf5_2x2.setText("\uC778\uC6D0\uC785\uB825");
		tf5_2x2.setColumns(10);
		tf5_2x2.setBounds(156, 119, 135, 64);
		TablePanel_2x2.add(tf5_2x2);
		
		tf6_2x2 = new JTextField();
		tf6_2x2.setText("\uC778\uC6D0\uC785\uB825");
		tf6_2x2.setColumns(10);
		tf6_2x2.setBounds(292, 119, 135, 64);
		TablePanel_2x2.add(tf6_2x2);
		
		tf7_2x2 = new JTextField();
		tf7_2x2.setText("\uC778\uC6D0\uC785\uB825");
		tf7_2x2.setColumns(10);
		tf7_2x2.setBounds(156, 186, 135, 64);
		TablePanel_2x2.add(tf7_2x2);
		
		tf8_2x2 = new JTextField();
		tf8_2x2.setText("\uC778\uC6D0\uC785\uB825");
		tf8_2x2.setColumns(10);
		tf8_2x2.setBounds(292, 186, 135, 64);
		TablePanel_2x2.add(tf8_2x2);
		
		JButton btnSaveData2x2 = new JButton("세부 데이터 입력-->");
		btnSaveData2x2.setBounds(180, 301, 247, 64);
		TablePanel_2x2.add(btnSaveData2x2);
		btnSaveData2x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				levelCombo.removeAllItems();
				currPanel.setVisible(false);
				dataInputPanel.setVisible(true);
				currPanel=dataInputPanel;
				String a1 = tf1_2x2.getText();
				String a2 = tf2_2x2.getText();
				String b1 = tf3_2x2.getText();
				String b2 = tf4_2x2.getText();
				
				String subject = subjectInput.getText();
				getSubjectLabel.setText(subject);
				
				levelCombo.addItem(a1 +" x "+ b1);
				levelCombo.addItem(a2 +" x "+ b1);
				levelCombo.addItem(a1 +" x "+ b2);
				levelCombo.addItem(a2 +" x "+ b2);
			}
		});
		
		
		JPanel TablePanel2x3 = new JPanel();
		curPanel2 = TablePanel2x3;
		
		TablePanel2x3.setBounds(423, 369, 647, 348);
		newDataPanel1.add(TablePanel2x3);
		TablePanel2x3.setVisible(false);
		TablePanel2x3.setLayout(null);
		
		tfa3 = new JTextField();
		tfa3.setBounds(451, 34, 147, 77);
		TablePanel2x3.add(tfa3);
		tfa3.setText("\uC218\uC900a3");
		tfa3.setColumns(10);
		
		tfa3b1 = new JTextField();
		tfa3b1.setBounds(451, 111, 147, 77);
		TablePanel2x3.add(tfa3b1);
		tfa3b1.setText("\uC778\uC6D0\uC785\uB825\uD558\uC138\uC694");
		tfa3b1.setColumns(10);
		
		tfa3b2 = new JTextField();
		tfa3b2.setBounds(451, 185, 147, 77);
		TablePanel2x3.add(tfa3b2);
		tfa3b2.setText("\uC778\uC6D0\uC785\uB825\uD558\uC138\uC694");
		tfa3b2.setColumns(10);
		
		tfa2b2 = new JTextField();
		tfa2b2.setBounds(304, 185, 147, 77);
		TablePanel2x3.add(tfa2b2);
		tfa2b2.setText("\uC778\uC6D0\uC785\uB825\uD558\uC138\uC694");
		tfa2b2.setColumns(10);
		
		tfa2b1 = new JTextField();
		tfa2b1.setBounds(304, 111, 147, 77);
		TablePanel2x3.add(tfa2b1);
		tfa2b1.setText("\uC778\uC6D0\uC785\uB825\uD558\uC138\uC694");
		tfa2b1.setColumns(10);
		
		tfa2 = new JTextField();
		tfa2.setBounds(304, 34, 147, 77);
		TablePanel2x3.add(tfa2);
		tfa2.setText("\uC218\uC900a2");
		tfa2.setColumns(10);
		
		tfa1 = new JTextField();
		tfa1.setBounds(159, 34, 147, 77);
		TablePanel2x3.add(tfa1);
		tfa1.setText("\uC218\uC900a1");
		tfa1.setColumns(10);
		
		tfa1b2 = new JTextField();
		tfa1b2.setBounds(159, 185, 147, 77);
		TablePanel2x3.add(tfa1b2);
		tfa1b2.setText("\uC778\uC6D0\uC785\uB825\uD558\uC138\uC694");
		tfa1b2.setColumns(10);
		
		tfa1b1 = new JTextField();
		tfa1b1.setBounds(159, 111, 147, 77);
		TablePanel2x3.add(tfa1b1);
		tfa1b1.setText("\uC778\uC6D0\uC785\uB825\uD558\uC138\uC694");
		tfa1b1.setColumns(10);
		
		tfb1 = new JTextField();
		tfb1.setBounds(12, 111, 147, 77);
		TablePanel2x3.add(tfb1);
		tfb1.setText("\uC218\uC900b1");
		tfb1.setColumns(10);
	
		tfb2 = new JTextField();
		tfb2.setBounds(12, 185, 147, 77);
		TablePanel2x3.add(tfb2);
		tfb2.setText("\uC218\uC900b2");
		tfb2.setColumns(10);
		JButton btnTableSave = new JButton("->\uC138\uBD80 \uB370\uC774\uD130 \uC785\uB825\uD558\uAE30<-");
		btnTableSave.setBounds(219, 272, 256, 66);
		TablePanel2x3.add(btnTableSave);
		btnTableSave.setFont(new Font("굴림", Font.PLAIN, 18));
		btnTableSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				levelCombo.removeAllItems();
				currPanel.setVisible(false);
				dataInputPanel.setVisible(true);
				currPanel=dataInputPanel;
				String a1 = tfa1.getText();
				String a2 = tfa2.getText();
				String a3 = tfa3.getText();
				String b1 = tfb1.getText();
				String b2 = tfb2.getText();
				String subject = subjectInput.getText();
				getSubjectLabel.setText(subject);
				
				levelCombo.addItem(a1 +" x "+ b1);
				levelCombo.addItem(a2 +" x "+ b1);
				levelCombo.addItem(a3 +" x "+ b1);
				levelCombo.addItem(a1 +" x "+ b2);
				levelCombo.addItem(a2 +" x "+ b2);
				levelCombo.addItem(a3 +" x "+ b2);
				
				
			}
		});
		newDataPanel1.add(oneVariationPanel);
		oneVariationPanel.setLayout(null);
		JRadioButton twoBtn = new JRadioButton("2");
		twoBtn.setBounds(23, 97, 119, 23);
		oneVariationPanel.add(twoBtn);
		JRadioButton threeBtn = new JRadioButton("3");
		threeBtn.setBounds(23, 144, 119, 23);
		oneVariationPanel.add(threeBtn);
		btnG2.add(twoBtn);
		btnG2.add(threeBtn);
		
		twoBtn.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					curPanel2.setVisible(false);
					panel1x2.setVisible(true);
					curPanel2=panel1x2;
				}
				
			}
			
		});
		threeBtn.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				curPanel2.setVisible(false);
				panel1x3.setVisible(true);
				curPanel2=panel1x3;
			}
			
		});
		JLabel lblNewLabel_2 = new JLabel("\uC218\uC900 \uAC1C\uC218 \uC120\uD0DD");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(50, 10, 195, 31);
		oneVariationPanel.add(lblNewLabel_2);
		
		JLabel subjectLabel = new JLabel("\uC8FC\uC81C\uB97C \uC785\uB825\uD558\uC138\uC694");
		subjectLabel.setBounds(76, 97, 167, 77);
		subjectLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		newDataPanel1.add(subjectLabel);
		
		subjectInput = new JTextField();
		subjectInput.setBounds(280, 97, 822, 77);
		subjectInput.setFont(new Font("굴림", Font.PLAIN, 20));
		newDataPanel1.add(subjectInput);
		subjectInput.setColumns(10);
		newDataPanel1.add(varTestPanel);
		varTestPanel.setLayout(null);
		//일원 , 이원 선택 라디오 버튼 그룹 묶기
		JRadioButton btnOneVariable = new JRadioButton("\uC77C\uC6D0\uBD84\uC0B0\uBD84\uC11D");
		btnOneVariable.setBounds(20, 34, 97, 23);
		varTestPanel.add(btnOneVariable);
		JRadioButton btnTwoVariable = new JRadioButton("\uC774\uC6D0\uBD84\uC0B0\uBD84\uC11D");
		btnTwoVariable.setBounds(150, 26, 113, 39);
		varTestPanel.add(btnTwoVariable);
		btnG1.add(btnOneVariable);
		btnG1.add(btnTwoVariable);
		btnOneVariable.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					oneVariationPanel.setVisible(true);
					twoVariationPanel.setVisible(false);
				}
			}
		});
		newDataPanel1.add(twoVariationPanel);
		twoVariationPanel.setLayout(null);
		btnTwoVariable.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					twoVariationPanel.setVisible(true);
					oneVariationPanel.setVisible(false);
				}
			}
		});
		//이원분산분석 라디오버튼
		JRadioButton btn2x2 = new JRadioButton("2x2");
		btn2x2.setBounds(18, 24, 119, 23);
		twoVariationPanel.add(btn2x2);
		JRadioButton btn2x3 = new JRadioButton("2x3  (\uAD8C\uC7A5)");
		btn2x3.setBounds(18, 113, 119, 23);
		twoVariationPanel.add(btn2x3);
		
		btnG3.add(btn2x2);
		btnG3.add(btn2x3);
		btn2x2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					curPanel2.setVisible(false);
					TablePanel_2x2.setVisible(true);
					curPanel2=TablePanel_2x2;
				}
			}
		});
		btn2x3.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					curPanel2.setVisible(false);
					TablePanel2x3.setVisible(true);
					curPanel2=TablePanel2x3;
				}
			}
		});
		
		
		
		JButton btnNewButton_4 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_4.setBounds(59, 758, 142, 58);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currPanel.setVisible(false);
				choosePanel.setVisible(true);
				currPanel=choosePanel;
			}
		});
		newDataPanel1.add(btnNewButton_4);
		
		
		
		newDataProcessPanel.setBounds(0, 0, 1167, 868);
		frame.getContentPane().add(newDataProcessPanel);
		newDataProcessPanel.setLayout(null);
		
		table_1 = new JTable(cs);
		table_1.setBounds(12, 99, 1143, 666);
		table_1.setRowHeight(30);
		JScrollPane scrollPane_1 = new JScrollPane(table_1);
		scrollPane_1.setBounds(12, 99, 1145, 694);
		newDataProcessPanel.add(scrollPane_1);
		table_1.setFont(new Font("Sansserif",Font.BOLD,15));
		table_1.setPreferredScrollableViewportSize(new Dimension(1143,666));
		
		JTableHeader tbHeader = table_1.getTableHeader();
		
		textField = new JTextField();
		textField.setBounds(138, 26, 826, 46);
		newDataProcessPanel.add(textField);
		textField.setColumns(30);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String val = textField.getText();
				TableRowSorter<TableModel> trs = new TableRowSorter<>(table_1.getModel());
				table_1.setRowSorter(trs);
				trs.setRowFilter(RowFilter.regexFilter(val));
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("Search");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_4.setBounds(12, 26, 111, 46);
		newDataProcessPanel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("\uBD84\uC11D\uC2DC\uC791");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(970, 803, 185, 55);
		newDataProcessPanel.add(btnNewButton);
		
		//뒤로가기 버튼 모음
		JButton btnNewButton_2 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currPanel.setVisible(false);
				dataInputPanel.setVisible(true);
				currPanel=dataInputPanel;
			}
		});
		btnNewButton_2.setBounds(12, 805, 121, 53);
		newDataProcessPanel.add(btnNewButton_2);
		
		
		
		choosePanel.setBounds(0, 0, 1167, 868);
		frame.getContentPane().add(choosePanel);
		choosePanel.setLayout(null);
		
		JButton newDataBtn = new JButton("\uC0C8\uB85C\uC6B4 \uD1B5\uACC4\uC790\uB8CC\uB85C \uBD84\uC11D\uD558\uAE30");
		newDataBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currPanel.setVisible(false);
				newDataPanel1.setVisible(true);
				currPanel=newDataPanel1;
			}
		});
		newDataBtn.setFont(new Font("굴림", Font.BOLD, 29));
		newDataBtn.setBounds(290, 94, 516, 250);
		choosePanel.add(newDataBtn);
		
		JButton savedDataBtn = new JButton("\uC774\uBBF8 \uC788\uB294 \uD1B5\uACC4\uC790\uB8CC\uB85C \uBD84\uC11D\uD558\uAE30");
		savedDataBtn.setFont(new Font("굴림", Font.BOLD, 29));
		savedDataBtn.setBounds(290, 435, 516, 250);
		choosePanel.add(savedDataBtn);
		
		
		
		getSubjectLabel.setFont(new Font("굴림", Font.BOLD, 20));
		
		
		
		
	
		
		
		dataInputPanel.setBounds(0, 0, 1167, 868);
		frame.getContentPane().add(dataInputPanel);
		dataInputPanel.setLayout(null);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("\uC218\uC900");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_3.setBounds(213, 130, 124, 34);
		dataInputPanel.add(lblNewLabel_3);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(213, 222, 124, 34);
		dataInputPanel.add(label);
		
		JLabel label_1 = new JLabel("\uC131\uBCC4");
		label_1.setFont(new Font("굴림", Font.BOLD, 20));
		label_1.setBounds(213, 305, 124, 34);
		dataInputPanel.add(label_1);
		
		JLabel label_2 = new JLabel("\uB098\uC774");
		label_2.setFont(new Font("굴림", Font.BOLD, 20));
		label_2.setBounds(213, 387, 124, 34);
		dataInputPanel.add(label_2);
		
		JLabel label_3 = new JLabel("\uB370\uC774\uD130\uAC12");
		label_3.setFont(new Font("굴림", Font.BOLD, 20));
		label_3.setBounds(213, 467, 124, 34);
		dataInputPanel.add(label_3);
		
		JLabel label_4 = new JLabel("\uADF8 \uC678");
		label_4.setFont(new Font("굴림", Font.BOLD, 20));
		label_4.setBounds(213, 643, 124, 34);
		dataInputPanel.add(label_4);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("굴림", Font.PLAIN, 16));
		textPane.setText("\uCD94\uD6C4 \uC704 \uB370\uC774\uD130\uAC00 \uC4F0\uC77C \uC5EC\uB7EC \uC0C1\uD669\uC744 \uC704\uD55C \uAE30\uC7AC\uB780 \uC785\uB2C8\uB2E4. \uBE44\uC6CC \uB450\uC154\uB3C4 \uB429\uB2C8\uB2E4");
		textPane.setBounds(374, 639, 674, 201);
		dataInputPanel.add(textPane);
		
		nameTf = new JTextField("");
		nameTf.setBounds(376, 222, 200, 34);
		dataInputPanel.add(nameTf);
		nameTf.setColumns(10);
		
		ageTf = new JTextField("");
		ageTf.setColumns(10);
		ageTf.setBounds(376, 387, 200, 34);
		dataInputPanel.add(ageTf);
		
		dataTf = new JTextField("");
		dataTf.setColumns(10);
		dataTf.setBounds(376, 467, 200, 34);
		dataInputPanel.add(dataTf);
		
		String [][] data = dataSave.getData();
		String [] headers = new String [] {"Subject","Level","Name", "Gender", "Age", "Data"};
		savedDataProcessPanel.setLayout(null);
		DefaultTableModel model = new DefaultTableModel(data,headers);
		
		JComboBox sexCombo = new JComboBox();
		sexCombo.addItem("Male");
		sexCombo.addItem("Female");
		sexCombo.addItem("모름");
		sexCombo.setBounds(376, 307, 200, 34);
		dataInputPanel.add(sexCombo);
		
				
				
				levelCombo.setBounds(376, 128, 471, 34);
				dataInputPanel.add(levelCombo);
				
				JButton btnDataSave = new JButton("Data Save");
				btnDataSave.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					try {
							boolean fileExists = new File("./data.csv").exists();
					
							FileWriter fw = new FileWriter("./data.csv",true);
						
							if(!fileExists) {
								fw.append("Subject, Level, Name, Gender, Age, Data\n");
							}
							String subject = subjectInput.getText();
							String level = levelCombo.getSelectedItem().toString();
							String name = nameTf.getText();
							String gender = sexCombo.getSelectedItem().toString();
							String age = ageTf.getText();
							String data = dataTf.getText();
							
							fw.append(subject+","+level + ","+ name +"," + gender +","+ age +","+data+"\n");
							fw.close();
							cs.refresh();
							JOptionPane.showMessageDialog(null, "success");
							
							nameTf.setText("");
							ageTf.setText("");
							dataTf.setText("");
							
						}catch(Exception e1) {
							e1.printStackTrace();
						}
					}
				});
				btnDataSave.setBounds(374, 540, 206, 50);
				dataInputPanel.add(btnDataSave);
				
	
				getSubjectLabel.setBounds(138, 30, 964, 78);
				dataInputPanel.add(getSubjectLabel);
				
				JButton btnGonext = new JButton("\uC800\uC7A5 \uB05D\uB0B4\uAE30");
				btnGonext.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						currPanel.setVisible(false);
						newDataProcessPanel.setVisible(true);
						currPanel=newDataProcessPanel;
					}
				});
				btnGonext.setBounds(787, 540, 248, 55);
				dataInputPanel.add(btnGonext);
		tbHeader.setBackground(new Color(100,200,255));
		tbHeader.setForeground(Color.WHITE);
		tbHeader.setFont(new Font("Sansserif",Font.BOLD,15));
		
		
		
		
		savedDataProcessPanel.setBounds(0, 0, 1167, 868);
		frame.getContentPane().add(savedDataProcessPanel);
		
		
		
		
		
		table = new JTable(model);
		table.setRowHeight(30);
		table.setFont(new Font("Sanserif",Font.BOLD,15));
		table.setAlignmentX(0);
		table.setSize(800,600);
	
		table.setPreferredScrollableViewportSize(new Dimension(800,600));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 240, 1167, 628);
		savedDataProcessPanel.add(scrollPane);
		
		
		search = new JTextField();
		search.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String val = search.getText();
				TableRowSorter<TableModel> trs = new TableRowSorter<>(table.getModel());
				table.setRowSorter(trs);
				trs.setRowFilter(RowFilter.regexFilter(val));
			}
		});
		search.setFont(new Font("굴림", Font.PLAIN, 20));
		search.setBounds(0, 39, 1167, 53);
		savedDataProcessPanel.add(search);
		search.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.fireTableDataChanged();
			}
		});
		btnNewButton_1.setBounds(12, 138, 266, 67);
		savedDataProcessPanel.add(btnNewButton_1);
		loginPanel.setBounds(0, 0, 1167, 868);
		frame.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAD11\uC6B4 \uC0B0\uC2EC \uD1B5\uACC4 \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel.setBounds(369, 35, 389, 183);
		loginPanel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		
		gradeInput = new JTextField();
		gradeInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()=='\n') {
					String grade = gradeInput.getText();
					if(grade.contains("9050")) {
						JOptionPane.showMessageDialog(null,"로그인 성공");
						currPanel.setVisible(false);
						choosePanel.setVisible(true);
						currPanel=choosePanel;
					}
					else
						JOptionPane.showMessageDialog(null, "광운대 산심과가 아니면 사용할 수 없습니다.");
				}
			}
		});
		gradeInput.setBounds(369, 395, 407, 63);
		loginPanel.add(gradeInput);
		gradeInput.setColumns(10);
		
		JButton btnLogin = new JButton("Log in");
		btnLogin.setBounds(431, 527, 262, 63);
		loginPanel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String grade = gradeInput.getText();
				if(grade.contains("9050")) {
					JOptionPane.showMessageDialog(null,"로그인 성공");
					currPanel.setVisible(false);
					choosePanel.setVisible(true);
					currPanel=choosePanel;
				}
				else
					JOptionPane.showMessageDialog(null, "광운대 산심과가 아니면 사용할 수 없습니다.");
				
			}
		});
		btnLogin.setFont(new Font("굴림", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("\uD559\uBC88\uC785\uB825");
		lblNewLabel_1.setBounds(199, 394, 104, 63);
		loginPanel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		
		JButton btnNewButton_3 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currPanel.setVisible(false);
				newDataPanel1.setVisible(true);
				currPanel=newDataPanel1;
				
				
			}
		});
		btnNewButton_3.setBounds(44, 741, 143, 78);
		dataInputPanel.add(btnNewButton_3);
	}
}
