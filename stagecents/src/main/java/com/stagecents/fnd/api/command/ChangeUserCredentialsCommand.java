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
package com.stagecents.fnd.api.command;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;
import org.joda.time.LocalDate;

import com.stagecents.fnd.domain.UserId;

public class ChangeUserCredentialsCommand {

    @TargetAggregateIdentifier
    private final UserId userId;
    private final String newCredentials;
    private final LocalDate changeDate;

    public ChangeUserCredentialsCommand(UserId userId,
	    String newCredentials, LocalDate changeDate) {
	this.userId = userId;
	this.newCredentials = newCredentials;
	this.changeDate = (changeDate == null) ? new LocalDate() : changeDate;
    }

    public UserId getUserId() {
	return userId;
    }

    public String getNewCredentials() {
	return newCredentials;
    }

    public LocalDate getChangeDate() {
	return changeDate;
    }
}
