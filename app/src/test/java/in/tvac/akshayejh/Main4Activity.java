package in.tvac.akshayejh.firebasesearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
ImageButton ib,ib1,ib2,ib3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ImageButton ib=(ImageButton)findViewById(R.id.appointment);
        ImageButton ib1=(ImageButton)findViewById(R.id.orders);
        ImageButton ib2=(ImageButton)findViewById(R.id.history);
        ImageButton ib3=(ImageButton)findViewById(R.id.search);

    }
    public void onAppoinClick(View v){
        Toast.makeText(this,"appointments",Toast.LENGTH_LONG).show();
    }
    public void onOrderClick(View v){
        Toast.makeText(this,"orders",Toast.LENGTH_LONG).show();
    }
    public void onHistoryClick(View v){
        Toast.makeText(this,"History",Toast.LENGTH_LONG).show();
    }
    public void onSearchClick(View v){
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}
