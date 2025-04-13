package ex21jdbc.shopping;

import java.sql.SQLException;

import ex21jdbc.crud.MyConnection;

public class InsertShop extends MyConnection {
	
	public InsertShop() {
		super("education", "1234");
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		
		try {
			query = "insert into sh_goods (g_idx, goods_name, goods_price, regidate, p_code) values "
					+ "(seq_total_idx.nextval, ?, ?, sysdate, ?)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, inputValue("상품명"));
			psmt.setInt(2, Integer.parseInt(inputValue("상품가격")));
			psmt.setInt(3, Integer.parseInt(inputValue("상품코드")));
			
			result = psmt.executeUpdate();
			System.out.println(result + "개의 상품이 입력");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
		
	}
	
	public static void main(String[] args) {
		new InsertShop().dbExecute();
	}
	
}	
