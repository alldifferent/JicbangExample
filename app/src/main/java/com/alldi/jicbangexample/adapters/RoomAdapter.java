package com.alldi.jicbangexample.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.alldi.jicbangexample.R;
import com.alldi.jicbangexample.datas.Room;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;


    public RoomAdapter(Context context, List<Room> list){
        super(context, R.layout.room_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        if (row == null){
            row = inf.inflate(R.layout.room_list_item, null);

        }

        Room roomData = mList.get(position);

        TextView paymemtTxt = row.findViewById(R.id.paymentTxt);
        TextView localTxt = row.findViewById(R.id.localTxt);
        TextView contextTxt = row.findViewById(R.id.contextTxt);

        paymemtTxt.setText(String.format("%d/%d", roomData.deposit,roomData.month_pay));
        localTxt.setText(String.format("%s, %d층",roomData.loaction,roomData.floor));
        contextTxt.setText(roomData.description);

        return row;

    }
}
