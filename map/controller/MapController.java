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
//    Ű ��ü�� �ߺ��� ���Ÿ� ���� hashCode()�� equals()�� �������̵� �ؾ��ϴµ� �Ź� �������̵� �ϴ� ���� ���ŷӱ� ������ String, Integer, wrapper�� 
//    ���� �̹� �������̵��� �Ǿ� �ִ� Ŭ������ ���
      
//    put(K key, V value) : Ű�� �� �߰�, ���� �� ���� ��ȯ
      map.put("�����", new Snack("§��",1500));
      map.put("������", new Snack("�ܸ�",2500));
      map.put("��������Ĩ", new Snack("§��", 1500));
      map.put("��ҹ�", new Snack("����Ѹ�", 1000));
      
      System.out.println(map);
//      �Է��� ������ ��µ��� ���� ���� ���ĵ� ����ϴµ� ���� ����
//      {������=�ܸ�[2500��], �����=§��[1500��], ��������Ĩ=§��[1500��], ��ҹ�=����Ѹ�[1000��]}
      
      map.put("�����", new Snack("�ſ��", 1500));
      System.out.println(map);
//      ����� § ������ �ſ������ ���� ���� ������
//      {������=�ܸ�[2500��], �����=�ſ��[1500��], ��������Ĩ=§��[1500��], ��ҹ�=����Ѹ�[1000��]}
      
      
//      Ű �Ǵ� ���� �ִ��� ������ Ȯ���ϴ� �޼ҵ�
//      containsKey(Object key) : key�� ������ true ��ȯ
//      containsValue(Object value) : value�� ������ true ��ȯ
      System.out.println(map.containsKey("�����")); // true
      System.out.println(map.containsValue(new Snack("§�� ", 1500))); // false �ּҰ��� �޶� false ��ȯ
      
//      get(Object key) : Ű�� �� ��ȯ
      System.out.println(map.get("�����"));   // �ſ��[1500��]
      System.out.println(map.get("Ȩ����"));   // null
      
//      �� ��� ���
//      1. values() : ��� value�� Collection�� ��� ��ȯ
      System.out.println(map.values());
//      [�ܸ�[2500��], �ſ��[1500��], §��[1500��], ����Ѹ�[1000��]]
      
      
//      Iterator()�޼ҵ�� Collection �������̽��� ���ǵ� �޼����̹Ƿ� Collection�� �ڼ��� List�� Set���� ���ԵǾ� ����
//      Map�� Collection�� �ڼ��� �ƴϱ� ������ iterator()�޼ҵ尡 ������ �ȵǾ� �ְ� iterator�� ����Ϸ��� keySet()�̳� entrySet() �޼ҵ带 ����ؼ� set���� ��ȯ���� �ٲ� �� �� iterator() ��� 
//      2. keySet()   : ��� Ű�� set�� ��� ��ȯ
      Set<String> set1 = map.keySet();   // Ű�� ��Ƴ��� ���� set1�� ��� ����
      System.out.println(set1);      // [������, �����, ��������Ĩ, ��ҹ�]
      
      Iterator<String> it = set1.iterator(); // ������ ������Ʈ�� �����ϱ� ���� Iterator ��� 
      while(it.hasNext()) {
         String key = it.next();      
         System.out.println("Ű : " + key + ", �� : " + map.get(key));
//         Ű : ������, �� : �ܸ�[2500��]
//         Ű : �����, �� : �ſ��[1500��]
//         Ű : ��������Ĩ, �� : §��[1500��]
//         Ű : ��ҹ�, �� : ����Ѹ�[1000��]
      }
      System.out.println();
      
//      3. entrySet() : ��� entry ��ü(Ű + ���� ��)�� set�� ��� ��ȯ / ���� ��� ��
      Set<Entry<String, Snack>> set2 = map.entrySet();
      Iterator<Entry<String,Snack>> it2 = set2.iterator();
      while(it2.hasNext()) {
         Entry<String, Snack> entry = it2.next();
         System.out.println("Ű : " + entry.getKey() + "�� : " + entry.getValue());
//         Ű : �������� : �ܸ�[2500��]
//         Ű : ������� : �ſ��[1500��]
//         Ű : ��������Ĩ�� : §��[1500��]
//         Ű : ��ҹ̰� : ����Ѹ�[1000��]
      }
      
      
//      TreeMap�� ����� ���ÿ� �ڵ����� �������� ����
      Map<String, Snack> map2 = new TreeMap<String, Snack>();
      map2.putAll(map);      // map�� �ִ� ��ü�� ��� map2�� ����
      System.out.println(map2);
//      String�� comparable�� �����Ǿ� �ִµ� key�� String���� ���س��ұ� ������ ������������ �ڵ� ���ĵ� 
//      {��ҹ�=����Ѹ�[1000��], ������=�ܸ�[2500��], �����=�ſ��[1500��], ��������Ĩ=§��[1500��]}
   }   
   
   public void doProperties() {
      Properties prop = new Properties();
      prop.setProperty("ä��", "����");
      prop.setProperty("����", "���");
      prop.setProperty("����", "����");
      prop.setProperty("ä��", "�Ǹ�");
      System.out.println(prop);
//      {����=���, ä��=�Ǹ�, ����=����}
      
      System.out.println(prop.getProperty("ä��"));      // �Ǹ�
      System.out.println(prop.getProperty("ä��", "����"));   // �Ǹ�
      System.out.println(prop.getProperty("�߰�", "����"));   // ����    
//      ù��°�� �ִ� ���� Ű�� ������ �� ���� ��ȯ. ù��°�� �ִ� ���� Ű�� ������ �ڿ� �ִ� ���� ��ȯ
   }
   
   public void fileSave() {
//      try(FileOutputStream fos = new FileOutputStream("test.properties");){
      try(FileOutputStream fos = new FileOutputStream("test.xml");){
         
         Properties prop = new Properties();
         prop.setProperty("title", "Properties Practice");
         prop.setProperty("language", "kor");
         
//         store(OutputStream os, String comments)
//          store(Writer writer, String comments)
//         os(�Ǵ� writer)�� prop����(����Ʈ �Ǵ� ������������), comments�� �ּ����� ����
         
//         prop.store(fos, "Properties Test File");   // Property ������ ������ �� �ִ� ����
         
//         StoreToXML(OutputStream os, String comment)
//         ����� ������ ����Ʈ ��Ʈ������ xml ��� ����
         prop.storeToXML(fos, "storeToXML Test");
         
//         ���� ����
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
         
//         load(InputStream is) : is�� �ִ� Properties �о�ͼ� Properties��ü�� ����
//         load(Reader reader) : ���� ��Ʈ������ ����� ������ ������ �о�ͼ� Properties��ü�� ����
         
//         prop.load(fis);
         
//         loadFromXML(InputStream is)
//         : ����Ʈ��Ʈ������ ����� xml ������ ������ �о�ͼ� Properties��ü�� ����
         prop.loadFromXML(fis);
         System.out.println(prop);      // {title=Properties Practice, language=kor}
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch(IOException e) {
         e.printStackTrace();
      }
}

   }



