// Дано

// Метод:
// public static String buildRedirectUrl(String next) {
//     return next;
// }

// Требуется 

// Написать безопасную версию метода, которая:
// принимает строку next
// разрешает редирект только на относительные пути
// запрещает:
// http://evil.com
// https://evil.com
// //evil.com
// пустые строки
// null

// если путь небезопасный — вернуть:
// "/home"

// Условия:
// без regex
