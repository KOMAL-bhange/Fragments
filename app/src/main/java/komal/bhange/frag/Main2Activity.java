package komal.bhange.frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Button button1,button2;
   // private MenuItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1=findViewById(R.id.button2);
        button2=findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            loadFragment(new FirstFragment());// pass a fragments call by constructor
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new SecondFragment());// pass a fragments call by constructor
            }
        });
    }

    private void loadFragment(Fragment fragment) {
      //  FragmentManager fragmentManager=getFragmentManager();  // andorid.app  libary
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction(); // for andorix libary
        fragmentTransaction.replace(R.id.container_fragments,fragment);
        fragmentTransaction.commit();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item1) {
        // Handle item selection
        switch (item1.getItemId()) {

            case R.id.action_Webview:
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
                Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item1);
        }
    }
}
