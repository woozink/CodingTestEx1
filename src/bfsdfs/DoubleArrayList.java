package bfsdfs;

import java.util.ArrayList;

public class DoubleArrayList {

    public static void main(String[] args) {

        //arraylist의 제너릭안에 arraylist를 한 번 더 사용한다.
        ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();

        ArrayList<String> data1 = new ArrayList<>();
        data1.add("1");
        data1.add("2");
        data1.add("3");

        ArrayList<String> data2 = new ArrayList<>();
        data2.add("11");
        data2.add("22");
        data2.add("33");

        ArrayList<String> data3 = new ArrayList<>();
        data3.add("111");
        data3.add("222");
        data3.add("333");

        //2차 arraylist에 1차 arraylist 집어넣기
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);

        System.out.println(datas.size());
        //결과: 3
        System.out.println(datas.toString());
        //결과: [[1, 2, 3], [11, 22, 33], [111, 222, 333]]

        System.out.println(datas.get(0));
        //결과: [1, 2, 3]

        System.out.println("\n------");
        //일반 for문 사용하기
        for(int i=0; i<datas.size(); i++) {
            for(int j=0; j<datas.get(i).size(); j++) {
                System.out.print("\t" + datas.get(i).get(j));
                //결과
                //1	    2	 3
                //11	22	 33
                //111	222	 333
            }
            System.out.println();
        }

        System.out.println("\n------");
        //향상된 for문 사용하기
        for(ArrayList<String> data: datas) {
            System.out.println(data);
            //[1, 2, 3]
            //[11, 22, 33]
            //[111, 222, 333]
        }
    }
}
