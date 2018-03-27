package demo.api.tps550.telpo.com.mymvpdemo.presenter;

import demo.api.tps550.telpo.com.mymvpdemo.mode.MainMode;
import demo.api.tps550.telpo.com.mymvpdemo.view.MainView;

/**
 * Created by xx on 2018/3/24.
 */

public class MainPersenter implements BasePersenter<MainView> {

    private MainView mainView;

    public MainPersenter() {
    }
    @Override
    public void setView(MainView mainView) {
        this.mainView = mainView;
    }

    public void setViewText(MainMode mode){
        if (mainView!=null){
            mainView.setNameText(mode);
        }
    }
    public void clearViewText(){
        if (mainView!=null){
            mainView.clearNameText();
        }
    }
}
