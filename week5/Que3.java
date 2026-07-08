void main() {
    int Score1 = Integer.parseInt(IO.readln("Enter Score 1 : "));

    int Score2 = Integer.parseInt(IO.readln("Enter Score 2 : "));

    int Score3 = Integer.parseInt(IO.readln("Enter Score 3 : "));

    int bonus = Integer.parseInt(IO.readln("Enter bonus score : "));
    int total = Score1 + Score2 + Score3;
    int totalb = total + bonus;
    double average = totalb / 3.0;
    IO.println("Total score = " + total + " points");
    IO.println("Total with bonus = " + totalb + " points");
    IO.println("Average of Total with bonus = %.2f point".formatted(average));
}
