package sk.upjs.registracia_konferencia;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class ParticipantTest {
	
	Workshop cidmWorkshop;
	Workshop slonWorkshop;
	
	@BeforeClass
	public void setBefore() {
		cidmWorkshop = new Workshop();
		cidmWorkshop.setPriceFull(355);
		cidmWorkshop.setPriceStudent(295);
		cidmWorkshop.setPriceFullLate(380);
		cidmWorkshop.setPriceStudentLate(320);
		slonWorkshop = new Workshop();
		slonWorkshop.setPriceFull(245);
		slonWorkshop.setPriceStudent(195);
		slonWorkshop.setPriceFullLate(265);
		slonWorkshop.setPriceStudentLate(210);
	}
	
	@Test
	void testFinalPrice1() {
		Participant participant = new Participant();
		participant.setEarlyRegistrated(true);
		participant.setWorkshop(cidmWorkshop);
		participant.setStudent(false);
		participant.setWantsExtraBed(false);
		participant.setCach(false);
		assertEquals(355.0, participant.finalPrice());
	}

	@Test
	void testFinalPrice2() {
		Participant participant = new Participant();
		participant.setEarlyRegistrated(false);
		participant.setWorkshop(cidmWorkshop);
		participant.setStudent(false);
		participant.setWantsExtraBed(false);
		participant.setCach(false);
		assertEquals(380.0, participant.finalPrice());
	}

	@Test
	void testFinalPrice3() {
		Participant participant = new Participant();
		participant.setEarlyRegistrated(true);
		participant.setWorkshop(slonWorkshop);
		participant.setStudent(false);
		participant.setWantsExtraBed(false);
		participant.setCach(false);
		List<Companion> companions = new ArrayList<>();
		Companion c1 = new Companion();
		c1.setCategory(CompanionCategory.ADULT);
		c1.setStart(LocalDateTime.of(2019, 9, 21, 17, 0));
		c1.setEnd(LocalDateTime.of(2019, 9, 23, 10, 0));
		companions.add(c1);
		participant.setCompanions(companions);
		assertEquals(245 + 110, participant.finalPrice());
	}
	
	
	
}
