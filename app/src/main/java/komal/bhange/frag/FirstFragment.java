package komal.bhange.frag;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;


public class FirstFragment extends Fragment {
View view;
Button button;
ToggleButton toggleButton1,toggleButton2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_first, container, false);
        button=view.findViewById(R.id.button);
        toggleButton1=view.findViewById(R.id.toggleButton1);
        toggleButton2=view.findViewById(R.id.toggleButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status= "ToggleButton1"+toggleButton1.getText() +"\n"+ "ToggleButton2"+toggleButton2.getText();
                Toast.makeText(getActivity(),status, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}