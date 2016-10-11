package com.oneofive.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oneofive.R;
import com.oneofive.api.ResponeseEntity.ProductsBean;
import com.oneofive.presenter.ProductPresenter;
import com.oneofive.presenter.view.ProductsFragmentParentView;
import com.oneofive.ui.adapter.ProductsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1509a on 2016/8/29.
 */
public class ProductsFragment extends BaseFragment implements ProductsFragmentParentView {
    private  RecyclerView rvShare;
    private LinearLayoutManager rVLinearLayoutManager;
    private ProductsAdapter productsAdapter;
    private SwipeRefreshLayout refreshLayout;
    private ProductPresenter productPresenter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LayoutInflater layoutInflater=LayoutInflater.from(getActivity());
        View view=layoutInflater.inflate(R.layout.fragment_products,container,false);
        setupRefreshLayout(view);
        setupShareRecyclerView(view);
        productPresenter=new ProductPresenter(this);
        return view;
    }
    private void setupRefreshLayout(View view) {
        refreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.shareRefreshLayout);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshRecyclerView();
            }
        });
    }
    private void refreshRecyclerView() {
        if(refreshLayout == null || productPresenter == null)
            return;
        refreshLayout.setRefreshing(true);
        productPresenter.refreshProducts();
    }
    private void setupShareRecyclerView(View view) {
        rvShare = (RecyclerView) view.findViewById(R.id.rv_products);
        rVLinearLayoutManager = new LinearLayoutManager(getActivity()) {
            @Override
            protected int getExtraLayoutSpace(RecyclerView.State state) {
                return 600;
            }
        };
        rvShare.setLayoutManager(rVLinearLayoutManager);
        rvShare.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
        productsAdapter = new ProductsAdapter(getActivity());
        rvShare.setAdapter(productsAdapter);
    }

    @Override
    public void onRefreshProductsSuccess(final List<ProductsBean> arrayList, boolean toUpdate) {

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                productsAdapter.setData(arrayList);
                productsAdapter.notifyDataSetChanged();
                refreshLayout.setRefreshing(false);
            }
        });
    }

    @Override
    public void oonRefreshProductsFailed(String errorMsg) {

    }
}
