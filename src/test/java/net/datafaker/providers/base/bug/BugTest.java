package net.datafaker.providers.base.bug;

import org.junit.jupiter.api.Test;

public class BugTest {


    @Test
    void name() {
        BugFaker faker = new BugFaker();
        String data = faker.expression("#{csv ';','\"','true','10','EmployeeId','#{Insect.nextInsectName}','Firstname','#{Name.first_name}','Lastname','#{Name.last_name}'}");
        System.out.println(data);
    }
}
