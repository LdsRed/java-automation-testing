package junit5test;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {


    @ParameterizedTest(name = "Run: {index} -- Value: {arguments}")
    @ValueSource(ints = {20, 40, 10, 2, 0})
    void intValues(int theParam) {
        System.out.println("theParam = " + theParam);
    }


    @ParameterizedTest(name = "String: {index} --- Value: {arguments}")
    @NullAndEmptySource
    @ValueSource(strings = {"firstString", "secondString"})
    void strings(String theParam) {
        System.out.println("theParam = " + theParam);
    }


    @Order(value = 1)
    @ParameterizedTest
    @CsvSource(value = {"Draven, 22, true", "Darius, 34, False", "Garen, 23, true"})
    void csvSource_StringIntBoolean(String param, int param2, boolean param3){
        System.out.println("param = " + param + ", param2 = " + param2 + ", param3 = " + param3);
    }

    @ParameterizedTest
    @CsvSource(value = {"James Clear, 'Steve, Rogers'", "Malfoi Lucius, 'Jordan,Larcher'"})
    void csvSource_StringWithComa(String param, String param2){
        System.out.println("param = " + param + ", param2 = " + param2 );
    }

    @ParameterizedTest
    @CsvSource(value = {"Jordan?Larcher", "Sara?Fantini"}, delimiter = '?')
    void csvSource_StringWithDiffDelimiters(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

}
