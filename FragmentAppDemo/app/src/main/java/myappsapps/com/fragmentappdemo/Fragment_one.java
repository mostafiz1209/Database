package myappsapps.com.fragmentappdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mostafiz-pc on 3/9/2017.
 */
public class Fragment_one extends Fragment {
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.fragment_one_layout,container,false);
        return v;
    }

}
