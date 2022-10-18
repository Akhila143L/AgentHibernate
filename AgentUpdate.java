package com.infinite.agenthib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class AgentUpdate {
	public static void main(String[] args) {
		Agent agent = new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent Id  ");
		agent.setAgentid(sc.nextInt());
		System.out.println("Enter Agent Name  ");
		agent.setName(sc.next());
		System.out.println("Enter Agent City  ");
		agent.setCity(sc.next());
		System.out.println("Enter Agent Gender  ");
		agent.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Agent MaritalStatus  ");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("Enter Agent Premium  ");
		agent.setPremium(sc.nextDouble());
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query =  session.createQuery("from Agent where Agentid="+agent.getAgentid());
		List<Agent> agentList = query.list();
		session.close();
		if(agentList.size()==1){
			 session = sf.openSession();
			Transaction trans = session.beginTransaction();
			session.saveOrUpdate(agent);
		trans.commit();
		System.out.println("***Record Updated***");
			}else{
				System.out.println("*** Record not Found ***");
			}
	}
}
