package com.example.swiper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;



/* This is the first page (first fragment)  */
public class FirstFragment extends Fragment {

    public FirstFragment () {
// Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    // Snackbar will be set up only after fragment is constructed.
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


        // Setting up the snackbar
        Snackbar snackbar = Snackbar.make(getActivity().findViewById(R.id.pager),
                "Snackbar. Page 1",
                Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("Action", new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(), "You've clicked on Snackbar on Page 1!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }


}
