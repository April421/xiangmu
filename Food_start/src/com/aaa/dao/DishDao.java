package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Dish;

public interface DishDao {
	void addDish(Dish dish);//��Ӳ�Ʒ
	void delDish(Integer id);//ͨ����Ʒidɾ����Ʒ
	List<Map<String,Object>> findAllDish();//��ѯ���в�Ʒ
	List findType(String name);//ͨ����Ʒ���ģ����ѯ
	void updateDish(Integer dish_status,Integer id);//�޸Ĳ�Ʒ״̬
}
