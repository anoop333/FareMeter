package gocars.mainproject.faremeter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void clickme(View view)
    {
        int id=view.getId();
        switch (id)
        {
            case R.id.imageView:
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                intent.putExtra("fare","10");
                startActivity(intent);
                break;
            case R.id.imageView2:
                Intent i=new Intent(Main2Activity.this,MainActivity.class);
                i.putExtra("fare","9");
                startActivity(i);
                break;
            case R.id.imageView3:
                Intent b=new Intent(Main2Activity.this,MainActivity.class);
                b.putExtra("fare","20");
                startActivity(b);
                break;
            case R.id.imageView4:
                Intent c=new Intent(Main2Activity.this,MainActivity.class);
                c.putExtra("fare","15");
                startActivity(c);
                break;



        }
    }
}
