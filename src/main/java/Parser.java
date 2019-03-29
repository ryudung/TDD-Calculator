import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * input을 파싱하는 클래스
 *
 * */
public class Parser {

    /**
     * @param input 유저가 입력한 string
     * @return
     * */
    public void parsing(String input) {

        char[] chars = input.toCharArray();

        //숫자
        List<Integer> numbers = new ArrayList<>();

        //연산자
        List<String> operators = new ArrayList<>();

        IntStream.range(0, chars.length)
                .forEach(i-> System.out.println(chars[i]));


    }
}
