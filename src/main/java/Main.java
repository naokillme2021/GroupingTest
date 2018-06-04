import entities.TestEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // テスト用エンティティのリスト
        List<TestEntity> entities = new ArrayList<>();

        // 同じObjectidでvalueが違うデータが2件ずつ入るようにする
        for (int i = 0; i < 5; i++) {
            TestEntity entity1 = new TestEntity();
            entity1.setObjectId(i);
            entity1.setStr("ほげほげ");
            entities.add(entity1);

            TestEntity entity2 = new TestEntity();
            entity2.setObjectId(i);
            entity2.setStr("ふがふが");
            entities.add(entity2);
        }

        // 単一のキーにリストのValueを持たせて実現する。
        HashMap<Integer, List<TestEntity>> map = new HashMap<>();

        for (TestEntity entity : entities) {
            if (map.get(entity.getObjectId()) == null) {
                map.put(entity.getObjectId(), new ArrayList<>(Arrays.asList(entity)));
            } else {
                map.get(entity.getObjectId()).add(entity);
            }
        }

        //表示
        for (int id : map.keySet()) {
            System.out.println(id + " => " + map.get(id));
        }
    }
}
