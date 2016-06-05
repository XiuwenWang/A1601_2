package com.l000phone.wen.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.l000phone.wen.recyclerview.adapter.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ImageView imgCardView;
    private TextView tvCardView;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView)findViewById(R.id.rv);

//        View inflate = LayoutInflater.from(this).inflate(R.layout.card_view, null);
//        imgCardView = (ImageView)inflate.findViewById(R.id.iv_card_view);
//        tvCardView = (TextView)inflate.findViewById(R.id.tv_card_view);

        recyclerView.setLayoutManager(getLayoutManager());
        MyAdapter adapter = new MyAdapter(getData());
        recyclerView.setAdapter(adapter);

    }

    private RecyclerView.LayoutManager getLayoutManager() {
        return new GridLayoutManager(this,2);
    }

    private ArrayList<String> getData() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 120; i++) {
            list.add("测试RecyclerView" + i);
        }
        return list;
    }


}
