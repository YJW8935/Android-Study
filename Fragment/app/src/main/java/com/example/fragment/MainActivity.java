package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FirstFragment FirstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment = new FirstFragment();

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,FirstFragment).commit();
            } // getSupportFragmentManager() : FragmentManager를 반환하는 메소드
            // 프래그먼트를 추가, 삭제, 또는 교체 등의 작업을 할 수 있게 해줌
        });
    }
    // beginTransaction() : 오류가 생기면 다시 원상태로 돌아오게 트랜잭션 객체를 만들어 실행
    // replace() : 실행시킬 프래그먼트 입력
    // commit() : 트랜잭션을 완료시키고 프래그먼트를 띄우기

    public void onChangeFragment(int index) {
        if(index == 0){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,FirstFragment).commit();
        }
    }
}