package com.united_programmers.theh;

/**
 * Created by lenroywisdom-bashford on 2015-11-16.
 */


        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Public_list extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.public_list,container,false);
        return v;
    }
}