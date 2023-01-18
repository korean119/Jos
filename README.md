1. Testrali 연동 작업 완료 (23.01.10)

  
	  @BeforeSuite
	  public void createSuite(ITestContext ctx) throws IOException, AbortException, APIException {
		  client = new APIClient("https://entbc.testrail.io");
		  client.setUser("joshin@ent-bc.com");
		  client.setPassword("패스워드");
		  
		  Map data = new HashMap();
		  data.put("include_all",true);
		  data.put("name","PAS_Selenium IDE 자동화 테스트"+System.currentTimeMillis());
		  
		 JSONObject c = null; 
		  c = (JSONObject) client.sendPost("add_run/" + PROJECT_ID, data);
		  
		
		  Long suite_id = (Long) c.get("id");
		  ctx.setAttribute("suiteId", suite_id);
		  
	    }
	 
	  
		@BeforeMethod
		public void beforeTest(ITestContext ctx,Method method) throws NoSuchMethodException {
			Method m = PAS.class.getMethod(method.getName());

			if (m.isAnnotationPresent(TestRails.class)) {
				TestRails ta = m.getAnnotation(TestRails.class);
				System.out.println(ta.id());
				ctx.setAttribute("caseId",ta.id());
				
			}
		}
		
		
