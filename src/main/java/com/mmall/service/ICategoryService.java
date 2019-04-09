package com.mmall.service;

import com.mmall.common.ServiceResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by jialiang_Lin on 2018/1/28.
 */
public interface ICategoryService {

    ServiceResponse addCategory(String categoryName, Integer parentId);

    ServiceResponse updateCategoryName(Integer categoryId,String categoryName);

    ServiceResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServiceResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);


}
