package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.BeforeTest;

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

    @Test
    public void testJobsForEquality(){
        Job job = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        int id = job.getId();
        Job job1 = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        assertFalse(job.equals(job1));
    }

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
public void testToStringContainsCorrectLabelsAndData() {
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

@Test
public void testToStringHandlesEmptyField() {
    Job job = new Job (
        "Product tester",
            new Employer(""),
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
@Test
public void testToStringIfOnlyIdAvailable() {
        Job job = new Job (
                null,
                null,
                null,
                null,
                null);

        assertEquals(job.toString(), "OOPS! This job does not seem to exist.");
}

}

