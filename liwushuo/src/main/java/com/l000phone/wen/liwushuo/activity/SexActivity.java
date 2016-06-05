package com.l000phone.wen.liwushuo.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.l000phone.wen.liwushuo.R;


public class SexActivity extends AppCompatActivity {

    private String sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sex);
    }
    public void onClick(View view){
        Intent intent = new Intent(SexActivity.this,MainActivity.class);
        switch (view.getId()){
            case R.id.ib_boy:
              sex = "boy";
                break;
            case R.id.ib_girl:
                sex = "girl";
                break;
        }
        SharedPreferences sp = SexActivity.this.getSharedPreferences("sex", MODE_PRIVATE);
        sp.edit().putBoolean("falg", true).commit();
        intent.putExtra("sex", sex);
        startActivity(intent);
        finish();
    }
}
