package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.crud.MyConnection;

public class DeleteShop extends MyConnection {
	
	public DeleteShop() {
		super("education", "1234");
	}
	
	@Override
	public void dbExecute() {
		
		try {
			csmt = con.prepareCall("{ call ShopDeleteGoods(?, ?) }");
			csmt.setInt(1, Integer.parseInt(inputValue("삭제할 상품의 일련번호")));
			csmt.registerOutParameter(2, Types.NUMERIC);
			csmt.execute();
			System.out.println("레코드 삭제 결과:" + csmt.getInt(2));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
		
	}
	
	public static void main(String[] args) {
		new DeleteShop().dbExecute();
	}
	
}
