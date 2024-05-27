import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Logger.enableFileMode(); // Ativa o modo de arquivo

        Logger.log(LogLevel.DEBUG, "Isso é uma mensagem de debug.");
        Logger.log(LogLevel.WARNING, "Isso é uma mensagem de aviso.");
        Logger.log(LogLevel.ERROR, "Isso é uma mensagem de erro.");

        Logger.disableFileMode(); // Desativa o modo de arquivo
    }
}