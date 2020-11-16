package Day036;


import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap005_answer {
    public static void main(String[] args) {
    	int total = 0;
    	double avg = 0;
        HashMap<String,Integer> map = new HashMap<>();
        map.put("first", new Integer(90)); map.put("second", new Integer(88)); 
        map.put("third", new Integer(100)); map.put("four", new Integer(72)); map.put("five", new Integer(94));
        
        System.out.println("=================\nNAME\tSCORE\n=================");
        Iterator<Entry<String,Integer>> iter = map.entrySet().iterator(); // 1. key, value 쌍으로 리스트 모으기
        while (iter.hasNext()){ // 2. 처리 대상의 유무 확인
            Entry<String,Integer> temp = iter.next();
            System.out.println(temp.getKey() + "\t" + temp.getValue() + "\n-------------");
            total += temp.getValue();
        }
        System.out.println("참가자 명단" + map.keySet());

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (double)total/map.size());
        System.out.println("최고점수 : " + Collections.max(map.values()));
        System.out.println("최고점수 : " + Collections.min(map.values()));

    }
}
