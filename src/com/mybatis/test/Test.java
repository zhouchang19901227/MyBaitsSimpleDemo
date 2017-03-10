package com.mybatis.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.zc.Org;

public class Test {

	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			//通过配置文件初始化sqlSessionFactory
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}

	public void getUserByID(int userID) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			IUserOperation userOperation = session
					.getMapper(IUserOperation.class);
			User user = userOperation.selectUserByID(userID);
			if (user != null) {
				System.out.println(user.getId() + ":" + user.getUserName()
						+ ":" + user.getUserAddress());
			}

		} finally {
			session.close();
		}
	}
	public void getMObileByID(int ID) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			IMobileOperation mobileOperation = session
					.getMapper(IMobileOperation.class);
			Mobile mobile = mobileOperation.selectMobleByID(ID);
			if (mobile != null) {
				System.out.println(mobile.getMobile_eq_no());
			}

		} finally {
			session.close();
		}
	}
	public void getUserList(String userName) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			IUserOperation userOperation = session
					.getMapper(IUserOperation.class);
			List<User> users = userOperation.selectUsersByName(userName);
			for (User user : users) {
				System.out.println(user.getId() + ":" + user.getUserName()
						+ ":" + user.getUserAddress());
			}

		} finally {
			session.close();
		}
	}

	/**
	 * 增加后要commit
	 */
	public void addUser() {
		
		User user = new User();
		user.setUserAddress("place");
		user.setUserName("test_add");
		user.setUserAge(30);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			IUserOperation userOperation = session
					.getMapper(IUserOperation.class);
			userOperation.addUser(user);
			session.commit();
			System.out.println("新增用户ID：" + user.getId());
		} finally {
			session.close();
		}
	}

	/**
	 * 修改后要commit
	 */
	public void updateUser() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			IUserOperation userOperation = session
					.getMapper(IUserOperation.class);
			User user = userOperation.selectUserByID(1);
			if (user != null) {
				user.setUserAddress("A new place");
				userOperation.updateUser(user);
				session.commit();
			}
		} finally {
			session.close();
		}
	}

	/**
	 * 删除后要commit.
	 * 
	 * @param id
	 */
	public void deleteUser(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			IUserOperation userOperation = session
					.getMapper(IUserOperation.class);
			userOperation.deleteUser(id);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void getUserArticles(int userid) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			IArticleOperation articleOperation = session
					.getMapper(IArticleOperation.class);
			List<Article> articles = articleOperation.getUserArticles(userid);
			for (Article article : articles) {
				System.out.println(article.getTitle() + ":"
						+ article.getContent() + "用户名："
						+ article.getUser().getUserName() + "用户地址："
						+ article.getUser().getUserAddress());
			}
		} finally {
			session.close();
		}
	}

	public void getBlogArticles(int blogid) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			IBlogOperation blogOperation = session
					.getMapper(IBlogOperation.class);
			Blog blog = blogOperation.getBlogByID(blogid);
			System.out.println(blog.getTitle() + ":");
			List<Article> articles = blog.getArticles();
			for (Article article : articles) {
				System.out.println(article.getTitle() + ":"
						+ article.getContent() + "用户名："
						+ article.getUser().getUserName() + "用户地址："
						+ article.getUser().getUserAddress());
				/*System.out.println(article.getTitle() + ":"
						+ article.getContent());*/
			}
		} finally {
			session.close();
		}
	}
	public void getBlogGood(int blogid) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			IBlogOperation blogOperation = session
					.getMapper(IBlogOperation.class);
			Org blog = blogOperation.getOrgData(blogid);
			System.out.println(blog.getOrgContacts().get(0).getGoods().getCustomerNo()+ ":");
			
	        System.out.println(session.selectOne("getOrgData", 1));
	        // 同一个session的相同sql查询,将会使用一级缓存 
	        System.out.println(session.selectOne("getOrgData", 1));
	        // 参数改变,需要重新查询
	        System.out.println(session.selectOne("getOrgData", 2));
	        // 清空缓存后需要重新查询
	        session.clearCache();
	        System.out.println(session.selectOne("getOrgData", 1));
	      
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage()+ ":");
		}
		finally {
			session.close();
		}
	}
	public static void main(String[] args) {
		try {
			Test test = new Test();
			// test.getUserByID(1);
			// test.getUserList("test1");
			// test.addUser();
			// test.updateUser();
			// test.deleteUser(6);

			//test.getUserArticles(1);

			test.getBlogGood(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
