package com.sist.web.service;

import java.util.*;

import com.sist.web.vo.*;
import com.sist.web.entity.*;

public interface FoodService {
	public List<FoodListVO> foodListData(int start, int end);
	public FoodEntity foodDetailData(int fno);
	public int foodTotalPage();
}
