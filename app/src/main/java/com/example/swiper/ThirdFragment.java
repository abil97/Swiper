package com.example.swiper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

/* The third page (third fragment)*/
public class ThirdFragment extends Fragment {

    public ThirdFragment () {
// Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_three, container, false);
    }

    // All widgets (buttons, textViews, etc.) will be displayed only after fragment is created
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        // Setting up imageButton and TextView
        ImageButton dogeButton = getView().findViewById(R.id.dogeButton);
        dogeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You've clicked on me!",
                        Toast.LENGTH_LONG).show();
            }
        });

        // Setting up a snackbar
        Snackbar snackbar = Snackbar.make(getActivity().findViewById(R.id.pager),
                "Snackbar. Page 3",
                Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("Action", new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(), "You've clicked on Snackbar on Page 3!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }
}
