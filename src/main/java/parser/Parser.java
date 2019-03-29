package parser;

import operator.Operator;
import parser.data.ParsedData;

import java.util.ArrayList;
import java.util.List;
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


        //숫자
        List<Integer> numbers = new ArrayList<>();

        //연산자
        List<Operator> operators = new ArrayList<>();


        IntStream.range(0, strings.length)
                .forEach(i -> {

                    if ((i+1) % 2 == 0) {//짝수 일경우

                        operators.add(Operator.of(strings[i]));

                    } else { //홀수 일경우

                        numbers.add(Integer.valueOf(strings[i]));
                    }

                });


        return ParsedData.builder()
                .numbers(numbers)
                .operators(operators)
                .build();
    }
}
