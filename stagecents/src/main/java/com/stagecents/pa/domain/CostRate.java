/**
 * Copyright (c) 2009-2014 Kaaterskil Management, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.stagecents.pa.domain;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import com.stagecents.common.DateEffective;
import com.stagecents.common.EffectiveDateInterval;

/**
 * Represents the cost rate of non-labor expenditure types defined with
 * <code>requiresCostRate</code> set to <code>true</code>.
 * 
 * @author Blair Caple
 */
public class CostRate implements DateEffective {

    protected ExpenditureType expenditureType;
    protected String name;
    protected String description;
    protected EffectiveDateInterval effectiveDateRange;
    protected float rate;

    CostRate() {
    }

    public CostRate(ExpenditureType expenditureType, String name,
	    String description, float rate, LocalDate startDate,
	    LocalDate endDate) {
	this(expenditureType, name, description, rate);
	effectiveDateRange = new EffectiveDateInterval(startDate, endDate);
    }

    public CostRate(ExpenditureType expenditureType, String name,
	    String description, float rate) {
	this.expenditureType = expenditureType;
	this.name = name;
	this.description = description;
	this.rate = rate;
    }

    void setExpenditureType(ExpenditureType expenditureType) {
	this.expenditureType = expenditureType;
    }

    public DateTime getStartDate() {
	return effectiveDateRange.getStartDate();
    }

    public DateTime getEndDate() {
	return effectiveDateRange.getEndDate();
    }

    public boolean isEffective(DateTime effectiveDate) {
	return (effectiveDateRange == null) ? true : effectiveDateRange
		.isEffective(effectiveDate);
    }

    public boolean isEffective(LocalDate effectiveDate) {
	return (effectiveDateRange == null) ? true : effectiveDateRange
		.isEffective(effectiveDate);
    }
}
