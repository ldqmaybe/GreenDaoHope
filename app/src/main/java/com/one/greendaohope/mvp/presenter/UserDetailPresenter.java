package com.one.greendaohope.mvp.presenter;

import com.one.greendaohope.entity.UserEntity;
import com.one.greendaohope.mvp.contact.UserDetailContact;
import com.one.greendaohope.ui.UserDetailActivity;
import com.one.greendaohope.util.DBUtils;

/**
 * @author LinDingQiang
 * @time 2019/8/22 15:18
 * @email dingqiang.l@verifone.cn
 */
public class UserDetailPresenter implements UserDetailContact.Presenter {
    private UserDetailActivity context;

    public UserDetailPresenter(UserDetailActivity context) {
        this.context = context;
    }


    @Override
    public void updateUser(UserEntity userEntity) {
        DBUtils.updateUser(userEntity);
        context.updateSuccess(userEntity);
    }
}
