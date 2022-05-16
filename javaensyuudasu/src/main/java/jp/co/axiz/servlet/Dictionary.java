package jp.co.axiz.servlet;

import java.util.HashMap;

/**
 * 英単語情報を保持するためのクラス
 */
public class Dictionary {

    /**
     * HashMap (Key：英語、Value：日本語)
     */
    private HashMap<String, String> dictionaryInfo;


    public Dictionary() {

    	dictionaryInfo = new HashMap<String, String>();
    	
    	//HashMapの情報
        dictionaryInfo.put("apple","りんご");
        dictionaryInfo.put("orange","みかん");
        dictionaryInfo.put("peach","もも");
        dictionaryInfo.put("grape","ぶどう");
        dictionaryInfo.put("pear","なし");
        
      
        	
       
    }



    public void setDictionaryInfo(HashMap<String, String> dictionaryInfo) {
        this.dictionaryInfo = dictionaryInfo;
    }

    public HashMap<String, String> getDictionaryInfo() {
        return dictionaryInfo;
    }

}