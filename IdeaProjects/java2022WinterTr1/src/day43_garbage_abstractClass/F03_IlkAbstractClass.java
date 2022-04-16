package day43_garbage_abstractClass;

public abstract class F03_IlkAbstractClass {

    public abstract void  AbstractMethod();
    /*
        Abstract method'lar
        child class'larin MUTLAKA ovverride etmesi gereken method'lardir
        dolayisiyla hicbir zaman direk calistirilmazlar
        ve bu sebeple method body'sine ihtiyac yoktur

        bir class'in veya method'un abstract olup olmadigini anlayabilriyimiz?
        - abstract yaziyorsa abstract'tir yazmiyorsa degildir
        (abstract olmayan class'lara concrete class/method denir)

        Abstract methodlar body'e sahip olamaz
        Concrete method'lar ise method body'si olmadan olusturulamaz
     */


}
