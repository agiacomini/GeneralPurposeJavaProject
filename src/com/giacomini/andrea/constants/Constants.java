package com.giacomini.andrea.constants;

public class Constants 
{
	//------------------------ Oracle JDBC Connection -------------------------------//
	
	public static final String ORACLEURL = "jdbc:oracle:thin:@192.168.2.163:1521:<ORACLE_DB_NAME>";
	public static final String ORACLEUSER = "<ORACLE_USER>";
	public static final String ORACLEPWD = "<ORACLE_PWD>";
	public static final String ORACLEDRIVER = "oracle.jdbc.driver.OracleDriver";
	
	//---------------------- ./Oracle JDBC Connection -------------------------------//
	
	//----------------------------- Oracle Query ------------------------------------//
	
	public static final String ORACLEQUERY_FINDALL = "SELECT * FROM <table_name>";
	public static final String ORACLEQUERY_FINDBYID = "SELECT * FROM <table_name> WHERE <column_name> = :id";
	
	//---------------------------- ./Oracle Query -----------------------------------//
	
}
