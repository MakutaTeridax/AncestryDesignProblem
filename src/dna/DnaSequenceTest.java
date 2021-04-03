package dna;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class DnaSequenceTest {
    DnaSequence dnaSequence;
    @Before
    public void setUp() throws Exception {
        dnaSequence = new DnaSequence();
    }

    @Test
    public void transcribe() {
        // TODO: implement tests
    	String dna = "GCTCGCAACATCGGATATACA";
    	List<String> okay = dnaSequence.transcribe(dna);
    	String output = "";
    	String separater = "";
    	for(String a: okay) {
    		output = output + separater + a;
    		separater = "-";
    	}
    	assertEquals("ala-arg-asn-lle-gly-tyr-thr", output);
    	dna = "ATGCGCAACATCGGATATACATAG";
    	okay = dnaSequence.transcribe(dna);
    	output = "";
    	separater = "";
    	for(String a: okay) {
    		output = output + separater + a;
    		separater = "-";
    	}
    	assertEquals("met-arg-asn-lle-gly-tyr-thr-stop", output);
    }
}