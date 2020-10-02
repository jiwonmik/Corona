package com.example.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static final int sub = 1001; /*다른 액티비티를 띄우기 위한 요청코드(상수)*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //검색
        SearchView searchView;
        searchView = findViewById(R.id.main_search);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                //검색 버튼이 눌러졌을 때 이벤트 처리
                Toast.makeText(MainActivity.this,"검색 처리됨 : "+query, Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //검색어가 변경되었을 때 이벤트 처리
                return false;
            }
        });

        //최근 확진자 발견 위치 버튼
        Button location_Btn = (Button) findViewById(R.id.location_btn);
        location_Btn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LocationActivity.class);
                startActivityForResult(intent, sub);
            }
        });

   }

   }