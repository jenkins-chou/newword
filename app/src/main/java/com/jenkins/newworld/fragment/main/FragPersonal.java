package com.jenkins.newworld.fragment.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jenkins.newworld.R;
import com.jenkins.newworld.activity.LivePlayActivity;
import com.jenkins.newworld.activity.LiveRecordActivity;
import com.jenkins.newworld.activity.TestActivity;
import com.jenkins.newworld.util.CommonDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * Created by zhouzhenjian on 2018/4/9.
 */

public class FragPersonal extends Fragment {
    //data
    private Context context;
    @OnClick(R.id.personal_setting) void personal_setting_action(){
        //CommonDialog.showBaseDialog(context,"personal_setting");
        Intent intent = new Intent(this.getContext(), TestActivity.class);
        startActivity(intent);
        this.getActivity().overridePendingTransition(0,R.anim.activity_vertical_open);
    }
    @OnClick(R.id.personal_attention_more)void personal_attention_more(){
        CommonDialog.showSuccessDialog(context,"Hey!!","personal_attention_more");
    }
    @OnClick(R.id.live_record)void live_record(){
        Intent intent = new Intent(context, LiveRecordActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.live_play)void live_play(){
        Intent intent = new Intent(context, LivePlayActivity.class);
        startActivity(intent);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_main_personal,container,false);
        context = view.getContext();
        ButterKnife.bind(this,view);
        return view;
    }
}
