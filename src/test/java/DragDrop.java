import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.text.html.Option;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DragDrop {

    @BeforeAll
    static  void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void DragDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $(".example").shouldHave(text("Drag and Drop"));
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));


        }
}
