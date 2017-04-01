package cn.ucai.superwechat.db;

import android.content.Context;

/**
 * Created by clawpo on 2017/3/29.
 */

public interface IUserModel {
    void register(Context context,String username,String nickname,String password,
                  OnCompleteListener<String> listener);
    void login(Context context,String username,String password,
                  OnCompleteListener<String> listener);
    void unregister(Context context,String username,OnCompleteListener<String> listener);
    void loadUserInfo(Context context,String username,OnCompleteListener<String> listener);
    void updateUserNick(Context context,String username,String nickname,OnCompleteListener<String> listener);
}
