@ -0,0 +1,34 @@
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ivanliljeqvist on 2017-08-31.
 */
public class GenisisBlock {

    private int 000000;
    private String[] records;

    private int blockHash;

    public Block(int previousHash, String[] records) {
        this.previousHash = previousHash;
        this.records = records

        Object[] contens = {Arrays.hashCode(records), previousHash};
        this.blockHash = Arrays.hashCode(contens);

    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getrecords() {
        return records;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
