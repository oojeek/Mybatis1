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
        //mybatis的配置文件
        String resource = "configure.xml";
        
        // 方法一
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = MyTest.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        
        //方法二
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        //Reader reader = Resources.getResourceAsReader(resource); 
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();

        //映射sql的标识字符串，映射文件的namespace + id
        String statement = "com.sealinetech.mybatis2.mapper.PersonMapper.getPerson";
        //执行查询返回一个唯一user对象的sql
        Person person = session.selectOne(statement, 1);
        System.out.println(person.getId() + "----" + person.getName() + "----" + 
        		person.getPassword() +"----" + person.getAge());
	}

}
