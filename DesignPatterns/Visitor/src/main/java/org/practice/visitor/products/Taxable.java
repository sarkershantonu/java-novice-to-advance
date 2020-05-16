package org.practice.visitor.products;

import org.practice.visitor.monitors.TaxMonitor;

//The Visitable interface
public interface Taxable {
	double addTaxMonitor(TaxMonitor taxMonitor);
}
