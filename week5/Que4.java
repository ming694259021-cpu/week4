void main() {
   int salary = Integer.parseInt(IO.readln("Enter salary : "));
   int deductionper = Integer.parseInt(IO.readln("Enter deduction percent : "));
   double deduction = salary * deductionper / 100.0;
   double Net = salary - deduction;
   IO.println("Deduction = %.1f ".formatted(deduction));
   IO.println("Net salary = %.1f ".formatted(Net));
}
