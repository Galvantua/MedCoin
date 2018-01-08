@ -0,0 +1,34 @@
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ivanliljeqvist on 2017-08-31.
 */
public class Block {

    private int previousHash;
    private String[] records;

    private int blockHash;

    public Block(int previousHash, String[] records) {
        this.previousHash = previousHash;
        this.records = records

        Object[] contens = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contens);

    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
