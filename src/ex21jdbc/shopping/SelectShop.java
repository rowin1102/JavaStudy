package ex21jdbc.shopping;

import java.sql.SQLException;

import ex21jdbc.crud.MyConnection;

public class SelectShop extends MyConnection {
	
	public SelectShop() {
		super("education", "1234");
	}
	
	@Override
	public void dbExecute() {
		
		try {
			String scan = inputValue("검색할 상품명");
			stmt = con.createStatement();
			String query = "select g_idx, goods_name, ltrim(to_char(goods_price, '999,999,999.990')) gp, "
					+ "to_char(regidate, 'yyyy-mm-dd hh24:mi') rd, p_code "
					+ "from sh_goods "
					+ "where goods_name like '%" + scan + "%'";
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int g_idx = rs.getInt("g_idx");
				String goods_name = rs.getString("goods_name");
				String goods_price = rs.getString("gp");
				String regidate = rs.getString("rd");
				int p_code = rs.getInt("p_code");
				
				System.out.printf("%d %s %s %s %d\n", g_idx, goods_name, goods_price, regidate, p_code);
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
		new SelectShop().dbExecute();
	}
	
}
