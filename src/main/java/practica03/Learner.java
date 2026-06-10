package practica03;

public class Learner {
    public static void main(String[] args) {
        String [] dataArr = new String[4]; //se crea un arreglo la cual se asignan los nombre
        dataArr[1] = "Bill";
        dataArr[2] = "Steve";
        dataArr[3] = "Larry";
        try {
            for(String data : dataArr){ // se aplica el metodo for el cual va a imprimir de forma cotinua
                System.out.println(data+" ");
            }
        }catch (Exception e){
            System.out.println(e.getClass());
        }
    }
}
