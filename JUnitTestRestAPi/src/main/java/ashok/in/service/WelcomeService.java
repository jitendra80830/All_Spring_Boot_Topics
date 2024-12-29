package ashok.in.service;

import ashok.in.dao.MsgDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    @Autowired
    public MsgDao msgDao;

    public String getMgs(){
        String msg = msgDao.getMsg();
        return msg;
    }
    public String getGreetMsg(){
        String msg = msgDao.getMsg();
        return msg;
    }

}
