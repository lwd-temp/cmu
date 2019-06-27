package cn.edu.cmu.framework;

import java.io.Serializable;

public class UserContext implements Serializable {

    private static ThreadLocal<String> loginEntityThreadLocal = new ThreadLocal<>();



    public static void removeUserSession() {
        loginEntityThreadLocal.remove();
    }


    /**
     * 设置当前线程的用户id
     * @param userId
     */
    public static void setUserId(String userId) {
        loginEntityThreadLocal.set(userId);
    }

    /**
     * 获取当前线程的 userid
     * @return
     */
    public static String getUserId() {
        return loginEntityThreadLocal.get();
    }
}
