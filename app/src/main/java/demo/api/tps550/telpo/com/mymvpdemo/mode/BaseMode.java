package demo.api.tps550.telpo.com.mymvpdemo.mode;

import java.io.Serializable;

/**
 *
 * @author xx
 * @date 2018/3/24
 */

public interface BaseMode<T> extends Serializable {

    /**
     * 加载数据
     * @return
     */
    T loadData();
}
