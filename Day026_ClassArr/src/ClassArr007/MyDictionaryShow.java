package ClassArr007;

public class MyDictionaryShow {
	public void show(MyDictionary[] words) {
		System.out.println("=======================================");
		System.out.println("::::::::::::: DICTIONARY!");
		System.out.println("=======================================");
		System.out.println("No\tANSWER\tWORD");
		for(int i=1; i<=words.length; i++) {
			System.out.println(i+"\t"+words[i].getUserAnswer()+"\t"+
								words[i]);
		}
	}
	
	//생성자
	MyDictionaryShow(){}
}
