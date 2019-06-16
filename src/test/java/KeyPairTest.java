import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.bondary.domain.Keys;
import ua.bondary.service.DecryptService;
import ua.bondary.service.EncryptService;
import ua.bondary.service.Utils;

import static org.junit.Assert.assertTrue;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration()
public class KeyPairTest extends Assert {

   @Autowired
    ApplicationContext applicationContext;

   @Autowired
    EncryptService encryptService;

//    @Autowired
//    Utils utils;

    @Test
    public void testKeyPair() {
        assertTrue(true);
    }


    @Test
    public void testEncryptService() {
        Keys privateKey = new Keys(17,21);
        Keys publicKey = new Keys(5,21);

        long message = 19;

        EncryptService encryptService = new EncryptService();
        long e = encryptService.encryptMessage(publicKey,message);
        assertTrue(e == 10L);

        DecryptService decryptService = new DecryptService();
        decryptService.setPrivateKey(privateKey);
        assertTrue(decryptService.decrypt(e) == 19);
    }
}