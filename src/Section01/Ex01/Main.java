package Section01.Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("==자바 텍스트 게시판==");
        System.out.println("==프로그램 시작==");
        int postNum = 1;
        while(true){
            System.out.print("명령) ");
            String cmd = sc.nextLine();

            if (cmd.equals("usr/article/write")){
                System.out.printf("입력된 명령어 : %s\n",cmd);
                System.out.println("==게시물 등록==");

                System.out.print("제목: ");
                String title = sc.nextLine();
                System.out.print("내용: ");
                String detail = sc.nextLine();

                System.out.printf("%d번 게시물이 등록되었습니다.\n",postNum);
                postNum++;
            }
            else if (cmd.equals("exit")){
                System.out.printf("입력된 명령어 : %s\n",cmd);
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else {
                System.out.println("명령어를 잘못 입력하셨습니다");
            }
        }

        System.out.println("==프로그램 종료==");

        sc.close();
    }
}
