package com.revature.daos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Account;
import com.revature.utils.ConnectionUtility;

public class AccountDAO implements IAccountDAO {

	@Override
	public List<Account> findAll() {
		try(Connection conn=ConnectionUtility.getConnection()){
			
			String sql="select * from Account";
			Statement statment=conn.createStatement();
			
			List<Account> list=new ArrayList<>();
			ResultSet result=statment.executeQuery(sql);
			
		while(result.next()) {
			Account ac=new Account();
			ac.setAccBalance(result.getDouble("acc_balance"));
			ac.setAccNum(result.getInt("acc_num"));
			ac.setAccType(result.getInt("acc_type"));
			ac.setPassword(result.getString("user_password"));
			ac.setUserId(result.getInt("user_id"));
			list.add(ac);
		}
			
		return list;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	@Override
	public Account findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAccount(Account ac) {
		// TODO Auto-generated method stub
		return false;
	}

}
