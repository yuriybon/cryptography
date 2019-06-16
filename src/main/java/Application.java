import java.security.Key;

public class Application {
    public static long getAilerFunction(int p, int q) {

        //return 12;
        return (p-1)*(q-1);
    }

    static long power(long a, long b){
        long result = 1;
        for (int i=1; i<=b; i++){
            result = result*a;
        }
        return result;
    }

    public static long encrypt(KeyPair publicKey, long message) {
        long res = power(message,publicKey.key);
        System.out.println(res);
        return  res % publicKey.general;
    }

    public static long decrypt(KeyPair privateKey, long message) {
        long res = power(message,privateKey.key);
        
        System.out.println(res);
        return  res % privateKey.general;
    }

    public static void main(String[] args) {
        System.out.println("Test");
        KeyPair publicKeyPair = new KeyPair(5,21);
        KeyPair privateKeyPair = new KeyPair(17,21);
        long message = 19;
        long encryptedMessage = encrypt(publicKeyPair,message);
        System.out.println(encryptedMessage);

        long decryptedMessage = encrypt(privateKeyPair,encryptedMessage);
        System.out.println(decryptedMessage);

    }
}
