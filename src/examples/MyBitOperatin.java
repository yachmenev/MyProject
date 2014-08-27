package examples;
/*
В Java существуют следующие виды побитовых операций:
|	ИЛИ (OR)
&	И (AND)
^	ИСКЛЮЧАЮЩЕЕ ИЛИ (XOR)
~	ОТРИЦАНИЕ (NOT)

Так же стоит выделить операции битового сдвига:
<<	сдвиг влево
>>	сдвиг вправо
>>>	беззнаковый сдвиг вправо
 */
public class MyBitOperatin {
    public static void main(String[] args){
        int x = 123;
        int y = 456;
        /*
        побитовое ИЛИ (OR) '|'
        00000000 00000000 00000000 01111011 (123)
        |
        00000000 00000000 00000001 11001000 (456)
        =
        00000000 00000000 00000001 11111011 (507)
        */
        System.out.println("Побитовое ИЛИ (OR) '|'\n" +
                "123 | 456 = " + (x | y));
        System.out.println(Integer.toString(x, 2) + " | " + Integer.toString(y, 2) +
                " = " + Integer.toString((x | y), 2));

        /*
        побитовое И (AND) '&'
        00000000 00000000 00000000 01111011 (123)
        &
        00000000 00000000 00000001 11001000 (456)
        =
        00000000 00000000 00000000 01001000 (57)
        */
        System.out.println("Побитовое И (AND) '&'\n" +
                "123 & 456 = " + (x & y));
        System.out.println(Integer.toString(x, 2) + " & " + Integer.toString(y, 2) +
                " = " + Integer.toString((x & y), 2));

        /*
        исключающее ИЛИ (XOR) '^'
        00000000 00000000 00000000 01111011 (123)
        ^
        00000000 00000000 00000001 11001000 (456)
        =
        00000000 00000000 00000001 10110011 (435)
        */
        System.out.println("исключающее ИЛИ (XOR) '^'\n" +
                "123 ^ 456 = " + (x ^ y));
        System.out.println(Integer.toString(x, 2) + " ^ " + Integer.toString(y, 2) +
                " = " + Integer.toString((x ^ y), 2));

        /*
        побитовое отрицание (NOT) '~'
        ~
        00000000 00000000 00000000 01111011 (123)
        =
        11111111 11111111 11111111 10000100 (-124)
        */
        System.out.println("побитовое отрицание (NOT) '~'\n" +
                "~ 123 = " + (~123));
        System.out.println("~ " + Integer.toString(x, 2) + " = " +
                Integer.toString((~123), 2));

        /*
        знаковый оператор сдвига влево '<<'
        11111111 11111111 11111111 10000101 (-123)
        <<
        11111111 11111111 11111111 00001010 (-246)
        */
        System.out.println("знаковый оператор сдвига влево '<<'\n" +
                "-123 << = " + (-123 << 1));
        System.out.println(Integer.toString((-123), 2) + " = " +
                Integer.toString((-123 << 1), 2));

        /*
        знаковый оператор сдвига вправо '>>'
        11111111 11111111 11111111 10000101 (-123)
        >>
        11111111 11111111 11111111 11000010 (-246)
        */
        System.out.println("знаковый оператор сдвига вправо '>>'\n" +
                "-123 >> = " + (-123 >> 1));
        System.out.println(Integer.toString(-123, 2) + " = " +
                Integer.toString((-123 >> 1), 2));

         /*
        беззнаковый оператор сдвига вправо '>>>'
        11111111 11111111 11111111 10000101 (-123)
        >>>
        11111111 11111111 11111111 11000010 (-246)
        */
        System.out.println("знаковый оператор сдвига вправо '>>>'\n" +
                "-123 >>> = " + (-123 >>> 1));
        System.out.println(Integer.toString(-123, 2) + " = " +
                Integer.toString((-123 >>> 1), 2));


        System.out.println("57 -  " + Integer.toString(57, 2));
        System.out.println("123 - " + Integer.toString(123, 2));
        System.out.println("-123 - " + Integer.toString(-123, 2));
        System.out.println("0 - " + Integer.toString(0, 2));

        /*
        Хранение в одной целочисленной переменной нескольких значений
        При помощи битовых сдвигов можно хранить в одной целочисленной переменной
        несколько значений меньшей длины. Например, в первых нескольких битах можно
        хранить одно число, в следующих битах — другое. Требуется только знать,
        на сколько бит выполняется сдвиг и сколько бит занимает хранимое число.
        Для записи используется логическое ИЛИ, для получения — И.
        В следующем примере в одном числе сохраняются три значения —
        возраст, рост, вес, а затем считываются из него. Недостатком такой системы
        является необходимость помнить, что хранимые значения не должны превышать
        количество бит, которые определены для них. Например, если в примере одно
        из значений будет превышать число 255, то мы получим ошибочный результат.
        * */
        int age, height, weight, combined, mask;
        age = 28; //00011100
        height = 185; //10111001
        weight = 80; //01010000
        combined = (age) | (height << 8) | (weight << 16); //00000000 01010000 10111001 00011100

        mask = 255;

        System.out.printf("Age: %d, height: %d, weight: %d",
                mask & combined,
                mask & combined >>> 8,
                mask & combined >>> 16);

        System.out.println("\ncombined = "+ combined + " " + Integer.toString(combined, 2));
        System.out.println("mask = " + mask + " " + Integer.toString(mask, 2));
        //Age: 28, height: 185, weight: 80

    }

}