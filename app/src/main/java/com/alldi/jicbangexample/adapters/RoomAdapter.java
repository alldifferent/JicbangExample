package com.alldi.jicbangexample.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

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


}
