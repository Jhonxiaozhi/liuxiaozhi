package com.oneofive.ui.adapter;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.oneofive.R;
import com.oneofive.api.ResponeseEntity.ProductsBean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1509a on 2016/8/29.
 */
public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder> {
    private final Context context;
    private List<ProductsBean> arrayList = new ArrayList<>();

    public ProductsAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<ProductsBean> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public ProductsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_products,parent,false);
        ProductsViewHolder productsViewHolder=new ProductsViewHolder(view);
        return productsViewHolder;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public void onBindViewHolder(ProductsViewHolder holder, int position) {
        holder.tvDetails.setText(arrayList.get(position).getPname());
        holder.tvName.setText(arrayList.get(position).getPname());
    }

    public class ProductsViewHolder extends RecyclerView.ViewHolder {
        TextView tvDetails,tvName;
        ImageView ivProducts;
        public ProductsViewHolder(View itemView) {
            super(itemView);
            ivProducts = (ImageView) itemView.findViewById(R.id.item_product_img);
            tvDetails = (TextView) itemView.findViewById(R.id.item_product_detials);
            tvName = (TextView) itemView.findViewById(R.id.item_product_name);
        }
    }
}
