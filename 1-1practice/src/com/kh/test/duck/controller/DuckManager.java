package com.kh.test.duck.controller;

import com.kh.test.duck.model.vo.Duck;
import com.kh.test.duck.model.vo.RubberDuck;
import com.kh.test.duck.model.vo.mallard;

public class DuckManager {
	public static void main(String[] args) {
		Duck[] dArr = new Duck[5];
		
		dArr[0] = new RubberDuck("러버덕","도날드",100); 
		dArr[1] = new mallard("청둥오리","꽥꽥이", "서울", "white"); 
		dArr[2] = new RubberDuck("러버덕","고무고무",100); 
		dArr[3] = new mallard("청둥오리","청둥이", "부산", "blue"); 
		dArr[4] = new mallard("청둥오리","미세먼지", RubberDuck.PLACE, "yellow"); 
		
		
		for(int i = 0; i < dArr.length; i++) {
//			System.out.println();
			dArr[i].quack();
		}
	}
}
