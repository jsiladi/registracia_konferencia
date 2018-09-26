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

	private void addCompanion(Companion companion) {
		companions.add(companion);
	}
	
	public static void main(String[] args) {
		Participant Petra = new Participant();
	}

}
