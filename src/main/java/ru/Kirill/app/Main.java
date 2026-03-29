package ru.Kirill.app;

import ru.Kirill.utils.StringUtils; // Импорт из ВАШЕЙ библиотеки

public class Main {
    public static void main(String[] args) {
        UserMessage msg = new UserMessage("  kirill_student  ", "hello world");

        String cleanName = StringUtils.toCamelCase(msg.getUserName());
        String reversedContent = StringUtils.reverse(msg.getMessageContent());

        System.out.println("Оригинальное имя: " + msg.getUserName());
        System.out.println("Обработанное имя (CamelCase): " + cleanName);
        System.out.println("Перевернутое сообщение: " + reversedContent);

        // Демонстрация работы toString() от Lombok
        System.out.println("Объект целиком: " + msg);
    }
}