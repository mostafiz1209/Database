package myappsapps.com.customlistviewdemo;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductListAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Product> arrayList;

    public ProductListAdapter(Context mContext, ArrayList<Product> arrayList) {
        this.mContext = mContext;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContext, R.layout.item_product_list, null);
        TextView tvName = (TextView) v.findViewById(R.id.tv_name);
        TextView tvPrice = (TextView) v.findViewById(R.id.tv_price);
        TextView tvDescription = (TextView) v.findViewById(R.id.tv_description);

        // Set text for TextView

        tvName.setText(arrayList.get(position).getName());
        tvPrice.setText(String.valueOf(arrayList.get(position).getPrice()) + " $");
        tvDescription.setText(arrayList.get(position).getDescription());

        // Save product id to tag

        v.setTag(arrayList.get(position).getId());


        return v;
    }
}
