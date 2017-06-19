package myappsapps.com.fragmentappdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mostafiz-pc on 3/9/2017.
 */
    public class Fragment_two extends Fragment {
        View v2;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            v2= inflater.inflate(R.layout.fragment_two_layout,container,false);
            return v2;
        }

    }
