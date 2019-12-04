package cn.haoxy;

import cn.haoxy.config.AppConfig;
import cn.haoxy.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestBean {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();
		IndexDao bean = applicationContext.getBean(IndexDao.class);
		System.out.println(bean.testSource());
		applicationContext.close();
	}
}
