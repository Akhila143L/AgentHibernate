package com.infinite.agenthib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class AgentSearch {
	public static void main(String[] args) {
		int Agentid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent Id  ");
		Agentid = sc.nextInt();
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query =  session.createQuery("from Agent where Agentid="+Agentid);
		List<Agent> agentList = query.list();
		if(agentList.size()==1){
		System.out.println(agentList.get(0));
		}else{
			System.out.println("*** Record not Found ***");
		}
	  }
}
