package POM_03_TempletePge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import POM_00_BasePage.BasePage;

public class TempletePage extends BasePage {

	public TempletePage(WebDriver driver) {
		super(driver);

	}

	// 템플릿 페이지 리스트 항목
	// 템플릿 > 리스트 첫 번째
	@FindBy(css = ("div:nth-child(1) > .TemplateListItem .TemplateListItem__title"))
	WebElement Templete_Listitem_1_btn;
	
	public void Templete_ListItem_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Templete_Listitem_1_btn)).click();
	}
	
	//드롭다운 리스트 항목  
	// 드롭다운 첫 번째 = 서명 요청 
	@FindBy(css = (".DropdownWrapper--opened .DropdownMenuRow:nth-child(1)"))
	WebElement Dropdown_ContractRequest_btn;
	
	public void Dropdown_ContractRequest_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Dropdown_ContractRequest_btn)).click();
	}
	
	
	// 드롭다운 두 번째 = 대량 전송 시작하기
	@FindBy(css = (".DropdownWrapper--opened .DropdownMenuRow:nth-child(2)"))
	WebElement Dropdown_BulkRequest_btn;
	
	public void Dropdown_BulkRequest_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Dropdown_BulkRequest_btn)).click();
	}

	
	// 드롭다운 세 번째 = 링크 서명 시작하기
	@FindBy(css = (".DropdownWrapper--opened .DropdownMenuRow:nth-child(3)"))
	WebElement Dropdown_linkSignature_btn;
	
	public void Dropdown_linkSignature_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Dropdown_linkSignature_btn)).click();
	}
	
	
	// + 템플릿 만들기 버튼
	@FindBy(css = (".tagCreateTemplateButton"))
	WebElement CreatTemplete_btn;
	
	public void CreatTemplete_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(CreatTemplete_btn)).click();
	}

///////////////////////////////////////////////////////////////


	public void Templete_Dropdown_BulckRequest_select() throws InterruptedException {
		Templete_ListItem_1_btn();
		Dropdown_BulkRequest_btn();
		
	}
}