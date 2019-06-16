package ua.bondary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.bondary.domain.Keys;

@Service
public class EncryptService {

    @Autowired
    Utils utils;

public long encryptMessage(Keys publicKeys, long message) {
    //utils.power()
    long res = utils.power(message,publicKeys.getKey());
    System.out.println(res);
    return  res % publicKeys.getGeneral();

}
}
