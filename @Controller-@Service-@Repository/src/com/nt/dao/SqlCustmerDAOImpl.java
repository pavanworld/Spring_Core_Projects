package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustmerBO;

@Repository("sqldao")
public class SqlCustmerDAOImpl implements CustmerDAO{
	private static final String SQL_QUERY="insert into Custmer(name,addr,amount,interest) values(?,?,?,?)";
	@Autowired
	private DataSource ds;
	
	public SqlCustmerDAOImpl() {
		System.out.println("SqlCustmerDAOImpl 0-param");
	}

	@Override
	public int insert(CustmerBO bo) throws Exception {
		
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(SQL_QUERY);
		
		ps.setString(1,bo.getName());
		ps.setString(2, bo.getAddr());
		ps.setFloat(3, bo.getAmt());
		ps.setFloat(4,bo.getInterest());
		return ps.executeUpdate();
		
	}

}

