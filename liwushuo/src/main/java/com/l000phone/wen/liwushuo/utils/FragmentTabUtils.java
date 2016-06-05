package com.l000phone.wen.liwushuo.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.List;

/**
 * ----------BigGod be here!----------/
 * ***┏┓******┏┓*********
 * *┏━┛┻━━━━━━┛┻━━┓*******
 * *┃             ┃*******
 * *┃     ━━━     ┃*******
 * *┃             ┃*******
 * *┃  ━┳┛   ┗┳━  ┃*******
 * *┃             ┃*******
 * *┃     ━┻━     ┃*******
 * *┃             ┃*******
 * *┗━━━┓     ┏━━━┛*******
 * *****┃     ┃神兽保佑*****
 * *****┃     ┃代码无BUG！***
 * *****┃     ┗━━━━━━━━┓*****
 * *****┃              ┣┓****
 * *****┃              ┏┛****
 * *****┗━┓┓┏━━━━┳┓┏━━━┛*****
 * *******┃┫┫****┃┫┫********
 * *******┗┻┛****┗┻┛*********
 * ━━━━━━神兽出没━━━━━━
 *
 * 项目名称：XiaoHongShu
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-04-28 17:19
 * 修改人：zhangwei
 * 修改时间：2016-04-28 17:19
 * 修改备注：
 */

public class FragmentTabUtils implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup rgs;
    private FragmentManager fm;
    private List<Fragment> fragments;
    private int containerId;
    private OnTabSelected onTabSelected;
    private int index;

    public FragmentTabUtils(RadioGroup rgs, FragmentManager fm, int containerId, List<Fragment> fragments) {
        this(rgs, fm, containerId, fragments, null);
    }

    public FragmentTabUtils(RadioGroup rgs, FragmentManager fm, int containerId, List<Fragment> fragments, OnTabSelected onTabSelected) {
        this.rgs = rgs;
        this.fm = fm;
        this.containerId = containerId;
        this.fragments = fragments;
        this.onTabSelected = onTabSelected;
        rgs.setOnCheckedChangeListener(this);
        RadioButton childAt = (RadioButton) rgs.getChildAt(0);
        childAt.setChecked(true);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        for (int i = 0; i < rgs.getChildCount(); i++) {
            Fragment fragment = fragments.get(i);
            //说明当前子控件被选中
            if (checkedId == rgs.getChildAt(i).getId()) {
                index = i;
                if (!fragment.isAdded()) {
                    getFragmentTransaction().add(containerId, fragment).commit();
                }
                getFragmentTransaction().show(fragment).commit();

            } else {
                getFragmentTransaction().hide(fragment).commit();
            }
        }
        if (onTabSelected != null) {
            onTabSelected.onTabSelected(group, checkedId, index);
        }
    }

    private FragmentTransaction getFragmentTransaction() {
        FragmentTransaction transaction = fm.beginTransaction();
//        transaction.setCustomAnimations()
        return transaction;

    }


    public interface OnTabSelected {
        void onTabSelected(RadioGroup group, int checkId, int currentIndex);
    }


}
