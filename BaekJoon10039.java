import java.util.InputMismatchException;

/* 백준 코딩테스트 문제 10039 :
 * 상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.
 * 어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다. 
 * 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다. 
 * 하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 
 * 보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.
 * 학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.*/

/* 도출 방법 :
 * 1) 40점 미만의 수를 입력 받았을 시 40으로 반환
 * 2) 남은 값은 전부 더해서 5로 나눈 평균값을 냄
 * */

import java.util.Scanner;

public class BaekJoon10039 {
	public static void main(String[] args) {
		int avgScores = 0;

		Scanner scan = new Scanner(System.in);

		try {
			for (int i = 0; i < 5; i++) { // 총 다섯명이므로 for문 5번 반복
				System.out.print((i + 1) + "번쨰 시험 점수를 입력해주세요 : ");
				int score = scan.nextInt();
				
				if (score > 100) { // 시험 점수가 100점을 초과할 때
					System.out.println("거짓말하지 마세요.");
					i--;
//					scan.close();
//					scan = new Scanner(System.in);
					// break; // NoSuchElementException 에러를 방지하기 위함
				} else if (score < 0) { // 시험 점수가 음수 값일 때
					System.out.println("장난해요 지금?");
					i--;
//					scan.close();
//					scan = new Scanner(System.in);
					// break;
				} else if (score > 40) { // 시험 점수가 40점 이상이면 해당 점수를 avgScores에 대입
					avgScores += score;
				} else { // 40점 미만이면 40점을 대입
					avgScores += 40;
				}
			}
		} catch (InputMismatchException e) { // 숫자 아닌 값을 입력했을 때
			System.out.println("뭐하시는 거예요? 정수를 입력하세요!");
			main(args);
		}

        System.out.println("시험 점수의 평균은 " + (avgScores / 5) + "점 입니다.");

		scan.close();

	}
}
