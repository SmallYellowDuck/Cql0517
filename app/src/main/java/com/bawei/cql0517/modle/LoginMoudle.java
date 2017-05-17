package com.bawei.cql0517.modle;

import com.bawei.cql0517.presenter.onLoginfinishListener;

/**
 * Created by chengqianlang on 2017/5/17.
 */

public interface LoginMoudle {
    void loign(String name, String pass, onLoginfinishListener listener);
}
