package sk.upjs.registracia_konferencia;

import java.time.LocalDateTime;
import java.util.List;

public class Participant {
	
	private String name;
	private String surname;
	private String email;
	private String organization;
	private String address;
	private Long ico;
	private String dic;
	private boolean earlyRegistrated;
	private Tshirt tshirt;
	private boolean isStudent;
	private boolean wantsExtraBed;
	private LocalDateTime start;
	private LocalDateTime end;
	private List<Companion> companions;
	private Workshop workshop;
	private boolean cach;
	
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double finalPrice() {
		return 0.0;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getIco() {
		return ico;
	}

	public void setIco(Long ico) {
		this.ico = ico;
	}

	public String getDic() {
		return dic;
	}

	public void setDic(String dic) {
		this.dic = dic;
	}

	public boolean isEarlyRegistrated() {
		return earlyRegistrated;
	}

	public void setEarlyRegistrated(boolean earlyRegistrated) {
		this.earlyRegistrated = earlyRegistrated;
	}

	public Tshirt getTshirt() {
		return tshirt;
	}

	public void setTshirt(Tshirt tshirt) {
		this.tshirt = tshirt;
	}

	public boolean isStudent() {
		return isStudent;
	}

	public void setStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}

	public boolean isWantsExtraBed() {
		return wantsExtraBed;
	}

	public void setWantsExtraBed(boolean wantsExtraBed) {
		this.wantsExtraBed = wantsExtraBed;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public List<Companion> getCompanions() {
		return companions;
	}

	public void setCompanions(List<Companion> companions) {
		this.companions = companions;
	}

	public Workshop getWorkshop() {
		return workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	public boolean isCach() {
		return cach;
	}

	public void setCach(boolean cach) {
		this.cach = cach;
	}

}
