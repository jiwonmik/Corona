package com.example.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button MapButton;
    private Button ChatButton;
    private Button WebButton;
    private Button location_Btn;

//    public static final int sub = 1001; /*다른 액티비티를 띄우기 위한 요청코드(상수)*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼 이벤트
        MapButton = (Button)findViewById(R.id.map_button);
        ChatButton = (Button)findViewById(R.id.chat_button);
        WebButton = (Button)findViewById(R.id.web_button);
        //최근 확진자 발견 위치 버튼
        location_Btn = (Button)findViewById(R.id.location_btn);

        MapButton.setOnClickListener(this);
        ChatButton.setOnClickListener(this);
        WebButton.setOnClickListener(this);
        location_Btn.setOnClickListener(this);
          //검색
//        final SearchView searchView = (SearchView)findViewById(R.id.main_search);
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                //검색 버튼이 눌러졌을 때 이벤트 처리-> 검색시 그 위치정보를 지도로 보일 수 잇어야함
//                return true;
//            }
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                //검색어가 변경되었을 때 이벤트 처리
//                return true;
//            }
//        });
    }

    //버튼(map, chat수정해야함)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.map_button:
                startActivity(new Intent(getApplicationContext(),WebActivity.class));
                break;
            case R.id.chat_button:
                startActivity(new Intent(getApplicationContext(),WebActivity.class));
                break;
            case R.id.web_button:
                startActivity(new Intent(getApplicationContext(),WebActivity.class));
                break;
            case R.id.location_btn:
                startActivity(new Intent(this,LocationActivity.class));
                break;

//                Intent intent = new Intent(getApplicationContext(),LocationActivity.class);
//                startActivityForResult(intent, sub);
            default:
                break;
        }
    }

   }
