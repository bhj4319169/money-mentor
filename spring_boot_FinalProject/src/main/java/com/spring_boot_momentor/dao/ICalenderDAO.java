package com.spring_boot_momentor.dao;

import java.util.ArrayList;

import com.spring_boot_momentor.model.CalenderProductVO;
import com.spring_boot_momentor.model.CalenderVO;
import com.spring_boot_momentor.model.InsuVO;
import com.spring_boot_momentor.model.PlanVO;

public interface ICalenderDAO {
	public int countCard();
	public ArrayList<PlanVO> calenderView(String userID); //일정 데이터 받아오기
	public void insertPlan(CalenderVO vo);//일정 추가
	public int planDuplicateCheck(String userID, String prdID, String prdType);//일정 중복 검사
	public void changePrdName(String prdName, String userID, String prdID, String prdType);//일정 이름 변경
	public void deletePlan(int dataID);//일정 삭제
	public ArrayList<CalenderVO> getPlanModify(String userID, int dataID);//수정할 일정 받아오기
	public void modifyPlan(CalenderVO vo);//일정 수정
	
	//상품 관련 코드(추후 다른 서비스로 옮길 수도 있음)
	public ArrayList<CalenderProductVO> calenderPrdList(String kind, String kindDetail, String order);
}
