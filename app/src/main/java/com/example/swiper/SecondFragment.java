package com.example.swiper;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;


/* Second page (second fragment) */
public class SecondFragment extends Fragment {

    public SecondFragment () {
// Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    // All widgets (buttons, textViews, etc.) will be displayed only after fragment is created
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        // Setting up buttons and text views
        Button btn = getView().findViewById(R.id.button);
        final EditText editText = getView().findViewById(R.id.editText);
        final TextView textView = getView().findViewById(R.id.fragmentTwoText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText());
            }
        });

        // Setting up a snackbar
        Snackbar snackbar = Snackbar.make(getActivity().findViewById(R.id.pager),
                "Snackbar. Page 2",
                Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("Action", new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(), "You've clicked on Snackbar on Page 2!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }
}
