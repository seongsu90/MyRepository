package ch13.exam06;

public class CompareMethodExample2 {

	public static void main(String[] args) {
		Pair<String,String> p1 =new Pair<String,String>("name","홍길동");
		Pair<String,String> p2 =new Pair<String,String>("name","김가을");
		
		Pair<String,Integer> p3 =new Pair<String,Integer>("name",1);
		Pair<String,Integer> p4 =new Pair<String,Integer>("name",2);
		
		Pair<String,String> result=Util.max(p1,p2);
		Pair<String,Integer> result2=Util.max(p3,p4);
		System.out.println(result);
		System.out.println(result2);
	}

}
