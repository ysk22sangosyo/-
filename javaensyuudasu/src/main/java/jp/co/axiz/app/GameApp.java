package jp.co.axiz.app;

public abstract class GameApp implements App{
	//フィールド
	private String item;
	//アクセサー
	public String getitem() {
        return this.item;
    }

    public void setitem(String item) {
        this.item = item;
    }
    
    
	 private int playTime;
	 
	 //アクセサー
	 public int getplayTime() {
		 return this.playTime;
	 }
	 
	 public void setplayTime(int playTime) {
	        this.playTime = playTime;
	    }
	
	//コンストラクタ
	 public GameApp() {
		
	}
	public GameApp(String item) {
		this.item =item;
	}
	public GameApp(int playTime) {
		this.playTime =playTime;
	}
	
	//メソッド
	protected  abstract String play();
	public  String start(String userName) {
		String gameStart= (userName+"さんと"+ item +"でゲームを開始します"+ play());
		 return gameStart;
	}
}