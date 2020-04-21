package com.example.travelmap;


import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import androidx.fragment.app.Fragment;

public class FragmentLogin extends Fragment {


    public FragmentLogin() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_login, container, false);
    }

}
