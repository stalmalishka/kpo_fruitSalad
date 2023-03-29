import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String working;
        System.out.println("Nice to meet you! Do you want to eat a fruit salad?(yes/no):");
        Scanner scanner = new Scanner(System.in);
        working = scanner.nextLine();
        String choiseOfSize;
        double weightOfSalad = 0, kkalOfSalad = 0;
        double maxKkal = 0;
        String moreKkal = null;
        if(working.equals("yes"))
        {
            System.out.println("Choose size of salad: small, middle or big: ");
            choiseOfSize = scanner.nextLine();
            System.out.println("Choose fruits for salad:\napple\npear\nbanana\ngrape\npeach\n");
            while (working.equals("yes"))
            {
                String choiseFruit = scanner.nextLine();
                String PeelYesOrNo;
                switch (choiseFruit)
                {
                    case "apple":
                        Apple apple = new Apple();
                        System.out.println("\nname: " + apple.name + "\nweight: " + apple.weight + "\nkkal: " + apple.kkal + "\nsort: " + apple.sort + "\ncountry: " + apple.country);
                        switch(choiseOfSize)
                        {
                            case "small":
                                weightOfSalad += apple.weight;
                                kkalOfSalad += apple.kkal;
                                break;
                            case "middle":
                                weightOfSalad += apple.weightX2();
                                kkalOfSalad += apple.kkalX2();
                                break;
                            case "big":
                                weightOfSalad += apple.weightX3();
                                kkalOfSalad += apple.kkalX3();
                            default: break;
                        }
                        System.out.println("\nDo you want to peel " + choiseFruit +" ?");
                        PeelYesOrNo = scanner.nextLine();
                        if(PeelYesOrNo.equals("yes"))
                        {
                            apple.peel();
                        }
                        apple.cut();
                        apple.add();
                        if(maxKkal < apple.kkal)
                        {
                            maxKkal = apple.kkal;
                            moreKkal = apple.name;
                        }
                        break;
                    case "pear":
                        Pear pear = new Pear();
                        System.out.println("\nname: " + pear.name + "\nweight: " + pear.weight + "\nkkal: " + pear.kkal + "\nsort: " + pear.sort + "\ncountry: " + pear.country);
                        switch(choiseOfSize)
                        {
                            case "small":
                                weightOfSalad += pear.weight;
                                kkalOfSalad += pear.kkal;
                                break;
                            case "middle":
                                weightOfSalad += pear.weightX2();
                                kkalOfSalad += pear.kkalX2();
                                break;
                            case "big":
                                weightOfSalad += pear.weightX3();
                                kkalOfSalad += pear.kkalX3();
                            default: break;
                        }
                        System.out.println("\nDo you want to peel " + choiseFruit +" ?");
                        PeelYesOrNo = scanner.nextLine();
                        if(PeelYesOrNo.equals("yes"))
                        {
                            pear.peel();
                        }
                        pear.cut();
                        pear.add();
                        if(maxKkal < pear.kkal)
                        {
                            maxKkal = pear.kkal;
                            moreKkal = pear.name;
                        }
                        break;
                    case "banana":
                        Banana banana = new Banana();
                        System.out.println("\nname: " + banana.name + "\nweight: " + banana.weight + "\nkkal: " + banana.kkal + "\nsort: " + banana.sort + "\ncountry: " + banana.country);
                        switch(choiseOfSize)
                        {
                            case "small":
                                weightOfSalad += banana.weight;
                                kkalOfSalad += banana.kkal;
                                break;
                            case "middle":
                                weightOfSalad += banana.weightX2();
                                kkalOfSalad += banana.kkalX2();
                                break;
                            case "big":
                                weightOfSalad += banana.weightX3();
                                kkalOfSalad += banana.kkalX3();
                            default: break;
                        }
                        banana.cut();
                        banana.add();
                        if(maxKkal < banana.kkal)
                        {
                            maxKkal = banana.kkal;
                            moreKkal = banana.name;
                        }
                        break;
                    case "grape":
                        Grape grape = new Grape();
                        System.out.println("\nname: " + grape.name + "\nweight: " + grape.weight + "\nkkal: " + grape.kkal + "\nsort: " + grape.sort + "\ncountry: " + grape.country);
                        switch(choiseOfSize)
                        {
                            case "small":
                                weightOfSalad += grape.weight;
                                kkalOfSalad += grape.kkal;
                                break;
                            case "middle":
                                weightOfSalad += grape.weightX2();
                                kkalOfSalad += grape.kkalX2();
                                break;
                            case "big":
                                weightOfSalad += grape.weightX3();
                                kkalOfSalad += grape.kkalX3();
                            default: break;
                        }
                        grape.add();
                        if(maxKkal < grape.kkal)
                        {
                            maxKkal = grape.kkal;
                            moreKkal = grape.name;
                        }
                        break;
                    case "peach":
                        Peach peach = new Peach();
                        System.out.println("\nname: " + peach.name + "\nweight: " + peach.weight + "\nkkal: " + peach.kkal + "\nsort: " + peach.sort + "\ncountry: " + peach.country);
                        switch(choiseOfSize)
                        {
                            case "small":
                                weightOfSalad += peach.weight;
                                kkalOfSalad += peach.kkal;
                                break;
                            case "middle":
                                weightOfSalad += peach.weightX2();
                                kkalOfSalad += peach.kkalX2();
                                break;
                            case "big":
                                weightOfSalad += peach.weightX3();
                                kkalOfSalad += peach.kkalX3();
                            default: break;
                        }
                        System.out.println("\nDo you want to peel " + choiseFruit +" ?");
                        PeelYesOrNo = scanner.nextLine();
                        if(PeelYesOrNo.equals("yes"))
                        {
                            peach.peel();
                        }
                        peach.cut();
                        peach.add();
                        if(maxKkal < peach.kkal)
                        {
                            maxKkal = peach.kkal;
                            moreKkal = peach.name;
                        }
                        break;
                    default:
                        System.out.println("\nWe have not such fruit!");
                        break;

                }
                System.out.println("\nDo you want something else? If yes, than what: ");
                working = scanner.nextLine();
            }
        }
        System.out.println("\nDo you want to add toping?");
        String topYesOrNo = scanner.nextLine();
        if(topYesOrNo.equals("yes"))
        {
            Toping toping = new Toping();
            System.out.println("\nWhat toping do you want?\nyogurt\ncaramel\nhoney\ncream\nice-cream");
            String choiseToping = scanner.nextLine();
            for (int i = 0; i < toping.top.length; i++)
            {
                if(choiseToping.equals(toping.top[i])) {
                    System.out.println("Do you want more toping?");
                    String moreTopping = scanner.nextLine();
                    if (moreTopping.equals("yes")) {
                        weightOfSalad += toping.weightX2();
                        kkalOfSalad += toping.kkalX2();
                    } else {
                        weightOfSalad += toping.weight;
                        kkalOfSalad += toping.kkal;
                    }
                }
            }
        }
        System.out.println("Weight of Salad: " + weightOfSalad);
        System.out.println("Kkal of salad: " + kkalOfSalad);
        System.out.println("The most kkalor fruit: " + moreKkal + " : " + maxKkal);
    }
}