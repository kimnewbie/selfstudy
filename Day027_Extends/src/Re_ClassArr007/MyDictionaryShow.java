package Re_ClassArr007;

public class MyDictionaryShow {
	public void show(MyDictionary[] words) {
		System.out.println("=======================================");
		System.out.println("::::::::::::: DICTIONARY!");
		System.out.println("=======================================");
		System.out.println("No\tANSWER\tWORD");
		
		for(int i=1; i<=words.length; i++) {
			System.out.println(words[i].getDno()+"\t"+words[i].getUserAnswer()+"\t"+
								words[i].getWord());
		}
		System.out.println("정답 개수 : " + MyDictionary.trueAnswer);
	}
	
	//생성자
	MyDictionaryShow(){}
}
