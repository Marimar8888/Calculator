package interfaces;
//Se implementa en ConsoleInputProvider
public interface IInputProvider {
    //Interface para la implementacion os métodos donde recibe el simbolo de la opeación +,-,/,*
    //Recibe el mensaje que muestra pidiendo el número y guarda ese número cuando se implemente en la clase
    //Calculator
    int getNumberInput(String message);
    //Recibe el mensaje desde la clase Calulator pidiendo el simbolo de la operación a realizar
    //cuando se implementa en Calculator se guarda ese simbolo en una variable
    String getOperationInput(String message);
}
