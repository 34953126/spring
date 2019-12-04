package cn.haoxy.dao;

import org.springframework.stereotype.Service;


@Service
public class IndexDaoImpl implements IndexDao {

	public IndexDaoImpl() {
		System.out.println("constructor");
	}

	public String testSource(){

		return "test \n test2";
	}
}
