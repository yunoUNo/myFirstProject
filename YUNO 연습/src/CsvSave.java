import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.table.AbstractTableModel;


public class CsvSave extends AbstractTableModel{
	private ArrayList<CsvDataSave> list;
	private String[] header = {"Subject","Level","Name","Gender","Age","Data"};
	
	public String getColumnName(int cell) {
		return header[cell];
	}
	
	public CsvSave() {
		updataList();
	}
	
	public void updataList() {
		list = new ArrayList<CsvDataSave>();
		try {
			Scanner sc = new Scanner(new File("./data.csv"));
		
			for(int i=0;sc.hasNextLine();i++) {//스캐너를 통해 읽는 데이터를 불러오기
				String[] data=sc.nextLine().split(",");
				if(i==0)
					continue;//i=0일때는 맨위에 줄 Subject,Level,Name,Gender,Age,Data 를 읽지 않기 위해.
					
				//CsvDataSave 클래스를 생성하고 데이터를 넣는다.
				CsvDataSave t = new CsvDataSave(data[0],data[1],data[2],data[3],data[4],data[5]);
			
				list.add(t);					
				
			}
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public int getColumnCount() {
		
		return 6;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
			switch(columnIndex) {
			case 0:
				return list.get(rowIndex).getSubject();
			case 1:
				return list.get(rowIndex).getLevel();
			case 2:
				return list.get(rowIndex).getName();
			case 3:
				return list.get(rowIndex).getGender();
			case 4:
				return list.get(rowIndex).getAge();
			case 5:
				return list.get(rowIndex).getData();
			}
			return null;
		}
	
	public void refresh() {
		updataList();
		super.fireTableDataChanged();
	}
}