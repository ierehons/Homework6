public class Main {
    public static void main(String[] args) {
        //case 1
        System.out.println("case 1");
        int yearsOld = 6;
        if (yearsOld >= 18) {
            System.out.println("поздравляем с совершеннолетием!");
        }        else {
            System.out.println("совершеннолетие ещё не наступил, нужно немного подождать.");
        }
        // case 2.2
        System.out.println("case 2.2");
        int yearsOld2 = 21;
        if (yearsOld2 >= 7&& yearsOld2 < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (yearsOld2 >= 18&& yearsOld2 < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        else if (yearsOld2 >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        // case 3
        System.out.println("case 3");
        int Place = 102;
        int seating =60;
        int standing = Place - seating;
        int usedSeating =10;  //занято сидячих мест
        int usedStanding = 8;  //занято стоящих мест
        if (usedSeating < seating){
            System.out.println("Есть ещё "+ (seating - usedSeating)+ " сидячих места");
        }
        else {
            System.out.println("Сидячих мест нет!");
        }
        if (usedStanding < standing){
            System.out.println("Есть ещё "+ (standing - usedStanding)+ " стоячих места");
        }
        else {
            System.out.println("Сотячих мест нет!");
        }
    }
}