package project.v1b;

interface CustomerService {

	void addCustomer(CustomerV0 sj);

	String getNum();

	String getNum(String num);

	String getName();

	String getName(String name);

	String getJumin();

	String getJumin(String jumin);

	String getAdr();

	String getAdr(String adr);

	String getPhon();

	String getPhon(String phon);

	void modifyCustomer(CustomerService sj);

	void removeCystomer(CustomerService name);

}
