package com.example.abratu.factoryserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.abratu.factoryserver.Interface.ItemClickListener;
import com.example.abratu.factoryserver.R;

import org.w3c.dom.Text;



public class OrderViewHolder extends RecyclerView.ViewHolder  {

    public TextView txtOrderId, txtOrderStatus,txtOrderPhone, txtOrderAddress;

    public Button btnEdit, btnRemove, btnDetails, btnDirection;

//    private ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderAddress = (TextView)itemView.findViewById(R.id.order_address);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);

        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);
        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);
        btnDetails = (Button)itemView.findViewById(R.id.btnDetails);
        btnDirection = (Button)itemView.findViewById(R.id.btnDirection);

//        itemView.setOnClickListener(this);
//        itemView.setOnCreateContextMenuListener(this);
//        itemView.setOnLongClickListener(this);
    }


}
