package com.bawei.cql0517.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bawei.cql0517.R;
import com.bawei.cql0517.presenter.MoudletoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,LoginView {

    private EditText etname;
    private EditText etpass;
    private Button but;
    private MoudletoView mMoudletoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        etname = (EditText) findViewById(R.id.etname);
        etpass = (EditText) findViewById(R.id.etpass);
        but = (Button) findViewById(R.id.but);
        but.setOnClickListener(this);
        mMoudletoView = new MoudletoView(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but:
mMoudletoView.onYanzheng(etname.getText().toString().trim(),etpass.getText().toString().trim());
                break;
        }
    }

    @Override
    public void setUsernameError() {
        etname.setError("账号为空");
    }

    @Override
    public void setUserpassError() {
        etpass.setError("密码为空");
    }

    @Override
    public void denglu() {
        Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
    }
}
