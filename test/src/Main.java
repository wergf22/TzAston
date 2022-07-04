import java.util.Scanner;
class Link
{
    public String name = "Вячеслав";
    public int seven = 7;
    public Link()
    {
    }
    public void TZ2()
    {
        Scanner n = new Scanner(System.in);
        System.out.println ("Пожалуйста, введите ваше имя: ");
        String use_name = n.nextLine();
        if (use_name.equalsIgnoreCase(name) == true)
            System.out.println("Вячеслав");
        else System.out.println("Такого имени нет");
    }
    public void TZ1()
    {
        Scanner num = new Scanner(System.in);
        int number;
        System.out.print("Введите число ");
        number = num.nextInt();
        if (number > seven)
            System.out.println("Привет");
    }
    public void TZ3()
    {
        Scanner num = new Scanner(System.in);
        int size;
        System.out.print("Введите размер массива ");
        size = num.nextInt();
        int[] myArray = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++)
        {
            Scanner input = new Scanner(System.in);
            myArray[i] = input.nextInt();
        }
        System.out.println("Элементы массива кратные трем:");
        for (int i = 0; i < size; i++){
            if (myArray[i] % 3 == 0)
                System.out.print(" " + myArray[i]);
        }

    }
}
class LinkList2App
{
    public static void main(String[] args)
    {
        Link theList = new Link();
        theList.TZ1();
        theList.TZ2();
        theList.TZ3();
    }
}