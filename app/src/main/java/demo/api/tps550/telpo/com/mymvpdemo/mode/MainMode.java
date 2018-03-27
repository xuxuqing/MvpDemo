package demo.api.tps550.telpo.com.mymvpdemo.mode;

/**
 * Created by xx on 2018/3/24.
 */

public class MainMode implements BaseMode {
    private String name = "";

    public MainMode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
