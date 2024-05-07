package pages.components;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        int numb = Integer.parseInt(day);
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $$(".react-datepicker__day:not(.react-datepicker__day--outside-month)")
                .filterBy(text(day)).first().click();
    }
}
