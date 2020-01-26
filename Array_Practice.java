package com.kh.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice {
   Scanner sc = new Scanner(System.in);
   public void practice1() {
      // 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 
      // 배열 인덱스에 넣은 후 그 값을 출력
      
      int[] arr = new int[10];
      
      for(int i = 0; i < arr.length; i++) {
         arr[i] += i + 1;
         System.out.print(arr[i] + " ");
      }
   }
   
   public void practice2() {
      // 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 
      // 배열 인덱스에 넣은 후 그 값을 출력
      
      int[] arr = new int[10];
      for(int i = 0; i < arr.length; i++) {
         arr[i] = i + 1;
         System.out.print(11 - arr[i] + " ");
      }
   }
   
   public void practice3() {
      // 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 
      // 배열에 초기화 한 후 출력
      
      System.out.println("양의 정수 : ");
      int size = sc.nextInt();
      
      int[] arr = new int[size];
      for(int i = 0; i < arr.length; i++) {
         arr[i] += i + 1;
         System.out.print(arr[i] + " ");
      }
   }
   
   public void practice4() {
      // 길이가 5인 String 배열을 선언하고 "사과", "귤", "포도", "복숭아", "참외"
      // 로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하라
      
      String[] arr = {"사과","귤","포도","복숭아","참외"};
      
      System.out.println(arr[1]);
   }
   
   public void practice5() {
      // 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에
      // 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
   
   System.out.println("문자열 : ");
    String word = sc.nextLine();
    System.out.println("문자 : ");
    char ch = sc.nextLine().charAt(0);
    
    char[] arr = new char[word.length()];
    char[] charIndex = new char[word.length()];
    
    for(int i = 0; i < word.length(); i++) {
       arr[i] = word.charAt(i);
    }
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
       if(arr[i] == ch) {
          count++;
          charIndex[i] = ch;
       }
    }
    System.out.print(word + "에 " + ch + "가 존재하는 위치(인덱스) : ");
    for(int i = 0; i < charIndex.length; i++) {
       if(charIndex[i] != '\u0000') {
            System.out.print(i + " ");
         }
    }
    System.out.println();
    System.out.println(ch + "의 개수 : " + count);
 }
    public void practice6() {
         // "월" ~ "일"까지 초기화 된 문자열을 만들고 0부터 6까지
         // 숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는 요일 출력
         // 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다"를 출력
         
        System.out.println("0 ~ 6 사이 숫자 입력 : ");
        int num = sc.nextInt();
        if(num >= 7) {
           System.out.println("잘못 입력하셨습니다.");
        }
        
        String[] day = {"월","화","수","목","금","토","일"};
        for(int i = 0; i < day.length; i++) {
           day[i] += i;
           if(i == num) {
              System.out.println(day[i].charAt(0) + "요일");
           }
        }
      }
     
      public void practice7() {
         // 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 
         // 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요
         // 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
         
         System.out.println("정수 : ");
         int size = sc.nextInt();
         
         int[] arr = new int[size];
         
         int num = 0;
         int sum = 0;
         for(int i = 0; i < arr.length; i++) {
            System.out.println("배열 " + i +"번째 인덱스에 넣을 값 : ");
            num = sc.nextInt();
            arr[i] += num;
//            System.out.print(num + " ");
         }
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
         }
         System.out.println();
         System.out.println("총 합 : " + sum);
      }
      
      public void practice8() {
         // 3 이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         // 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력
         // 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요" 출력하고 다시 정수 받아라
         
        System.out.println("정수 : ");
        int num = sc.nextInt();
        
        if (num % 2 == 0 || num < 3) {
           System.out.println("다시 입력하세요");
        } else {
        
        int count = 0;
        // count 변수 선언은 for문의 i값이 증가만하기 때문에 결과 출력이
        // 커지거나 작아질 수 있는 유동성이 있는 경우 변수를 새로 선언하는 것이 낫다
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++) {
           if(i < (num /2 +1 )) {
              count++;
              arr[i] = count;
           } else {
              count--;
              arr[i] = count;
           }
        }
        for(int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }
      }
      } 
      public void practice9() {
         // 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 "000 치킨 배달 가능", 
         // 없으면 "000 치킨은 없는 메뉴입니다"를 출력
         // 단, 치킨 메뉴가 들어가있는 배열은 스스로 정할 
         
         System.out.println("치킨 이름을 입력하세요 : ");
         String userMenu = sc.nextLine();
         
         String[] menu = {"후라이드","양념","간장","반반"};
         
         boolean check = false;
        for(int i = 0; i < menu.length; i++) {         
           if(userMenu.equals(menu[i])) {
              check = true;
           } 
        }
         if(check) {
            System.out.println(userMenu + "치킨 배달 가능");
         } else {
            System.out.println(userMenu + "치킨은 없는 메뉴입니다.");
         }
      }
      public void practice10() {
         // 주민번호 성별자리 이후부터 *로 가리고 출력하라
         // 단 원본 배열 값은 변경 없이 배열 복사본으로 변경
         
         System.out.println("주민등록번호(-포함");
         char jumin = sc.nextLine().charAt(0);
         
         char[] arr;
         
//         for(int i = 0; i < jumin.length(); i++) {
//            arr[i] = jumin.charAt(i);
//         }
      }
      
      public void practice11() {
         // 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당
         // 1~10 사이의 난수를 발생시켜 배열에 초기화 한 후 출력
         
         int[] arr = new int[10];
         
         for(int i = 0; i < arr.length; i++) {
         int random = (int)(Math.random() * 10) + 1;
            arr[i] += random; 
         }
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
      }
      
      public void practice12() {
         // 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당
         // 1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체 값과 그 값 중에서
         // 최대값과 최소값을 출력
         
         int[] arr = new int[10];
         
         for(int i = 0; i < arr.length; i++) {
         int random = (int)(Math.random() * 10) + 1;
            arr[i] = random; 
         }
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
         
         Arrays.sort(arr);
         System.out.println();
         System.out.print("최대값 : " + arr[9]);
         System.out.println();
         System.out.print("최소값 : " + arr[0]);
      }
      
      public void practice13() {
         // 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         // 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화 한 후 출력
         
         // 중복된 값이 있으면 난수 재생성
         // 값이 같으면 난수를 재생성해서 배열에 넣기
         // if(arr[i] == random) 으로 조건문 넣어봤지만 안됨 
         // 일단은 배열에 랜덤값을 넣고 전체값과 비교해서 같은 값만 
         
         int[] arr = new int[10];
         
         for(int i = 0; i < arr.length; i++) {
            int random = (int)(Math.random() * 10) + 1;
            arr[i] = random;
            for(int j = 0; j < i; j++) {
            	if(arr[i] == arr[j]) {
            		i--;
            	}
            }
         }
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
      }
}

























