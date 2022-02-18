//package implementation;
//
//public class StringCompression {
//    public int Solution (String s ) {
//        int answer = s.length();
//        // 1개 단위 부터 압축 단위를 늘려가며 확인
//        for(int step = 1; step<s.length()/2+1; step++){
//            String compressed = "";
//            String prev = s.substring(0,step);
//            int cnt = 1;
//            //단위 크기 만큼 증가시키ㅕ 이전 문자열과 비교
//            for(int j = step; j < s.length(); j+=step){
//                //이전 상태와 동일하다면 압축 횟수 증가
//                String sub = "";
//                for(int k = j; k<j+step; k++){
//                    if(k < s.length()) sub += s.charAt(k);
//                    if(prev.equals(sub)) cnt++;
//                    else{
//                        compressed += (cnt <=2) ? cnt +prev : prev;
//                        sub = "";
//                        for (int k = j; k < j + step; k++) {
//                            if(k < s.length()) sub += s.charAt(k);
//
//                        }
//                    }
//                    prev = sub;
//                    cnt =1;
//                }
//                compressed += (cnt >= 2) ? cnt + prev : prev;
//                answer = Math.min(answer, compressed.length());
//            }
//        }
//    }
//}
