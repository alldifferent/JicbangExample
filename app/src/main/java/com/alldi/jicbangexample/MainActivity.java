package com.alldi.jicbangexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alldi.jicbangexample.adapters.RoomAdapter;
import com.alldi.jicbangexample.databinding.ActivityMainBinding;
import com.alldi.jicbangexample.datas.Room;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RoomAdapter mRoomAdapter;
    List<Room> roomList = new ArrayList<>();
    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
        fillRooms();

    }

    void fillRooms(){

        roomList.add(new Room(500,35,"서구 둔산동", 7, "타임월드 인근"));
        roomList.add(new Room(500,45,"동구 둔산동", 3, "갤러리 백화점 부근"));
        roomList.add(new Room(500,35,"북구 둔산동", 20, "둔산동 아너스빌"));
        roomList.add(new Room(500,35,"남구 둔산동", 2, "시세대비 저렴"));
        roomList.add(new Room(500,40,"서구 둔산동", 15, "리치빌 오피스 15평형"));
        roomList.add(new Room(500,35,"북구 둔산동", 15, "시청역 부근"));
        roomList.add(new Room(500,35,"서구 둔산동", 7, "타임월드 인근"));
        roomList.add(new Room(500,45,"동구 둔산동", 3, "갤러리 백화점 부근"));
        roomList.add(new Room(500,35,"북구 둔산동", 20, "둔산동 아너스빌"));
        roomList.add(new Room(500,35,"남구 둔산동", 2, "시세대비 저렴"));
        roomList.add(new Room(500,40,"서구 둔산동", 15, "리치빌 오피스 15평형"));
    }

    void setupEvents(){


    }

    void setValues(){

        mRoomAdapter = new RoomAdapter(MainActivity.this, roomList);
        act.roomListView.setAdapter(mRoomAdapter);

    }

    void bindViews(){


    }


}
