package entities;

/**
 * GetterとSetterを持つ、標準的なクラス。
 */
public class TestEntity {

    private int objectId;

    private String str;

    /**
     * フィールドの値を取得します。
     */
    public int getObjectId() {
        return objectId;
    }

    /**
     * フィールドに値を入れます。
     */
    public void setObjectId(int param) {
        objectId = param;
    }

    /**
     * フィールドの値を取得します。
     */
    public String getStr() {
        return str;
    }

    /**
     * フィールドに値を入れます。
     */
    public void setStr(String param) {
        str = param;
    }
}
