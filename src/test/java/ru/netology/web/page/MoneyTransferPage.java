package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class MoneyTransferPage {
    public DashboardPage setAmountAndCard(DataHelper.TransferInfo info) {
        $("[data-test-id=amount] input").setValue(info.getAmount().toString());
        $("[data-test-id=from] input").setValue(info.getFromCard());
        $("[data-test-id=action-transfer]").click();
        return new DashboardPage();

    }

}

