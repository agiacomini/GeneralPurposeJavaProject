package com.giacomini.andrea.database;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class DbConnectionWithStaticFactoryMethod 
{
	private static final int MAX_CONNECTION = 10;
    private static int totalDbConnection = 0;
    
    private static Set<DbConnectionWithStaticFactoryMethod> availableConnections = new HashSet<DbConnectionWithStaticFactoryMethod>();
    
    public DbConnectionWithStaticFactoryMethod()
    {
    	totalDbConnection++;
    }
    
    public static DbConnectionWithStaticFactoryMethod getInstance() throws SQLException
    {
    	if( totalDbConnection < MAX_CONNECTION )
    	{
    		return new DbConnectionWithStaticFactoryMethod();
    	}
    	else if ( availableConnections.size() > 0 )
    	{
    		DbConnectionWithStaticFactoryMethod dbc = availableConnections.iterator().next();
    		availableConnections.remove( dbc );
    		return dbc;
    	}
    	else
    	{
    		throw new SQLException();
    	}
    }
}
