package PagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TempletePage extends _0_BasePage {

	public TempletePage(WebDriver driver) {
		super(driver);

	}

	// 템플릿 > 리스트 첫 번째)
	@FindBy(css = ("div:nth-child(1) > .TemplateListItem .TemplateListItem__title"))
	WebElement TempletListItem_1_btn;

	// 리스트 두 번째 = 대량 전송 시작하기
	@FindBy(css = (".DropdownWrapper--opened .DropdownMenuRow:nth-child(2)"))
	WebElement BulkRequest_btn;

	// + 템플릿 만들기 버튼
	@FindBy(css = (".tagCreateTemplateButton.css-1hiamvf"))
	WebElement CreatTemplete_btn;

	///////////////////////////////////////////////////

	public void CreatTemplete_btn() throws InterruptedException {
		CreatTemplete_btn.click();
	}

	public void NomarlAccount_BulkRequest_Off_Case() throws InterruptedException {
		TempletListItem_1_btn.click();
		BulkRequest_btn.click();
	}
}