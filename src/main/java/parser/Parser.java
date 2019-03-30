package parser;

import parser.data.Numbers;
import parser.data.Operators;
import parser.data.ParsedData;
import parser.data.SplitedData;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * input을 파싱하는 클래스
 */
public class Parser {
    private final String SPLIT_REGEX = "[-+*/]";

    /**
     * input을 파싱해서 검증하고 결과값을 제공하는 메서드.
     *
     * @param input 유저가 입력한 string
     * @return 숫자, 연산자를 가지는 객체
     */
    public Optional<ParsedData> parsing(String input) {
        SplitedData splitedData = splitNumAndOperator(input, SPLIT_REGEX);

        List<Integer> numbers;

        try {

            //숫자
            numbers = splitedData.getNumbers()
                    .stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

        } catch (NumberFormatException e) {
            return Optional.empty();
        }

        //연산자
        Operators operators = Operators.of(splitedData.getOperators());

        if (numbers.size() <= operators.size()) {
            return Optional.empty();
        }


        return Optional.of(ParsedData.builder()
                .numbers(Numbers.of(numbers))
                .operators(operators)
                .build());
    }


    /**
     * 사용자 입력을 숫자와 연산자로 분리하는 메서드.
     *
     * @param input 유저가 입력한 값
     * @param regex 숫자, 연산자를 나눌 정규식 표현
     * @return 숫자, 연산자를 담는 객체
     */
    public SplitedData splitNumAndOperator(String input, String regex) {
        //숫자
        List<String> numbers = new LinkedList<>();

        //연산자
        List<String> operators = new LinkedList<>();


        int last = 0;

        Pattern pattern = Pattern.compile(regex);

        Matcher m = pattern.matcher(input);

        while (m.find()) {

            //숫자 추가
            numbers.add(input.substring(last, m.start()));

            //연산자 추가
            operators.add(m.group());

            last = m.end();
        }

        //마지막 숫자 추가
        numbers.add(input.substring(last));


        return SplitedData.builder()
                .numbers(numbers)
                .operators(operators)
                .build();
    }

}
