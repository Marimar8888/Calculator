package interfaces;
//Esta interface no se implementa, se crean variables de interface para crear el objeto se implementa en
//ConsoleoutputtProvider
public interface IOutputProvider {
    //Método llamado en Calculator. Recibe todos los parámetros y realiza la impresión del resultado
    //mediate un mensaje compuesto por todos estos parámetros.
    void printResult(int firstNumber, int secondNumber, String operationSymbol, int
            result);
}
