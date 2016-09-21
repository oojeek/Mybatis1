package com.sealinetech.mybatis2.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sealinetech.mybatis2.pojo.Person;

public class MyTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        //mybatis�������ļ�
        String resource = "configure.xml";
        
        // ����һ
        //ʹ�������������mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
        InputStream is = MyTest.class.getClassLoader().getResourceAsStream(resource);
        //����sqlSession�Ĺ���
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        
        //������
        //ʹ��MyBatis�ṩ��Resources�����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
        //Reader reader = Resources.getResourceAsReader(resource); 
        //����sqlSession�Ĺ���
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        
        //������ִ��ӳ���ļ���sql��sqlSession
        SqlSession session = sessionFactory.openSession();

        //ӳ��sql�ı�ʶ�ַ�����ӳ���ļ���namespace + id
        String statement = "com.sealinetech.mybatis2.mapper.PersonMapper.getPerson";
        //ִ�в�ѯ����һ��Ψһuser�����sql
        Person person = session.selectOne(statement, 1);
        System.out.println(person.getId() + "----" + person.getName() + "----" + 
        		person.getPassword() +"----" + person.getAge());
	}

}
