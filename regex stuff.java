// Bunch of stuff that uses regex in cool ways! (sorry for the static abuse)

public static boolean isPrime(int number) {
    return !Pattern.matches("^1?$|^(11+?)\\1+$", new String(new char[number]).replace('\0', '1'));
}

public static boolean isAlphabetic(String input) {
    return input.matches("[a-zA-Z]+");
}

public static boolean isNumeric(String input) {
    return input.matches("\\d+");
}

public static boolean isAlphanumeric(String input) {
    return input.matches("[a-zA-Z0-9]+");
}

// May have a few problems.
public static boolean isEmail(String input) {
    return input.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
}

public static boolean isIPAddress(String input) {
    return input.matches("(\\d{1,3}\\.){3}\\d{1,3}");
}

public static boolean isURL(String input) {
    return input.matches("^[a-zA-Z]+://([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}|localhost)(:[0-9]{1,5})?(/.*)?$");
}

  
