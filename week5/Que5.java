void main() {
    int initial = Integer.parseInt(IO.readln("Enter initial saving : "));
    int monthly = Integer.parseInt(IO.readln("Enter monthly saving : "));
    int number = Integer.parseInt(IO.readln("Enter number of months : "));
    int interestper = Integer.parseInt(IO.readln("Enter interest percent : "));
    double Total = initial + monthly * number;
    double Interest = Total * interestper / 100.0;
    double Final = Total + Interest;
    IO.println(("Enter total saving before interest = %.2f ").formatted(Total) + (" bath"));
    IO.println(("Interest = %.2f ").formatted(Interest) + (" bath"));
    IO.println(("Final saving = %.2f ").formatted(Final) + (" bath"));
}