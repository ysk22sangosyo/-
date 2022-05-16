package jp.co.axiz.app;

public class CardGameApp extends GameApp implements App {
 public CardGameApp() {
	 
 }
 public CardGameApp(String item) {
	 super(item);
	 setplayTime(5) ;	
 }
 @Override
 protected String play() {
	 String tranpStart= ("ババ抜きを行います。");
	 return tranpStart;
 }
}
