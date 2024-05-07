package pages.components;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateAndCityComponent {
    public void setState(String value){
        $("#stateCity-wrapper").$(byText(value)).click();
    }

    public void setCity(String value){
        $("#stateCity-wrapper").$(byText(value)).click();
    }
}
