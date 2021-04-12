package Algorithnm; // 이진탐색법 알고리즘

import java.util.Scanner; 

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("검색할 데이터를 입력하세요");
        Scanner sc = new Scanner(System.in); // sc = 변수
        int search = sc.nextInt();
        int[] dataArray = {11,13,17,19,23,29,31};
        Bsearch(dataArray, search);   // 메소드에 보내기

    }
    public static void Bsearch(int[] arr,int search) {
        int head = 0;
        int tail = arr.length -1; //초기화
        int center;

        while (head <= tail) {
            center = (head+tail)/2;
            
            if (arr[center] == search) {
                System.out.println(center+"번째의 요소가 일치");
                break;
            } 
            if (arr[center] < search) {
                head = center + 1;
            } else {
                tail = center - 1;
            }
        }   
        if (head > tail) {
            System.out.println("찾지 못했습니다.");
        }
    }
}
