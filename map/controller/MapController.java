package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.vo.Snack;

public class MapController {
   public void doMap() {
      Map<String, Snack> map = new HashMap<String, Snack>();
//    키 객체는 중복값 제거를 위해 hashCode()와 equals()를 오버라이딩 해야하는데 매번 오버라이딩 하는 것이 번거롭기 때문에 String, Integer, wrapper와 
//    같은 이미 오버라이딩이 되어 있는 클래스를 사용
      
//    put(K key, V value) : 키와 값 추가, 성공 시 값을 반환
      map.put("새우깡", new Snack("짠맛",1500));
      map.put("다이제", new Snack("단맛",2500));
      map.put("포테이토칩", new Snack("짠맛", 1500));
      map.put("고소미", new Snack("고소한맛", 1000));
      
      System.out.println(map);
//      입력한 순서로 출력되지 않음 값이 겹쳐도 출력하는데 지장 없음
//      {다이제=단맛[2500원], 새우깡=짠맛[1500원], 포테이토칩=짠맛[1500원], 고소미=고소한맛[1000원]}
      
      map.put("새우깡", new Snack("매운맛", 1500));
      System.out.println(map);
//      새우깡 짠 맛에서 매운맛으로 값이 덮어 씌워짐
//      {다이제=단맛[2500원], 새우깡=매운맛[1500원], 포테이토칩=짠맛[1500원], 고소미=고소한맛[1000원]}
      
      
//      키 또는 값이 있는지 없는지 확인하는 메소드
//      containsKey(Object key) : key가 있으면 true 반환
//      containsValue(Object value) : value가 있으면 true 반환
      System.out.println(map.containsKey("새우깡")); // true
      System.out.println(map.containsValue(new Snack("짠맛 ", 1500))); // false 주소값이 달라서 false 반환
      
//      get(Object key) : 키의 값 반환
      System.out.println(map.get("새우깡"));   // 매운맛[1500원]
      System.out.println(map.get("홈런볼"));   // null
      
//      값 출력 방법
//      1. values() : 모든 value를 Collection에 담아 반환
      System.out.println(map.values());
//      [단맛[2500원], 매운맛[1500원], 짠맛[1500원], 고소한맛[1000원]]
      
      
//      Iterator()메소드는 Collection 인터페이스에 정의된 메서드이므로 Collection의 자손인 List와 Set에도 포함되어 있음
//      Map은 Collection의 자손이 아니기 때문에 iterator()메소드가 포함이 안되어 있고 iterator을 사용하려면 keySet()이나 entrySet() 메소드를 사용해서 set으로 반환값을 바꿔 준 후 iterator() 사용 
//      2. keySet()   : 모든 키를 set에 담아 반환
      Set<String> set1 = map.keySet();   // 키를 모아놓은 것을 set1에 담아 놓음
      System.out.println(set1);      // [다이제, 새우깡, 포테이토칩, 고소미]
      
      Iterator<String> it = set1.iterator(); // 각각의 엘리먼트에 접근하기 위해 Iterator 사용 
      while(it.hasNext()) {
         String key = it.next();      
         System.out.println("키 : " + key + ", 값 : " + map.get(key));
//         키 : 다이제, 값 : 단맛[2500원]
//         키 : 새우깡, 값 : 매운맛[1500원]
//         키 : 포테이토칩, 값 : 짠맛[1500원]
//         키 : 고소미, 값 : 고소한맛[1000원]
      }
      System.out.println();
      
//      3. entrySet() : 모든 entry 객체(키 + 값의 쌍)를 set에 담아 반환 / 많이 사용 됨
      Set<Entry<String, Snack>> set2 = map.entrySet();
      Iterator<Entry<String,Snack>> it2 = set2.iterator();
      while(it2.hasNext()) {
         Entry<String, Snack> entry = it2.next();
         System.out.println("키 : " + entry.getKey() + "값 : " + entry.getValue());
//         키 : 다이제값 : 단맛[2500원]
//         키 : 새우깡값 : 매운맛[1500원]
//         키 : 포테이토칩값 : 짠맛[1500원]
//         키 : 고소미값 : 고소한맛[1000원]
      }
      
      
//      TreeMap은 저장과 동시에 자동으로 오름차순 정렬
      Map<String, Snack> map2 = new TreeMap<String, Snack>();
      map2.putAll(map);      // map에 있는 객체를 모두 map2에 넣음
      System.out.println(map2);
//      String에 comparable이 구현되어 있는데 key를 String으로 정해놓았기 때문에 오름차순으로 자동 정렬됨 
//      {고소미=고소한맛[1000원], 다이제=단맛[2500원], 새우깡=매운맛[1500원], 포테이토칩=짠맛[1500원]}
   }   
   
   public void doProperties() {
      Properties prop = new Properties();
      prop.setProperty("채소", "오이");
      prop.setProperty("과일", "사과");
      prop.setProperty("간식", "젤리");
      prop.setProperty("채소", "피망");
      System.out.println(prop);
//      {과일=사과, 채소=피망, 간식=젤리}
      
      System.out.println(prop.getProperty("채소"));      // 피망
      System.out.println(prop.getProperty("채소", "땅콩"));   // 피망
      System.out.println(prop.getProperty("견과", "땅콩"));   // 땅콩    
//      첫번째에 있는 값이 키에 있으면 그 값을 반환. 첫번째에 있는 값이 키에 없으면 뒤에 있는 값을 반환
   }
   
   public void fileSave() {
//      try(FileOutputStream fos = new FileOutputStream("test.properties");){
      try(FileOutputStream fos = new FileOutputStream("test.xml");){
         
         Properties prop = new Properties();
         prop.setProperty("title", "Properties Practice");
         prop.setProperty("language", "kor");
         
//         store(OutputStream os, String comments)
//          store(Writer writer, String comments)
//         os(또는 writer)에 prop저장(바이트 또는 문자형식으로), comments는 주석으로 저장
         
//         prop.store(fos, "Properties Test File");   // Property 형식을 저장할 수 있는 파일
         
//         StoreToXML(OutputStream os, String comment)
//         저장된 정보를 바이트 스트림으로 xml 출력 저장
         prop.storeToXML(fos, "storeToXML Test");
         
//         파일 내용
//         <comment>storeToXML Test</comment>
//         <entry key="title">Properties Practice</entry>
//         <entry key="language">kor</entry>
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch(IOException e) {
         e.printStackTrace();
      }
   }
   public void fileOpen() {
//      try (FileInputStream fis = new FileInputStream("test.properties");){
      try (FileInputStream fis = new FileInputStream("test.xml");){
         
         Properties prop = new Properties();
         
//         load(InputStream is) : is에 있는 Properties 읽어와서 Properties객체에 저장
//         load(Reader reader) : 문자 스트림으로 저장된 파일의 내용을 읽어와서 Properties객체에 저장
         
//         prop.load(fis);
         
//         loadFromXML(InputStream is)
//         : 바이트스트림으로 저장된 xml 파일의 내용을 읽어와서 Properties객체에 저장
         prop.loadFromXML(fis);
         System.out.println(prop);      // {title=Properties Practice, language=kor}
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch(IOException e) {
         e.printStackTrace();
      }
}

   }



