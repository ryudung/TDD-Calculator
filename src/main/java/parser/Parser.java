package parser;

import parser.data.Numbers;
import parser.data.ParsedData;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * input을 파싱하는 클래스
 */
public class Parser {

    /**
     * input을 파싱해서 숫자, 연산자를 제공하는 메서드
     *
     * @param input 유저가 입력한 string
     * @return 숫자, 연산자를 가지는 객체
     */
    public ParsedData parsing(String input) {


        String[] strings = input.trim().split("");


        //연산자
        List<String> operators = IntStream.range(0, strings.length)
                .filter(i -> i % 2 != 0)//홀수 일경우
                .mapToObj(i -> strings[i])
                .collect(Collectors.toList());

        //숫자
        List<Integer> numbers = IntStream.range(0, strings.length)
                .filter(i -> i % 2 == 0)//짝수 일경우
                .mapToObj(i -> Integer.parseInt(strings[i]))
                .collect(Collectors.toList());


        return ParsedData.builder()
                .numbers(Numbers.of(numbers))
                .operators(operators)
                .build();
    }
}
