package lesson_9;

public class ThrowableMetodLess {
    // обработка исключений. Error (throwable) необрабатываемые исключения, не отлавливаются? ! ?
    // Exception - Runtime - не всегда обрабатываются, однако лежат на ответственности программиста. (деление на ноль,
    // выход за границу массива и т.п.)
    // обрабатываем исключения, необходимо проверять.
    // try catch finally;
    // try finally - на этапе компиляции все хорошо, на этапе run - exceptions in thread и строчка кода;
    // выстраивать кетчи от более узкого к более широкому, если кетчей несколько;
    // мы можем сами выбрасывать исключения (генерировать и выбрасывать);
    // throw new ArithmeticException;
    // System.exit, если в самом finally генерируется исключение, и если используются потоки демоны;
    // Специфические кейсы - это и есть исключения. Практически редки;
    // multycatch - или/и объединение исключений - объединение споймателей;
    // Finally - закрывать потоки, например ситуация со сканнером или рандомом - закрыть поток метода;
    // кастомные исключения от рантайм исключения.
    // для этого достаточно наследовать класс Exception
    // там же создается исключения. Кусок кода обернуть в Try и пробросить метод и в кетче прописать.


}
