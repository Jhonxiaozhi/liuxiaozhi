package com.oneofive.presenter;

import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.oneofive.MyApplication;
import com.oneofive.api.ApiPoolExecutor;
import com.oneofive.api.Resource;
import com.oneofive.api.ResponeseEntity.ProductsBean;
import com.oneofive.presenter.view.CustomView;
import com.oneofive.presenter.view.ProductsFragmentParentView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/8/29.
 */
public class ProductPresenter {
    private ProductsFragmentParentView view;
    private Resource resourceApi;

    public ProductPresenter(CustomView view) {
        this.view = (ProductsFragmentParentView) view;
        resourceApi = MyApplication.getApiResource();
    }

    public void refreshProducts() {
        ApiPoolExecutor.getInstance().execute(new Runnable() {
            @Override
            public void run() {
                JSONObject json = resourceApi.getObjects("products");

                JSONArray jsonArray = json.getJSONArray("data");
                List<ProductsBean> arr = JSONObject.parseArray(jsonArray.toJSONString(), ProductsBean.class);
                view.onRefreshProductsSuccess(arr,true);
                Log.e("ProductPresenter", arr.get(0).getCreatedAt());

            }
        });

    }
}
