package com.coupon.model;

import java.util.*;

public interface CouponDAO_interface {
          public void insert(CouponVO empVO);
          public void update(CouponVO empVO);
          public void delete(Integer empno);
          public CouponVO findByPrimaryKey(Integer empno);
          public List<CouponVO> getAll();
          //萬用複合查詢(傳入參數型態Map)(回傳 List)
//        public List<EmpVO> getAll(Map<String, String[]> map); 
}
