import java.math.BigInteger;
import java.security.SecureRandom;

public class DiffieHellman {

    BigInteger privateKey(BigInteger prime) {
        SecureRandom random = new SecureRandom();

        return BigInteger.valueOf(
                random.longs(1, 1, prime.longValue())
                        .findFirst()
                        .orElseThrow());
    }

    BigInteger publicKey(BigInteger prime, BigInteger primitiveRoot, BigInteger privateKey) {
        return primitiveRoot.modPow(privateKey, prime);
    }

    BigInteger secret(BigInteger prime, BigInteger publicKey, BigInteger privateKey) {
        return publicKey.modPow(privateKey, prime);
    }

}