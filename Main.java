import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        int container;
        int track;
        int boxNumber = 0;
        int containerNumber = 0;
        int trackNumber = 0;

        int boxCount = Integer.parseInt(boxes);

        container = boxCount / 27;
        if (boxCount % 27 > 0) {
            container++;
        }

        track = container / 12;
        if (container % 12 > 0) {
            track++;
        }

        for (int x = 1; x <=track; x++ ) {
            trackNumber++;
            System.out.println("Грузовик " + trackNumber);

            for (int z = 1; z < container; z++) {
                containerNumber++;
                System.out.println("Контейнер " + containerNumber);

                for (int i = 1; i <= boxCount; i++) {
                    boxNumber++;
                    if (boxNumber > 27) {
                        containerNumber++;
                        boxNumber = 1;
                        z++;

                        if (containerNumber > 12) {
                            trackNumber++;
                            containerNumber = 1;
                            x++;
                            System.out.println("Грузовик " + trackNumber);
                        }
                        System.out.println("Контейнер " + containerNumber);
                    }
                    System.out.println("Ящик " + boxNumber);
                }

            }
        }
       
    }

}
