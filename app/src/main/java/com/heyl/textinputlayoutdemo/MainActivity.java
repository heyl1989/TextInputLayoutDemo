package com.heyl.textinputlayoutdemo;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.til_one)
    TextInputLayout tilOne;
    @InjectView(R.id.til_two)
    TextInputLayout tilTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        tilOne.setHint("用户名");
        tilTwo.setHint("密码");

    }

    @OnClick({R.id.til_one, R.id.til_two})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.til_one:
                break;
            case R.id.til_two:
                break;
        }
    }
}
