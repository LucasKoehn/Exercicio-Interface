public class ConsoleLogger {
    public void log(LogLevel level, String message) {
        switch (level) {
            case DEBUG:
                System.out.println("\u001B[32m" + message + "\u001B[0m"); // Verde
                break;
            case WARNING:
                System.out.println("\u001B[33m" + message + "\u001B[0m"); // Amarelo
                break;
            case ERROR:
                System.out.println("\u001B[31m" + message + "\u001B[0m"); // Vermelho
                break;
        }
    }
}
