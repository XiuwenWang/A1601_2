package com.l000phone.wen.xiaohongshu.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.l000phone.wen.xiaohongshu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotFragment extends Fragment {


    public static HotFragment newInstance() {

        Bundle args = new Bundle();
        HotFragment fragment = new HotFragment();
        fragment.setArguments(args);
        return fragment;
    }


    public HotFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getChildFragmentManager();
        return inflater.inflate(R.layout.fragment_hot, container, false);
    }

}
