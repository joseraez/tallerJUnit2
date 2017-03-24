package com.everis.bootcamp.test;

import java.util.Comparator;

import org.junit.runner.Description;
import org.junit.runner.manipulation.Sorter;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class SorterRunner extends BlockJUnit4ClassRunner {
	 
    private static final Comparator<Description> comparator = new Comparator<Description>() {

        public int compare(Description o1, Description o2) {
            return o1.getDisplayName().compareTo(o2.getDisplayName());
        }
    };

    public SorterRunner(Class<?> klass) throws InitializationError {
    	super(klass);
        sort(new Sorter(comparator));
}
}
