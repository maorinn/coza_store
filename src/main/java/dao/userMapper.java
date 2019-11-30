package dao;

import ben.userBen;
import java.util.List;
/*
* 此接口用来声明各表的dao方法需要完成的功能
*
* */
public interface userMapper {
    public List<userBen> queryUser();

    public boolean upUser(userBen user);

    public boolean deUser(int user_id);

    public boolean addUser(userBen user);
}
