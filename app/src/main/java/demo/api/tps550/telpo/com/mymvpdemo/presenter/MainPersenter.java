package demo.api.tps550.telpo.com.mymvpdemo.presenter;

import java.lang.ref.WeakReference;

import demo.api.tps550.telpo.com.mymvpdemo.mode.MainMode;
import demo.api.tps550.telpo.com.mymvpdemo.view.MainView;

/**
 * Created by xx on 2018/3/24.
 */

public class MainPersenter implements BasePersenter<MainView> {

    private MainView mainView;
    private MainMode mode;

    public MainPersenter() {
    }
    @Override
    public void setView(MainView mainView) {
        WeakReference<MainView> mainViewWeakReference = new WeakReference<>(mainView);
        this.mainView = mainViewWeakReference.get();

        MainMode mode = new MainMode();
        WeakReference<MainMode> mainmodeWeakReference = new WeakReference<>(mode);
        this.mode = mainmodeWeakReference.get();
    }

    public void setViewText(){
        if (mainView!=null && mode!=null){
            mainView.setNameText(mode.loadData());
        }
    }
    public void clearViewText(){
        if (mainView!=null){
            mainView.clearNameText();
        }
    }
}
