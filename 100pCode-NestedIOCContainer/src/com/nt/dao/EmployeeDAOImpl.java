package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	private  String query="select * from employee where id>=? and id<=? ";
	
	@Autowired
	private DataSource ds;
	
	

	public EmployeeDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}



	@Override
	public List<EmployeeBO> getEmployeeDetails(int min,int max) throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List listBO=new ArrayList();
		try {
			con=ds.getConnection();
		
			ps=con.prepareStatement(query);
			ps.setInt(1,min);
			ps.setInt(2,max);
			rs=ps.executeQuery();
			boolean flag=false;
			while(rs.next()) {
				  flag=true;
				  EmployeeBO bo=new EmployeeBO(); bo.setId(rs.getInt(1));
				  bo.setName(rs.getString(2)); bo.setDepartment(rs.getString(4));
				  bo.setDesignation(rs.getString(3)); listBO.add(bo);
				 
				
			}
	
			if(!flag)
				throw new IllegalArgumentException("Invalid Deisgnation");
			return listBO;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		finally {
			if(con!=null)
				con.close();
			if(ps!=null)
				ps.close();
			if(rs!=null)
				rs.close();
		}
		
	}

}
