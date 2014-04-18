package com.rainer.denis;

import org.hibernate.Session;
import com.rainer.denis.HibernateUtil;

public class TestHibernateConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session sessao = null;
		try {
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("Conectou");
		} finally{
			sessao.close();
			System.out.println("Fechou conexao!");
		}
			
		}

	}

