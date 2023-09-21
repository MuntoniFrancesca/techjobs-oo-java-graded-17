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

//**************
// START TASK5
@Test
    public void testToStringStartsAndEndsWithNewLine() {

    Job job = new Job(
            "Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

        assertTrue(job.toString().startsWith(System.lineSeparator()));
        assertTrue(job.toString().endsWith(System.lineSeparator()));
}

@Test
public void testToStringContainsLabelForEachField() {
            Job job = new Job(
            "Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

            assertEquals(job.toString(), System.lineSeparator() +
                    "ID: " + job.getId() + System.lineSeparator() +
                    "Name: " + job.getName().toString() + System.lineSeparator() +
                    "Employer: " + job.getEmployer().toString() + System.lineSeparator() +
                    "Location: " + job.getLocation().toString() + System.lineSeparator() +
                    "Position Type: " + job.getPositionType().toString() + System.lineSeparator() +
                    "Core Competency: " + job.getCoreCompetency().toString() +
                    System.lineSeparator());
}
//*****CREATING THE TEST FOR EMPTYFIELD IN PROGRESS
@Test
public void testToStringAddsDataNotAvailableWhenFieldIsEmpty() {
    Job job = new Job (
        "Product tester",
            new Employer(null),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    assertEquals(job.toString(), System.lineSeparator() +
            "ID: 1" + System.lineSeparator() +
            "Name: Product tester" + System.lineSeparator() +
            "Employer: Data not available" + System.lineSeparator() +
            "Location: Desert" + System.lineSeparator() +
            "Position Type: Quality control" + System.lineSeparator() +
            "Core Competency: Persistence" +
            System.lineSeparator());
}

//CREATING THE TEST FOR EMPTY FIELD IN PROGRESS

//*************TASK5





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

