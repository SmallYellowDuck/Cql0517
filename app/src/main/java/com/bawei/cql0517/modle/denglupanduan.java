package com.bawei.cql0517.modle;

import android.text.TextUtils;

import com.bawei.cql0517.presenter.onLoginfinishListener;

/**
 * Created by chengqianlang on 2017/5/17.
 */

public class denglupanduan implements LoginMoudle {
    @Override
    public void loign(String name, String pass, onLoginfinishListener listener) {
        if (TextUtils.isEmpty(name)){
            listener.onUsernameError();
            return;
        }
        if (TextUtils.isEmpty(pass)){
            listener.onUserpassError();
            return;
        }else{
            listener.onSuccess();
        }

    }
}
