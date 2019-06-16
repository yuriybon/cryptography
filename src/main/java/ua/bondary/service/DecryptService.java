package ua.bondary.service;

import org.springframework.beans.factory.annotation.Autowired;
import ua.bondary.domain.Keys;

public class DecryptService {

    private Keys privateKey;

    @Autowired
    Utils utils;

    public DecryptService() {}

    public void setPrivateKey(Keys privateKey) {
        this.privateKey = privateKey;
    }

    public long decrypt(long message) {
        long res = Utils.power(message,privateKey.getKey());
        System.out.println(res);
        return  res % privateKey.getGeneral();
    }
}
