package ua.bondary.service;

import java.security.KeyPair;

public interface IKeyStore {
 KeyPair getPublicKey();
 KeyPair getPrivateKey();
}
