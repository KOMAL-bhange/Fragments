package komal.bhange.frag;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleFragment extends Fragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    View view;
    Button button;
    EditText editText;
        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
            // Inflate the layout for this fragment
            view= inflater.inflate(R.layout.fragment_simple, container, false);
            editText=view.findViewById(R.id.editText2);
            button=view.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainActivity.textView.setText(editText.getText().toString().trim());
                    Toast.makeText(getActivity(), "Fragment Done", Toast.LENGTH_SHORT).show();
                }
            });
            return view;
        }
    }