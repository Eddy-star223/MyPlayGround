import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        System.out.println(displayAge(25));
    }

    public static String displayAge(int ageYears) {
        LocalDate birthDate = LocalDate.now().minusYears(ageYears);
        Period period = Period.between(birthDate, LocalDate.now());

        return String.format("%d years, %d months, %d days", period.getYears(), period.getMonths(), period.getDays());
    }
}
