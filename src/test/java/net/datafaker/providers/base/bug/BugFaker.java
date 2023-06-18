package net.datafaker.providers.base.bug;

import net.datafaker.Faker;

public class BugFaker extends Faker {
    public BugProvider insect() {
        return getProvider(BugProvider.class, BugProvider::new, this);
    }
}
