package printer;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 프린트를 도와주는 유틸클래스.
 * */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Printer {

    private static final String SPACE = " ";

    /**
     * SPACE와 함께 print하는 메서드
     *
     * @param s 첫번째 파라미터
     * @param i 두번째 파라미터
     */
    public static void printOutWithSpace(String s, String i) {
        String message = appendWithSpace(s, i);

        print(message);
    }

    /**
     * SPACE와 함께 print하는 메서드
     *
     * @param r 첫번째 파라미터
     * @param s 두번째 파라미터
     * @param i 세번째 파라미터
     */
    public static void printOutWithSpace(String r, String s, String i) {

        String message = appendWithSpace(r, s, i);

        print(message);
    }

    /**
     * 주어진 String[]에 " " 값을 더하여 합친 결과를 제공하는 메서드.
     *
     * 예) String[]{"a","b","c","d"}
     *     결과: "a b c d"
     *
     * @param strings String 배열
     *
     * @return strings를 모두 append한 결과값
     * */
    private static String appendWithSpace(String... strings) {
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            result.append(str).append(SPACE);
        }

        return result.toString();
    }

    /**
     * 주어진 String 값을 출력하는 메서드.
     *
     * @param str 출력할 값
     * */
    public static void print(String str) {
        System.out.println(str);
    }
}
