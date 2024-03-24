import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        try
        {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[46]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception) {
            System.out.println("Loglandı : " + exception);
        }
        finally {
            System.out.println("Ben her zaman çalışırım: ");
        }

    }
}