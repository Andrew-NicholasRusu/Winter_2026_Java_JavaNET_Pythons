import java.text.DecimalFormat; // This import statement allows the use of the DecimalFormat class, which is used
import java.time.LocalDate;

public class TeamLeader extends ProductionWorker{
    private double monthlyBonus;
    private double requiredTrainingHours;
    public double trainingHoursAttended;

    public TeamLeader() {
        super();
        this.monthlyBonus = 0.0;
        this.requiredTrainingHours = 0.0;
        this. trainingHoursAttended = 0.0;
    }

    public TeamLeader(String name, String num, LocalDate date, int sh,
                      double rate, double mb, double rth, double tha) {
        super(name, num, date, sh, rate);
        // The super(name, num, date, sh, rate) call initializes the inherited attributes from the ProductionWorker class 
        // (and indirectly from the Employee class) using the provided arguments for name, number, hire date, shift, and pay rate.
        this.monthlyBonus = mb;
        this.requiredTrainingHours = rth;
        this.trainingHoursAttended = tha;

    }

    // Getters
    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public double getRequiredTrainingHours(){
        return requiredTrainingHours;
    }

    public double getTrainingHoursAttended(){
        return trainingHoursAttended;
    }

    // Setters
    public void setMonthlyBonus(double monthlyBonus){
        this.monthlyBonus = monthlyBonus;
    }

    public void setRequiredTrainingHours(double requiredTrainingHours){
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public void setTrainingHoursAttended(double trainingHoursAttended){
        this.trainingHoursAttended = trainingHoursAttended;
    }

    // toString method
    @Override
    public String toString(){
        // This is not in the UML, but we need to format the monthly bonus as currency in the output.
        DecimalFormat currency = new DecimalFormat("$#, ##0.00");
        // The DecimalFormat class is used to format the monthly bonus as a currency value with two decimal places.
        return super.toString() + "\n" +
                "Monthly Bonus: " + currency.format(monthlyBonus) + "\n" +
                "Required Training Hours: " + requiredTrainingHours + "\n" +
                "Training Hours Attended: " + trainingHoursAttended;

    }
}
