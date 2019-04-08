package ru.spsuace.course.lesson2.classwork.patterns.behavioral.visitor;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

public class CommanderTest extends UnitTest<Commander> {
    /**
     * Create a new test instance for the given {@link Commander}
     */
    public CommanderTest() {
        super(Commander::new);
    }

    @Override
    void verifyVisit(Commander unit, UnitVisitor mockedVisitor) {
        verify(mockedVisitor).visitCommander(eq(unit));
    }


}