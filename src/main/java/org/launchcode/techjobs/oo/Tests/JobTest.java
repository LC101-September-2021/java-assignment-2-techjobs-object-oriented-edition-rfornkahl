package org.launchcode.techjobs.oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class JobTest {



    @Test
    public void testSettingJobId(){
        Job testJob = new Job();
        Job testJob2 = new Job();

        assertFalse(testJob.getId() == testJob2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob3.getName(), "Product tester");
        assertTrue(testJob3 instanceof Job);
        assertEquals(testJob3.getEmployer(), "ACME");
        assertEquals(testJob3.getLocation(), "Desert");
        assertEquals(testJob3.getPositionType(), "Quality control");
        assertEquals(testJob3.getCoreCompetency(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob4 == testJob5 );
    }
}
