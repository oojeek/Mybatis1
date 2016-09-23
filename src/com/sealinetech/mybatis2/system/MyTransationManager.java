package com.sealinetech.mybatis2.system;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionStatus;

public class MyTransationManager extends DataSourceTransactionManager
{

	@Override
	protected void doBegin(Object transaction, TransactionDefinition definition)
	{
		// TODO Auto-generated method stub
		System.out.println("Tran Begin!");
		super.doBegin(transaction, definition);
	}

	@Override
	protected void doCommit(DefaultTransactionStatus status)
	{
		// TODO Auto-generated method stub
		System.out.println("Tran Commited!");
		super.doCommit(status);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1901575475168942132L;
	
	
}
