package parser;

import parser.data.ParsedData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * input을 파싱하는 클래스
 */
public class Parser {

    /**
     * @param input 유저가 입력한 string
     * @return
     */
    public ParsedData parsing(String input) {

        String[] strings = input.split("");


        //숫자
        List<Integer> numbers = new ArrayList<>();

        //연산자
        List<String> operators = new ArrayList<>();


        IntStream.range(0, strings.length)
                .forEach(i -> {

                    if ((i+1) % 2 == 0) {//짝수 일경우

                        operators.add(String.valueOf(strings[i]));

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
