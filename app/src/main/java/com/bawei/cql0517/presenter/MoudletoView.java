package com.bawei.cql0517.presenter;

import com.bawei.cql0517.modle.LoginMoudle;
import com.bawei.cql0517.modle.denglupanduan;
import com.bawei.cql0517.view.LoginView;

/**
 * Created by chengqianlang on 2017/5/17.
 */

public class MoudletoView implements LoginPresenter,onLoginfinishListener {

    private LoginView mLoginView;
    private LoginMoudle mLoginMoudle;

    public MoudletoView(LoginView loginView) {
        mLoginView = loginView;
        mLoginMoudle=new denglupanduan();
    }


    @Override
    public void onYanzheng(String name, String pass) {
        mLoginMoudle.loign(name,pass,this);
    }

    @Override
    public void onDestroy() {
mLoginView=null;
    }

    @Override
    public void onUsernameError() {
        if (mLoginView!=null){
            mLoginView.setUsernameError();
        }
    }

    @Override
    public void onUserpassError() {
        if (mLoginView!=null){
            mLoginView.setUserpassError();
        }
    }

    @Override
    public void onSuccess() {
        if (mLoginView!=null){
            mLoginView.denglu();
        }
    }
}
