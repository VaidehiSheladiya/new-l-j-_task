import java.util.Scanner;
class Food {
    int code;
    String foodName;
    String sticker;
    String foodType;
    void getType() {
        switch (sticker.toLowerCase()) {
            case "green":
                foodType = "Vegetarian";
                break;
            case "yellow":
                foodType = "Contains Egg";
                break;
            case "red":
                foodType = "Non Vegetarian";
                break;
            default:
                foodType = "Unknown food";
                break;
        }
    }
    void foodIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Food Code: ");
        code = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Food Name: ");
        foodName = scanner.nextLine();
        System.out.print("Enter Sticker");
        sticker = scanner.nextLine();
        getType();
    }

    void foodOut() {
        System.out.println( code);
        System.out.println(foodName);
        System.out.println(sticker);
        System.out.println(foodType);
    }public static void main(String[] args) {
        Food foodItem = new Food();
        foodItem.foodIn();
        foodItem.foodOut();
    }
}
