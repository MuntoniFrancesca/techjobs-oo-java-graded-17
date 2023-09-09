package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job = new Job();
        Job job1 = new Job();
        assertNotEquals(job.getId(), job1.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

//    ASSERT EQUALS METHOD:
//    @Test
//    public void testJobsForEquality(){
//       Job job = new Job(
//                "Product tester",
//                new Employer("ACME"),
//                new Location("Desert"),
//                new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
//                int id = job.getId();
//        Job job1 = new Job(
//                "Product tester",
//                new Employer("ACME"),
//                new Location("Desert"),
//                new PositionType("Quality control"),
//                new CoreCompetency("Persistence")
//        );
//        assertFalse(job.equals(job1));
//    }
}
