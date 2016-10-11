package com.oneofive.presenter.view;

import com.oneofive.api.ResponeseEntity.ProductsBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/8/29.
 */
public interface ProductsFragmentParentView extends CustomView {
    void onRefreshProductsSuccess(List<ProductsBean> arrayList, boolean toUpdate);
    void oonRefreshProductsFailed(String errorMsg);
}
