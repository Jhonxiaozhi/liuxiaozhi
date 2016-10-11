package com.oneofive.ui.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BaseFragment extends Fragment {

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return super.onCreateView(inflater, container, savedInstanceState);
    }


//    public String currentAccount() {
//        SharedPreferences accountPref = SharedPreferenceUtils.LoginSp.getAccountPref(getActivity());
//        return SharedPreferenceUtils.LoginSp.getAccount(accountPref);
//    }
//
//    public String getCurrentDev(){
//        return SmartHomeApplication.getApplication().getCurrentDev();
//    }
//    public String getCurrentSn(){
//        return SmartHomeApplication.getApplication().getCurrentSn();
//    }


}
