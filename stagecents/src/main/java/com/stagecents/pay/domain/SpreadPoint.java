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
package com.stagecents.pay.domain;

public class SpreadPoint {

    private Spread spread;
    private String name;
    private int sequence;
    private float value;

    SpreadPoint() {
    }

    public SpreadPoint(Spread spread, String name, int sequence, float value) {
	this.spread = spread;
	this.name = name;
	this.sequence = sequence;
	this.value = value;
    }

    public void setSpread(Spread spread) {
        this.spread = spread;
    }

    public String getName() {
	return name;
    }

    public int getSequence() {
	return sequence;
    }

    public float getValue() {
	return value;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + sequence;
	result = prime * result + Float.floatToIntBits(value);
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null || !(obj instanceof SpreadPoint)) {
	    return false;
	}
	SpreadPoint other = (SpreadPoint) obj;
	if (name == null) {
	    if (other.name != null) {
		return false;
	    }
	} else if (!name.equals(other.name)) {
	    return false;
	}
	if (sequence != other.sequence) {
	    return false;
	}
	if (Float.floatToIntBits(value) != Float.floatToIntBits(other.value)) {
	    return false;
	}
	return true;
    }
}
