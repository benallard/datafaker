package net.datafaker.providers.base.bug;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

public class BugProvider extends AbstractProvider<BaseProviders> {
    private static final String[] INSECT_NAMES = new String[]{"Ant", "Beetle", "Butterfly", "Wasp"};

    public BugProvider(BaseProviders faker) {
        super(faker);
    }

    public String nextInsectName() {
        return INSECT_NAMES[faker.random().nextInt(INSECT_NAMES.length)];
    }
}
