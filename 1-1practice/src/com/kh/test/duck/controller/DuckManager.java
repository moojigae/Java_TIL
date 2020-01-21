package com.kh.test.duck.controller;

import com.kh.test.duck.model.vo.Duck;
import com.kh.test.duck.model.vo.RubberDuck;
import com.kh.test.duck.model.vo.mallard;

public class DuckManager {
	public static void main(String[] args) {
		Duck[] dArr = new Duck[5];
		
		dArr[0] = new RubberDuck("������","������",100); 
		dArr[1] = new mallard("û�տ���","�в���", "����", "white"); 
		dArr[2] = new RubberDuck("������","����",100); 
		dArr[3] = new mallard("û�տ���","û����", "�λ�", "blue"); 
		dArr[4] = new mallard("û�տ���","�̼�����", RubberDuck.PLACE, "yellow"); 
		
		
		for(int i = 0; i < dArr.length; i++) {
//			System.out.println();
			dArr[i].quack();
		}
	}
}
