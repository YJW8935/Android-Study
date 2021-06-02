package com.example.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {

    MainActivity mainActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity)getActivity();
    }
    //onAttach() : 액티비티와 프래그먼트를 붙일 때 호출되는 메소드
    //사용할 액티비티는 MainActivity, getActivity()로 액티비티를 찾기
    //버튼 클릭 시 액티비티의 메소드를 호출


    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }
    // onDetach() : 프래그먼트가 액티비티로부터 떨어지는 단계

    @Nullable

    @Override //inflate를 위한 메소드
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup)inflater.inflate(R.layout.fragment_first, container, false);
        Button button3 = (Button)view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.onChangeFragment(1);
            } //액티비티에서 프래그먼트를 바꾸기 위해 정의할 메소드
        });
        return view;
    }
}