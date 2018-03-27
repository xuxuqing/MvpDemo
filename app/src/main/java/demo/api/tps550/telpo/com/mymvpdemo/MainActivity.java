package demo.api.tps550.telpo.com.mymvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import demo.api.tps550.telpo.com.mymvpdemo.mode.MainMode;
import demo.api.tps550.telpo.com.mymvpdemo.presenter.MainPersenter;
import demo.api.tps550.telpo.com.mymvpdemo.view.MainView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,MainView{

    private TextView tv_context;

    private MainPersenter mainPersenter = new MainPersenter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_context = (TextView) findViewById(R.id.tv_context);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);

        mainPersenter.setView(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                mainPersenter.setViewText(new MainMode("第一"));
                break;
            case R.id.button2:
                mainPersenter.setViewText(new MainMode("第二"));

                break;
            case R.id.button3:
                mainPersenter.clearViewText();

                break;
            default:
                break;
        }
    }

    @Override
    public void setNameText(MainMode mode) {

        tv_context.setText(mode.getName());
    }

    @Override
    public void clearNameText() {

        tv_context.setText("");
    }
}
