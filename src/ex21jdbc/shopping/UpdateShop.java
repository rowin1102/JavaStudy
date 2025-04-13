package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.crud.MyConnection;

public class UpdateShop extends MyConnection {
	
	public UpdateShop() {
		super("education", "1234");
	}
	
	@Override
	public void dbExecute() {
		
		try {
			csmt = con.prepareCall("{ call ShopUpdateGoods(?, ?, ?, ?, ?) }");
			
			csmt.setString(1, inputValue("상품명"));
			csmt.setInt(2, Integer.parseInt(inputValue("가격")));
			csmt.setInt(3, Integer.parseInt(inputValue("제품코드")));
			csmt.setInt(4, Integer.parseInt(inputValue("수정할 상품의 일련번호")));
			csmt.registerOutParameter(5, Types.NUMERIC);
			csmt.execute();
			
			int result = csmt.getInt(5);
			
			if(result == 1) {
				System.out.println("상품 수정 성공");
			} else {
				System.out.println("상품 수정 실패");
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
		
	}
	
	public static void main(String[] args) {
		new UpdateShop().dbExecute();
	}
	
}	
